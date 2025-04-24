/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package AppLogin;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.sql.Timestamp;
import java.time.Duration;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author byAlexLR
 */
public class Login {

    public static void main(String[] args) {
        // Inicializa el Scanner.
        Scanner sc = new Scanner(System.in);
        while (true) {
            // Pide y almacena los datos introducidos por el usuario.
            System.out.println("Por favor, introduzca sus datos de acceso:");
            System.out.print("Usuario: ");
            String username = sc.next();
            System.out.print("Contraseña: ");
            String password = sc.next();

            // Se conecta a la base de datos.
            Connection connection = MySQLConnection.getConnection();

            // Declaración de variables.
            PreparedStatement pstmt = null;
            String sql;
            if (connection != null) {
                System.out.println("Inicio de sentencias:");

                try {
                    // Obtiene la información del usuario.
                    sql = "SELECT password, failed_attempts, last_attempt FROM users WHERE username = ?";
                    pstmt = connection.prepareStatement(sql);
                    pstmt.setString(1, username);
                    ResultSet rs = pstmt.executeQuery();

                    if (rs.next()) {
                        // Obtiene los valores de la base de datos.
                        String hash = rs.getString("password");
                        int failedAttempts = rs.getInt("failed_attempts");
                        java.sql.Timestamp lastAttemptTimestamp = rs.getTimestamp("last_attempt");
                        LocalDateTime lastAttempt = lastAttemptTimestamp != null ? lastAttemptTimestamp.toLocalDateTime() : null;

                        // Comprueba los datos y si la cuenta está bloqueada.
                        if (failedAttempts >= 3 && lastAttempt != null && Duration.between(lastAttempt, LocalDateTime.now()).toMinutes() < 5) {
                            System.out.println("""
                                               Cuenta bloqueada, inténtalo dentro de 5 minutos.
                                               """);
                        } else {
                            // Verifica la contraseña.
                            if (BCrypt.checkpw(password, hash)) {
                                System.out.println("""
                                               Inicio de sesión correcto.
                                               """);
                                // Reinicia el contador de intentos fallidos.
                                sql = "UPDATE users SET failed_attempts = 0, last_attempt = NULL WHERE username = ?";
                                pstmt = connection.prepareStatement(sql);
                                pstmt.setString(1, username);
                                pstmt.executeUpdate();
                                break;
                            } else {
                                System.out.println("""
                                                   Usuario o contraseña incorrectos.
                                                   """);
                                // Incrementa el contador de intentos fallidos.
                                sql = "UPDATE users SET failed_attempts = failed_attempts + 1, last_attempt = ? WHERE username = ?";
                                pstmt = connection.prepareStatement(sql);
                                pstmt.setTimestamp(1, Timestamp.valueOf(LocalDateTime.now()));
                                pstmt.setString(2, username);
                                pstmt.executeUpdate();
                            }
                        }
                        // En el caso de no encontrar el usuario.
                    } else {
                        System.out.println("""
                                           Usuario no encontrado.
                                           """);
                    }

//                // Consulta SQL con un mensaje de confirmación.
//                String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
//                PreparedStatement pstmt = connection.prepareStatement(sql);
//                pstmt.setString(1, username);
//                pstmt.setString(2, password);
//                System.out.println("Consultando: " + sql);
//
//                // Ejecuta la consulta.
//                ResultSet rs = pstmt.executeQuery();
//
//                // Opción de Bucle
//                boolean succesful = false;
//                while (rs.next()) {
//                    succesful = true;
//                    int rowID = rs.getInt("id");
//                    String rowUsername = rs.getString("username");
//                    String rowPassword = rs.getString("password");
//                    System.out.println(rowID + "\t" + rowUsername + "\t" + rowPassword);
//                }
                } catch (SQLException e) {
                    // Mensaje de error al crear la base de datos.
                    System.err.println("Error durante la validación de datos: " + e.getMessage());
                } finally {
                    // Libera recursos.
                    try {
                        if (connection != null) {
                            connection.close();
                        }
                    } catch (SQLException e) {
                        System.err.println("Error al liberar recursos: " + e.getMessage());
                    }
                }
            }
        }
        // Cierra el scanner.
        sc.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DBUpdates;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author byAlexLR
 */
public class DBConnection {

    public static void main(String[] args) {
        // Declaración de variables.
        Connection connection = MySQLConnection.getConnection();
        PreparedStatement pstmt = null;
        String sql, encriptedPassword;

        if (connection != null) {
            System.out.println("Inicio de sentencias:");

            try {
                // Modifica la tabla users.
                sql = "ALTER TABLE users ADD COLUMN failed_attempts int default 0";
                pstmt = connection.prepareStatement(sql);
                pstmt.executeUpdate();
                System.out.println("Columna failed_attempts añadida.");

                sql = "ALTER TABLE users ADD COLUMN last_attempt timestamp";
                pstmt = connection.prepareStatement(sql);
                pstmt.executeUpdate();
                System.out.println("Columna last_attempt añadida.");

                // Encripta las contraseñas.
                encriptedPassword = BCrypt.hashpw("admin123", BCrypt.gensalt(12));
                System.out.println("La contraseña 'admin123' encriptada es: " + encriptedPassword);

                sql = "UPDATE users SET password = ? WHERE username = ?";
                pstmt = connection.prepareStatement(sql);
                pstmt.setString(1, encriptedPassword);
                pstmt.setString(2, "admin");
                pstmt.executeUpdate();
                System.out.println("La contraseña de 'admin' ha sido encriptada");

                encriptedPassword = BCrypt.hashpw("pass123", BCrypt.gensalt(12));
                System.out.println("La contraseña 'pass123' encriptada es: " + encriptedPassword);
                
                sql = "UPDATE users SET password = ? WHERE username = ?";
                pstmt = connection.prepareStatement(sql);
                pstmt.setString(1, encriptedPassword);
                pstmt.setString(2, "usuario");
                pstmt.executeUpdate();
                System.out.println("La contraseña de 'usuario' ha sido encriptada");

            } catch (SQLException e) {
                // Mensaje de error al modificar la base de datos.
                System.err.println("Error durante la modificación de la base de datos: " + e.getMessage());
            } finally {
                // Libera recursos.
                try {
                    if (pstmt != null) {
                        pstmt.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    System.err.println("Error al liberar recursos: " + e.getMessage());
                }
            }
        }
    }
}

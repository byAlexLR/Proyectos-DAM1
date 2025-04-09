/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Apartado2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Login {

    public static void main(String[] args) {
        // Inicializa el Scanner.
        Scanner sc = new Scanner(System.in);

        // Pide y almacena los datos introducidos por el usuario.
        System.out.println("Por favor, introduzca sus datos de acceso:");
        System.out.print("Usuario: ");
        String username = sc.next();
        System.out.print("Contraseña: ");
        String password = sc.next();

        // Se conecta a la base de datos.
        Connection connection = MySQLConnection.getConnection();
        if (connection != null) {
            System.out.println("Inicio de sentencias:");

            try {
                Statement stmt = connection.createStatement();

                // Consulta SQL con un mensaje de confirmación.
                String sql = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
                System.out.println("Consultando: " + sql);

                // Ejecuta la consulta.
                ResultSet rs = stmt.executeQuery(sql);

                // Verifica el resultado de la consulta.
                if (rs.next()) {
                    System.out.println("Inicio de sesión correcto.");
                } else {
                    System.out.println("Usuario o contraseña incorrectos.");
                }

            } catch (SQLException ex) {
                // Mensaje de error al crear la base de datos.
                System.err.println("Error durante la validación de datos: " + ex.getMessage());
            }
        }
    }
}

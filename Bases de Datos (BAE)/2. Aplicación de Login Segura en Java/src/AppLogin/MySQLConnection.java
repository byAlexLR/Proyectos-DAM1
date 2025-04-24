/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package AppLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author byAlexLR
 */
public class MySQLConnection {

    public static Connection getConnection() {
        // Variables con los datos de la conexión.
        Connection connection = null;
        String DB_URL = "jdbc:mysql://localhost:3306/seguridad_db";
        String DB_USER = "root";
        String DB_PASSWORD = null;

        try {
            // Carga el driver de MySQL.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Se conecta a la Base de Datos.
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            // Mensaje de confirmación.
            System.out.println("Conexión exitosa a la Base de Datos 'seguridad_db'.");
        } catch (ClassNotFoundException e) {
            // Mensaje de error de driver.
            System.err.println("Error al cargar el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            // Mensaje de error al conectar a la Base de Datos.
            System.err.println("Error al conectar a la Base de Datos" + e.getMessage());
        }
        return connection;
    }
}

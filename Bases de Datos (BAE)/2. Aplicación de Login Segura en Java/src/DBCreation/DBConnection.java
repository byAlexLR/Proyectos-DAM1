/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DBCreation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author byAlexLR
 */
public class DBConnection {

    public static void main(String[] args) {
        Connection connection = MySQLConnection.getConnection();

        if (connection != null) {
            System.out.println("Inicio de sentencias:");

            try {
                Statement stmt = connection.createStatement();

                // Crea la base de datos si no existe y confirma la creación.
                String sqlCreateSQL = "CREATE DATABASE IF NOT EXISTS seguridad_db";
                stmt.executeUpdate(sqlCreateSQL);
                System.out.println("La base de datos 'seguridad_db' ha sido creada.");

                // Se conecta a la base de datos y confirma la conexión.
                stmt.executeUpdate("USE seguridad_db");
                System.out.println("Se ha conectado a la base de datos 'seguridad_db'.");

                // Crea la tabla y confirma la creación.
                String sqlCreateTb = "CREATE TABLE IF NOT EXISTS users (id INT AUTO_INCREMENT PRIMARY KEY, username VARCHAR(50) NOT NULL, password VARCHAR(100) NOT NULL)";
                stmt.executeUpdate(sqlCreateTb);
                System.out.println("La tabla 'users' ha sido creada.");

                // Realiza la insercción de la información y confirma la inserción.
                String sqlInsert = "INSERT INTO users (username, password) VALUES ('admin', 'admin123'), ('usuario', 'pass123')";
                stmt.executeUpdate(sqlInsert);
                System.out.println("Los usuarios han sido insertados.");

            } catch (SQLException e) {
                // Mensaje de error al crear la base de datos.
                System.err.println("Error durante la creación de base de datos: " + e.getMessage());
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
}

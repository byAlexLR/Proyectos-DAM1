/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.examensorpresa2;

// Importa las librerías.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {

        // Inicialización del ArrayList de Materiales.
        ArrayList<Material> materiales = new ArrayList<>();

        // Intenta leer el archivo CSV.
        try (BufferedReader br = new BufferedReader(new FileReader("material.csv"))) {

            // Lectura del fichero línea por línea.
            String linea;
            while ((linea = br.readLine()) != null) {
                // Divide la línea en columnas separadas por comas.
                String[] datos = linea.split(",");

                // Verifica si la línea tiene el número correcto de columnas.
                if (datos.length != 3) {
                    System.err.println("Línea inválida: " + linea);
                    continue;
                }

                try {
                    // Obtiene y convierte los datos de las columnas (elimina espacios extra).
                    String nombre = datos[0].trim();
                    int cantidad = Integer.parseInt(datos[1].trim());
                    double precio = Double.parseDouble(datos[2].trim());

                    // Añade el material a la lista.
                    materiales.add(new Material(nombre, cantidad, precio));
                } catch (NumberFormatException e) {
                    System.err.println("Error al parsear los datos: " + linea);
                }
            }

            // Muestra por pantalla los materiales y sus cálculos.
            for (Material material : materiales) {
                System.out.println(material);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }
}

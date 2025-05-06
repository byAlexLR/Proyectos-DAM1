/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.examen.mayo2;

// Librerías importadas.
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {
        // Declaro el Arraylist.
        ArrayList<Producto> productitos = new ArrayList<>();

        // Creacción de un try-catch para capturar las excepciones, e implemento el Buffer, para leer el archivo.
        try (BufferedReader br = new BufferedReader(new FileReader("producto.csv"))) {
            // Declaración de la variable linea.
            String linea;

            // Bucle While, donde seguirá activo hasta que no existan datos a leer.
            while ((linea = br.readLine()) != null) {
                // Declaro un array para insertar cada línea y separarla por comas.
                String[] datos = linea.split(",");

                // En el caso de que no contenga 3 columnas.
                if (datos.length != 3) {
                    System.err.println("El formato no es correcto.");
                    continue;
                }

                // Creacción de un try-catch para parsear y capturar las excepciones si algo no se puede parsear.
                try {
                    // Parseo cada posición de datos.
                    String nombre = datos[0].trim();
                    int cantidad = Integer.parseInt(datos[1].trim());
                    double precio = Double.parseDouble(datos[2].trim());

                    // Lo agrego al arraylist productitos.
                    productitos.add(new Producto(nombre, cantidad, precio));

                    // Captura la excepción, si no se puede parsear.
                } catch (NumberFormatException ex) {
                    System.err.println("No se ha podido parsear: " + linea);
                }
            }

            // Recorro el ArrayList, para mostrar cada línea de productos.
            for (Producto pro : productitos) {
                System.out.println(pro);
            }

            // Declaro la variable para almacenar el valor de la compra.
            double total = 0.0;
            // Recorro el array, llamando a getTotal y sumando el dato obtenido a la variable.
            for (Producto pro : productitos) {
                total += pro.getTotal();
            }
            // Imprime un mensaje final con el resultado obtenido.
            PrintStream printf = System.out.printf("Precio Total de la compra: " + total + "€");

            // Captura las posibles excepciones.
        } catch (FileNotFoundException ex) {
            System.err.println("Archivo no encontrado o sin permisos: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error de entrada/salida: " + ex.getMessage());
        }
    }
}

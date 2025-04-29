/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.practica2;

// Librerías importadas.
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {
        // Creación de la variable Scanner.
        Scanner sc = new Scanner(System.in);
        // Inicialización del ArrayList Libro.
        List<Libro> libros = new ArrayList<>();
        // Inserción de libros al ArrayList.
        libros.add(new Libro("¿Cómo llegar a ser decimal?", "Millares", 2023, "ISBN 9874-5612-31230"));
        libros.add(new Libro("Dolores que angustían", "Angustia", 2021, "ISBN 3654-8971-25890"));
        libros.add(new Libro("¿Cómo conocí a vuestra madre?", "Millares", 2025, "ISBN 1234-5678-91234"));
        libros.add(new Libro("No sigan el refrán", "Alfredo", 2022, "ISBN 5648-9213-57028"));
        libros.add(new Libro("Pedrito clavó un clavito", "Pedrito", 2021, "ISBN 4578-3692-10548"));

        // Ordena el array según el año.
        libros.sort(Comparator.comparingInt(libro -> libro.getAno()));
        
        // Muestra el contenido de la lista de libros.
        System.out.println("Lista de Libros:");
        for (Libro lib : libros) {
            System.out.println(lib.toString());
        }

        // Declaración de la variable autor.
        String autor;
        // Bucle para que el usuario pregunte tantas veces como quiera.
        do {
            // Le pregunta al usuario el autor que está buscando.
            System.out.println("Para salir introduce 0.");
            System.out.print("Introduce el nombre del autor: ");
            autor = sc.next();

            // Se activa el condicional si el valor introducido no es 0.
            if (!"0".equals(autor)) {
                // En el caso de no encontrar al autor, inicia el condicional if.
                boolean noEncontrado = true;
                // Bucle para buscar el autor especificado.
                for (Libro lib : libros) {
                    if (lib.getAutor().equalsIgnoreCase(autor)) {
                        // En el caso de encontrarlo manda un false a la variable encontrado para no iniciar el condicional if.
                        noEncontrado = false;
                        System.out.println(lib.toString());
                    }
                }

                // Imprime un mensaje de libro no encontrado si no existe en el ArrayList.
                if (noEncontrado) {
                    System.out.println("Libro no encontrado.\n");
                }
            }
        } while (!"0".equals(autor));
        // Muestra un mensaje de salida.
        System.out.println("Saliendo del programa.");
        // Cierra el scanner.
        sc.close();
    }
}

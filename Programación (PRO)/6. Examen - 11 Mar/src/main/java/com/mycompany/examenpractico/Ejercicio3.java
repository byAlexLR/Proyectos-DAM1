/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenpractico;

// Paquetes.
import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Ejercicio3 {

    // Método para contar las apariciones de una palabra en una frase
    public static int contarPalabras(String frase, String palabra) {
        int contador = 0;
        int indice = 0;

        // Convertir ambos a minúsculas para una búsqueda insensible a
        // mayúsculas/minúsculas
        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();

        // Buscar la palabra en la frase
        while ((indice = frase.indexOf(palabra, indice)) != -1) {
            contador++;
            indice += palabra.length();
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar la frase al usuario
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        // Solicitar la palabra al usuario
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        // Contar las apariciones de la palabra en la frase
        int apariciones = contarPalabras(frase, palabra);

        // Mostrar el resultado
        System.out.println("La palabra '" + palabra + "' aparece " + apariciones + " veces en la frase.");

        sc.close();
    }
}

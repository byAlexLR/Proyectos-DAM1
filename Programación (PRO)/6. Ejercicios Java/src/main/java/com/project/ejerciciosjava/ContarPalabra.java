/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

// Paquetes
import java.util.Scanner;

/**
 * 
 * @autor byAlexLR
 */
public class ContarPalabra {

    /**
     * Método que cuenta la cantidad de veces que una palabra aparece en una frase.
     */
    public static int contarApariciones(String frase, String palabra) {
        String[] palabras = frase.split("\\s+");
        int contador = 0;

        for (String p : palabras) {
            if (p.equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Método principal que ejecuta el programa y cuenta las apariciones de una
     * palabra en una frase introducida por el usuario.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        System.out.println("Introduce la palabra a buscar:");
        String palabra = sc.nextLine();
        sc.close();

        System.out.println("La palabra aparece " + ContarPalabra.contarApariciones(frase, palabra) + " veces.");
    }
}
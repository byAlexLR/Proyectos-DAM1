/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

// Paquetes
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @autor byAlexLR
 */
public class Anagrama {

    /**
     * Método que verifica si dos palabras son anagramas.
     */
    public static boolean sonAnagramas(String palabra1, String palabra2) {
        char[] arr1 = palabra1.toLowerCase().toCharArray();
        char[] arr2 = palabra2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    /**
     * Método principal que ejecuta el programa y verifica si dos palabras son
     * anagramas.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera palabra:");
        String palabra1 = sc.next();
        System.out.println("Introduce la segunda palabra:");
        String palabra2 = sc.next();
        sc.close();

        System.out.println("¿Son anagramas? " + Anagrama.sonAnagramas(palabra1, palabra2));
    }
}
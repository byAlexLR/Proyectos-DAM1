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
public class Palindromo {

    /**
     * Método que verifica si una frase es palíndroma.
     */
    public static boolean esPalindromo(String frase) {
        String fraseLimpia = frase.replaceAll("\\s+", "").toLowerCase();
        String invertida = new StringBuilder(fraseLimpia).reverse().toString();
        return fraseLimpia.equals(invertida);
    }

    /**
     * Método principal que ejecuta el programa y verifica si una frase introducida
     * por el usuario es palíndroma.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        sc.close();

        System.out.println("¿Es palíndroma? " + Palindromo.esPalindromo(frase));
    }
}
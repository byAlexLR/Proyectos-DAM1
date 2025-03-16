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
public class TraductorJavalandia {

    /**
     * Método que traduce una frase del idioma de Javalandia al español.
     */
    public static String traducir(String frase) {
        if (frase.startsWith("Javalín, javalón")) {
            return frase.substring(17).trim();
        } else if (frase.endsWith("javalén, len, len")) {
            return frase.substring(0, frase.length() - 17).trim();
        }
        return "No está en el idioma de Javalandia.";
    }

    /**
     * Método principal que ejecuta el programa y traduce una frase introducida por
     * el usuario del idioma de Javalandia.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase en idioma de Javalandia:");
        String frase = sc.nextLine();
        sc.close();

        System.out.println("Traducción: " + TraductorJavalandia.traducir(frase));
    }
}
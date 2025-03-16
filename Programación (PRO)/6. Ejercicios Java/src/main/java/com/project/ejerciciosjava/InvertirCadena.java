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
public class InvertirCadena {

    /**
     * Método que invierte una cadena de texto.
     */
    public static String invertir(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    /**
     * Método principal que ejecuta el programa y muestra la cadena invertida.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena:");
        String cadena = sc.nextLine();
        String invertida = invertir(cadena);
        System.out.println("Cadena invertida: " + invertida);
        sc.close();
    }
}
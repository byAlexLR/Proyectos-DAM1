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
public class CompararFrases {
    private String frase1;
    private String frase2;

    /**
     * Constructor que solicita al usuario que introduzca dos frases.
     */
    public CompararFrases() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera frase:");
        frase1 = sc.nextLine();
        System.out.println("Introduce la segunda frase:");
        frase2 = sc.nextLine();
        sc.close();
    }

    /**
     * Método que muestra cuál de las dos frases es más corta.
     */
    public void mostrarFraseMasCorta() {
        if (frase1.length() < frase2.length()) {
            System.out.println("La frase más corta es: " + frase1);
        } else if (frase2.length() < frase1.length()) {
            System.out.println("La frase más corta es: " + frase2);
        } else {
            System.out.println("Ambas frases tienen la misma longitud.");
        }
    }

    /**
     * Método principal que ejecuta el programa y compara las frases introducidas.
     */
    public static void main(String[] args) {
        CompararFrases comparar = new CompararFrases();
        comparar.mostrarFraseMasCorta();
    }
}
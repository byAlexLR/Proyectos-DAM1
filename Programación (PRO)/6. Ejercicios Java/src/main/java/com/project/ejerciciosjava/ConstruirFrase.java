/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

// Paquetes
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @autor byAlexLR
 */
public class ConstruirFrase {

    /**
     * Método que construye una frase a partir de palabras introducidas por el
     * usuario.
     */
    public static String construirFrase() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();

        System.out.println("Introduce palabras (escribe 'fin' para terminar):");
        while (true) {
            String palabra = sc.next();
            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }
            palabras.add(palabra);
        }
        sc.close();

        return String.join(" ", palabras);
    }

    /**
     * Método principal que ejecuta el programa y muestra la frase construida.
     */
    public static void main(String[] args) {
        System.out.println("Frase final: " + ConstruirFrase.construirFrase());
    }
}
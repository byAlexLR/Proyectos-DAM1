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
public class ContarEspacios {

    /**
     * Método que cuenta el número de espacios en una frase.
     */
    public static int contarEspacios(String frase) {
        int espacios = 0;
        for (char c : frase.toCharArray()) {
            if (c == ' ') {
                espacios++;
            }
        }
        return espacios;
    }

    /**
     * Método principal que ejecuta el programa y cuenta los espacios en una frase
     * introducida por el usuario.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        sc.close();

        System.out.println("Número de espacios: " + ContarEspacios.contarEspacios(frase));
    }
}
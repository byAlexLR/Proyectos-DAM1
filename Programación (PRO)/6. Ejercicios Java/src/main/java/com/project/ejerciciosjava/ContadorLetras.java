/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

// Paquetes
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @autor byAlexLR
 */
public class ContadorLetras {

    /**
     * Método que cuenta la frecuencia de letras en una frase.
     */
    public static void contarLetras(String frase) {
        HashMap<Character, Integer> mapa = new HashMap<>();

        // Cuenta la frecuencia de cada letra en la frase
        for (char c : frase.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                mapa.put(c, mapa.getOrDefault(c, 0) + 1);
            }
        }

        // Muestra la frecuencia de cada letra
        for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " veces");
        }
    }

    /**
     * Método principal que ejecuta el programa y cuenta las letras en una frase
     * introducida por el usuario.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        sc.close();

        ContadorLetras.contarLetras(frase);
    }
}
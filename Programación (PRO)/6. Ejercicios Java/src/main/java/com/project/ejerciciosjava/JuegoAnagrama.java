/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

// Paquetes
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @autor byAlexLR
 */
public class JuegoAnagrama {

    /**
     * Método que genera un anagrama a partir de una palabra.
     */
    public static String generarAnagrama(String palabra) {
        List<Character> letras = new ArrayList<>();
        for (char c : palabra.toCharArray()) {
            letras.add(c);
        }
        Collections.shuffle(letras);

        StringBuilder anagrama = new StringBuilder();
        for (char c : letras) {
            anagrama.append(c);
        }
        return anagrama.toString();
    }

    /**
     * Método principal que ejecuta el programa y genera un anagrama a partir de una
     * palabra introducida por el usuario.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jugador 1, introduce una palabra:");
        String palabra = sc.next();
        sc.close();

        System.out.println("Anagrama generado: " + JuegoAnagrama.generarAnagrama(palabra));
    }
}
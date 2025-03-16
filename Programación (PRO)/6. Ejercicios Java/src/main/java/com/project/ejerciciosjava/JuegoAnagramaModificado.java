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
public class JuegoAnagramaModificado {

    /**
     * Método que cuenta las coincidencias de caracteres en posiciones específicas
     * entre dos palabras.
     */
    public static int contarCoincidencias(String original, String intento) {
        int coincidencias = 0;
        int longitud = Math.min(original.length(), intento.length());

        for (int i = 0; i < longitud; i++) {
            if (original.charAt(i) == intento.charAt(i)) {
                coincidencias++;
            }
        }
        return coincidencias;
    }

    /**
     * Método principal que ejecuta el programa y permite a un jugador intentar
     * adivinar la palabra original a partir de un anagrama.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jugador 1, introduce una palabra:");
        String original = sc.next();
        String anagrama = JuegoAnagrama.generarAnagrama(original);
        System.out.println("Anagrama generado: " + anagrama);

        String intento;
        do {
            System.out.println("Jugador 2, intenta adivinar la palabra original:");
            intento = sc.next();
            System.out.println("Coincidencias: " + JuegoAnagramaModificado.contarCoincidencias(original, intento));
        } while (!intento.equals(original));

        System.out.println("¡Correcto!");
        sc.close();
    }
}
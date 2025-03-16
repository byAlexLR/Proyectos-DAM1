/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

// Paquetes
import java.util.Random;

/**
 * 
 * @autor byAlexLR
 */
public class ArrayPares {

    /**
     * Método que rellena un array con números pares aleatorios dentro de un rango.
     */
    public static int[] rellenarPares(int longitud, int fin) {
        int[] pares = new int[longitud];
        Random rand = new Random();

        // Rellena el array con números pares aleatorios
        for (int i = 0; i < longitud; i++) {
            int num;
            do {
                num = rand.nextInt(fin - 1) + 2;
            } while (num % 2 != 0); // Asegura que el número generado es par
            pares[i] = num;
        }
        return pares;
    }

    /**
     * Método principal que ejecuta el programa y muestra el array de números pares.
     */
    public static void main(String[] args) {
        int[] resultado = ArrayPares.rellenarPares(5, 50);
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}
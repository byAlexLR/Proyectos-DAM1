/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

// Paquetes
import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @autor byAlexLR
 */
public class SepararParesImpares {

    /**
     * Método que separa y ordena números pares e impares de un array.
     */
    public static void separarNumeros(int[] numeros) {
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        // Separa los números en pares e impares
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        // Ordena los números pares e impares
        Collections.sort(pares);
        Collections.sort(impares);

        // Muestra los números pares e impares
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

    /**
     * Método principal que ejecuta el programa y separa los números pares e impares
     * de un array.
     */
    public static void main(String[] args) {
        int[] numeros = { 5, 12, 8, 23, 45, 34, 2, 89 };
        SepararParesImpares.separarNumeros(numeros);
    }
}
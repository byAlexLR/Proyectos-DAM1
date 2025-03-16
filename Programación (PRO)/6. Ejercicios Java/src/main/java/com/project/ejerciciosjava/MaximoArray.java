/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

/**
 * 
 * @autor byAlexLR
 */
public class MaximoArray {

    /**
     * Método que encuentra el valor máximo en un array.
     */
    public static int maximo(int[] t) {
        int max = t[0];
        for (int num : t) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Método principal que ejecuta el programa y encuentra el valor máximo en un array de números.
     */
    public static void main(String[] args) {
        int[] numeros = { 5, 12, 8, 34, 2, 89, 45 };
        System.out.println("El número máximo es: " + MaximoArray.maximo(numeros));
    }
}
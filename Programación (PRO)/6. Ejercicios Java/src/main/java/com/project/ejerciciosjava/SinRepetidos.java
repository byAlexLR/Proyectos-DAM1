/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

// Paquetes
import java.util.HashSet;

/**
 * 
 * @autor byAlexLR
 */
public class SinRepetidos {

    /**
     * Método que elimina los números duplicados de un array.
     */
    public static int[] eliminarDuplicados(int[] t) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : t) {
            set.add(num);
        }

        int[] resultado = new int[set.size()];
        int i = 0;
        for (int num : set) {
            resultado[i++] = num;
        }
        return resultado;
    }

    /**
     * Método principal que ejecuta el programa y elimina los números duplicados de
     * un array.
     */
    public static void main(String[] args) {
        int[] numeros = { 5, 12, 5, 23, 12, 45, 23, 50 };
        int[] sinRepetidos = SinRepetidos.eliminarDuplicados(numeros);
        for (int num : sinRepetidos) {
            System.out.print(num + " ");
        }
    }
}
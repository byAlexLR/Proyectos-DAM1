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
public class ArraySuma {
    private int[] numeros;

    /**
     * Constructor que inicializa el array con 10 números aleatorios entre 1 y 100.
     */
    public ArraySuma() {
        numeros = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }
    }

    /**
     * Método que calcula la suma de los números en el array.
     */
    public int calcularSuma() {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    /**
     * Método que muestra los números en el array.
     */
    public void mostrarNumeros() {
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Método principal que ejecuta el programa, muestra los números y calcula la
     * suma.
     */
    public static void main(String[] args) {
        ArraySuma array = new ArraySuma();
        array.mostrarNumeros();
        System.out.println("Suma: " + array.calcularSuma());
    }
}
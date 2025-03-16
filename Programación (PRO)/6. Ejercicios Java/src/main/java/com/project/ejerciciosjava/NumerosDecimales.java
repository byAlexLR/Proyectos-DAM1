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
public class NumerosDecimales {
    private double[] numeros;

    /**
     * Constructor que inicializa un array de números decimales introducidos por el
     * usuario.
     */
    public NumerosDecimales() {
        numeros = new double[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 5 números decimales:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }
        sc.close();
    }

    /**
     * Método que muestra los números decimales almacenados en el array.
     */
    public void mostrarNumeros() {
        for (double num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Método principal que ejecuta el programa y muestra los números decimales
     * introducidos por el usuario.
     */
    public static void main(String[] args) {
        NumerosDecimales numeros = new NumerosDecimales();
        numeros.mostrarNumeros();
    }
}
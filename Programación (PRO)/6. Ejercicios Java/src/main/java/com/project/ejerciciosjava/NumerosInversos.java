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
public class NumerosInversos {
    private int[] numeros;

    /**
     * Constructor que inicializa un array de números enteros introducidos por el
     * usuario.
     */
    public NumerosInversos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos números quieres introducir? ");
        int n = sc.nextInt();
        numeros = new int[n];

        System.out.println("Introduce los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }
        sc.close();
    }

    /**
     * Método que muestra los números en orden inverso.
     */
    public void mostrarInverso() {
        System.out.println("Números en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    /**
     * Método principal que ejecuta el programa y muestra los números introducidos
     * en orden inverso.
     */
    public static void main(String[] args) {
        NumerosInversos numeros = new NumerosInversos();
        numeros.mostrarInverso();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

/**
 * 
 * @autor byAlexLR
 */
public class Matriz {
    private int[][] matriz;

    /**
     * Constructor que inicializa una matriz de 5x5 con valores específicos.
     */
    public Matriz() {
        matriz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = 10 * i + j;
            }
        }
    }

    /**
     * Método que muestra los valores de la matriz.
     */
    public void mostrarMatriz() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Método principal que ejecuta el programa y muestra la matriz inicializada.
     */
    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        matriz.mostrarMatriz();
    }
}
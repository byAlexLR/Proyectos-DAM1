/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

// Paquetes
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @autor byAlexLR
 */
public class CamaraSecreta {
    private int[] combinacionSecreta;

    /**
     * Constructor que inicializa la combinación secreta con números aleatorios.
     */
    public CamaraSecreta(int longitud) {
        Random rand = new Random();
        combinacionSecreta = new int[longitud];

        // Genera una combinación secreta de números aleatorios entre 1 y 5
        for (int i = 0; i < longitud; i++) {
            combinacionSecreta[i] = rand.nextInt(5) + 1;
        }
    }

    /**
     * Método para jugar a adivinar la combinación secreta.
     */
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int[] intento = new int[combinacionSecreta.length];
        boolean acertado = false;

        // Bucle que continúa hasta que se adivine la combinación secreta
        while (!acertado) {
            System.out.println("Introduce tu combinación:");
            for (int i = 0; i < intento.length; i++) {
                intento[i] = scanner.nextInt();
            }

            acertado = true;
            // Compara el intento con la combinación secreta y da pistas
            for (int i = 0; i < intento.length; i++) {
                if (intento[i] > combinacionSecreta[i]) {
                    System.out.print("↓");
                    acertado = false;
                } else if (intento[i] < combinacionSecreta[i]) {
                    System.out.print("↑");
                    acertado = false;
                } else {
                    System.out.print("✔");
                }
            }
            System.out.println();
        }
        System.out.println("¡Combinación correcta!");
        scanner.close();
    }

    /**
     * Método principal que ejecuta el programa y empieza el juego.
     */
    public static void main(String[] args) {
        CamaraSecreta juego = new CamaraSecreta(4);
        juego.jugar();
    }
}
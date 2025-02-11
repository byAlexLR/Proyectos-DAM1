/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class EspiralNumeros {

    private int n;

    public EspiralNumeros(int n) {
        this.n = n;
    }

    private void imprimirvalor(int fila, int columna, int valor) {
        if (columna == n - 1) {
            System.out.printf("%3d%n", valor);
        } else {
            System.out.printf("%3d", valor);
        }
    }

    public void generarEspiral() {
        int valor = 1, inicio = 0, fin = n - 1;

        while (inicio <= fin) {
            for (int i = inicio; i <= fin; i++) {
                imprimirvalor(inicio, i, valor++);
            }
            for (int i = inicio + 1; i <= fin; i++) {
                imprimirvalor(i, fin, valor++);
            }
            for (int i = fin - 1; i >= inicio; i--) {
                imprimirvalor(fin, i, valor++);
            }
            for (int i = fin - 1; i > inicio; i--) {
                imprimirvalor(i, inicio, valor++);
            }
            inicio++;
            fin--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la espiral: ");
        int n = sc.nextInt();
        sc.close();

        EspiralNumeros espiral = new EspiralNumeros(n);
        espiral.generarEspiral();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class CuadradoHueco {

    private int tamano;

    public CuadradoHueco(int tamano) {
        this.tamano = tamano;
    }

    public void dibujarCuadrado() {
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i == 0 || i == tamano - 1 || j == 0 || j == tamano - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int tamano = sc.nextInt();
        sc.close();

        CuadradoHueco dibuja = new CuadradoHueco(tamano);
        dibuja.dibujarCuadrado();
    }
}

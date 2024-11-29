/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class EjercicioExtra {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        piramide(sc);
    }

    public static void piramide(Scanner sc) {
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        for (int altura = 1; altura <= num; altura++) {
            for (int espacio = 1; espacio <= num - altura; espacio++) {
                System.out.print(" ");
            }

            for (int asterisco = 1; asterisco <= (altura * 2) - 1; asterisco++) {
                System.out.print(altura);
            }
            System.out.println("");
        }

    }
}

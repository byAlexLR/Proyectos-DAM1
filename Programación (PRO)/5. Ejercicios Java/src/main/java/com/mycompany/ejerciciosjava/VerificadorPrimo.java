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
public class VerificadorPrimo {

    private int num;

    public VerificadorPrimo(int num) {
        this.num = num;
    }

    public boolean esPrimo() {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número a verificar: ");
        int num = sc.nextInt();
        sc.close();

        VerificadorPrimo verificador = new VerificadorPrimo(num);
        System.out.println("El numero es primo: " + verificador.esPrimo());
    }
}

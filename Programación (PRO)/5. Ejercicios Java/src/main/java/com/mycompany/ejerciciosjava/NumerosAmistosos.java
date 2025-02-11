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
public class NumerosAmistosos {

    private int num1, num2;

    public NumerosAmistosos(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    private int sumaDivisores(int num) {
        int suma = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public boolean sonAmistosos() {
        return sumaDivisores(num1) == num2 && sumaDivisores(num2) == num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        sc.close();

        NumerosAmistosos numeros = new NumerosAmistosos(num1, num2);
        if (numeros.sonAmistosos()) {
            System.out.println("Los números " + num1 + " y " + num2 + " son amistosos.");
        } else {
            System.out.println("Los números " + num1 + " y " + num2 + " no son amistosos.");
        }
    }
}

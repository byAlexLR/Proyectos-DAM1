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
public class Factorial {

    private int numero;

    public Factorial(int numero) {
        this.numero = numero;
    }

    public long calcularFactorial() {
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para calcular su factorial: ");
        int numero = sc.nextInt();
        sc.close();

        Factorial factorial = new Factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial.calcularFactorial());
    }
}

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
public class NumeroAutomorfico {

    private int num;

    public NumeroAutomorfico(int num) {
        this.num = num;
    }

    public boolean esAutomorfico() {
        int cuadrado = num * num;
        String numeroStr = String.valueOf(num);
        String cuadradoStr = String.valueOf(cuadrado);
        return cuadradoStr.endsWith(numeroStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        sc.close();

        NumeroAutomorfico auto = new NumeroAutomorfico(num);
        if (auto.esAutomorfico()) {
            System.out.println("El número es automórfico");
        } else {
            System.out.println("El número no es automórfico");
        }
    }
}

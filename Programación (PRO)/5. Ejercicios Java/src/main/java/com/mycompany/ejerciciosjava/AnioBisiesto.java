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
public class AnioBisiesto {

    private int num;

    public AnioBisiesto(int num) {
        this.num = num;
    }

    public void esBisiesto() {
        if (num % 4 == 0) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("No es bisiesto.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el año: ");
        int num = sc.nextInt();
        sc.close();

        AnioBisiesto bisiesto = new AnioBisiesto(num);
        bisiesto.esBisiesto();
    }
}

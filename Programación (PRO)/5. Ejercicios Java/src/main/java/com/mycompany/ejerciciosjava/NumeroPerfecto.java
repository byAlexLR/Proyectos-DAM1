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
public class NumeroPerfecto {

    private int num;

    public NumeroPerfecto(int num) {
        this.num = num;
    }

    public boolean esPerfecto() {
        int suma = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma == num;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        sc.close();
        
        NumeroPerfecto tipo = new NumeroPerfecto(num);
        System.out.println("El número es perfecto: " + tipo.esPerfecto());
    }
}

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
public class SumaDigitos {

    private int num;

    public SumaDigitos(int num) {
        this.num = num;
    }

    public int calcularSuma() {
        int suma = 0;
        while (num > 0) { // Vuelve a ejecutarse
            suma += num % 10; // Saca el resto
            num /= 10; // Elimina el último número
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        sc.close();

        SumaDigitos suma = new SumaDigitos(num);
        System.out.println("La suma del número " + num + " es: " + suma.calcularSuma());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examensorpresa;

import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Ejercicio4 {
        public static void main(String[] args) {
        int num1, num2;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Número 1: "); //Imprime mensaje del número 1
        num1 = sc.nextInt(); //Lee el número
        System.out.print("Número 2: "); //Imprime mensaje del número 2
        num2 = sc.nextInt(); //Lee el número
        
        System.out.println("El resultado es:"); //Apartado
        System.out.println("Suma: " + (num1+num2)); 
        System.out.println("Resta: " + (num1-num2));
        System.out.println("Multiplicación: " + (num1*num2));
        System.out.println("División: " + (num1/num2));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.project.ejerciciosjava;

import java.util.Scanner; // Importa la clase Scanner.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio7 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Inicia la variable scanner.
        Mes(sc); // Llamamos al método con la variable sc.
    }

    public static void Mes(Scanner sc) { // Método e importamos las variables del main necesarias.
        System.out.println("- EJERCICIO 7 (DÍAS DE MES) -"); // Dice el apartado.
        System.out.print("Introduce un mes: "); // Solicita al usuario que ingrese un número.
        int mes = sc.nextInt(); // Lee lo escrito y se hace la variable.

        if (mes >= 1 || mes <= 12) { // Comprueba si el número está entre el 1 y el 12.
            switch (mes) { // Estructura switch que determina el número introducido al mes correspondiente.
                case 1 -> // Enero
                    System.out.println("Enero tiene 31 dias");
                case 2 -> // Febrero
                    System.out.println("Febrero tiene 29 días");
                case 3 -> // Marzo
                    System.out.println("Marzo tiene 31 días");
                case 4 -> // Abril
                    System.out.println("Abril tiene 30 días");
                case 5 -> // Mayo
                    System.out.println("Mayo tiene 31 días");
                case 6 -> // Junio
                    System.out.println("Junio tiene 30 días");
                case 7 -> // Julio
                    System.out.println("Julio tiene 31 días");
                case 8 -> // Agosto
                    System.out.println("Agosto tiene 31 días");
                case 9 -> // Septiembre
                    System.out.println("Septiembre tiene 30 días");
                case 10 -> // Octubre
                    System.out.println("Octubre tiene 31 días");
                case 11 -> // Noviembre
                    System.out.println("Noviembre tiene 30 días");
                case 12 -> // Diciembre
                    System.out.println("Diciembre tiene 31 días");
            }
        }
    }
}
    
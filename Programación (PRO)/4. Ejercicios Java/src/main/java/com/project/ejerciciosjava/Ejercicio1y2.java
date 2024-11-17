/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.ejerciciosjava;

import java.util.Scanner; // Importa la clase Scanner.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio1y2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Inicia la variable scanner.
        ParImpar(sc); // Llamamos al método con la variable sc.
        Multiplo(sc); // Llamamos al método con la variable sc.
    }

    public static void ParImpar(Scanner sc) { // Método e importamos las variables del main necesarias.
        System.out.println("- EJERCICIO 1 (PAR O IMPAR) -"); // Dice el apartado.
        System.out.print("Introduce un número: "); // Solicita al usuario que ingrese un número.
        int num1 = sc.nextInt(); // Lee lo escrito y se hace la variable.

        if ((num1 % 2) == 0) {  // Verifica si el número es par (divisible por 2)
            System.out.println("El número " + num1 + " es par."); // Dice el resultado si es par.
        } else {
            System.out.println("El número " + num1 + " es impar."); // Dice el resultado si es impar.
        }
    }

    public static void Multiplo(Scanner sc) { // Método e importamos las variables del main n
        System.out.print("Introduce un número: "); // Solicita al usuario que ingrese una letrecesarias.
        System.out.println("- EJERCICIO 2 (MÚLTIPLO DE 10) -"); // Dice el apartado.
        System.out.print("Introduce un número: "); // Solicita al usuario que ingrese un número.
        int num1 = sc.nextInt(); // Lee lo escrito y se hace la variable.

        if ((num1 % 10) == 0) { // Verifica si el número es múltiplo de 10 (es divisible por 10)
            System.out.println("El número " + num1 + " es múltiplo de 10."); // Dice el resultado si es múltiplo.
        } else {
            System.out.println("El número " + num1 + " no es múltiplo de 10."); // Dice el resultado si no es múltiplo.
        }
    }
}

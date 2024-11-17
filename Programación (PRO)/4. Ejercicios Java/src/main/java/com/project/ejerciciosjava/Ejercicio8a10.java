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
public class Ejercicio8a10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Inicia la variable scanner.
        ContadorWhile(sc); // Llamamos al método con la variable sc.
        ContadorFor(sc); // Llamamos al método con la variable sc.
        Contador2y3(sc); // Llamamos al método con la variable sc.
    }

    public static void ContadorWhile(Scanner sc) { // Método e importamos las variables del main necesarias.
        System.out.println("- EJERCICIO 8 (CONTADOR WHILE) -"); // Dice el apartado.
        int i = 0; // Inicia la variable i con el valor 0.

        while (i < 100) { // Bucle while: se ejecuta mientras i sea menor que 100.
            System.out.println("Contador While - " + ++i); // Muestra un mensaje del contador y va incrementando el número.
        }
    }

    public static void ContadorFor(Scanner sc) { // Método e importamos las variables del main necesarias.
        System.out.println("- EJERCICIO 9 (CONTADOR FOR) -"); // Dice el apartado.

        for (int i = 1; i <= 100; i++) { // Bucle for: inicializa i en 1, incrementa hasta 100.
            System.out.println("Contador For - " + i); // Muestra un mensaje del contador.
        }
    }

    public static void Contador2y3(Scanner sc) { // Método e importamos las variables del main necesarias.
        System.out.println("- EJERCICIO 10 (CONTADOR DIVISIBLE ENTRE 2 Y 3) -"); // Dice el apartado.

        for (int i = 1; i <= 100; i++) { // Bucle for: inicializa i en 1, incrementa hasta 100.
            if ((i % 2) == 0 && (i % 3) == 0) { // Comprueba si el número es divisible por 2 y por 3.
                System.out.println("Contador Divisible Entre 2 y 3 - " + i); // Muestra un mensaje del contador.
            }
        }
    }
}

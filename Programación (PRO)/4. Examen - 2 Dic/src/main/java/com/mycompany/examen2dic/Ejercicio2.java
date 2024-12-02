/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2dic;

import java.util.Scanner; // Importa la clase Scanner.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos la variable Scanner.
        calcula(sc); // Crea el método e importamos la variable sc.
    }

    public static void calcula(Scanner sc) { // Método con la variable Scanner importada.
        System.out.println("¡Vamos a usar la Calculadora!"); // Título de lo que va a hacer.
        System.out.print("¡Por favor! Introduce el primer número: "); // Pide al usuario que inserte un primer número.
        int num1 = sc.nextInt(); // Lo lee y almacena en la variable creada.
        System.out.print("Inserta el operador (+, -, x, /): "); // Pide al usuario que inserte el operador.
        String ope = sc.next(); // Lo lee y almacena en la variable creada.
        System.out.print("Ahora introduce el segundo número: "); // Pide al usuario que inserte un segundo número.
        int num2 = sc.nextInt(); // Lo lee y almacena en la variable creada.

        if ("/".equals(ope)) {
            if (num2 == 0) { // Comprueba si el divisor es igual a cero, si lo es imprime el mensaje.
                System.out.println("El divisor es igual a cero, por ello no se ha podido realizar la división.");
            } else {
                System.out.println("La división de " + num1 + " y " + num2 + " es: " + (num1 / num2)); // División, mensaje con su enunciado y respectivo resultado.
            }
        } else {
            switch (ope) { // Switch del operador.
                case "+" -> // Suma, mensaje con su enunciado y respectivo resultado.
                    System.out.println("La suma de " + num1 + " + " + num2 + " es: " + (num1 + num2));
                case "-" -> // Resta, mensaje con su enunciado y respectivo resultado.
                    System.out.println("La resta de " + num1 + " - " + num2 + " es: " + (num1 - num2));
                case "x" -> // Multiplicación, mensaje con su enunciado y respectivo resultado.
                    System.out.println("La multiplicación de " + num1 + " x " + num2 + " es: " + (num1 * num2));
                default -> // En el caso de que el operador no sea el correcto.
                    System.out.println("El operador introducido es incorrecto.");
            }
        }
    }
}

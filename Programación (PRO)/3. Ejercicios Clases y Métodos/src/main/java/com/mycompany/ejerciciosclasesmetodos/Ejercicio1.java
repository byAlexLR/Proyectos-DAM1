/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciosclasesmetodos;

/**
 *
 * @author byAlexLR
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        int num1 = 5, num2 = 10; // Iniciamos las variables con los valores predefinidos.

        System.out.println("Los numeros utilizados son " + num1 + " y " + num2 + ":"); // Muestra un mensaje de contexto, comunicando los números a usar.
        System.out.println("Suma: " + operaciones(num1, num2, 'S')); // Muestra el resultado al usuario, llamando al método que realiza la operación.
        System.out.println("Resta: " + operaciones(num1, num2, 'R')); // Muestra el resultado al usuario, llamando al método que realiza la operación.
        System.out.println("Multiplicacion: " + operaciones(num1, num2, 'M')); // Muestra el resultado al usuario, llamando al método que realiza la operación.
        System.out.println("Division: " + operaciones(num1, num2, 'D')); // Muestra el resultado al usuario, llamando al método que realiza la operación.
        System.out.println("Modulo: " + operaciones(num1, num2, 'O')); // Muestra el resultado al usuario, llamando al método que realiza la operación.
    }

    public static int operaciones(int num1, int num2, char s) {
        return switch (s) { // Utilizamos la estructura switch para hacer los cálculos.
            case 'S' -> num1 + num2; // Realizamos la suma de los números, nombrados anteriormente.
            case 'R' -> num1 - num2; // Realizamos la resta de los números, nombrados anteriormente.
            case 'M' -> num1 * num2; // Realizamos la multiplicación de los números, nombrados anteriormente.
            case 'D' -> num1 / num2; // Realizamos la división de los números, nombrados anteriormente.
            default -> num1 % num2; // Realizamos el módulo (el resto) de los números, nombrados anteriormente.
        };
    }
}

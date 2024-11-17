/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.project.ejerciciosjava;

import javax.swing.JOptionPane; // Importa la clase JOptionPane.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio5y6 {

    public static void main(String args[]) {
        Divisor(); // Llamamos al método.
        NumMayor(); // Llamamos al método.
    }

    public static void Divisor() { // Método.
        JOptionPane.showMessageDialog(null, "- EJERCICIO 5 (DIVISIÓN) -"); // Dice el apartado. 
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo:")); // Solicita al usuario que ingrese un dividendo y crea la variable.
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor:")); // Solicita al usuario que ingrese un divisor y crea la variable.

        if (num2 == 0) { // Comprueba si el divisor es igual a 0.
            JOptionPane.showMessageDialog(null, "El divisor " + num2 + " es igual a 0."); // Muestra un mensaje indicando que el divisor es igual a 0.
        } else {
            JOptionPane.showMessageDialog(null, "El resultado de dividir " + num1 + " entre " + num2 + " es: " + num1 / num2); // Muestra un mensaje de los números a dividir y el resultado.
        }
    }

    public static void NumMayor() { // Método.
        JOptionPane.showMessageDialog(null, "- EJERCICIO 6 (NÚMERO MAYOR) -"); // Dice el apartado.
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el 1º Número:")); // Solicita al usuario que ingrese un primer número y crea la variable.
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el 2º Número:")); // Solicita al usuario que ingrese un segundo número y crea la variable.
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el 3º Número:")); // Solicita al usuario que ingrese un tercer número y crea la variable.

        if ((num1 > num2) && (num1 > num3)) { // Comprueba si el nº 1 es mayor que el nº 2 y 3.
            JOptionPane.showMessageDialog(null, "El número " + num1 + " es mayor que " + num2 + " y " + num3 + "."); // Muestra un mensaje indicando que el nº1 es mayor que el resto.
        } else if (num2 > num3) { // Comprueba si el nº 2 es mayor que el 3.
            JOptionPane.showMessageDialog(null, "El número " + num2 + " es mayor que " + num1 + " y " + num3 + "."); // Muestra un mensaje indicando que el nº2 es mayor que el resto.
        } else {
            JOptionPane.showMessageDialog(null, "El número " + num3 + " es mayor que " + num1 + " y " + num2 + "."); // Muestra un mensaje indicando que el nº3 es mayor que el resto.
        }
    }
}

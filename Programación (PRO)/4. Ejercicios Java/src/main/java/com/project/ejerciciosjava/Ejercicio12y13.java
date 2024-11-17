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
public class Ejercicio12y13 {

    public static void main(String args[]) {
        ecuacion2(); // Llamamos al método.
        numMayorDoWhile(); // Llamamos al método.
    }

    public static void ecuacion2() { // Método.
        JOptionPane.showMessageDialog(null, "- EJERCICIO 12 (ECUACIÓN DE SEGUNDO GRADO) -"); // Dice el apartado.

        int a = Integer.parseInt(JOptionPane.showInputDialog("Establece el valor de A:")); // Solicita al usuario que ingrese un valor a A.
        int b = Integer.parseInt(JOptionPane.showInputDialog("Establece el valor de B:")); // Solicita al usuario que ingrese un valor a B.
        int c = Integer.parseInt(JOptionPane.showInputDialog("Establece el valor de C:")); // Solicita al usuario que ingrese un valor a C.

        JOptionPane.showMessageDialog(null, "Nuestra ecuación de segundo grado sería: " + a + "x^2 + " + b + "x + " + c + "= 0"); // Muestra la ecuación en la pantalla.

        int discriminante = b * b - 4 * a * c; // Calcula el discriminante de la ecuación.

        if (discriminante > 0) { // Comprueba el valor del discriminante si es mayor a 0.
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a); // Fórmula parte positiva.
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a); // Fórmula parte negativa.
            JOptionPane.showMessageDialog(null, "La solución es: X1 = " + String.format("%.2f", x1) + " y X2 = " + String.format("%.2f", x2)); // Muestra las soluciones X1 y X2 con dos decimales.
        } else if (discriminante == 0) { // Comprueba el valor del discriminante si es igual a 0.
            double x = -b / (2 * a); // Fórmula de solución única.
            JOptionPane.showMessageDialog(null, "La solución es: X = " + String.format("%.2f", x)); // Muestra la solución única X con dos decimales.
        } else {
            JOptionPane.showMessageDialog(null, "No hay soluciones reales."); // Muestra un mensaje diciendo que no hay solución.
        }
    }

    public static void numMayorDoWhile() { // Método.
        JOptionPane.showMessageDialog(null, "- EJERCICIO 13 (NÚMERO MAYOR O IGUAL A 0) -"); // Dice el apartado.

        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:")); // Solicita al usuario que ingrese un número.
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:")); // Solicita al usuario que ingrese un número.
        } while (num <= 0); // Bucle do-while: Mantiene el bucle hasta que el número sea mayor o igual a 0.

        JOptionPane.showMessageDialog(null, "El número " + num + " es igual o mayor que 0."); // Muestra un mensaje diciendo que el número introducido es igual o mayor que 0.
    }
}

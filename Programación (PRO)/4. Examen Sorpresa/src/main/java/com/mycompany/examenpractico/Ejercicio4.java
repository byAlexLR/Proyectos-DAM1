/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenpractico;

import javax.swing.JOptionPane; // Importa la clase JOptionPane.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        insertarNum(); // Llamamos al método.
        insertarNum1(); // Llamamos al método.
    }

    public static void insertarNum() { // Método.
        int contador = 0, cierre = -1, num = 0; // Inicia las variables.
        while (num != cierre) { // Bucle While: Si el num es igual al cierre se para el bucle. Sino, sigue.
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: ")); // Solicita al usuario que ingrese un número.
            contador++; // Suma un 1 a la variable, es decir, va contando las veces que se inserta un número.
        }
        JOptionPane.showMessageDialog(null, "Se ha insertado un número " + contador + " veces."); // Dice el número de veces que se ha insertado un número.
    }

    public static void insertarNum1() { // Método.
        int contador = 0 + 1, cierre = -1, num; // Inicia las variables.
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: ")); // Solicita al usuario que ingrese un número.
            contador += num; // Realiza un contador sumando los números introducidos.
        } while (num != cierre); // Bucle Do-While: Si el "num" es igual al "cierre" se para el bucle. Sino, sigue.
        JOptionPane.showMessageDialog(null, "La insercción de números hace una suma de " + contador + " ."); // Dice la suma final de todos los números introducidos.
    }
}

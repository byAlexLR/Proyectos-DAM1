/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosclasesmetodos;

/**
 *
 * @author byAlexLR
 */

import javax.swing.JOptionPane; // Importa la clase JOptionPane.

public class Ejercicio4 {

    public static void main(String[] args) {
        ASCII(); // Llama al método ASCII.
        ASCIICHAR(); // Llama al método ASCIICHAR.
    }

    public static void ASCII() { // Método que devuelve el cáracter correspondiente al número.
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:")); // Iniciamos la variable e indicamos al usuario que introduzca el número.
        char caracter1 = (char) num1; // Iniciamos la variable y cambiamos el número a cáracter.
        JOptionPane.showMessageDialog(null, "El numero introducido corresponde al caracter: " + caracter1); // Muestra al usuario el resultado.
    }

    public static void ASCIICHAR() { // Método que devuelve el número correspondiente al cáracter.
        char caracter2 = JOptionPane.showInputDialog("Introduce una letra:").charAt(0); // Iniciamos la variable e indicamos al usuario que introduzca la letra.
        int num2 = (int) caracter2; // Iniciamos la variable y cambiamos el cáracter a número.
        JOptionPane.showMessageDialog(null, "La letra introducida corresponde al número: " + num2); // Muestra al usuario el resultado.
    }
}

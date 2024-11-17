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
public class Ejercicio3y4 {

    public static void main(String args[]) {
        LetraMayus(); // Llamamos al método.
        LetrasIguales(); // Llamamos al método.
    }

    public static void LetraMayus() { // Método.
        JOptionPane.showMessageDialog(null, "- EJERCICIO 3 (LETRA MAYÚS O MINÚS) -"); // Dice el apartado.
        char letra = JOptionPane.showInputDialog("Introduce una letra:").charAt(0); // Solicita al usuario que ingrese una letra y crea la variable.
        if (Character.isUpperCase(letra)) { // Comprueba si la letra es mayúscula.
            JOptionPane.showMessageDialog(null, "La letra '" + letra + "' es mayúscula."); // Muestra un mensaje si la letra es mayúscula.
        } else {
            JOptionPane.showMessageDialog(null, "La letra '" + letra + "' es minúscula."); // Muestra un mensaje si la letra es minúscula.
        }
    }

    public static void LetrasIguales() { // Método.
        JOptionPane.showMessageDialog(null, "- EJERCICIO 4 (LETRAS IGUALES) -"); // Dice el apartado.
        char letra1 = JOptionPane.showInputDialog("Introduce la 1º Letra:").charAt(0); // Solicita al usuario que ingrese una letra y crea la variable.
        char letra2 = JOptionPane.showInputDialog("Introduce la 2º Letra:").charAt(0); // Solicita al usuario que ingrese una letra y crea la variable.

        if (letra1 == letra2) { // Comprueba si las letras introducidas son iguales.
            JOptionPane.showMessageDialog(null, "La primera letra '" + letra1 + "' es igual a la segunda letra '" + letra2 + "'."); // Muestra un mensaje si las letras son iguales.
        } else {
            JOptionPane.showMessageDialog(null, "La primera letra '" + letra1 + "' no es igual a la segunda letra '" + letra2 + "'."); // Muestra un mensaje si las letras no son iguales.
        }
    }
}

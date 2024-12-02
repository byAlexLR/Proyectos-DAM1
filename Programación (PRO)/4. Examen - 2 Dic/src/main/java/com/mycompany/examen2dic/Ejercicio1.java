/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examen2dic;

import javax.swing.JOptionPane; // Importamos el JOptionPane.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        multipla(); // Crea el método.
    }

    public static void multipla() { // Método.
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para multiplicar")); // Creamos la variable y le decimos al usuario que introduzca un número.

        if (num > 0 && num < 11) { // Comprobamos que el número esté comprendido entre 1 y 10.
            JOptionPane.showMessageDialog(null, "Tabla de Multiplicar del " + num); // Título de la tabla a realizar.
            for (int i = 0; i <= 10; i++) { // Crea el Bucle For: para ir realizando la tabla y vaya haciendo los multiplicadores.
                JOptionPane.showMessageDialog(null, num + "x" + i + " = " + (num * i)); // Imprime el resultado en formato de tabla.
            }
        } else { // Si el número no se comprende entre 1 y 10, imprime el mensaje.
            JOptionPane.showMessageDialog(null, "El número introducido no está comprendido entre 1 y 10.");
        }
    }
}

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

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println(Bienvenida()); // Muestra el mensaje de Bienvenida con el nombre inicializado, llamando al método.
        BienvenidaIntroducida(); // Llama al método con el nombre "BienvenidaIntroducida".
    }

    public static String Bienvenida() {
        return "¡Bienvenido, Alex!"; // Lo devolvemos lo que tiene que imprimir.
    }

    public static String BienvenidaIntroducida() {
        String nombre2 = JOptionPane.showInputDialog("Introduce tu nombre:"); // Iniciamos la variable e indicamos al usuario que introduzca el nombre.
        JOptionPane.showMessageDialog(null, "¡Bienvenido, " + nombre2 + "!"); // // Muestra el mensaje de Bienvenida con el nombre introducido.
        return null; // Lo devolvemos.
    }
}

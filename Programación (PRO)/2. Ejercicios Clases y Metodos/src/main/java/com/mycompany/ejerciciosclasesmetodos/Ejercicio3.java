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

public class Ejercicio3 {

    public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio:")); // Iniciamos la variable e indicamos al usuario que introduzca el radio.
        double resultado = AreaCirculo(radio); // Llama al método con el nombre "AreaCirculo".
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + resultado); // Muestra el resultado del área al usuario en una pestaña.
    }

    public static double AreaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2); // Calculamos el área, Pi por radio elevado a 2.
        return area; // Devuelve el área.
    }
}

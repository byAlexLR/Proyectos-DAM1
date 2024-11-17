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

public class Ejercicio5 {

    public static void main(String[] args) {
        double iva = 0.21, igic = 0.07; // Iniciamos las variables iva e igic con su valor predefinido.
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el importe:")); // Solicita al usuario el importe a calcular.
        double importeIVA = IVA(precio, iva); // Calcula el importe final con iva usando el método.
        double importeIGIC = IGIC(precio, igic); // Calcula el importe final con igic usando el método.

        JOptionPane.showMessageDialog(null, "El importe es: " + String.format("%.2f", importeIVA) + "€ con IVA " + String.format("%.2f", importeIGIC) + "€ con IGIC."); // Muestra los resultados al usuario con una restricción de decimales.
        JOptionPane.showMessageDialog(null, "El importe es: " + importeIVA + "€ con IVA " + importeIGIC + "€ con IGIC."); // Muestra los resultados al usuario sin una restricción de decimales.
    }

    public static double IVA(double precio, double iva) { // Método que calcula el iva precio por iva y le suma el precio.
        return precio + (precio * iva);
    }

    public static double IGIC(double precio, double igic) { // Método que calcula el igic precio por igic y le suma el precio.
        return precio + (precio * igic);
    }
}

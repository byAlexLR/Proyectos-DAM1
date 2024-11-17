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
public class Ejercicio11 {

    public static void main(String args[]) {
        Ventas(); // Llamamos al método.
    }

    public static void Ventas() { // Método.
        JOptionPane.showMessageDialog(null, "- EJERCICIO 11 (VENTAS) -"); // Dice el apartado.
        int numVentas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de ventas:")); // Solicita al usuario que ingrese un número de ventas.
        double total = 0.0; // Inicia la variable total con el valor 0, para contabilizar cada venta.

        for (int i = 1; i <= numVentas; i++) { // Bucle for: repite el bucle hasta completar el "numVentas" introducido.
            double venta = Double.parseDouble(JOptionPane.showInputDialog("Introduce el importe nº" + i + ":")); // Solicita al usuario que ingrese una importe y crea la variable.
            total += venta; // Suma el importe de cada venta introducido al total.
        }

        JOptionPane.showMessageDialog(null, "La suma de las " + numVentas + " ventas es de: " + String.format("%.2f", total) + "€."); // Muestra un mensaje con el total de ventas y la suma de todas ellas.
    }
}

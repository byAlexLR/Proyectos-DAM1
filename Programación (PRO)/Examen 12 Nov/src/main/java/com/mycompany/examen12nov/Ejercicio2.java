/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen12nov;

import javax.swing.JOptionPane; // Importamos el JOptionPane.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Salario(); // Llama al método Salario.
    }

    public static void Salario() { // Creo el método
        String nombre = JOptionPane.showInputDialog("Podría introducir su nombre: "); // Creo la variable nombre y le indica que introduzca su nombre.
        int horas = Integer.parseInt(JOptionPane.showInputDialog("¡Bienvenido, " + nombre + "! Podría indicar las horas trabajadas: ")); // Le da la bienvenida personalizada y le pregunta las horas trabajadas.
        int cobrar = horas * 12; // Creo la fórmula, horas por el precio.
        JOptionPane.showMessageDialog(null, "Por un total de " + horas + "h trabajadas. La cantidad a cobrar sería de " + cobrar + "€."); // Le hago un resumen de sus horas trabajadas y le indica la cantidad que le pertenece.
    }
}

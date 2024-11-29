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
public class Ejercicio2 {

    public static void main(String[] args) {
        meses(); // Llamamos al método.
    }

    public static void meses() { // Método.
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce un mes (1-12): ")); // Solicita al usuario que ingrese un número de mes y crea la variable.
        String op = ""; // Iniciamos la variable.

        if (mes >= 1 || mes <= 12) { // Comprueba si el número está entre el 1 y el 12.
            if (mes == 2) {
                op = " que tiene 28 días."; // Si el mes es febrero, tiene 28 días.
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                op = " que tiene 30 días."; // Si el mes tiene 30 días.
            } else {
                op = " que tiene 31 días."; // Si el mes tiene 31 días.
            }
            switch (mes) { // Estructura switch que determina el número introducido al mes correspondiente.
                case 1 -> // Enero
                    JOptionPane.showMessageDialog(null, "El número " + mes + " corresponde al mes de Enero" + op); // Muestra un mensaje con el número correspondiente al mes y sus días.
                case 2 -> // Febrero
                    JOptionPane.showMessageDialog(null, "El número " + mes + " corresponde al mes de Febrero" + op); // Muestra un mensaje con el número correspondiente al mes y sus días.
                case 3 -> // Marzo
                    JOptionPane.showMessageDialog(null, "El número " + mes + " corresponde al mes de Marzo" + op); // Muestra un mensaje con el número correspondiente al mes y sus días.
                case 4 -> // Abril
                    JOptionPane.showMessageDialog(null, "El número " + mes + " corresponde al mes de Abril" + op); // Muestra un mensaje con el número correspondiente al mes y sus días.
                case 5 -> // Mayo
                    JOptionPane.showMessageDialog(null, "El número " + mes + " corresponde al mes de Mayo" + op); // Muestra un mensaje con el número correspondiente al mes y sus días.
                case 6 -> // Junio
                    JOptionPane.showMessageDialog(null, "El número " + mes + " corresponde al mes de Junio" + op); // Muestra un mensaje con el número correspondiente al mes y sus días.
                case 7 -> // Julio
                    JOptionPane.showMessageDialog(null, "El número " + mes + " corresponde al mes de Julio" + op); // Muestra un mensaje con el número correspondiente al mes y sus días.
                case 8 -> // Agosto
                    JOptionPane.showMessageDialog(null, "El número " + mes + " corresponde al mes de Agosto" + op); // Muestra un mensaje con el número correspondiente al mes y sus días.
                case 9 -> // Septiembre
                    JOptionPane.showMessageDialog(null, "El número " + mes + " corresponde al mes de Septiembre" + op); // Muestra un mensaje con el número correspondiente al mes y sus días.
                case 10 -> // Octubre
                    JOptionPane.showMessageDialog(null, "El número " + mes + " corresponde al mes de Octubre" + op); // Muestra un mensaje con el número correspondiente al mes y sus días.
                case 11 -> // Noviembre
                    JOptionPane.showMessageDialog(null, "El número " + mes + " corresponde al mes de Noviembre" + op); // Muestra un mensaje con el número correspondiente al mes y sus días.
                case 12 -> // Diciembre
                    JOptionPane.showMessageDialog(null, "El número " + mes + " corresponde al mes de Diciembre." + op); // Muestra un mensaje con el número correspondiente al mes y sus días.
            }
        } else {
            JOptionPane.showConfirmDialog(null, "El mes introducido es incorrecto."); // Si el mes es inválido, muestra un mensaje de error.
        }
    }
}

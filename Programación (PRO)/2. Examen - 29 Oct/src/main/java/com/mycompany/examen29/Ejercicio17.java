/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen29;

import javax.swing.JOptionPane; // Importamos el JOptionPane.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        String leenum = JOptionPane.showInputDialog("Establece un número: "); // Preguntamos al usuario el número.
        int num = Integer.parseInt(leenum); // Leemos el número y lo pasamos a valor int.
       
        char caracter = (char)num; // Convertimos el número a carácter.
        JOptionPane.showMessageDialog(null, "El resultado en ASCII es: " + caracter); // Exporta el resultado de la conversión.
        
    }
}

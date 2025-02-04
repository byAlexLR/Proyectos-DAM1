/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.feb;

import javax.swing.JOptionPane; // Importo el JOptionPane.

/**
 *
 * @author byAlexLR
 */
public class AnioBisiesto {

    private int ano; // Variable privada del número introducido.

    public AnioBisiesto(int ano) { // Constructor de la variable 'ano'.
        this.ano = ano;
    }

    public void esBisiesto() { // Método para saber si es año bisiesto o no.
        if (ano % 4 == 0) { // Condicional If-Else: Comprueba si el año es divisible entre 4 y su resto es igual a 0. Si lo es, sería bisiesto, sino, sería no bisiesto.
            JOptionPane.showMessageDialog(null, "El año " + ano + " es un año bisiesto.");
        } else {
            JOptionPane.showMessageDialog(null, "El año " + ano + " no es un año bisiesto.");
        }
    }

    public static void main(String[] args) { // Método Main.
        String nombre = JOptionPane.showInputDialog("Bienvenido/a a Año Bisiesto. ¿Cómo te llamas?"); // Da la bienvenida pidiendo el nombre.
        int ano = Integer.parseInt(JOptionPane.showInputDialog(nombre + ", podrías introducir el año")); // Con el nombre le pide el año.

        AnioBisiesto bisi = new AnioBisiesto(ano); // Inicializa la variable.
        bisi.esBisiesto(); // Dice el resultado llamando al método.
    }
}

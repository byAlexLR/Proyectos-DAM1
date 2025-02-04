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
public class TablaMultiplicar {

    private int num; // Variable privada del número introducido.

    public TablaMultiplicar(int num) { // Constructor de la variable num.
        this.num = num;
    }

    public void generarTabla() { // Método para multiplicar y sacar la tabla.
        JOptionPane.showMessageDialog(null, "Tabla de Multiplicar del " + num); // Muestra un mensaje de la tabla que se va a realizar.
        for (int i = 1; i <= 10; i++) { // Bucle For: Itinera los números hasta llegar a 10, empezando en el 1.
            JOptionPane.showMessageDialog(null, num + " x " + i + " = " + (num * i)); // Imprime el resultado de la tabla de multiplicar.
        }
    }

    public static void main(String[] args) { // Método Main.
        String nombre = JOptionPane.showInputDialog("Bienvenido/a a Tablas de Multiplicar. ¿Cómo te llamas?"); // Da la bienvenida pidiendo el nombre.
        int num = Integer.parseInt(JOptionPane.showInputDialog(nombre + ", podrías introducir el número que deseas multiplicar")); // Con el nombre le pide el número que desea multiplicar.

        TablaMultiplicar tabla = new TablaMultiplicar(num); // Inicializa la variable.
        tabla.generarTabla(); // Dice el resultado llamando al método.
    }
}

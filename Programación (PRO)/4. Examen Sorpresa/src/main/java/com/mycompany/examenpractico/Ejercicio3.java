/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenpractico;

import java.util.Scanner; // Importa la clase Scanner.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos la variable Scanner.
        compras(sc); // Llamamos al método con la variable sc.
    }

    public static void compras(Scanner sc) { // Método con variable scanner.
        double total = 0.0; // Inicia la variable total con el valor 0, para contabilizar cada venta.
        
        System.out.print("Introduce el número de ventas: "); // Solicita al usuario que ingrese un número de ventas.
        int ventas = sc.nextInt(); // Almacena el valor introducido en la variable creada.
        

        for (int i = 1; i <= ventas; i++) { // Bucle for: repite el bucle hasta completar el "ventas" introducido.
            System.out.print("Introduce el importe: "); // Solicita al usuario que ingrese una importe.
            double importe = sc.nextDouble(); // Almacena el valor introducido en la variable creada.
            total += importe; // Suma el importe de cada venta introducido al total.
        }
        
        System.out.println("La suma de las " + ventas + " ventas es de: " + String.format("%.2f", total) + "€."); // Muestra un mensaje con el total de ventas y la suma de todas ellas.
    }

}

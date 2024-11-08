/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examensorpresa;

import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Inicia la variable scanner.
        double igic = 0.21; // Inicia la variable IGIC con el valor predefinido.
        TiendaInformatica(sc, igic); // Llamamos al metodo con dos variables sc e igic.
    }

    public static void TiendaInformatica(Scanner sc, Double igic) { // Método e importamos las variables del main necesarias.
        System.out.println("¡Bienvenido a Ultima Informatica!"); // Mensaje de bienvenida a la tienda.
        System.out.print("Podria indicarnos su nombre: "); // Le pido que indique su nombre.
        String nombre = sc.nextLine(); // Lo lee y almacena en la variable nombre.
        System.out.print("¡Bienvenido, " + nombre + "! Podrias indicarnos el precio del articulo: "); // Le da la bienvenida personalizada y le pido que me indique el precio.
        double precio = sc.nextDouble(); // Lo lee y almacena en la variable precio.
        precio = (precio * igic) + precio; // Fórmula precio por igic más el precio.
        System.out.println("El articulo que deseas comprar con el IGIC se quedaria en " + String.format("%.2f", precio) + " eur."); // Muestra el precio final con el igic por pantalla, pero redondea el precio a dos decimales.
    }
}

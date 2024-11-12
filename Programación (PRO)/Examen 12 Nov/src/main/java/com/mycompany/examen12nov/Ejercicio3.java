/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen12nov;

import java.util.Scanner; // Importamos el Scanner.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Inicio la variable Scanner.
        System.out.println("¡Bienvenido al conversor de grados y pesetas!"); // Imprime un mensaje de bienvenida con lo que va a realizar.
        Grados(sc); // Llama al método Grados con la variable sc (Scanner).
        Pesetas(sc); // Llama al método Pesetas con la variable sc (Scanner).
    }

    public static void Grados(Scanner sc) { // Creo el método importando la variable Scanner.
        System.out.println("- Apartado Grados"); // Imprime un mensaje comunicando el apartado.
        System.out.print("Podria introducir los grados: "); // Imprime un mensaje indicando que introduzca los grados.
        double grados = sc.nextDouble(); // Crea la variable (grados) y lee lo que puso el usuario.
        double fahrenheit = 32 + (9 * grados / 5); // Creo la fórmula de conversión.
        System.out.println("Los " + grados + " grados centigrados (ºC), equivalen a " + String.format("%.1f", fahrenheit) + " grados fahrenheit (ºF)."); // Imprime un mensaje final, comentando los grados introducidos a lo que equivale.
    }

    public static void Pesetas(Scanner sc) { // Creo el método importando la variable Scanner.
        System.out.println("- Apartado Pesetas"); // Imprime un mensaje comunicando el apartado.
        System.out.print("Podria introducir la cantidad de euros: "); // Imprime un mensaje indicando que introduzca la cantidad de euros.
        int euros = sc.nextInt(); // Crea la variable (euros) y lee lo que puso el usuario.
        int pesetas = euros * 166386; // Creo la fórmula de conversión.
        System.out.println("La cantidad de " + euros + " euros, equivale a " + pesetas + " pesetas."); // Imprime un mensaje final, comentando los euros introducidos a lo que equivale.
    }
}

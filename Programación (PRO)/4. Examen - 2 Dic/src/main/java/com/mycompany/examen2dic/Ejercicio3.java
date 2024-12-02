/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2dic;

import java.util.Scanner; // Importa la clase Scanner.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos la variable Scanner.
        contador(sc); // Crea el método e importamos la variable sc.
    }

    public static void contador(Scanner sc) { // Método con la variable Scanner importada.
        int contadormenos = 0, contadormas = 0, num = 0; // Creamos las variables necesarias, contador negativo y otro positivo junto a la variable número.
        do { // Bucle do-while: se ejecuta al menos una vez.
            System.out.print("Introduzca un número: "); // Mensaje para el usuario, para que introduzca el número.
            num = sc.nextInt(); // Lo lee y almacena en la variable.
            if (num <= 0) { // Comprueba si el número es menor o igual que 0.
                contadormenos++; // Lo suma al contador de negativos.
            } else {
                contadormas++; // Lo suma al contador de positivos.
            }
        } while (num != 0); // El bucle continúa mientras el número no sea igual a 0.
        System.out.println("El número total de números introducidos es: Positivos = " + contadormas + " / Negativos = " + contadormenos); // Lanza el mensaje con el resultado de números introducidos.
    }
}

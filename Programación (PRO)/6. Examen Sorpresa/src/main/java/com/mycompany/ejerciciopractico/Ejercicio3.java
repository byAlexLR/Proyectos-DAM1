/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopractico;

// Paquetes
import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Ejercicio3 {

    // Metodo para contar los espacios.
    public static int contarEspacios(String frase) {
        // Contador de espacios.
        int espacios = 0;
        // Bucle For: para sacar parte por parte, para contar los espacios.
        for (char c : frase.toCharArray()) {
            // Si es igual a ' ', suma un espacio al contador.
            if (c == ' ') {
                espacios++;
            }
        }
        // Devuelve el total de numeros de espacios.
        return espacios;
    }

    // Método main.
    public static void main(String[] args) {
        // Se inicializa el Scanner, para dar la bienvenida personalizada y comunicarle que introduzca una frase.
        Scanner sc = new Scanner(System.in);
        System.out.print("Bienvenido, ¿cómo te llamas?: ");
        String nombre = sc.next();
        sc.nextLine(); // Consumir el salto de línea pendiente
        System.out.print(nombre + ", ¿podrías introducir una frase?: ");
        String frase = sc.nextLine();

        // Muestra el total de espacios.
        System.out.println("Número de espacios: " + Ejercicio3.contarEspacios(frase));
        
        sc.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjava;

import java.util.Scanner; // Importación de la clase Scanner para la entrada de datos

/**
 * 
 * @author byAlexLR
 */
public class Fibonacci {

    private int num; // Número de términos de la secuencia a generar
    
    // Constructor de la clase que inicializa la cantidad de términos
    public Fibonacci (int num) {
        this.num = num;
    }
    
    /**
     * Método que genera y muestra la secuencia de Fibonacci en la consola.
     */
    public void generarSecuencia() {
        int a = 0, b = 1; // Inicialización de los dos primeros términos de la secuencia
        System.out.println(a + " " + b); // Muestra los dos primeros términos
        // Ciclo para calcular y mostrar el resto de los términos
        for (int i = 2; i < num; i++) { // Comienza desde el tercer término (i=2)
            int fib = a + b; // Calcula el siguiente término sumando los dos anteriores
            System.out.println(" " + fib); // Muestra el término actual
            a = b; // Actualiza el valor de a al valor de b
            b = fib; // Actualiza el valor de b al valor del término actual
        }
    }
    
    /**
     * Método principal que solicita al usuario la cantidad de términos y genera la secuencia.
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
        System.out.print("Introduce la cantidad de términos: "); // Solicita al usuario la cantidad de términos
        int num = sc.nextInt(); // Lee el número de términos ingresado por el usuario
        sc.close(); // Cierra el objeto Scanner

        Fibonacci terminos = new Fibonacci(num); // Crea un objeto de la clase Fibonacci con la cantidad de términos especificada
        terminos.generarSecuencia(); // Llama al método para generar y mostrar la secuencia
    }
}

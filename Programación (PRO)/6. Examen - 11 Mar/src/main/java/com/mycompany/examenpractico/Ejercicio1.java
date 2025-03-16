/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examenpractico;

// Paquetes.
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Ejercicio1 {

    // Constructor.
    private int[] array;

    public Ejercicio1() {
        this.array = new int[10];
    }

    // Rellena el array de 10 números aleatorios comprendidos entre el 0 y el 100.
    public void NumRandom() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Números generados: " + Arrays.toString(array));
    }

    // Del Array escoge el número máximo y lo comunica.
    public void NumMaximo() {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("El número máximo es: " + max);
    }

    // Del Array escoge el número mínimo y lo comunica.
    public void NumMinimo() {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("El número mínimo es: " + min);
    }

    // Del Array pilla todos los números y los suma.
    public void NumSuma() {
        int suma = 0;
        for (int i : array) {
            suma += i;
        }
        System.out.println("La suma de los números es: " + suma);
    }

    // Del Array suma todos los números y realiza la media.
    public void NumMedia() {
        int suma = 0;
        for (int i : array) {
            suma += i;
        }
        double media = (double) suma / array.length;
        System.out.println("La media de los números es: " + media);
    }

    // Del Array, le pide al usuario una posición y le pregunta el número, introduce el el número en la posición seleccionada.
    public void NumSustituir() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la posición (0-9): ");
        int posicion = sc.nextInt();
        System.out.print("Introduce el número: ");
        int numero = sc.nextInt();

        if (posicion >= 0 && posicion < array.length) {
            array[posicion] = numero;
            System.out.println("Nuevo array: " + Arrays.toString(array));
        } else {
            System.out.println("Posición no válida.");
        }
    }

    // Método main.
    public static void main(String[] args) {
        Ejercicio1 ejer = new Ejercicio1();

        ejer.NumRandom();
        ejer.NumMaximo();
        ejer.NumMinimo();
        ejer.NumSuma();
        ejer.NumMedia();
        ejer.NumSustituir();
    }
}

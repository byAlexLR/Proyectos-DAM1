/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopractico;

// Paquetes
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Ejercicio2 {

    // Variable privada de la lista de sueldos.
    private ArrayList<Integer> sueldos;

    // Constructor de la variable 'sueldos'.
    public Ejercicio2() {
        sueldos = new ArrayList<>();
    }

    // Método para interactuar con la lista.
    public void agregarSueldo() {
        // Se inicializa el Scanner, para dar la bienvenida personalizada y comunicarle que introduzca los sueldos.
        Scanner sc = new Scanner(System.in);
        System.out.print("Bienvenido, ¿cómo te llamas?: ");
        String nombre = sc.next();
        // Pide que se introduzcan los sueldos.
        System.out.println(nombre + ", por favor introduce los distintos sueldos (termina con -1)");
        // Bucle While para introducir los sueldos y almacenarlos.
        while (true) {
            System.out.print("Introduce el sueldo: ");
            int sueldo = sc.nextInt();
            if (sueldo == -1) {
                break;
            }
            // Guarda el dato en la lista.
            sueldos.add(sueldo);
        }
        // Cierra el scanner.
        sc.close();
    }

    // Método para mostrar los sueldos.
    public void mostrarSueldo() {
        if (sueldos.isEmpty()) {
            System.out.println("No se han introducido sueldos.");
            return;
        }
        // Ordena los sueldos y los muestra.
        Collections.sort(sueldos);
        System.out.println("Sueldos ordenados de forma creciente: " + sueldos);
        // Suma y calcula la media de sueldos.
        int suma = 0;
        for (int num : sueldos) {
            suma += num;
        }
        double media = (double)suma / sueldos.size();
        // Muestra el resultado del mínimo, máximo y la media.
        System.out.println("El sueldo mínimo es: " + Collections.min(sueldos));
        System.out.println("El sueldo máximo es: " + Collections.max(sueldos));
        System.out.println("La media de los sueldos es: " + media);
    }

    // Método main.
    public static void main(String[] args) {
        // Inicializa la variable, para introducir y mostrar los sueldos.
        Ejercicio2 ejer = new Ejercicio2();
        ejer.agregarSueldo();
        ejer.mostrarSueldo();
    }
}
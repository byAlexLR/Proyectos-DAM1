/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenpractico;

// Paquetes.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Ejercicio2 {

    // Constructor.
    private ArrayList<Integer> sueldos;

    public Ejercicio2() {
        this.sueldos = new ArrayList<>();
    }

    // Inicializa el array y le pregunta al usuario el sueldo y va sumando, hasta
    // que se introduce -1.
    public void ingresarSueldos() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Introduce el sueldo (o -1 para terminar): ");
            int sueldo = sc.nextInt();
            if (sueldo == -1) {
                break;
            }
            sueldos.add(sueldo);
        }
    }

    // Ordena y muestra los sueldos en orden decreciente.
    public void mostrarSueldos() {
        Collections.sort(sueldos, Collections.reverseOrder());
        System.out.println("Sueldos en orden decreciente: " + sueldos);
    }

    // Del ArrayList escoge el número máximo y lo comunica.
    public void sueldoMaximo() {
        if (!sueldos.isEmpty()) {
            int max = Collections.max(sueldos);
            System.out.println("El sueldo máximo es: " + max);
        } else {
            System.out.println("No se han introducido sueldos.");
        }
    }

    // Del ArrayList escoge el número mínimo y lo comunica.
    public void sueldoMinimo() {
        if (!sueldos.isEmpty()) {
            int min = Collections.min(sueldos);
            System.out.println("El sueldo mínimo es: " + min);
        } else {
            System.out.println("No se han introducido sueldos.");
        }
    }

    // Del ArrayList suma todos los números y realiza la media.
    public void mediaSueldos() {
        if (!sueldos.isEmpty()) {
            int suma = 0;
            for (int sueldo : sueldos) {
                suma += sueldo;
            }
            double media = (double) suma / sueldos.size();
            System.out.println("La media de los sueldos es: " + media);
        } else {
            System.out.println("No se han introducido sueldos.");
        }
    }

    // Método main.
    public static void main(String[] args) {
        Ejercicio2 ejercicio = new Ejercicio2();

        ejercicio.ingresarSueldos();
        ejercicio.mostrarSueldos();
        ejercicio.sueldoMaximo();
        ejercicio.sueldoMinimo();
        ejercicio.mediaSueldos();
    }
}

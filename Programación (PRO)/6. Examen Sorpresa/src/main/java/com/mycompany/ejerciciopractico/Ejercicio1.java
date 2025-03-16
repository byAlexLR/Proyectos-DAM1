/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciopractico;

// Paquetes
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Ejercicio1 {

    // Constructor de la variable 'num'.
    public Ejercicio1() {
    }

    // Método para interactuar con el array.
    public void RamdonNum() {
        Scanner sc = new Scanner(System.in);
        // Crea el array y le genera 100 números aleatorios.
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        //System.out.println("Números generados: " + Arrays.toString(array));

        // Menu para interactuar con el.
        boolean salir = false;
        while (!salir) {
            System.out.println("\nIntroduce un número de sección:");
            System.out.println("1. Conocer el mayor de los números");
            System.out.println("2. Conocer el menor de los números");
            System.out.println("3. Obtener la suma de todos los números");
            System.out.println("4. Obtener la media de todos los números");
            System.out.println("5. Sustituir el valor de un elemento por otro número");
            System.out.println("6. Salir");
            int num = sc.nextInt();

            switch (num) {
                // Saca el número máximo del array.
                case 1 -> {
                    int max = array[0];
                    for (int i : array) {
                        if (i > max) {
                            max = i;
                        }
                    }
                    System.out.println("El número máximo es: " + max);
                }
                // Saca el número mínimo del array.
                case 2 -> {
                    int min = array[0];
                    for (int i : array) {
                        if (i < min) {
                            min = i;
                        }
                    }
                    System.out.println("El número mínimo es: " + min);
                }
                // Saca la suma de todos los números.
                case 3 -> {
                    int contador = 0;
                    for (int i : array) {
                        contador += i;
                    }
                    System.out.println("La suma de todos los números es: " + contador);
                }
                // Saca la media de la suma de todos los números.
                case 4 -> {
                    int contador = 0;
                    for (int i : array) {
                        contador += i;
                    }
                    double media = (double) contador / array.length;
                    System.out.println("La media del total de los números es: " + media);
                }
                // Sustituye el valor de un elemento por otro número que se introduce por
                // teclado.
                case 5 -> {
                    System.out.print("Introduce la posición (0-99): ");
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
                case 6 -> salir = true;
                // Si no se introduce un valor válido, saltará el mensaje.
                default -> System.out.println("El número introducido no se ha encontrado.");
            }
        }
        sc.close();
    }

    // Método main.
    public static void main(String[] args) {
        // Se inicializa el Scanner, para dar la bienvenida personalizada y preguntar
        // qué sección usar.
        Scanner sc = new Scanner(System.in);
        System.out.print("Bienvenido, ¿cómo te llamas?: ");
        String nombre = sc.next();
        System.out.println(
                nombre + ", podrías introducir un número de sección para interactuar con los números generados.");

        // Inicializa la variable, para dar el resultado.
        Ejercicio1 ran = new Ejercicio1();
        ran.RamdonNum();
    }
}
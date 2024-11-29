/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examenpractico;

import java.util.Scanner; // Importa la clase Scanner.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos la variable Scanner.
        tiempo(sc); // Llamamos al método con la variable sc.
    }

    public static void tiempo(Scanner sc) { // Método.
        System.out.print("Introduce la Hora: "); // Solicita al usuario que ingrese una hora.
        int h = sc.nextInt(); // Almacena la hora.
        System.out.print("Introduce los Minutos: "); // Solicita al usuario que ingrese unos minutos.
        int m = sc.nextInt(); // Almacena los minutos.
        System.out.print("Introduce los Segundos: "); // Solicita al usuario que ingrese unos segundos.
        int s = sc.nextInt(); // Almacena los segundos.

        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) { // Comprueba que el dato introducido se comprenda entre los valores definicidos en el if.
            System.out.println("La hora introducida es incorrecta."); // Si el valor es incorrecto, muestra este mensaje.
        } else {
            System.out.println("La hora introducida es correcta."); // Si el valor es correcto, muestra este mensaje.
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.project.ejerciciosjava;

import java.util.Scanner; // Importa la clase Scanner.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio14a16 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Inicia la variable scanner.
        login(sc); // Llamamos al método con la variable sc.
        diaSemana(sc); // Llamamos al método con la variable sc.
        esPrimo(sc); // Llamamos al método con la variable sc.
    }

    public static void login(Scanner sc) { // Método e importamos las variables del main necesarias.
        System.out.println("- EJERCICIO 14 (LOGIN) -"); // Dice el apartado.

        String pass = "DysFunctional-19*", passIntro; // Inicia las variables para la contraseña.
        int error = 0, errorMaximo = 3; // Inicia las variables para contabilizar los errores.

        while (error < errorMaximo) { // Bucle while: Solicita la contraseña hasta que se acaben los intentos.
            System.out.print("Introduce la contraseña: "); // Solicita al usuario que ingrese la contraseña.
            passIntro = sc.nextLine(); // Lee lo escrito y lo almacena en una variable.
            if (pass.equals(passIntro)) { // Comprueba la contraseña introducida con la válida.
                System.out.println("¡Enhorabuena, has iniciado sessión!"); // Muestra un mensaje comunicando el inicio de sesión.
                break; // Sale del bucle.
            } else {
                error++; // Suma un error al contador (variable).
                if (error < errorMaximo) { // Comprueba el número de errores, si lleva menos de 3 errores.
                    if (error == 1) { // Comprueba si lleva un error.
                        System.out.println("Llevas " + error + " intento de " + errorMaximo + "."); // Muestra un mensaje comunicando el número de errores en singular.
                    } else {
                        System.out.println("Llevas " + error + " intentos de " + errorMaximo + "."); // Muestra un mensaje comunicando el número de errores en plural.
                    }
                } else {
                    System.out.println("¡Has agotado todos los intentos!"); // Muestra un mensaje comunicando que ha agotado el número de intentos.
                }
            }
        }
    }

    public static void diaSemana(Scanner sc) { // Método e importamos las variables del main necesarias.
        System.out.println("- EJERCICIO 15 (DÍA DE LA SEMANA) -"); // Dice el apartado.

        System.out.print("Introduce un día de la semana: "); // Solicita al usuario que ingrese un día de la semana.
        String dia = sc.nextLine().toLowerCase(); // Lee lo escrito y se hace la variable pasando lo escrito por el usuario a minúsculas.

        switch (dia) { // Estructura switch que determina el día introducido a un mensaje.
            case "lunes", "martes", "miercoles", "jueves", "viernes" ->
                System.out.println("El " + dia + " es día laborable.");  // Si el día es uno de los días laborables.
            case "sabado", "domingo" ->
                System.out.println("El " + dia + " no es un día laborable."); // Si el día es sábado o domingo.
        }
    }

    public static void esPrimo(Scanner sc) { // Método e importamos las variables del main necesarias.
        System.out.println("- EJERCICIO 16 (¿ES PRIMO?) -"); // Dice el apartado.
        
        System.out.print("Introduce un número: "); // Solicita al usuario que ingrese un número.
        int num = sc.nextInt(); // Lee lo escrito y se hace la variable.

        if (num <= 1) { // Si el número es menor o igual a 1, no se considera primo.
            System.out.println("El número " + num + " no es un número primo."); // Muestra un mensaje indicando que no es primo.
            return; // Termina la ejecución del método.
        } else { // Sino, buscará si el número introducido es primo o no.
            for (int i = 2; i <= Math.sqrt(num); i++) { // Itera desde 2 hasta la raíz cuadrada de "num" para verificar si "num" es divisible por algún número en este rango.
                if ((num % i) == 0) { // Si "num" es divisible por "i", no es primo.
                    System.out.println("El número " + num + " no es un número primo."); // Muestra un mensaje indicando que no es primo.
                    break; // Termina el bucle porque ya se ha determinado que no es primo.
                } else { // Si no se ha encontrado ningún divisor, el número es primo.
                    System.out.println("El número " + num + " es un número primo."); // Muestra un mensaje indicando que es primo.
                    break; // Termina el bucle porque ya se ha determinado que es primo.
                }
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.feb;

import java.util.Scanner; // Importo el Scanner.

/**
 *
 * @author byAlexLR
 */
public class SumaDigitos {

    private int num; // Variable privada del número introducido.

    public SumaDigitos(int num) { // Constructor de la variable num.
        this.num = num;
    }

    public int SumaDigitos() { // Método para sumar los dígitos de un número.
        int original = num, suma = 0; // Creo dos variables, una para no modificar la variable del número introducido y otra para la suma de los dígitos.
        while (original > 0) { // Bucle While: Se inicia si 'original' es mayor a 0.
            suma += original % 10; // Saca el resto del número y lo suma a la variable 'suma'.
            original /= 10; // Elimina el último dígito del número introducido en la variable 'original'.
        }
        return suma; // Devuelve el resultado.
    }

    public static void main(String[] args) { // Método Main.
        Scanner sc = new Scanner(System.in); // Inicializa Scanner.
        System.out.print("Bienvenido/a a Suma de Dígitos. ¿Cómo te llamas?: "); // Da la bienvenida pidiendo el nombre.
        String nombre = sc.next(); // Lo lee y almacena.
        System.out.print(nombre + ", podrías introducir un número: "); // Con el nombre le pide el número a sumar.
        int num = sc.nextInt(); // Lo lee y almacena.
        sc.close(); // Cierro el Scanner.
        
        SumaDigitos dig = new SumaDigitos(num); // Inicializa la variable.
        System.out.println("La suma de los dígitos del número '" + num + "' es: " + dig.SumaDigitos()); // Dice el resultado llamando al método.
    }
}

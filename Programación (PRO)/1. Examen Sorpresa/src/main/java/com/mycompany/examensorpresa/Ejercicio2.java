/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examensorpresa;

import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Ejercicio2 {

        public static void main(String[] args) {
        String nombre; //Variable nombre
        double precio, iva = 0.07; //Variable precio e iva
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: "); //Imprime mensaje al usuario
        nombre = sc.nextLine(); //Lee
        System.out.println("¡Bienvenido/a " + nombre + "!"); //Imprime mensaje de bienvenida
        
        System.out.print("Introduce el importe del producto: "); //Imprime mensaje a usuario
        precio = sc.nextDouble(); //Lee
        precio = (precio*iva) + precio; // Precio por el iva más el iva
        System.out.println("El importe con un 7% es de: " + precio + " eur"); //Imprime el precio con el iva
    }
}

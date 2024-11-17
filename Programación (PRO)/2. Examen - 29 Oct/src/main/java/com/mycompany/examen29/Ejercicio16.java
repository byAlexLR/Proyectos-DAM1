/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen29;

import java.util.Scanner; // Importamos el Scanner.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        // Declaramos las variables nombre, precio, iva e igic, los dos últimos estableciendo su valor.
        String nombre;
        double precio, iva = 0.21, igic = 0.07, resultadoigic, resultadoiva;

        Scanner sc = new Scanner(System.in); // Iniciamos la variable sc para que lea la entrada.
        System.out.println("¡Bienvenido a Última Informática!"); // Muestra una bienvenida al usuario con el nombre de la tienda.
        System.out.print("Podria indicar su nombre: "); // Le indicamos al usuario si podría indicar su nombre.
        nombre = sc.nextLine(); // Leemos lo que escribe.
        System.out.print("¡Bienvenido, " + nombre + "! Podria indicar el precio del producto que desea comprar: "); // Damos la bienvenida y le indica si podría poder el precio del producto.
        precio = sc.nextDouble(); // Leemos el precio con un Double.
        resultadoigic = (precio * igic) + precio; // Hacemos la operación del IGIC (7%). Precio multiplicado por igic y luego le suma el precio.
        resultadoiva = (precio * iva) + precio; // Hacemos la operación del IVA (21%). Precio multiplicado por iva y luego le suma el precio.
        System.out.println("El precio del producto seria: " + resultadoigic + " IGIC y " + resultadoiva + " IVA."); // Muestra al usuario un mensaje con ambos resultados.
        sc.close(); // Cerramos la lectura, es decir, el Scanner.
    }
}

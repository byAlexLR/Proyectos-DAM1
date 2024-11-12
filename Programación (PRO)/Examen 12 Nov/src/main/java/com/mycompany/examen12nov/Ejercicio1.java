/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examen12nov;

import java.util.Scanner; // Importamos el Scanner.

/**
 *
 * @author byAlexLR
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Inicio la variable Scanner.
        Bienvenida(sc); // Llama al método Bienvenida con la variable sc (Scanner).
        NotaFinal(sc); // Llama al método NotaFinal con la variable sc (NotaFinal).
    }

    public static void Bienvenida(Scanner sc) { // Creo el método importando la variable Scanner. 
        System.out.println("¡Bienvenido al aula virtual!"); // Imprime un mensaje de bienvenida al aula virtual.
        System.out.print("Podria indicar su nombre: "); // Imprime un mensaje para indicarle que ponga su nombre.
        String nombre = sc.nextLine(); // Crea la variable y lee lo que puso el usuario.
        System.out.println("¡Bienvenido, " + nombre + "!"); // Imprime el mensaje de bienvenida personalizado.
    }

    public static void NotaFinal(Scanner sc) { // Creo el método importando la variable Scanner.
        System.out.print("Introduce la nota del 1º trimestre (Maximo 10.0): "); // Imprime un mensaje preguntando la nota del 1º Trimestre.
        double nota1 = sc.nextDouble(); // Crea la variable (nota1) y lee lo que puso el usuario.
        System.out.print("Introduce la nota del 2º trimestre (Maximo 10.0): "); // Imprime un mensaje preguntando la nota del 2º Trimestre.
        double nota2 = sc.nextDouble(); // Crea la variable (nota2) y lee lo que puso el usuario.
        System.out.print("Introduce la nota del 3º trimestre (Maximo 10.0): "); // Imprime un mensaje preguntando la nota del 3º Trimestre.
        double nota3 = sc.nextDouble(); // Crea la variable (nota3) y lee lo que puso el usuario.
        System.out.println("Notas: 1º Trimestre ( " + nota1 + " ) 2º Trimestre ( " + nota2 + " ) 3º Trimestre ( " + nota3 + " )"); // Imprime un mensaje con el resumen de las notas introducidas.
        double notafinal = (nota1 + nota2 + nota3) / 3; // Suma las notas y las divide entre 3.
        System.out.println("La nota final del alumno seria: " + String.format("%.2f", notafinal)); // Imprime el mensaje con la nota final y la redondeo a dos decimales.
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examensorpresa;

import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Inicia la variable scanner.
        PerimetroCirculo(sc); // Llamamos al metodo con la variable sc.
        PerimetroTriangulo(sc); // Llamamos al metodo con la variable sc.
        PerimetroCuadrado(sc); // Llamamos al metodo con la variable sc.
        PerimetroRectangulo(sc); // Llamamos al metodo con la variable sc.
    }

    public static void PerimetroCirculo(Scanner sc) { // Método e importamos las variables del main necesarias.
        // Cículo
        System.out.println("Ciculo:"); // Dice el apartado.
        System.out.print("Introduce el diametro: "); // Imprime el mensaje al usuario.
        double diametro = sc.nextDouble();  //Lee lo escrito y se hace la variable.
        double perimetro = 2 * Math.PI * diametro; // Fórmula 2 por PI por el diámetro. 
        System.out.println("El perimetro del circulo es: " + perimetro); // Dice el resultado.
    }

    public static void PerimetroTriangulo(Scanner sc) { // Método e importamos las variables del main necesarias.
        // Triángulo
        System.out.println("Triangulo:"); // Dice el apartado.
        System.out.print("Introduce el lado A: "); // Imprime el mensaje al usuario.
        double ladoa = sc.nextDouble(); // Lee lo escrito y se hace la variable.
        System.out.print("Introduce el lado B: "); // Imprime el mensaje al usuario.
        double ladob = sc.nextDouble(); // Lee lo escrito y se hace la variable.
        System.out.print("Introduce el lado C: "); // Imprime el mensaje al usuario.
        double ladoc = sc.nextDouble(); // Lee lo escrito y se hace la variable.
        double perimetro = ladoa + ladob + ladoc; // Fórmula suma de tres lados (lado A, lado B y lado C).
        System.out.println("El perimetro del triangulo es: " + perimetro); // Dice el resultado.
    }

    public static void PerimetroCuadrado(Scanner sc) { // Método e importamos las variables del main necesarias.
        // Cuadrado
        System.out.println("Cuadrado:"); // Dice el apartado.
        System.out.print("Introduce el lado: "); // Imprime el mensaje al usuario.
        double lado = sc.nextInt(); // Lee lo escrito y se hace la variable.
        double perimetro = lado * 4; // Fórmula lado por 4.
        System.out.println("El perimetro del cuadrado es: " + perimetro); // Dice el resultado.
    }

    public static void PerimetroRectangulo(Scanner sc) { // Método e importamos las variables del main necesarias.
        // Rectángulo
        System.out.println("Rectangulo:"); // Dice el apartado.
        System.out.print("Introduce la base: "); // Imprime el mensaje al usuario.
        double base = sc.nextInt(); // Lee lo escrito y se hace la variable.
        System.out.print("Introduce la altura: "); // Imprime el mensaje al usuario.
        double altura = sc.nextInt(); // Lee lo escrito y se hace la variable.
        double perimetro = 2 * (base + altura); // Fórmula base más altura por 2.
        System.out.println("El perimetro del rectangulo es: " + perimetro); // Dice el resultado.
    }
}

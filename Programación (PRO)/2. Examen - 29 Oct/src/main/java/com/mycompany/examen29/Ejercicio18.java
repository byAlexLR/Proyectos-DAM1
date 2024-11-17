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
public class Ejercicio18 {

    public static void main(String[] args) {
        double radio, resultado; // Declaramos las variables radio y resultado.

        Scanner sc = new Scanner(System.in); // Iniciamos la variable sc para que lea la entrada.
        System.out.print("Indica el radio del circulo: "); // Pedimos al usuario que establezca el radio del círculo.
        radio = sc.nextDouble(); // Leemos lo que ha puesto
        resultado = Math.PI * Math.pow(radio, 2); // Realiza la fórmula, Pi multiplicada por radio elevado a 2.
        System.out.println("El area del circulo es: " + resultado); // Muestra el resultado.
    }
}

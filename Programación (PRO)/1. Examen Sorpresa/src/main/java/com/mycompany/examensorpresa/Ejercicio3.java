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
        Scanner sc = new Scanner(System.in);
        //Cículo
        System.out.println("Ciculo:"); //Dice el apartado
        System.out.print("Introduce el diametro: "); //Imprime el mensaje al usuario
        double circulo1 = sc.nextDouble(); //Lee lo escrito y se hace la variable
        double area = 2 * Math.PI * circulo1; //Formula 
        System.out.println("El perimetro del circulo es: " + area); //Dice el resultado

        //Triángulo
        System.out.println("Triangulo:"); //Dice el apartado
        System.out.print("Introduce el base: "); //Imprime el mensaje al usuario
        double trian1 = sc.nextInt(); //Lee lo escrito y se hace la variable
        double area2 = trian1 + trian1 + trian1; //Formula suma de tres lados
        System.out.println("El perimetro del triangulo es: " + area2); //Dice el resultado

        //Cuadrado
        System.out.println("Cuadrado:"); //Dice el apartado
        System.out.print("Introduce el lado: "); //Imprime el mensaje al usuario
        double cuadra1 = sc.nextInt(); //Lee lo escrito y se hace la variable
        double area3 = cuadra1 * 4; //Formula lado por 4
        System.out.println("El perimetro del cuadrado es: " + area3); //Dice el resultado

        //Rectángulo
        System.out.println("Rectangulo:"); //Dice el apartado
        System.out.print("Introduce el base: "); //Imprime el mensaje al usuario
        double recta1 = sc.nextInt(); //Lee lo escrito y se hace la variable
        System.out.print("Introduce el altura: "); //Imprime el mensaje al usuario
        double recta2 = sc.nextInt(); //Lee lo escrito y se hace la variable
        double area4 = 2 * (recta1 + recta2); //Formula base+altura por 2
        System.out.println("El perimetro del rectangulo es: " + area4); //Dice el resultado
    }
}

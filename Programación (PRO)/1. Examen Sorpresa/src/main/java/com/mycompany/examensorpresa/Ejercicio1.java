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
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Cículo
        System.out.println("Circulo:"); //Dice el apartado
        System.out.print("Introduce el radio: "); //Imprime el mensaje al usuario
        double radio = sc.nextDouble(); //Lee lo escrito y se hace la variable
        double area = Math.PI * Math.pow(radio, 2); //Formula radio
        System.out.println("El area del circulo es: " + area); //Dice el resultado
        
        //Triángulo
        System.out.println("Triangulo:"); //Dice el apartado
        System.out.print("Introduce la base: "); //Imprime el mensaje al usuario
        double trian1 = sc.nextInt(); //Lee lo escrito y se hace la variable
        System.out.print("Introduce la altura: "); //Imprime el mensaje al usuario
        double trian2 = sc.nextInt(); //Lee lo escrito y se hace la variable
        double area2 = (trian1 * trian2) / 2; //Formula base por altura entre 2
        System.out.println("El area del triangulo es: " + area2); //Dice el resultado
        
        //Cuadrado
        System.out.println("Cuadrado:"); //Dice el apartado
        System.out.print("Introduce el lado: "); //Imprime el mensaje al usuario
        double cuadra1 = sc.nextInt(); //Lee lo escrito y se hace la variable
        double area3 = cuadra1 * cuadra1; //Formula lado por lado
        System.out.println("El area del cuadrado es: " + area3); //Dice el resultado
        
        //Rectángulo
        System.out.println("Rectangulo:"); //Dice el apartado
        System.out.print("Introduce la base: "); //Imprime el mensaje al usuario
        double recta1 = sc.nextInt(); //Lee lo escrito y se hace la variable
        System.out.print("Introduce la altura: "); //Imprime el mensaje al usuario
        double recta2 = sc.nextInt(); //Lee lo escrito y se hace la variable
        double area4 = recta1 * recta2; //Formula base por altura
        System.out.println("El area del rectangulo es: " + area4); //Dice el resultado
    }
}

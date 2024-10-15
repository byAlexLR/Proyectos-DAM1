/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.ejerciciossencillos;

/**
 *
 * @author byAlexLR
 */

import java.util.Scanner;

public class AreaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        double radio, area;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio: ");
        radio = sc.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
    }
}

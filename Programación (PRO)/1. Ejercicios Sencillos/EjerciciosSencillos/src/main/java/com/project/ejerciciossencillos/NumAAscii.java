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

public class NumAAscii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        int num;
        char caracter;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();
        caracter = (char) num;
        System.out.println("El numero " + num + " corresponde en la tabla ASCII a " + caracter);
    }
}

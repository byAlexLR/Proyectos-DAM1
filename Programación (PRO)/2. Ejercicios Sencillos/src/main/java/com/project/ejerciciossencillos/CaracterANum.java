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

public class CaracterANum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        int num;
        char caracter;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un caracter: ");
        caracter = sc.next().charAt(0);
        num = (int) caracter;
        System.out.println("El caracter " + caracter + " corresponde en la tabla ASCII al numero " + num);
    }
}

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

public class BienvenidoNombreScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        // TODO code application logic here
        String nombre;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Establece tu nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Bienvenido, " + nombre + "!");
        
    }
}

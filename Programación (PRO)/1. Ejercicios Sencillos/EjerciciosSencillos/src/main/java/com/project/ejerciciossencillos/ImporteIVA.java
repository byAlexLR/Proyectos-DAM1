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

public class ImporteIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        double precio, importe, iva = 0.21;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el importe: ");
        precio = sc.nextDouble();
        importe = precio + (precio * iva); // Para hacer un descuento sería importe = precio - (precio * porcentaje de descuento)
        System.out.println("El importe es: " + importe);
    }
}

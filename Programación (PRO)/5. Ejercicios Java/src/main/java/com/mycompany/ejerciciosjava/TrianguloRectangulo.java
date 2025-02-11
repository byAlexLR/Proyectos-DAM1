/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class TrianguloRectangulo {
    private int num;

    public TrianguloRectangulo(int num) {
        this.num = num;
    }
    
    public void generarTriangulo(){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        
        TrianguloRectangulo tri = new TrianguloRectangulo(num);
        tri.generarTriangulo();
    }
}

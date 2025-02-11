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
public class NumeroTriangular {
    private int num;
    
    public NumeroTriangular(int num){
        this.num = num;
    }
    
    public void mostrarserie(){
        for (int i = 1; i <= num; i++) {
            int triangular = (i*(i+1))/2;
            System.out.println(triangular);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        sc.close();
        
        NumeroTriangular trian = new NumeroTriangular(num);
        trian.mostrarserie();
    }
}

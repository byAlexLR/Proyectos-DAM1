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
public class ContadorPalabras {
    private String texto;
    
    public ContadorPalabras(String texto){
        this.texto = texto;
    }
    
    public int contarPalabras(){
        if(texto == null || texto.isEmpty()){
            return 0;
        }
      String[] palabras = texto.trim().split("\\s+");
      return palabras.length;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.next();
        
        ContadorPalabras contador = new ContadorPalabras(texto);
        System.out.println("Número de palabras: " + contador.contarPalabras());
    }
}

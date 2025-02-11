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
public class BinarioDecimal {

    private String numeroBinario;

    public BinarioDecimal(String numeroBinario) {
        this.numeroBinario = numeroBinario;
    }

    public int convertirADecimal() {
        int numeroDecimal = 0;
        for (int i = 0; i < numeroBinario.length(); i++) {
            if(numeroBinario.charAt(numeroBinario.length() - 1 - i) == '1'){
                numeroDecimal += Math.pow(2, i);
            }
        }
        return numeroDecimal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        String numeroBinario = sc.next();
        sc.close();
        
        BinarioDecimal numeroDecimal = new BinarioDecimal(numeroBinario);
        System.out.println("El número decimal es: " + numeroDecimal.convertirADecimal());
    }
}

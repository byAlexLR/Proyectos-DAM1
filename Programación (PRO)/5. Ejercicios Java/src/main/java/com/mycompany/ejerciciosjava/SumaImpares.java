/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjava;

/**
 *
 * @author byAlexLR
 */
public class SumaImpares {

    private int limiteInferior;
    private int limiteSuperior;

    public SumaImpares(int limiteInferior, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    public int calcularSuma() {
        int suma = 0;
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        SumaImpares suma = new SumaImpares(1, 10);
        System.out.println("La suma de todos los números impares del 1 al 10 es: " + suma.calcularSuma());
    }
}
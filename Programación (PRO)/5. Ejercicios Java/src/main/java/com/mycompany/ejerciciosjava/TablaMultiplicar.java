/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjava;

/**
 *
 * @author byAlexLR
 */
public class TablaMultiplicar {

    private int num;

    //Constructores
    public TablaMultiplicar ( int num) {
        this.num = num;
    }

    public void generarTabla() {
        System.out.println("Tabla de Multiplicar (" + num + "):");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }
    }

    public static void main(String[] args) {
        TablaMultiplicar tabla = new TablaMultiplicar(5);
        tabla.generarTabla();
    }
}
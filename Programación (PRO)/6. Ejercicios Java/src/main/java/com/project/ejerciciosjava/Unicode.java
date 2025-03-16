/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

/**
 * 
 * @autor byAlexLR
 */
public class Unicode {

    /**
     * Método que muestra todos los caracteres Unicode en el rango U+0000 a U+FFFF.
     */
    public static void mostrarUnicode() {
        for (int i = 0x0000; i <= 0xFFFF; i++) {
            System.out.println("U+" + String.format("%04X", i) + " -> " + (char) i);
        }
    }

    /**
     * Método principal que ejecuta el programa y muestra todos los caracteres
     * Unicode.
     */
    public static void main(String[] args) {
        Unicode.mostrarUnicode();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

// Paquetes
import java.util.Scanner;

/**
 * 
 * @autor byAlexLR
 */
public class SinVocales {

    /**
     * Método que elimina las vocales de una cadena de texto.
     */
    public static String eliminarVocales(String nombre) {
        return nombre.replaceAll("[aeiouáéíóúAEIOUÁÉÍÓÚ]", "");
    }

    /**
     * Método principal que ejecuta el programa y elimina las vocales de un nombre
     * introducido por el usuario.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = sc.nextLine();
        sc.close();

        System.out.println("Nombre sin vocales: " + SinVocales.eliminarVocales(nombre));
    }
}
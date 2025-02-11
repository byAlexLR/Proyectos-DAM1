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
public class ContadorVocales {

    private String texto;

    public ContadorVocales(String texto) {
        this.texto = texto;
    }

    public int contarVocales() {
        int numVocales = 0;
        for (int i = 0; i < texto.length(); i++) {
            char vocales = texto.toLowerCase().charAt(i);

            switch (vocales) {
                case 'a' ->
                    numVocales++;
                case 'e' ->
                    numVocales++;
                case 'i' ->
                    numVocales++;
                case 'o' ->
                    numVocales++;
                case 'u' ->
                    numVocales++;
                default -> {
                }
            }
        }
        return numVocales;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = sc.next();
        sc.close();

        ContadorVocales numVocales = new ContadorVocales(texto);
        System.out.println("En el texto introducido '" + texto + "' hay un total de " + numVocales.contarVocales() + " vocales.");
    }
}

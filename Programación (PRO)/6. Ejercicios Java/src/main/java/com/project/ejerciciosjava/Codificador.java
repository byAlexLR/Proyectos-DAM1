/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

// Paquetes
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @autor byAlexLR
 */
public class Codificador {
    private static final char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
    private static final char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

    private static final HashMap<Character, Character> mapa = new HashMap<>();

    // Inicializa el mapa de caracteres para la codificación
    static {
        for (int i = 0; i < conjunto1.length; i++) {
            mapa.put(conjunto1[i], conjunto2[i]);
            mapa.put(Character.toUpperCase(conjunto1[i]), conjunto2[i]);
        }
    }

    /**
     * Método que codifica un texto según el mapa de caracteres.
     */
    public static String codificar(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            resultado.append(mapa.getOrDefault(c, c));
        }
        return resultado.toString();
    }

    /**
     * Método principal que ejecuta el programa y codifica un texto introducido por
     * el usuario.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();
        sc.close();

        System.out.println("Texto codificado: " + Codificador.codificar(texto));
    }
}
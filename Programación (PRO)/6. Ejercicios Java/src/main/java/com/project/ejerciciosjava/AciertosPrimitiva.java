/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

/**
 * 
 * @autor byAlexLR
 */
public class AciertosPrimitiva {

    /**
     * Método que cuenta el número de aciertos entre la apuesta y la combinación
     * ganadora.
     */
    public static int contarAciertos(int[] apuesta, int[] ganadora) {
        int aciertos = 0;
        // Recorre cada número de la apuesta
        for (int numApuesta : apuesta) {
            // Compara cada número de la apuesta con cada número de la combinación ganadora
            for (int numGanador : ganadora) {
                if (numApuesta == numGanador) {
                    aciertos++;
                    break; // Termina el bucle interno si se encuentra un acierto
                }
            }
        }
        return aciertos;
    }

    /**
     * Método principal que ejecuta el programa y muestra el número de aciertos.
     */
    public static void main(String[] args) {
        int[] apuesta = { 5, 12, 23, 34, 45, 50 };
        int[] ganadora = { 3, 12, 23, 31, 45, 49 };
        System.out.println("Número de aciertos: " + AciertosPrimitiva.contarAciertos(apuesta, ganadora));
    }
}
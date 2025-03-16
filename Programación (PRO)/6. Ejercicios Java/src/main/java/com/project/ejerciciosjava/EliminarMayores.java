/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

// Paquetes
import java.util.ArrayList;

/**
 * 
 * @autor byAlexLR
 */
public class EliminarMayores {

    /**
     * Método que elimina los valores mayores a un valor dado de un array.
     */
    public static int[] eliminarMayores(int[] t, int valor) {
        ArrayList<Integer> filtrados = new ArrayList<>();

        // Filtra los números menores o iguales al valor dado
        for (int num : t) {
            if (num <= valor) {
                filtrados.add(num);
            }
        }

        // Convierte la lista filtrada de nuevo a un array
        int[] resultado = new int[filtrados.size()];
        for (int i = 0; i < filtrados.size(); i++) {
            resultado[i] = filtrados.get(i);
        }

        return resultado;
    }

    /**
     * Método principal que ejecuta el programa y muestra los valores filtrados.
     */
    public static void main(String[] args) {
        int[] numeros = { 5, 12, 8, 34, 23, 45, 50 };
        int[] resultado = EliminarMayores.eliminarMayores(numeros, 20);
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}
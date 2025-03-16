/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

// Paquetes
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * @autor byAlexLR
 */
public class Campeonato {
    private ArrayList<Integer> puntuaciones;

    /**
     * Constructor que inicializa la lista de puntuaciones.
     */
    public Campeonato() {
        puntuaciones = new ArrayList<>();
    }

    /**
     * Método que permite agregar puntuaciones a la lista.
     */
    public void agregarPuntuaciones() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las puntuaciones (termina con -1):");
        while (true) {
            int puntos = sc.nextInt();
            if (puntos == -1)
                break;
            puntuaciones.add(puntos);
        }
        sc.close();
    }

    /**
     * Método que muestra las puntuaciones ordenadas de mayor a menor.
     */
    public void mostrarPuntuaciones() {
        Collections.sort(puntuaciones, Collections.reverseOrder());
        System.out.println("Puntuaciones ordenadas: " + puntuaciones);
    }

    /**
     * Método principal que ejecuta el programa y gestiona las puntuaciones del
     * campeonato.
     */
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();
        campeonato.agregarPuntuaciones();
        campeonato.mostrarPuntuaciones();
    }
}
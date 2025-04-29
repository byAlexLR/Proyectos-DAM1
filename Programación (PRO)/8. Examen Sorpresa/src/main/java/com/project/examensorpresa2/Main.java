/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.examensorpresa2;

// Importa las librerías
import java.util.ArrayList;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {
        // Crea el Arraylist
        ArrayList<Tarea> tareas = new ArrayList<>();
        // Crea las distintas tareas y las añade al array
        tareas.add(new Tarea("Limpiar", 1, false));
        tareas.add(new Tarea("Formatear el ordenador", 3, true));
        tareas.add(new Tarea("Pagar el internet", 2, false));

        System.out.println("Todas las tareas:");
        // Muestra todas las tareas
        for (Tarea ta : tareas) {
            System.out.println(ta.toString());
        }

        System.out.println("\nTareas pendientes:");
        // Muestra solo las tareas pendientes
        for (Tarea ta : tareas) {
            if (!ta.isCompletada()) { // Si no está completada
                System.out.println(ta.toString());
            }
        }
    }
}

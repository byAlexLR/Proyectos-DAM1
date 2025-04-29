/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.practicando1;

import java.util.ArrayList;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Actividad> actividades = new ArrayList<>();
        actividades.add(new Tarea("Limpiar", 2, false));
        actividades.add(new Tarea("Bofetear", 1, true));
        actividades.add(new Tarea("Bofetear", 3, true));

        System.out.println("Tareas:");
        for (Actividad ad : actividades) {
            System.out.println(ad.toString());
        }

        System.out.println("Tareas por completar:");
        for (Actividad ad : actividades) {
            if (ad instanceof Actividad) {
                Tarea tarea = (Tarea) ad;
                if (!tarea.isCompletada()) {
                    System.out.println(ad.toString());
                }
            }
        }
    }
}

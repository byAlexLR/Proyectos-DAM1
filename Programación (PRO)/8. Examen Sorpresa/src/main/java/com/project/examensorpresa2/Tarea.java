/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.examensorpresa2;

/**
 *
 * @author byAlexLR
 */
public class Tarea {

    // Declaramos las variables¡
    private String titulo;
    private int prioridad;
    private boolean completada;

    // Constructor
    public Tarea(String titulo, int prioridad, boolean completada) {
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.completada = completada;
    }

    // Método IsCompletada (Setter y Getter)
    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // Método toString para imprimir los datos
    @Override
    public String toString() {
        return "Título: " + titulo + "\n"
                + "Prioridad: " + prioridad + "\n"
                + "¿Está completada?: " + (completada ? "Sí" : "No") + "\n";
    }
}

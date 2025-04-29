/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.practicando1;

/**
 *
 * @author byAlexLR
 */
public class Tarea extends Actividad {

    private boolean completada;

    public Tarea(String titulo, int prioridad, boolean completada) {
        super(titulo, prioridad);
        this.completada = completada;
    }

    /**
     * @return the completada
     */
    public boolean isCompletada() {
        return completada;
    }

    /**
     * @param completada the completada to set
     */
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\n"
                + "Prioridad: " + prioridad + "\n"
                + "¿Está completada?: " + (isCompletada() ? "Sí" : "No") + "\n";
    }
}

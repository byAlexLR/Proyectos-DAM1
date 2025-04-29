/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.practicando1;

/**
 *
 * @author byAlexLR
 */
public abstract class Actividad {

    protected String titulo;
    protected int prioridad;
    
    public Actividad(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }
    
    @Override
    public abstract String toString();
}

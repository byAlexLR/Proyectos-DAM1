/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.practicando2;

/**
 *
 * @author byAlexLR
 */
public abstract class Evento {

    protected String fecha;
    protected String hora;
    
    public Evento(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    @Override
    public abstract String toString();
}

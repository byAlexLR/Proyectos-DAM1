/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.practicando2;

/**
 *
 * @author byAlexLR
 */
public class Cita extends Evento {

    private String descripcion;

    public Cita(String fecha, String hora, String descripcion) {
        super(fecha, hora);
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + "\n"
                + "Hora: " + hora + "\n"
                + "Descripción: " + descripcion + "\n";
    }
}

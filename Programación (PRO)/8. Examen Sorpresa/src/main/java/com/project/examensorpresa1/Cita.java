/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.examensorpresa1;

/**
 *
 * @author byAlexLR
 */
public class Cita {

    // Declaramos las variables
    private String fecha;
    private String hora;
    private String descripcion;

    // Constructor
    public Cita(String fecha, String hora, String descripcion) {
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
    }

    // Método getFecha (Setter y Getter)
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Método toString para imprimir los datos
    @Override
    public String toString() {
        return "Fecha: " + fecha + "\n"
                + "Hora: " + hora + "\n"
                + "Descripción: " + descripcion;
    }
}

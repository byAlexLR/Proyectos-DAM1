/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.practicaherencias2;

/**
 *
 * @author byAlexLR
 */
public abstract class Personas {

    protected String nombre;
    protected String correo;
    
    public Personas (String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }
    
    public abstract void mostrarInformacion();
}

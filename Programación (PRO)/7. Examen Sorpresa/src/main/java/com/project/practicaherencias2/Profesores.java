/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.practicaherencias2;

/**
 *
 * @author byAlexLR
 */
public class Profesores extends Personas {

    private String departamento;
    
    public Profesores (String nombre, String correo, String departamento) {
        super(nombre, correo);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor [Nombre: " + nombre + ", Correo: " + correo + ", Departamento: " + departamento + "]");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.practicaherencias2;

/**
 *
 * @author byAlexLR
 */
public class Estudiantes extends Personas {

    private String curso;

    public Estudiantes(String nombre, String correo, String curso) {
        super(nombre, correo);
        this.curso = curso;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Estudiante [Nombre: " + nombre + ", Correo: " + correo + ", Curso: " + curso + "]");
    }    
}

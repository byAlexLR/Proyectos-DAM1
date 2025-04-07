/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.practicaherencias3;

/**
 *
 * @author byAlexLR
 */
public class Revistas extends Publicaciones {

    private int numEdicion;
    private int mesPublicacion;
    
    public Revistas (String titulo, String autor, int ano, int numEdicion, int mesPublicacion){
        super(titulo, autor, ano);
        this.numEdicion = numEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista [Título: " + titulo + ", Autor: " + autor + ", Año: " + ano + ", Nº de Edición: " + numEdicion + ", Mes de Publicación: " + mesPublicacion + "]");
    }
}

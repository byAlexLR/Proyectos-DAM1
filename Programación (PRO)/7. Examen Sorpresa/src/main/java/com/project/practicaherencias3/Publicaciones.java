/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.practicaherencias3;

/**
 *
 * @author byAlexLR
 */
public abstract class Publicaciones {

    protected String titulo;
    protected String autor;
    protected int ano;
    
    public Publicaciones (String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    
    public abstract void mostrarInformacion();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.practicaherencias3;

/**
 *
 * @author byAlexLR
 */
public class Libros extends Publicaciones {

    private int numPaginas;
    private String tapa;
    
    public Libros (String titulo, String autor, int ano, int numPaginas, String tapa){
        super(titulo, autor, ano);
        this.numPaginas = numPaginas;
        this.tapa = tapa;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro [Título: " + titulo + ", Autor: " + autor + ", Año: " + ano + ", Nº de Páginas: " + numPaginas + ", Tipo de Tapa: " + tapa + "]");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.practica2;

/**
 *
 * @author byAlexLR
 */
public class Libro {

    // Declaración de variables.
    private String titulo;
    private String autor;
    private int ano;
    private String isbn;

    // Constructor.
    public Libro(String titulo, String autor, int ano, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
    }

    // Método Getter de Autor.
    public String getAutor() {
        return autor;
    }

    // Método Setter de Autor.
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método Getter de Año.
    public int getAno() {
        return ano;
    }

    // Método Setter de Año.
    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método toString para imprimir la información del libro.
    @Override
    public String toString() {
        return "Título: " + titulo + "\n"
                + "Autor: " + autor + "\n"
                + "Año: " + ano + "\n"
                + "ISBN: " + isbn + "\n";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.abril2;

/**
 *
 * @author byAlexLR
 */
public class Video extends Publicaciones { // Deriva de la clase Publicaciones

    // Declaramos las variables
    private String url;
    private int duracion;

    // Constructor
    public Video(String fecha, String autor, String url, int duracion) {
        super(fecha, autor);
        this.url = url;
        this.duracion = duracion;
    }

    // Método Abstracto: Imprime la información del contenido de la publicación
    @Override
    public String mostrarContenido() {
        return "Url: " + url + ", Duración: " + duracion + "s";
    }

    // Método Abstracto: Imprime la información de cada una de las publicaciones
    @Override
    public void mostrarInformacion() {
        System.out.println("Publicación de Vídeo [Fecha: " + fecha + ", Autor: " + autor + ", " + mostrarContenido() + "]");
    }
}

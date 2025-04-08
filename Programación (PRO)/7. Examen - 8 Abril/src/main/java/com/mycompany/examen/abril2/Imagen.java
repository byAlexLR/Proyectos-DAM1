/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.abril2;

/**
 *
 * @author byAlexLR
 */
public class Imagen extends Publicaciones { // Deriva de la clase Publicaciones

    // Declaramos las variables
    private String url;
    
    // Constructor
    public Imagen(String fecha, String autor, String url) {
        super(fecha, autor);
        this.url = url;
    }

    // Método Abstracto: Imprime la información del contenido de la publicación
    @Override
    public String mostrarContenido() {
        return "Url: " + url;
    }

    // Método Abstracto: Imprime la información de cada una de las publicaciones
    @Override
    public void mostrarInformacion() {
        System.out.println("Publicación de Imagen [Fecha: " + fecha + ", Autor: " + autor + ", " + mostrarContenido() + "]");
    }
    
}

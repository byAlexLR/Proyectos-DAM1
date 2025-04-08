/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.abril2;

/**
 *
 * @author byAlexLR
 */
public class Texto extends Publicaciones { // Deriva de la clase Publicaciones
    
    // Declaramos las variables
    private String mensaje;  

    // Constructor de la clase Publicaciones(Padre) y Texto(Hijo)
    public Texto(String fecha, String autor, String mensaje) {
        super(fecha, autor);
        this.mensaje = mensaje;
    }
    
    // Método Abstracto: Imprime la información del contenido de la publicación
    @Override
    public String mostrarContenido() {
        return  "Mensaje: " + mensaje;
    }

    // Método Abstracto: Imprime la información de cada una de las publicaciones
    @Override
    public void mostrarInformacion() {
        System.out.println("Publicación de Texto [Fecha: " + fecha + ", Autor: " + autor + ", " + mostrarContenido() + "]");
    }
}

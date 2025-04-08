/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.abril2;

/**
 *
 * @author byAlexLR
 */
public abstract class Publicaciones {
    
    // Declaramos las variables
    protected String fecha;
    protected String autor;
    
    // Constructor Padre
    public Publicaciones (String fecha, String autor){
        this.fecha = fecha;
        this.autor = autor;
    }
    
    // Métodos abstractos para mostrar la información y mostrar el contenido
    public abstract String mostrarContenido();
    public abstract void mostrarInformacion();
}

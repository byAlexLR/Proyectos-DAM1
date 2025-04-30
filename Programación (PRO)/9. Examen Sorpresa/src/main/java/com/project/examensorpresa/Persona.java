/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.examensorpresa;

/**
 *
 * @author byAlexLR
 */
// Se implementa la interfaz  Serializable.
public class Persona implements java.io.Serializable {

    // Declaración de variables.
    private String nombre;
    private int edad;

    // Constructor.
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método toString para mostrar el objeto Persona.
    @Override
    public String toString() {
        return "Persona: [Nombre: " + nombre + ", Edad: " + edad + "]";
    }
}

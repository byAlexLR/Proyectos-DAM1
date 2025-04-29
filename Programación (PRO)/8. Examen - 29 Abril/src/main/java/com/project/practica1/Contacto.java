/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.practica1;

/**
 *
 * @author byAlexLR
 */
public class Contacto {

    // Declaración de variables.
    private String nombre;
    private String numero;
    private String email;

    // Constructor.
    public Contacto(String nombre, String numero, String email) {
        this.nombre = nombre;
        this.numero = numero;
        this.email = email;
    }

    // Método Getter de Nombre.
    public String getNombre() {
        return nombre;
    }

    // Método Setter de Nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString para imprimir el contacto.
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
                + "Número: " + numero + "\n"
                + "Email: " + email + "\n";
    }
}

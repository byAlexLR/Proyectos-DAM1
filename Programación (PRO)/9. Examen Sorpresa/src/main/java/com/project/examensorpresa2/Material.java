/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.examensorpresa2;

/**
 *
 * @author byAlexLR
 */
public class Material {

    // Declaración de variables.
    private String nombre;
    private int cantidad;
    private double precio;

    // Constructor.
    public Material(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Método Getter que multiplica la cantidad por el precio.
    public double getTotal() {
        return cantidad * precio;
    }

    // Método toString para imprimir el material.
    @Override
    public String toString() {
        return "Material [Nombre: " + nombre + ", Cantidad: " + cantidad + ", Precio Unitario: " + precio +
               ", Precio Total: " + getTotal() + "]";
    }
}

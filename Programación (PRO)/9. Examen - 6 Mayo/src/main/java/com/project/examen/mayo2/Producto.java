/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.examen.mayo2;

/**
 *
 * @author byAlexLR
 */
public class Producto {

    // Declaración de variables.
    private String nombre;
    private int cantidad;
    private double precio;

    // Constructor.
    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Método getTotal, que devuelve el precio total de la cantidad dicha.
    public double getTotal() {
        return cantidad * precio;
    }

    // Método toString, para mostrar la información de cada producto.
    @Override
    public String toString() {
        return "Producto[" + "Nombre: " + nombre + ", Cantidad: " + cantidad + ", Precio Unitario: " + precio + ", Precio Total: " + getTotal() + ']';
    }

}

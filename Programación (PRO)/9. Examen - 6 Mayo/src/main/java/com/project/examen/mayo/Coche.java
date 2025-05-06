/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.examen.mayo;

/**
 *
 * @author byAlexLR
 */
// Implementación de la interfaz Serializable.
public class Coche implements java.io.Serializable {

    // Declaración de variables.
    private String marca;
    private String modelo;
    private int cilindrada;

    // Constructor.
    public Coche(String marca, String modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    // Método toString, para mostrar la información de cada coche.
    @Override
    public String toString() {
        return "Coche[" + "Marca: " + marca + ", Modelo: " + modelo + ", Cilindrada: " + cilindrada + ']';
    }
}

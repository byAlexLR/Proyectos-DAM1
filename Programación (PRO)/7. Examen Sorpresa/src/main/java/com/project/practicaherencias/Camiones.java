/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.practicaherencias;

/**
 *
 * @author byAlexLR
 */
public class Camiones extends Vehiculo {

    private int capacidadCarga;
    
    public Camiones (String matricula, String modelo, String marca, int capacidadCarga) {
        super(matricula, modelo, marca);
        this.capacidadCarga = capacidadCarga;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Camión [Matricula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Capacidad de Carga: " + capacidadCarga + "T]");
    }    
}

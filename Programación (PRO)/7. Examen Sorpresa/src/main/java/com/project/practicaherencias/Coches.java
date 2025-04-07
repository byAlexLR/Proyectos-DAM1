/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.project.practicaherencias;

/**
 *
 * @author byAlexLR
 */
public class Coches extends Vehiculo {

    private int puertas;

    public Coches (String matricula, String modelo, String marca, int puertas) {
        this.puertas = puertas;
        super(matricula, modelo, marca);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Coche [Matricula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", NºPuertas: " + puertas + "]") ;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.practicaherencias;

/**
 *
 * @author byAlexLR
 */
public class Motos extends Vehiculo {

    private int cilindrada;
    
    public Motos (String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Moto [Matricula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Cilindrada: " + cilindrada + "cc]");
    }
}

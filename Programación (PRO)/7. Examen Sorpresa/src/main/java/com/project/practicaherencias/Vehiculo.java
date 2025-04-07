/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.project.practicaherencias;

/**
 *
 * @author byAlexLR
 */
public abstract class Vehiculo {

    protected String matricula;
    protected String marca;
    protected String modelo;
    
    public Vehiculo (String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public abstract void mostrarInformacion();
    
}

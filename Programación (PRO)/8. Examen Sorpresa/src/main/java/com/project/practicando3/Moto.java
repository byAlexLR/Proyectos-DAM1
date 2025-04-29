/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.practicando3;

/**
 *
 * @author byAlexLR
 */
public class Moto extends Vehiculo {

    private double impuestoMoto;
    private double precioTotal;

    public Moto(String marca, String modelo, int ano, double precio) {
        super(marca, modelo, ano, precio);
        this.precioTotal = precioTotal;
        this.impuestoMoto = 0.05;
    }

    @Override
    public double calcularImpuesto() {
        return precioTotal = (precio * impuestoMoto) + precio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Año: " + ano + "\n"
                + "Precio (Sin IVA): " + precio + "\n"
                + "Precio (Con IVA): " + calcularImpuesto() + "€\n";
    }
}

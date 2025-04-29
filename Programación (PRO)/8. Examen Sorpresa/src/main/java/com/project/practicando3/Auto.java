/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.practicando3;

/**
 *
 * @author byAlexLR
 */
public class Auto extends Vehiculo {

    private double impuestoAuto;
    private double precioTotal;

    public Auto(String marca, String modelo, int ano, double precio) {
        super(marca, modelo, ano, precio);
        this.precioTotal = precioTotal;
        this.impuestoAuto = 0.10;
    }

    @Override
    public double calcularImpuesto() {
        return precioTotal = (precio * impuestoAuto) + precio;
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

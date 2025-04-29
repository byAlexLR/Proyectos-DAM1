/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.practicando3;

/**
 *
 * @author byAlexLR
 */
public abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected int ano;
    protected double precio;

    public Vehiculo(String marca, String modelo, int ano, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precio = precio;
    }

    public abstract double calcularImpuesto();

    @Override
    public abstract String toString();
}

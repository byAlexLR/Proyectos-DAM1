/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.abril;

/**
 *
 * @author byAlexLR
 */
public abstract class Empleado {
    
    // Declaramos las variables
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
    // Constructor Padre
    public Empleado (String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    // Métodos abstractos para mostrar la información y calcular el salario
    public abstract double calcularSalario();
    public abstract void mostrarInformacion();
}

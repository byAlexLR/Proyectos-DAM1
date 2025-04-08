/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.abril;

/**
 *
 * @author byAlexLR
 */
public class EmpleadoFijo extends Empleado { // Deriva de la clase Empleado

    // Inicializamos las variables
    private int salarioMensual;

    // Constructor de la clase Empleado(Padre) y EmpleadoFijo(Hijo)
    public EmpleadoFijo(String nombre, String apellidos, int edad, int salarioMensual) {
        super(nombre, apellidos, edad);
        this.salarioMensual = salarioMensual;
    }

    // Método Abstracto: Devuelve el Salario Mensual
    @Override
    public double calcularSalario() {
        double salarioTotal = salarioMensual;
        return salarioTotal;
    }

    // Método Abstracto: Imprime la información de cada uno de los empleados
    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado Fijo [Nombre: " + nombre + ", Apellidos: " + apellidos + ", Edad: " + edad + ", Salario Mensual: " + calcularSalario() + "€]");
    }
}

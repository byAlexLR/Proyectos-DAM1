/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.abril;

/**
 *
 * @author byAlexLR
 */
public class EmpleadoHoras extends Empleado { // Deriva de la clase Empleado

    // Inicializamos las variables
    private int salarioHoras;
    private int precioHora;

    // Constructor de la clase Empleado y EmpleadoHoras
    public EmpleadoHoras(String nombre, String apellidos, int edad, int salarioHoras, int precioHora) {
        super(nombre, apellidos, edad);
        this.salarioHoras = salarioHoras;
        this.precioHora = precioHora;
    }
    
    // Método Abstracto: Devuelve el Salario por Horas
    @Override
    public double calcularSalario() {
        double salarioTotal = salarioHoras * precioHora;
        return salarioTotal;
    }

    // Método Abstracto: Imprime la información de cada uno de los empleados
    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado por Horas [Nombre: " + nombre + ", Apellidos: " + apellidos + ", Edad: " + edad + ", Salario por Horas: " + calcularSalario() + "€ por " + salarioHoras + "h (Precio por hora: " + precioHora + "€)]");
    }
}

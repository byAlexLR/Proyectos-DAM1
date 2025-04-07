/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.project.practicaherencias4;

/**
 *
 * @author byAlexLR
 */
public abstract class Empleados {

    protected String nombre;
    protected String correo;
    private int salario;

    public Empleados(String nombre, String correo, int salario) {
        this.nombre = nombre;
        this.correo = correo;
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo.");
        }
    }

    public abstract void mostrarInformacion();

    public abstract double calcularSalarioAnual();
}

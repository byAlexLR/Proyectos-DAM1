/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.practicaherencias4;

import java.util.List;

/**
 *
 * @author byAlexLR
 */
public class Tecnicos extends Empleados {

    private String especialidad;
    private int experiencia;
    private List<String> lenguajes;
    
    public Tecnicos(String nombre, String correo, int salario, String especialidad, int experiencia, List<String> lenguajes){
        super(nombre, correo, salario);
        this.especialidad = especialidad;
        this.experiencia = experiencia;
        this.lenguajes = lenguajes;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Técnico [Nombre: " + nombre + ", Correo: " + correo + ", Salario: " + getSalario() + ", Especialidad: " + especialidad + ", Experencia: " + experiencia + " años, Lenguajes: " + lenguajes + "]");
    }    

    @Override
    public double calcularSalarioAnual() {
        double bonificacion = experiencia > 5 ? 0.10 : 0.0;
        return getSalario() * 12 * (1 + bonificacion);    }
}

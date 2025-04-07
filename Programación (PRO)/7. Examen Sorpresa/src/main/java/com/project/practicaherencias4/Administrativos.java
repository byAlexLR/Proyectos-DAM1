/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.practicaherencias4;

/**
 *
 * @author byAlexLR
 */
public class Administrativos extends Empleados {

    private String departamento;
    private String nivel; // Dos opciones junior o senior
    
    public Administrativos(String nombre, String correo, int salario, String departamento, String nivel){
        super(nombre, correo, salario);
        this.departamento = departamento;
        this.nivel = nivel;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Administrativo [Nombre: " + nombre + ", Correo: " + correo + ", Salario: " + getSalario() + ", Departamento: " + departamento + ", Nivel:" + nivel + "]");
    }

    @Override
    public double calcularSalarioAnual() {
        double bonificacion = nivel.equals("senior") ? 0.05 : 0.0;
        return getSalario() * 12 * (1 + bonificacion);
    }
}

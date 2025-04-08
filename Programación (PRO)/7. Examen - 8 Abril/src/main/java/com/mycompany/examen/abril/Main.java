/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen.abril;

/**
 *
 * @author byAlexLR
 */
public class Main {
    public static void main(String[] args) {
        // Array con los empleados Fijos y Por Horas
        Empleado[] empleados = {
            new EmpleadoFijo("Helena", "Esperanza Grasia", 33, 1500),
            new EmpleadoFijo("Javier", "Felipe Gomez", 45, 800),
            new EmpleadoHoras("Alex", "Federico Perez", 28, 6, 10)
        };
        
        // Muestra un mensaje al principio de lo que va a mostrar segidamente y luego recorre el array mostrando la información
        System.out.println("Resumen de los Empleados:");
        for(Empleado emp : empleados) {
            emp.mostrarInformacion();
        }
    }
}

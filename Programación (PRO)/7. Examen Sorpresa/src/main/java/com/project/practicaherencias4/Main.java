/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.practicaherencias4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca el número de registros: ");
        int numRegistros = sc.nextInt();
        
        Empleados[] empleados = new Empleados[numRegistros];
        for (int i = 0; i < numRegistros; i++) {
            System.out.print("Introduce el tipo a registrar (Administrativo - 1 | Técnico - 2): ");
            int tipoRegistro = sc.nextInt();
            
            System.out.println("Introduce el nombre: ");
            String nombre = sc.next();
            
            System.out.println("Introduce el correo: ");
            String correo = sc.next();
            
            System.out.println("Introduce el salario: ");
            int salario = sc.nextInt();
            
            switch(tipoRegistro){
                case 1 -> {
                    System.out.println("Introduce el departamento: ");
                    String departamento = sc.next();
                    System.out.println("Introduce el nivel(junior o senior): ");
                    String nivel = sc.next().toLowerCase();
                    empleados[i] = new Administrativos(nombre, correo, salario, departamento, nivel);
                }
                case 2 -> {
                    System.out.println("Introduce la especialidad: ");
                    String especialidad = sc.next();
                    System.out.println("Introduce la experencia: ");
                    int experiencia = sc.nextInt();
                    System.out.println("Introduce los lenguajes: ");
                    String lenguajesStr = sc.next();
                    List<String> lenguajes = new ArrayList<>();
                    for(String lenguaje : lenguajesStr.split(",")){
                        lenguajes.add(lenguaje.trim());
                    }
                    empleados[i] = new Tecnicos(nombre, correo, salario, especialidad, experiencia, lenguajes);
                }
                default -> {
                    System.out.println("El tipo introducido es incorrecto");
                    --i;
                }
            }
        }
        
        sc.close();
        
        System.out.println("Resumen de los registros:");
        for(Empleados emp : empleados) {
            emp.mostrarInformacion();
            System.out.println("Salario Anual: " + emp.calcularSalarioAnual());
        }
    }
}

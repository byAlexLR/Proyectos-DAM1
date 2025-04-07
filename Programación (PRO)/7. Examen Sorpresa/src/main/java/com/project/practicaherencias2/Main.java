/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.practicaherencias2;

import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas personas quieres registrar?: ");
        int numPersonas = sc.nextInt();
        
        Personas[] personas = new Personas[numPersonas];
        
        for (int i = 0; i < numPersonas; i++) {
            System.out.print("Introduce el tipo de persona a registrar(Estudiante - 1 | Profesor - 2): ");
            int tipoRegistro = sc.nextInt();
            
            System.out.print("Introduce el nombre: ");
            String nombre = sc.next();
            System.out.print("Introduce el correo: ");
            String correo = sc.next();
            
            switch(tipoRegistro) {
                case 1 -> {
                    System.out.print("Introduce el curso del Estudiante: ");
                    String curso = sc.next();
                    personas[i] = new Estudiantes(nombre, correo, curso);
                }
                case 2 -> {
                    System.out.print("Introduce el departamento del Profesor: ");
                    String departamento = sc.next();
                    personas[i] = new Profesores(nombre, correo, departamento);
                }
                default -> {
                    System.out.print("Tipo de persona incorrecto");
                    --i;
                }
            }
        }
        
        /*
        Personas[] personas = {
            new Estudiantes("Federico", "feder@gmail.com", "1ºCFGS"),
            new Estudiantes("Patricia", "patri@gmail.com", "2ºESO"),
            new Profesores("Helena", "helenaconh@gmail.com", "Informática"),
            new Profesores("Javier", "javierseb@gmail.com", "Informática - Jefe")
        };*/
        
        sc.close();
        
        System.out.println("Resumen de los registros:");
        for(Personas v : personas) {
            v.mostrarInformacion();
        }
    }
}

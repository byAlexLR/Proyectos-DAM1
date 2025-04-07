/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.practicaherencias3;

import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos registros quieres insertar?: ");
        int numRegistros = sc.nextInt();
        
        Publicaciones[] publicaciones = new Publicaciones[numRegistros];
        for (int i = 0; i < numRegistros; i++) {
            System.out.print("¿Qué quieres insertar? (Libros - 1 | Revistas - 2): ");
            int tipoRegistro = sc.nextInt();
            
            System.out.println("Introduce el título: ");
            String titulo = sc.next();
            
            System.out.println("Introduce el autor: ");
            String autor = sc.next();
            
            System.out.println("Intoduce el año: ");
            int ano = sc.nextInt();
            
            switch(tipoRegistro){
                case 1 -> {
                    System.out.println("Introduce el número de páginas: ");
                    int numPaginas = sc.nextInt();
                    System.out.println("Introduce el tipo de tapa: ");
                    String tapa = sc.next();
                    publicaciones[i] = new Libros(titulo, autor, ano, numPaginas, tapa);
                }
                case 2 -> {
                    System.out.println("Introduce el número de edición: ");
                    int numEdicion = sc.nextInt();
                    System.out.println("Introduce el mes de publicación: ");
                    int mesPublicacion = sc.nextInt();
                    publicaciones[i] = new Revistas(titulo, autor, ano, numEdicion, mesPublicacion);
                }
                default -> {
                    System.out.println("El tipo de registro es incorrecto");
                    --i;
                }
            }
        }
        
        sc.close();
        
        System.out.println("Resumen de los registros:");
        for(Publicaciones p : publicaciones) {
            p.mostrarInformacion();
        }
    }
}

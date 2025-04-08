/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.abril2;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {
        // Array con los distintos tipos de publicaciones
        Publicaciones[] publicaciones = {
            new Texto("24-04-2024", "Felipe", "Blah blah blah PEPE"),
            new Imagen("18-03-2024", "Antonia", "https://www3.gobiernodecanarias.jpg"),
            new Video("31-12-2024", "Arturo", "https://www3.gobiernodecanarias.mp4", 90)
        };
        
        // Muestra un mensaje al principio de lo que va a mostrar segidamente y luego recorre el array mostrando la información
        System.out.println("Resumen de las Publicaciones:");
        for (Publicaciones publi : publicaciones) {
            publi.mostrarInformacion();
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.examensorpresa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {

        // Crea el Array e inserta las personas.
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Helena", 33));
        personas.add(new Persona("Pedrito", 45));
        personas.add(new Persona("Alfredo", 26));
        personas.add(new Persona("Angustia", 20));
        personas.add(new Persona("Antía", 27));

        // Declaración e inicialización de las variables de escritura y lectura.
        try (FileOutputStream fos = new FileOutputStream("personas.dat"); ObjectOutputStream salida = new ObjectOutputStream(fos); FileInputStream fis = new FileInputStream("personas.dat"); ObjectInputStream entrada = new ObjectInputStream(fis)) {

            // Escribe el ArrayList completo en el fichero.
            salida.writeObject(personas);

            // Lee el ArrayList completo desde el fichero.
            ArrayList<Persona> personasLeidas = (ArrayList<Persona>) (ArrayList<Persona>) entrada.readObject();

            // Muestra los objetos leídos.
            for (Persona pers : personasLeidas) {
                System.out.println(pers);
            }

            // Captura las excepciones.
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.practica1;

// Librerías importadas.
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {
        // Creación de la variable Scanner.
        Scanner sc = new Scanner(System.in);
        // Inicialización del ArrayList Contacto.
        ArrayList<Contacto> contactos = new ArrayList<>();
        // Inserción de contactos al ArrayList.
        contactos.add(new Contacto("Pedrito", "+34 699150239", "pedrito@gmail.com"));
        contactos.add(new Contacto("Federico", "+34 615089783", "federico@gmail.com"));
        contactos.add(new Contacto("Helena", "+34 600984565", "helena@gmail.com"));
        contactos.add(new Contacto("Javier", "+34 602879435", "javier@gmail.com"));
        contactos.add(new Contacto("Javier", "+34 685789254", "javier2@gmail.com"));
        contactos.add(new Contacto("Alejandro", "+34 654823879", "alejandro@gmail.com"));

        // Muestra el contenido de la lista de contactos.
        System.out.println("Lista de Contactos:");
        for (Contacto cont : contactos) {
            System.out.println(cont.toString());
        }

        // Declaración de la variable nombre.
        String nombre;
        // Bucle para que el usuario pregunte tantas veces como quiera.
        do {
            // Le pregunta al usuario en que contacto está interesado, y le comunica la forma de salir.
            System.out.println("Para salir introduce 0.");
            System.out.print("¿A quién estás buscando?: ");
            nombre = sc.next();

            // Se activa el condicional si el valor introducido no es 0.
            if (!"0".equals(nombre)) {
                // En el caso de no encontrar al usuario, inicia el condicional if.
                boolean noEncontrado = true;
                // Bucle para buscar el contacto especificado.
                for (Contacto cont : contactos) {
                    if (cont.getNombre().equalsIgnoreCase(nombre)) {
                        // En el caso de encontrarlo manda un false a la variable encontrado para no iniciar el condicional if.
                        noEncontrado = false;
                        System.out.println(cont.toString());
                    }
                }

                // Imprime un mensaje de contacto no encontrado si no existe en el ArrayList.
                if (noEncontrado) {
                    System.out.println("Contacto no encontrado.\n");
                }
            }
        } while (!"0".equals(nombre));
        // Muestra un mensaje de salida.
        System.out.println("Saliendo del programa.");
        // Cierra el scanner.
        sc.close();
    }
}

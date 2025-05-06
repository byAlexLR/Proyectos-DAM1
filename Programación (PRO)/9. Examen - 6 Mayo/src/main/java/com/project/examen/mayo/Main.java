/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.examen.mayo;

// Librerías importadas.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {
        // Declaración de array e insercción de datos en él.
        ArrayList<Coche> vehiculos = new ArrayList<>();
        vehiculos.add(new Coche("Ford", "Fiesta ST", 150));
        vehiculos.add(new Coche("Volvo", "Cabrera", 130));
        vehiculos.add(new Coche("Skoda", "Fabia", 89));
        vehiculos.add(new Coche("Chevrolet", "Impala", 120));

        // Creacción de un try-catch para capturar las excepciones, e inicialización de las variables para obtener el archivo y utilizarlo.
        try (FileOutputStream fos = new FileOutputStream("vehiculitos.bat"); ObjectOutputStream salida = new ObjectOutputStream(fos); FileInputStream fis = new FileInputStream("vehiculitos.bat"); ObjectInputStream entrada = new ObjectInputStream(fis)) {

            // Inserta en el archivo "vehiculitos.bat", los diferentes vehículos.
            salida.writeObject(vehiculos);

            // Lee el archivo y lo guarda en un nuevo array. Para ello utilizo el casting.
            ArrayList<Coche> vehiculosLeidos = (ArrayList<Coche>) entrada.readObject();

            // Muestra un mensaje antes del bucle, para dar contexto.
            System.out.println("Listado de vehículos:");
            // Bucle For: para mostrar los vehículos que se han leído.
            for (Coche veh : vehiculosLeidos) {
                System.out.println(veh);
            }

            // Captura las posibles excepciones.
        } catch (FileNotFoundException ex) {
            System.err.println("Archivo no encontrado o sin permisos: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error de entrada/salida: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println("Clase no encontrada: " + ex.getMessage());
        }
    }
}

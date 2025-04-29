/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.examensorpresa1;

// Importa las librerías
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {
        // Inicializa el Scanner
        Scanner sc = new Scanner(System.in);

        // Crea las distintas citas
        Cita cita1 = new Cita("18-02-25", "18:57", "Pedritos Festival");
        Cita cita2 = new Cita("02-06-25", "12:00", "Abuelito Festival");
        Cita cita3 = new Cita("25-12-25", "20:30", "Calipso Festival");

        // Crea el Arraylist e introduce las citas al array
        ArrayList<Cita> citas = new ArrayList<>();
        citas.add(cita1);
        citas.add(cita2);
        citas.add(cita3);

        // Variable para leer lo que introduce el usuario
        String opcion;
        // Bucle para interactuar con el usuario y pedirle la fecha
        do {
            // Le pregunta al usuario y lee su respuesta
            System.out.println("Para salir introduce 0.");
            System.out.print("Introduce una cita(DD-MM-YY): ");
            opcion = sc.next();

            // Para saber si existe, se inicializa en falso
            boolean existe = false;

            // Se recorre el array
            for (Cita ci : citas) {
                // Compara si el valor introducido concuerda con alguna cita, si es así lo imprime, sino, avisa de que la cita no ha sido encontrada
                if (ci.getFecha().equals(opcion)) {
                    existe = true; // Cambia el boolean para que no se imprima
                    System.out.println(ci.toString());
                    break;
                }
            }
            // En el caso de que no se encuentre la fecha se imprime el siguiente mensaje
            if (!existe) {
                System.out.println("Cita no encontrada");
            }
            // Si el valor introducido es 0 cierra el bucle
        } while (!"0".equals(opcion));

        // Cierra el scanner
        sc.close();
    }
}

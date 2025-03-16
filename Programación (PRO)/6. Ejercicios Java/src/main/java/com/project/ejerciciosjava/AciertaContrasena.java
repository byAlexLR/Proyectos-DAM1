/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.project.ejerciciosjava;

// Paquetes
import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class AciertaContrasena {
    private String contrasena;

    // Constructor: solicita al Jugador 1 que introduzca la contraseña y la guarda
    public AciertaContrasena() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jugador 1, introduce la contraseña:");
        contrasena = sc.nextLine();
        // Limpia la pantalla después de que el Jugador 1 introduzca la contraseña
        System.out.println("\n".repeat(50));
    }

    // Método para jugar: permite al Jugador 2 intentar adivinar la contraseña
    public void jugar() {
        Scanner sc = new Scanner(System.in);
        String intento;

        // Bucle que continúa hasta que el Jugador 2 acierte la contraseña
        do {
            System.out.print("Jugador 2, intenta adivinar la contraseña:");
            intento = sc.nextLine();

            // Compara el intento con la contraseña y da pistas
            if (intento.compareTo(contrasena) < 0) {
                System.out.println("La contraseña es mayor.");
            } else if (intento.compareTo(contrasena) > 0) {
                System.out.println("La contraseña es menor.");
            }
        } while (!intento.equals(contrasena));

        // Mensaje de éxito al acertar la contraseña
        System.out.println("¡Has acertado!");

        sc.close();
    }

    // Método principal: crea una instancia del juego e inicia el juego
    public static void main(String[] args) {
        AciertaContrasena juego = new AciertaContrasena();
        juego.jugar();
    }
}
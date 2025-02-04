/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examen.feb;

import java.util.Scanner; // Importo el Scanner.s

/**
 *
 * @author byAlexLR
 */
public class Rombo {

    private int num; // Variable privada del tamaño del rombo.

    public Rombo(int num) { // Constructor de la variable 'num'.
        this.num = num;
    }

    public void dibujarRombo() { // Método para hacer el rombo.
        int n = num / 2; // Divido el número entre dos, así obtengo el tamaño de la mitad del rombo.
        if (num % 2 == 0) {
            num++; // Si es par, incrementa en 1 para hacerlo impar.
        }
        for (int i = -n; i <= n; i++) { // Bucle For: inicio en '-n' hasta llegar a 'n', para hacer el dibujo.
            int absI = Math.abs(i); // Obtengo el valor absoluto de 'i'.
            System.out.println(" ".repeat(absI) + "*".repeat(num - 2 * absI)); // Imprimo el espacio segundo el valor de absI, e imprimo los asteriscos según el valor correspondiente a la multiplicación de 'absI' por '2' menos 'num'.
        }
    }

    public static void main(String[] args) { // Método Main.
        Scanner sc = new Scanner(System.in); // Inicializa Scanner.
        System.out.print("Bienvenido/a a Rombo. ¿Cómo te llamas?: "); // Da la bienvenida pidiendo el nombre.
        String nombre = sc.next(); // Lo lee y almacena.
        System.out.print(nombre + ", podrías introducir el tamaño del rombo: "); // Con el nombre le pide el tamaño del rombo.
        int num = sc.nextInt(); // Lo lee y almacena.
        sc.close(); // Cierro el Scanner.

        Rombo rom = new Rombo(num); // Inicializa la variable.
        rom.dibujarRombo(); // Llama al método.
    }
}

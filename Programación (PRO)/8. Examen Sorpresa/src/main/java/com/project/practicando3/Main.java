/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.practicando3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Honda", "Civic", 2025, 15000.0));
        vehiculos.add(new Moto("BMW", "1500", 2024, 7500.0));

        boolean salir = false;

        while (!salir) {
            System.out.println("¿Qué te gustaría hacer? \n1. Ver la lista\n2. Añadir a la lista\n3. Eliminar de la lista\n4. Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    for (Vehiculo veh : vehiculos) {
                        System.out.println(veh.toString());
                    }
                }
                case 2 -> {
                    System.out.print("Introduce la Marca: ");
                    String marca = sc.next();
                    System.out.print("Introduce el Modelo: ");
                    String modelo = sc.next();
                    System.out.print("Introduce el Año: ");
                    int ano = sc.nextInt();
                    System.out.print("Introduce el Precio: ");
                    Double precio = sc.nextDouble();

                    System.out.print("Introduce el tipo (1 - Auto | 2 - Moto): ");
                    int tipo = sc.nextInt();
                    switch (tipo) {
                        case 1: {
                            vehiculos.add(new Auto(marca, modelo, ano, precio));
                        }
                        case 2: {
                            vehiculos.add(new Moto(marca, modelo, ano, precio));
                        }
                    }
                }
                case 3 -> {
                    System.out.print("¿Qué modelo quieres eliminar?: ");
                    String modelo = sc.next();
                    vehiculos.removeIf(veh -> veh.modelo.equalsIgnoreCase(modelo));
                    System.out.println("Vehículo eliminado.");
                }
                case 4 -> {
                    salir = true;
                    System.out.println("Adiós");
                }
                default ->
                    System.out.println("Lo siento, no te he entendido.");
            }
        }
        sc.close();
    }
}

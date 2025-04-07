/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.project.practicaherencias;

import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos vehículos te gustaría registrar?: ");
        int numVehiculo = sc.nextInt();
        
        Vehiculo[] vehiculos = new Vehiculo[numVehiculo];
        
        for (int i = 0; i < numVehiculo; i++) {
            System.out.println("¿Qué tipo de vehículo te gustaría registrar? (Coche - 1, Camión - 2, Moto - 3): ");
            int tipoVehiculo = sc.nextInt();
            
            System.out.print("Introduce la matrícula: ");
            String matricula = sc.next();
            System.out.print("Introduce la marca: ");
            String marca = sc.next();
            System.out.print("Introduce el modelo: ");
            String modelo = sc.next();
            
            switch(tipoVehiculo){
                case 1 -> {
                    System.out.print("Introduce el número de puertas: ");
                    int puertas = sc.nextInt();
                    vehiculos[i] = new Coches(matricula, marca, modelo, puertas);
                }
                case 2 -> {
                    System.out.print("Introduce la capacidad de carga: ");
                    int capacidadCarga = sc.nextInt();
                    vehiculos[i] = new Camiones(matricula, marca, modelo, capacidadCarga);
                }
                case 3 -> {
                    System.out.print("Introduce la cilindrada: ");
                    int cilindrada = sc.nextInt();
                    vehiculos[i] = new Motos(matricula, marca, modelo, cilindrada);
                }
                default -> {
                    System.out.println("El tipo de vehículo introducido es incorrecto.");
                    --i;
                }
            }
        }
        
        /*Vehiculo[] vehiculos = {
            new Coches("4580DGT", "Ford", "Fiesta", 3),
            new Coches("6789RTU", "Ferrari", "450", 2),
            new Camiones("8756PDT", "Scania", "Galer", 6),
            new Motos("0129TYU", "Vespa", "250P", 80)
        };*/
        
        sc.close();
        
        System.out.println("Resumen de los registros:");
        for (Vehiculo v : vehiculos) {
            v.mostrarInformacion();
        }
    }
}

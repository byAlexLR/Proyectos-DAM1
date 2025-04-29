/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.practicando2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author byAlexLR
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Evento> eventos = new ArrayList<>();
        eventos.add(new Cita("05-12-2025", "12:56", "Hacer Deberes"));
        eventos.add(new Cita("13-01-2025", "09:00", "Hacer Rave"));
        eventos.add(new Cita("25-07-2025", "18:30", "Hacer Clases"));
        String fecha;

        do {
            System.out.println("Para salir introduce un 0.");
            System.out.print("Introduce una fecha (DD-MM-YYYY): ");
            fecha = sc.next();

            if (!"0".equals(fecha)) {
                boolean encontrada = true;
                for (Evento ev : eventos) {
                    if (ev.fecha == null ? fecha == null : ev.fecha.equals(fecha)) {
                        encontrada = false;
                        System.out.println(ev.toString());
                    }
                }

                if (encontrada) {
                    System.out.println("Lo sentimos, la fecha introducida no corresponde a ninguna guardada.\n");
                }
            }
        } while (!"0".equals(fecha));
        sc.close();
    }
}

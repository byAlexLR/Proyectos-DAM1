/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.mycompany.ejercicioinventado;

import javax.swing.JOptionPane;

/**
 *
 * @author byAlexLR
 * 
 */
public class EjercicioInventado {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        Horas();
    }
    
    public static void Horas() {
        double precioDia = 0.0, contadorSalario = 0.0, contadorHoras = 0.0, contadorExtras = 0.0;
        String nombreDias = "", cierre;
        int menu;
        boolean cerramos = false;

        do { 
            menu = Integer.parseInt(JOptionPane.showInputDialog("<html><div style='text-align: left;'>¿Qué quieres realizar?<br>1) Ingresar horas trabajadas.<br>2) Ver el resumen total.<br>3) Salir.</div></html>"));
            
            switch (menu) {
                case 1 -> {
                    for (int i = 0; i < 7; i++) {
                        switch (i) {
                            case 0 -> {
                                nombreDias = "Lunes";
                                precioDia = 10.0;
                            }
                            case 1 -> {
                                nombreDias = "Martes";
                                precioDia = 10.0;
                            }
                            case 2 -> {
                                nombreDias = "Miércoles";
                                precioDia = 12.0;
                            }
                            case 3 -> {
                                nombreDias = "Jueves";
                                precioDia = 12.0;
                            }
                            case 4 -> {
                                nombreDias = "Viernes";
                                precioDia = 15.0;
                            }
                            case 5 -> {
                                nombreDias = "Sábado";
                                precioDia = 18.0;
                            }
                            case 6 -> {
                                nombreDias = "Domingo";
                                precioDia = 20.0;
                            }
                        }

                        double horas = Double.parseDouble(JOptionPane.showInputDialog("<html><div style='text-align: center;'>Introduce las horas trabajadas del " + nombreDias + ":</div></html>"));

                        if (horas >= 0 && horas <= 12) {
                            contadorHoras += horas;

                            if (horas > 8) {
                                double horasExtras = horas - 8;
                                contadorExtras += horasExtras;
                                contadorSalario += (8 * precioDia) + (horasExtras * precioDia * 1.5);
                            } else {
                                contadorSalario += horas * precioDia;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "<html><div style='text-align: center;'>Las horas introducidas no son correctas.<br>Debe estar entre 0 y 12, inclusive.</div></html>");
                            i--;
                        }
                    }
                }
                case 2 -> {
                    if (contadorExtras > 0) {
                        JOptionPane.showMessageDialog(null, "<html><div style='text-align: left;'>Resumen del trabajo:<br>· Total a pagar: " + contadorSalario + " euros<br>· Horas trabajadas: " + contadorHoras + " horas<br>· Horas extras incluidas: " + contadorExtras + " horas</div></html>");
                    } else {
                        JOptionPane.showMessageDialog(null, "<html><div style='text-align: left;'>Resumen del trabajo:<br>· Total a pagar: " + contadorSalario + " euros<br>· Horas trabajadas: " + contadorHoras + " horas</div></html>");
                    }
                }
                case 3 -> {
                    cierre = JOptionPane.showInputDialog("<html><div style='text-align: center;'>¿Quieres salir de la plataforma? (si/no)</div></html>").toLowerCase();
                    if ("si".equals(cierre)) {
                        JOptionPane.showMessageDialog(null, "<html><div style='text-align: center;'>Saliendo...</div></html>");
                        cerramos = true;
                    } else if ("no".equals(cierre)) {
                        cerramos = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "<html><div style='text-align: center;'>No te he entendido. Continuemos.</div></html>");
                        cerramos = false;
                    }
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "<html><div style='text-align: center;'>El valor introducido no es correcto.</div></html>");
                }
            }
        } while (!cerramos);
    }
}
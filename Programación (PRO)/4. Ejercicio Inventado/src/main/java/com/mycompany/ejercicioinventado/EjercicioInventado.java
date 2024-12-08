/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ejercicioinventado;

import javax.swing.JOptionPane; // Importa la clase JOptionPane.

/**
 *
 * @author byAlexLR
 *
 */
public class EjercicioInventado {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Horas();  // Llamada al método.
    }

    public static void Horas() {
        // Inicia las variables para contar cálculos y datos.
        double precioDia = 0.0, contadorSalario = 0.0, contadorHoras = 0.0, contadorExtras = 0.0;
        String nombreDias = "", cierre;
        int menu;
        boolean cerramos = false; // Para salir del bucle.

        // Bucle Do-While: Para crear el menú.
        do {
            // Mostrar el menú y leer opción seleccionada.
            menu = Integer.parseInt(JOptionPane.showInputDialog("<html><div style='text-align: left;'>¿Qué quieres realizar?<br>1) Ingresar horas trabajadas.<br>2) Ver el resumen total.<br>3) Salir.</div></html>"));

            // Switch: Crear el menú con opciones.
            switch (menu) {
                // Si selecciona la primera opción.
                case 1 -> {
                    // Bucle For: Para registrar las horas de cada día.
                    for (int i = 0; i < 7; i++) {
                        // Switch: Determina el día en el mensaje y el precio.
                        switch (i) {
                            case 0 -> { nombreDias = "Lunes"; precioDia = 10.0; }
                            case 1 -> { nombreDias = "Martes"; precioDia = 10.0; }
                            case 2 -> { nombreDias = "Miércoles"; precioDia = 12.0; }
                            case 3 -> { nombreDias = "Jueves"; precioDia = 12.0; }
                            case 4 -> { nombreDias = "Viernes"; precioDia = 15.0; }
                            case 5 -> { nombreDias = "Sábado"; precioDia = 18.0; }
                            case 6 -> { nombreDias = "Domingo"; precioDia = 20.0; }
                        }
                        
                         // Solicitar al usuario las horas trabajadas para el día actual.
                        double horas = Double.parseDouble(JOptionPane.showInputDialog("<html><div style='text-align: center;'>Introduce las horas trabajadas del " + nombreDias + ":</div></html>"));

                        if (horas >= 0 && horas <= 12) { // Valida que las horas estén entre 0 y 12.
                            contadorHoras += horas; // Las suma al contador total.

                            if (horas > 8) { // Calcula las horas extras si es necesario.
                                double horasExtras = horas - 8; // A las horas le resta 8h, que son las que no se considerán extras.
                                contadorExtras += horasExtras; // Las suma al contador extra.
                                contadorSalario += (8 * precioDia) + (horasExtras * precioDia * 1.5); // Calcula el precio de las horas y de las extras.
                            } else {
                                contadorSalario += horas * precioDia; // Calcula el precio de las horas del día actual.
                            }
                        } else {
                            // Mensaje de error, si las horas no se comprenden entre el 0 y el 12, ambas inclusive.
                            JOptionPane.showMessageDialog(null, "<html><div style='text-align: center;'>Las horas introducidas no son correctas.<br>Debe estar entre 0 y 12, inclusive.</div></html>");
                            i--; // Repite el día actual.
                        }
                    }
                }
                // Si selecciona la segunda opción.
                case 2 -> {
                    // Muestra un resumen de horas trabajadas y el salario.
                    if (contadorExtras > 0) { // Si tiene horas extras, muestra este mensaje.
                        JOptionPane.showMessageDialog(null, "<html><div style='text-align: left;'>Resumen del trabajo:<br>· Total a pagar: " + contadorSalario + " euros<br>· Horas trabajadas: " + contadorHoras + " horas<br>· Horas extras incluidas: " + contadorExtras + " horas</div></html>");
                    } else { // Si no tiene horas extras, muestra este mensaje.
                        JOptionPane.showMessageDialog(null, "<html><div style='text-align: left;'>Resumen del trabajo:<br>· Total a pagar: " + contadorSalario + " euros<br>· Horas trabajadas: " + contadorHoras + " horas</div></html>");
                    }
                }
                // Si selecciona la tercera opción.
                case 3 -> {
                    // Muestra un mensaje para confirmar la salida de la plataforma.
                    cierre = JOptionPane.showInputDialog("<html><div style='text-align: center;'>¿Quieres salir de la plataforma? (si/no)</div></html>").toLowerCase();
                    if ("si".equals(cierre)) { // Si introduce "si", cerrará el bucle y mostrará un mensaje de salida.
                        JOptionPane.showMessageDialog(null, "<html><div style='text-align: center;'>Saliendo...</div></html>");
                        cerramos = true;
                    } else if ("no".equals(cierre)) { // Si introduce "no" volverá al menú.
                        cerramos = false;
                    } else { // Si introduce una cosa diferente a las adjudicadas, volverá al menú después de lanzar un mensaje comunicando que no se ha entendido la opción elegida.
                        JOptionPane.showMessageDialog(null, "<html><div style='text-align: center;'>No te he entendido. Continuemos.</div></html>");
                        cerramos = false;
                    }
                }
                default -> { // En el caso de introducir una opción no válida, lanzará este mensaje de error.
                    JOptionPane.showMessageDialog(null, "<html><div style='text-align: center;'>El valor introducido no es correcto.</div></html>");
                }
            }
        } while (!cerramos); // Continuará mientras no sea true.
    }
}

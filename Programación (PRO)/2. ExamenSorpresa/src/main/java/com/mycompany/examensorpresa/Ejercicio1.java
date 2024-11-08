/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examensorpresa;

import javax.swing.JOptionPane;

/**
 *
 * @author byAlexLR
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        AreaCirculo(); // Llamamos al metodo.
        AreaTriangulo(); // Llamamos al metodo.
        AreaCuadrado(); // Llamamos al metodo.
        AreaRectangulo(); // Llamamos al metodo.
    }

    public static void AreaCirculo() { // Método
        double radio = Double.parseDouble(JOptionPane.showInputDialog("(Circulo) Indica el radio:")); // Crea la variable e imprime un mensaje, y lee lo que establece el usuario. 
        double area = Math.PI * Math.pow(radio, 2); // PI por radio al cuadrado.
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + area); // Dice el resultado.
    }

    public static void AreaTriangulo() { // Método
        double base = Double.parseDouble(JOptionPane.showInputDialog("(Triangulo)Indica el base:")); // Crea la variable e imprime un mensaje, y lee lo que establece el usuario.
        double altura = Double.parseDouble(JOptionPane.showInputDialog("(Triangulo)Indica el altura:")); // Crea la variable e imprime un mensaje, y lee lo que establece el usuario.
        double area = (base * altura) / 2; // Fórmula base por altura entre dos.
        JOptionPane.showMessageDialog(null, "El area del triangulo es: " + area); // Dice el resultado.
    }

    public static void AreaCuadrado() { // Método
        double lado = Double.parseDouble(JOptionPane.showInputDialog("(Cuadrado)Indica el lado:")); // Crea la variable e imprime un mensaje, y lee lo que establece el usuario.
        double area = lado * lado; // Fórmula lado por lado.
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + area); // Dice el resultado.
    }

    public static void AreaRectangulo() { // Método
        double base = Double.parseDouble(JOptionPane.showInputDialog("(Rectangulo)Indica el base:")); // Crea la variable e imprime un mensaje, y lee lo que establece el usuario.
        double altura = Double.parseDouble(JOptionPane.showInputDialog("(Rectangulo)Indica el altura:")); // Crea la variable e imprime un mensaje, y lee lo que establece el usuario.
        double area = base * altura; // Fórmula base por altura.
        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + area); // Dice el resultado.
    }
}

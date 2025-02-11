/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author byAlexLR
 */
public class Palindromo {
    private int num;
    
    public Palindromo(int num){
        this.num = num;
    }
    
    public void esPalindromo(){
        int numNormal = num;
        int revNum = 0;
        
        while(numNormal != 0){
            revNum = revNum * 10 + numNormal % 10;
            numNormal /= 10;
        }
        
        JOptionPane.showMessageDialog(null, "Input: " + num + "Invertido: " + revNum);
        if(revNum == num) {
            JOptionPane.showMessageDialog(null, "Es palíndromo");
        } else {
            JOptionPane.showMessageDialog(null, "No es palíndromo");
        }
    }
    
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
        
        Palindromo pali = new Palindromo(num);
        pali.esPalindromo();
    }
}

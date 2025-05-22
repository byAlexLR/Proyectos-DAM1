/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.practicandointerfaces;

/**
 *
 * @author byAlexLR
 */
public class Minicalculadora extends javax.swing.JFrame {

    // Inicializa los componentes.  
    public Minicalculadora() {
        initComponents();
    }

    // Variables para almacenar datos introducidos.
    private int num1;
    private int num2;
    private int resultado = 0;

    // Constructor que inicializa las variables.
    public Minicalculadora(int num1, int num2, int resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }

    // Método generado automáticamente para inicializar los componentes gráficos.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCalculadora = new javax.swing.JPanel();
        bSumar = new javax.swing.JButton();
        bRestar = new javax.swing.JButton();
        bMultiplicar = new javax.swing.JButton();
        bDividir = new javax.swing.JButton();
        tNumero1 = new javax.swing.JTextField();
        tNumero2 = new javax.swing.JTextField();
        lResultado = new javax.swing.JLabel();
        lNumero1 = new javax.swing.JLabel();
        lNumero2 = new javax.swing.JLabel();
        lResultado2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bSumar.setText("Sumar");
        bSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSumarActionPerformed(evt);
            }
        });

        bRestar.setText("Restar");
        bRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestarActionPerformed(evt);
            }
        });

        bMultiplicar.setText("Multiplicar");
        bMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiplicarActionPerformed(evt);
            }
        });

        bDividir.setText("Dividir");
        bDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDividirActionPerformed(evt);
            }
        });

        lNumero1.setText("Primer Número");

        lNumero2.setText("Segundo Número");

        lResultado2.setText("RESULTADO:");

        javax.swing.GroupLayout pCalculadoraLayout = new javax.swing.GroupLayout(pCalculadora);
        pCalculadora.setLayout(pCalculadoraLayout);
        pCalculadoraLayout.setHorizontalGroup(
            pCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCalculadoraLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pCalculadoraLayout.createSequentialGroup()
                        .addGroup(pCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lNumero1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tNumero1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(pCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tNumero2)
                            .addComponent(lNumero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lResultado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(pCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bDividir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bRestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addContainerGap())
        );
        pCalculadoraLayout.setVerticalGroup(
            pCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCalculadoraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCalculadoraLayout.createSequentialGroup()
                        .addComponent(bSumar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bRestar))
                    .addGroup(pCalculadoraLayout.createSequentialGroup()
                        .addGroup(pCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lNumero1)
                            .addComponent(lNumero2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addGap(13, 13, 13)
                .addGroup(pCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lResultado2)
                    .addComponent(bDividir))
                .addGroup(pCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCalculadoraLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(bMultiplicar))
                    .addGroup(pCalculadoraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método que se ejecuta al presionar el botón "Restar".
    private void bRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestarActionPerformed
        // Asigna los textos ingresados por el usuario, parseando los valores a Int.
        num1 = Integer.parseInt(tNumero1.getText());
        num2 = Integer.parseInt(tNumero2.getText());
        // Realiza la resta en la variable.
        resultado = num1 - num2;

        // Muestra en el JLabel el resultado.
        lResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_bRestarActionPerformed

    // Método que se ejecuta al presionar el botón "Sumar".
    private void bSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSumarActionPerformed
        // Asigna los textos ingresados por el usuario, parseando los valores a Int.
        num1 = Integer.parseInt(tNumero1.getText());
        num2 = Integer.parseInt(tNumero2.getText());
        // Realiza la suma en la variable.
        resultado = num1 + num2;

        // Muestra en el JLabel el resultado.
        lResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_bSumarActionPerformed

    // Método que se ejecuta al presionar el botón "Multiplicar".
    private void bMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultiplicarActionPerformed
        // Asigna los textos ingresados por el usuario, parseando los valores a Int.
        num1 = Integer.parseInt(tNumero1.getText());
        num2 = Integer.parseInt(tNumero2.getText());
        // Realiza la multiplicación en la variable.
        resultado = num1 * num2;

        // Muestra en el JLabel el resultado.
        lResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_bMultiplicarActionPerformed

    // Método que se ejecuta al presionar el botón "Dividir".
    private void bDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDividirActionPerformed
        // Asigna los textos ingresados por el usuario, parseando los valores a Int.
        num1 = Integer.parseInt(tNumero1.getText());
        num2 = Integer.parseInt(tNumero2.getText());

        // Comprueba si alguna variable es igual a cero.
        if (num2 == 0 || num1 == 0) {
            // Muestra en el JLabel un mensaje de que se está dividiendo por cero.
            lResultado.setText("División por Cero");
        } else {
            // Realiza la división en la variable.
            resultado = num1 / num2;
            // Muestra en el JLabel el resultado.
            lResultado.setText(String.valueOf(resultado));
        }

    }//GEN-LAST:event_bDividirActionPerformed

    // Método main.
    public static void main(String args[]) {
        // Establece el "look and feel" de Nimbus si está disponible.
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Minicalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Minicalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Minicalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Minicalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Crea y muestra la ventana de la aplicación.
        java.awt.EventQueue.invokeLater(() -> {
            new Minicalculadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDividir;
    private javax.swing.JButton bMultiplicar;
    private javax.swing.JButton bRestar;
    private javax.swing.JButton bSumar;
    private javax.swing.JLabel lNumero1;
    private javax.swing.JLabel lNumero2;
    private javax.swing.JLabel lResultado;
    private javax.swing.JLabel lResultado2;
    private javax.swing.JPanel pCalculadora;
    private javax.swing.JTextField tNumero1;
    private javax.swing.JTextField tNumero2;
    // End of variables declaration//GEN-END:variables
}

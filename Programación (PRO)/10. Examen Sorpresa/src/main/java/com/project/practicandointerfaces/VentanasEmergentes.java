/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.practicandointerfaces;

// Importa las librerías de swing necesarias.
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author byAlexLR
 */
public class VentanasEmergentes extends javax.swing.JFrame {

    // Inicializa los componentes.
    public VentanasEmergentes() {
        initComponents();
    }

    // Método generado automáticamente para inicializar los componentes gráficos.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanasEmergentes = new javax.swing.JPanel();
        bMostrarMensaje = new javax.swing.JButton();
        bPedirNombre = new javax.swing.JButton();
        bVentanaPersonalizada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bMostrarMensaje.setText("Mostrar mensaje");
        bMostrarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarMensajeActionPerformed(evt);
            }
        });

        bPedirNombre.setText("Pedir nombre");
        bPedirNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPedirNombreActionPerformed(evt);
            }
        });

        bVentanaPersonalizada.setText("Ventana personalizada");
        bVentanaPersonalizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVentanaPersonalizadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VentanasEmergentesLayout = new javax.swing.GroupLayout(VentanasEmergentes);
        VentanasEmergentes.setLayout(VentanasEmergentesLayout);
        VentanasEmergentesLayout.setHorizontalGroup(
            VentanasEmergentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanasEmergentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentanasEmergentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bMostrarMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bPedirNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bVentanaPersonalizada, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                .addContainerGap())
        );
        VentanasEmergentesLayout.setVerticalGroup(
            VentanasEmergentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanasEmergentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bMostrarMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bPedirNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bVentanaPersonalizada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VentanasEmergentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VentanasEmergentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método que se ejecuta al presionar el botón "Mostrar Mensaje".
    private void bMostrarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarMensajeActionPerformed
        // Lanza una ventana con el mensaje.
        JOptionPane.showMessageDialog(this, "¡Hola desde un JOptionPane!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bMostrarMensajeActionPerformed

    // Método que se ejecuta al presionar el botón "Pedir Nombre".
    private void bPedirNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPedirNombreActionPerformed
        // Ventana que pide el nombre y lo almacena en la variable "nombre".
        String nombre = JOptionPane.showInputDialog(this, "¿Cuál es tu nombre?");
        // Comprueba si se ha introducido un valor.
        if (nombre != null && !nombre.isBlank()) {
            // Lanza una ventana con el mensaje personalizado.
            JOptionPane.showMessageDialog(this, "¡Hola, " + nombre + "!");
        }
    }//GEN-LAST:event_bPedirNombreActionPerformed

    // Método que se ejecuta al presionar el botón "Ventana Personalizada".
    private void bVentanaPersonalizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVentanaPersonalizadaActionPerformed
        // Asigna la librería JDialog a la variable.
        JDialog dialogo;
        // Añade un nombre a la ventana.
        dialogo = new JDialog(this, "Ventana personalizada", true);
        // Asigna unas dimensiones.
        dialogo.setSize(250, 150);
        // Asigna al layout "null" para posicionar los componentes manualmente.
        dialogo.setLayout(null);

        // Muestra un JLabel con un mensaje.
        JLabel lbl = new JLabel("Este es un JDialog.");
        // Asigna el tamaño y la posición.
        lbl.setBounds(40, 30, 160, 20);
        // Añade un botón con el texto "Cerrar".
        JButton btnCerrar = new JButton("Cerrar");
        // Asigna el tamaño y la posición.
        btnCerrar.setBounds(70, 70, 100, 25);
        // Asigna un acción al botón "Cerrar", que es cerrar la ventana.
        btnCerrar.addActionListener(ev -> dialogo.dispose());

        // Agrega el JLabel y JButton.
        dialogo.add(lbl);
        dialogo.add(btnCerrar);
        // Asigna la posición y la visibilidad de la ventana.
        dialogo.setLocationRelativeTo(this);
        dialogo.setVisible(true);

    }//GEN-LAST:event_bVentanaPersonalizadaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanasEmergentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanasEmergentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanasEmergentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanasEmergentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Crea y muestra la ventana de la aplicación.
        java.awt.EventQueue.invokeLater(() -> {
            new VentanasEmergentes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel VentanasEmergentes;
    private javax.swing.JButton bMostrarMensaje;
    private javax.swing.JButton bPedirNombre;
    private javax.swing.JButton bVentanaPersonalizada;
    // End of variables declaration//GEN-END:variables
}

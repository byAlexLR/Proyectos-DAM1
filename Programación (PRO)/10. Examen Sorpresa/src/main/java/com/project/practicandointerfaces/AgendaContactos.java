/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.practicandointerfaces;

/**
 *
 * @author byAlexLR
 */
public class AgendaContactos extends javax.swing.JFrame {

    // Inicializa los componentes.
    public AgendaContactos() {
        initComponents();
    }
    
    // Variables para almacenar datos del contacto.
    private String nombre;
    private String numero;
    private String correo;
    
    // Constructor que inicializa las variables.
    public AgendaContactos(String nombre, String numero, String correo) {
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
    }

    // Método generado automáticamente para inicializar los componentes gráficos.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgendaContactos = new javax.swing.JPanel();
        lNombreTexto = new javax.swing.JLabel();
        lTeléfonoTexto = new javax.swing.JLabel();
        lCorreoTexto = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();
        tfCorreo = new javax.swing.JTextField();
        bAnadir = new javax.swing.JButton();
        spContactos = new javax.swing.JScrollPane();
        tContactos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lNombreTexto.setText("Introduce el nombre: ");

        lTeléfonoTexto.setText("Introduce el teléfono: ");

        lCorreoTexto.setText("Introduce el correo: ");

        bAnadir.setText("Añadir");
        bAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnadirActionPerformed(evt);
            }
        });

        tContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Teléfono", "Correo"
            }
        ));
        spContactos.setViewportView(tContactos);

        javax.swing.GroupLayout AgendaContactosLayout = new javax.swing.GroupLayout(AgendaContactos);
        AgendaContactos.setLayout(AgendaContactosLayout);
        AgendaContactosLayout.setHorizontalGroup(
            AgendaContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgendaContactosLayout.createSequentialGroup()
                .addGroup(AgendaContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgendaContactosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AgendaContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AgendaContactosLayout.createSequentialGroup()
                                .addGroup(AgendaContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(AgendaContactosLayout.createSequentialGroup()
                                        .addComponent(lNombreTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNombre))
                                    .addGroup(AgendaContactosLayout.createSequentialGroup()
                                        .addComponent(lTeléfonoTexto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AgendaContactosLayout.createSequentialGroup()
                                        .addComponent(lCorreoTexto)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(bAnadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(spContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        AgendaContactosLayout.setVerticalGroup(
            AgendaContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgendaContactosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AgendaContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombreTexto)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgendaContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTeléfonoTexto)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgendaContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCorreoTexto)
                    .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAnadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(spContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AgendaContactos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AgendaContactos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método que se ejecuta al presionar el botón "Añadir".
    private void bAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnadirActionPerformed
        // Asigna los textos ingresados por el usuario.
        nombre = tfNombre.getText();
        numero = tfTelefono.getText();
        correo = tfCorreo.getText();

        // Verifica que ningún campo esté vacío.
        if (!nombre.isEmpty() && !numero.isEmpty() && !correo.isEmpty()) {
            // Obtiene el modelo de la tabla y agrega una nueva fila.
            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tContactos.getModel();
            modelo.addRow(new String[]{nombre, numero, correo});
            
            // Limpia los campos de texto después de añadir el contacto.
            tfNombre.setText("");
            tfTelefono.setText("");
            tfCorreo.setText("");
        }
    }//GEN-LAST:event_bAnadirActionPerformed

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
            java.util.logging.Logger.getLogger(AgendaContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Crea y muestra la ventana de la aplicación.
        java.awt.EventQueue.invokeLater(() -> {
            new AgendaContactos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgendaContactos;
    private javax.swing.JButton bAnadir;
    private javax.swing.JLabel lCorreoTexto;
    private javax.swing.JLabel lNombreTexto;
    private javax.swing.JLabel lTeléfonoTexto;
    private javax.swing.JScrollPane spContactos;
    private javax.swing.JTable tContactos;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}

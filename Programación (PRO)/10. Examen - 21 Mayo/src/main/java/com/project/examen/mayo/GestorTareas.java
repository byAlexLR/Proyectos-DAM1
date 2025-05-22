/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.examen.mayo;

/**
 *
 * @author byAlexLR
 */
public class GestorTareas extends javax.swing.JFrame {

    // Inicializa los componentes de la interfaz.
    public GestorTareas() {
        initComponents();
    }

    // Variables para almacenar la tarea y su grado de importancia.
    private String tarea;
    private String grado;

    // Constructor que inicializa las variables tarea y grado.
    public GestorTareas(String tarea, String grado) {
        this.tarea = tarea;
        this.grado = grado;
    }

    // Código generado automáticamente por el diseñador de NetBeans.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GestorTareas = new javax.swing.JPanel();
        lIntroduceTarea = new javax.swing.JLabel();
        tfTarea = new javax.swing.JTextField();
        lIntroduceGrado = new javax.swing.JLabel();
        tfGrado = new javax.swing.JTextField();
        bAnadir = new javax.swing.JButton();
        spTarea = new javax.swing.JScrollPane();
        tTareas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lIntroduceTarea.setText("Introduce la tarea:");

        lIntroduceGrado.setText("Introduce el grado de importancia:");

        bAnadir.setText("Añadir");
        bAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnadirActionPerformed(evt);
            }
        });

        tTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarea Pendiente", "Grado de Importancia"
            }
        ));
        spTarea.setViewportView(tTareas);

        javax.swing.GroupLayout GestorTareasLayout = new javax.swing.GroupLayout(GestorTareas);
        GestorTareas.setLayout(GestorTareasLayout);
        GestorTareasLayout.setHorizontalGroup(
            GestorTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestorTareasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GestorTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAnadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GestorTareasLayout.createSequentialGroup()
                        .addGroup(GestorTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GestorTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(GestorTareasLayout.createSequentialGroup()
                                    .addComponent(lIntroduceTarea)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(GestorTareasLayout.createSequentialGroup()
                                    .addComponent(lIntroduceGrado)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfGrado)))
                            .addComponent(spTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        GestorTareasLayout.setVerticalGroup(
            GestorTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestorTareasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(GestorTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lIntroduceTarea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GestorTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lIntroduceGrado)
                    .addComponent(tfGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAnadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GestorTareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GestorTareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Acción del botón "Añadir": inserta una nueva fila en la tabla con los datos ingresados.
    private void bAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnadirActionPerformed
        // Obtiene los valores ingresados en los campos de texto.
        tarea = tfTarea.getText();
        grado = tfGrado.getText();

        // Verifica que ambos campos no estén vacíos.
        if (!tarea.isEmpty() && !grado.isEmpty()) {
            // Añade una nueva fila a la tabla con los valores ingresados.
            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tTareas.getModel();
            modelo.addRow(new String[]{tarea, grado});
            // Limpia los campos de texto.
            tfTarea.setText("");
            tfGrado.setText("");
        }

    }//GEN-LAST:event_bAnadirActionPerformed

    // Método main.
    public static void main(String args[]) {
        // Configura el estilo visual Nimbus, capturando posibles excepciones.
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Hace la interfaz visible.
        java.awt.EventQueue.invokeLater(() -> {
            new GestorTareas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GestorTareas;
    private javax.swing.JButton bAnadir;
    private javax.swing.JLabel lIntroduceGrado;
    private javax.swing.JLabel lIntroduceTarea;
    private javax.swing.JScrollPane spTarea;
    private javax.swing.JTable tTareas;
    private javax.swing.JTextField tfGrado;
    private javax.swing.JTextField tfTarea;
    // End of variables declaration//GEN-END:variables
}

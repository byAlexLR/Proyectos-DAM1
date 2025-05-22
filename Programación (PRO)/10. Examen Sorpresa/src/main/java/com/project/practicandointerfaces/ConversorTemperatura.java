/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.practicandointerfaces;

/**
 *
 * @author byAlexLR
 */
public class ConversorTemperatura extends javax.swing.JFrame {

    // Inicializa los componentes.
    public ConversorTemperatura() {
        initComponents();
    }

    // Variables para almacenar datos introducidos.
    private double valor;
    private String opcion;
    private double resultado = 0.0; // Se inicializa en "0.0".

    // Constructor que inicializa las variables.
    public ConversorTemperatura(double valor, String opcion, double resultado) {
        this.valor = valor;
        this.opcion = opcion;
        this.resultado = resultado;
    }

    // Método generado automáticamente para inicializar los componentes gráficos.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConversorTemperatura = new javax.swing.JPanel();
        lIntroduceElValorAConvertir = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        cbOpciones = new javax.swing.JComboBox<>();
        bConvertir = new javax.swing.JButton();
        lResultadoTexto = new javax.swing.JLabel();
        lResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lIntroduceElValorAConvertir.setText("Introduce el valor a convertir:");

        cbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius a Fahrenheit", "Fahrenheit a Celsius" }));
        cbOpciones.setToolTipText("");
        cbOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpcionesActionPerformed(evt);
            }
        });

        bConvertir.setText("Convertir");
        bConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConvertirActionPerformed(evt);
            }
        });

        lResultadoTexto.setText("RESULTADO:");

        javax.swing.GroupLayout ConversorTemperaturaLayout = new javax.swing.GroupLayout(ConversorTemperatura);
        ConversorTemperatura.setLayout(ConversorTemperaturaLayout);
        ConversorTemperaturaLayout.setHorizontalGroup(
            ConversorTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConversorTemperaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConversorTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lIntroduceElValorAConvertir)
                    .addComponent(lResultadoTexto)
                    .addComponent(lResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConversorTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbOpciones, 0, 145, Short.MAX_VALUE)
                    .addComponent(tfValor))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        ConversorTemperaturaLayout.setVerticalGroup(
            ConversorTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConversorTemperaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConversorTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lIntroduceElValorAConvertir)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConversorTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lResultadoTexto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConversorTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bConvertir)
                    .addComponent(lResultado))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConversorTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConversorTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Método que se ejecuta al presionar el JComboBox.
    private void cbOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcionesActionPerformed

    }//GEN-LAST:event_cbOpcionesActionPerformed

    // Método que se ejecuta al presionar el botón "Convertir".
    private void bConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConvertirActionPerformed
        // Asigna los textos ingresados por el usuario.
        valor = Double.parseDouble(tfValor.getText());
        opcion = (String) cbOpciones.getSelectedItem();

        // Try-Catch para recoger la posible expceción por un valor inválido.
        try {
            // Comprueba si la opción introducida es "Celsius a Fahrenheit", sino, ejecuta el else.
            if (opcion.equals("Celsius a Fahrenheit")) {
                // Realiza la operación en la variable resultado, para pasar a Fahrenheit.
                resultado = (valor * 9 / 5) + 32;
                // Muestra en el JLabel el resultado con un redondeo de dos decimales y la asignación de la nomenclatura del tipo de temperatura.
                lResultado.setText(String.valueOf(String.format("%.2f", resultado) + " ºF"));
            } else {
                // Realiza la operación en la variable resultado, para pasar a Celsius.
                resultado = (valor - 32) * 5 / 9;
                // Muestra en el JLabel el resultado con un redondeo de dos decimales y la asignación de la nomenclatura del tipo de temperatura.
                lResultado.setText(String.valueOf(String.format("%.2f", resultado) + " ºC"));
            }
            // Captura la excepción.
        } catch (NumberFormatException ex) {
            // Muestra el siguiente mensaje si el valor introducido no es correcto.
            lResultado.setText("Introduce un valor válido.");
        }
    }//GEN-LAST:event_bConvertirActionPerformed

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
            java.util.logging.Logger.getLogger(ConversorTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Crea y muestra la ventana de la aplicación.
        java.awt.EventQueue.invokeLater(() -> {
            new ConversorTemperatura().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConversorTemperatura;
    private javax.swing.JButton bConvertir;
    private javax.swing.JComboBox<String> cbOpciones;
    private javax.swing.JLabel lIntroduceElValorAConvertir;
    private javax.swing.JLabel lResultado;
    private javax.swing.JLabel lResultadoTexto;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}

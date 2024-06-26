/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pFormulario;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class frmSalarioDocente extends javax.swing.JFrame {

    /**
     * Creates new form frmSalarioDocente
     */
    public frmSalarioDocente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGroupNivelAcademico = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        RadioEspecialidad = new javax.swing.JRadioButton();
        RadioLicenciatura = new javax.swing.JRadioButton();
        RadioMaestria = new javax.swing.JRadioButton();
        RadioDoctorado = new javax.swing.JRadioButton();
        FieldSalario = new javax.swing.JTextField();
        TextSalarioAnterior = new javax.swing.JLabel();
        TextIncremento = new javax.swing.JLabel();
        TextSalarioNuevo = new javax.swing.JLabel();
        ButtonCalcular = new javax.swing.JButton();
        ButtonReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresar el Importe Salarial:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nivel Académico"));
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        bGroupNivelAcademico.add(RadioEspecialidad);
        RadioEspecialidad.setText("Especialidad");

        bGroupNivelAcademico.add(RadioLicenciatura);
        RadioLicenciatura.setText("Licenciatura");

        bGroupNivelAcademico.add(RadioMaestria);
        RadioMaestria.setText("Maestria");

        bGroupNivelAcademico.add(RadioDoctorado);
        RadioDoctorado.setText("Doctorado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioEspecialidad)
                    .addComponent(RadioLicenciatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioMaestria)
                    .addComponent(RadioDoctorado))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioEspecialidad)
                    .addComponent(RadioMaestria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioLicenciatura)
                    .addComponent(RadioDoctorado))
                .addGap(42, 42, 42))
        );

        FieldSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldSalarioKeyReleased(evt);
            }
        });

        TextSalarioAnterior.setText("Salario anterior");

        TextIncremento.setText("Salario Total");

        TextSalarioNuevo.setText("% de Aumento");

        ButtonCalcular.setText("Calcular");
        ButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalcularActionPerformed(evt);
            }
        });

        ButtonReiniciar.setText("Reiniciar");
        ButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextIncremento)
                                .addGap(162, 162, 162)
                                .addComponent(ButtonCalcular)
                                .addGap(35, 35, 35)
                                .addComponent(ButtonReiniciar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextSalarioAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextSalarioNuevo)
                                .addGap(105, 105, 105))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(FieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextSalarioAnterior)
                    .addComponent(TextSalarioNuevo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(TextIncremento)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonCalcular)
                            .addComponent(ButtonReiniciar))
                        .addGap(46, 46, 46))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldSalarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldSalarioKeyReleased

        if(!FieldSalario.getText().matches("^[0-9]*$")){
        JOptionPane.showMessageDialog(null, "Ingresar solo numeros");
        FieldSalario.setText("");
        FieldSalario.requestFocus();
        }
    }//GEN-LAST:event_FieldSalarioKeyReleased

    private void ButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalcularActionPerformed
        // TODO add your handling code here:
        double salario, salarioNuevo=0;
        salario=Double.parseDouble(FieldSalario.getText());
        if(RadioLicenciatura.isSelected()){
        salarioNuevo=salario*1.035;
        TextIncremento.setText(String.valueOf("El % de incremento: 3.5%"));
        }
        if(RadioEspecialidad.isSelected()){
        salarioNuevo=salario*1.046;
        TextIncremento.setText(String.valueOf("El % de incremento: 4.6%"));
        }
        if(RadioMaestria.isSelected()){
        salarioNuevo=salario*1.053;
        TextIncremento.setText(String.valueOf("El % de incremento: 5.3%"));
        }
        if(RadioDoctorado.isSelected()){
        salarioNuevo=salario*1.068;
        TextIncremento.setText(String.valueOf("El % de incremento: 6.8%"));
        }
        DecimalFormat df=new DecimalFormat("0.00");
        TextSalarioAnterior.setText("El salario es "+df.format(salario));
        TextSalarioNuevo.setText("El salario actual es "+df.format(salarioNuevo));
    }//GEN-LAST:event_ButtonCalcularActionPerformed

    private void ButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonReiniciarActionPerformed
        // TODO add your handling code here:
        FieldSalario.setText("");
        TextSalarioAnterior.setText("Salario Anterior");
        TextIncremento.setText("% de Aumento");
        TextSalarioNuevo.setText("Salario Total");
    }//GEN-LAST:event_ButtonReiniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(frmSalarioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSalarioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSalarioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSalarioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSalarioDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCalcular;
    private javax.swing.JButton ButtonReiniciar;
    private javax.swing.JTextField FieldSalario;
    private javax.swing.JRadioButton RadioDoctorado;
    private javax.swing.JRadioButton RadioEspecialidad;
    private javax.swing.JRadioButton RadioLicenciatura;
    private javax.swing.JRadioButton RadioMaestria;
    private javax.swing.JLabel TextIncremento;
    private javax.swing.JLabel TextSalarioAnterior;
    private javax.swing.JLabel TextSalarioNuevo;
    private javax.swing.ButtonGroup bGroupNivelAcademico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

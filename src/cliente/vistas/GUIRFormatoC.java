/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.sop_rmi.GestionAnteproyectoINT;
import SGestionAnteproyectos.dto.clsConceptosDTO;
import SGestionAnteproyectos.dto.clsFormatoTiCDTO;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GUIRFormatoC extends javax.swing.JFrame {

    /**
     * Creates new form GUIFormatoC
     */
    private static GestionAnteproyectoINT objetoRemotoAnteproyecto;
    private static String depDir;

    public GUIRFormatoC(GestionAnteproyectoINT objAnte, String depDir) {
        initComponents();
        this.objetoRemotoAnteproyecto = objAnte;
        this.depDir = depDir;
        this.txtEstructura.setEnabled(false);
        this.cmbConcepto.setEnabled(false);
        this.txtObservaciones.setEnabled(false);
        this.btnEvaluar.setEnabled(false);
    }

    public GUIRFormatoC() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEvaluarAnt = new javax.swing.JLabel();
        lblCodigoAnt = new javax.swing.JLabel();
        lblConceptos = new javax.swing.JLabel();
        lblEstructura = new javax.swing.JLabel();
        lblConceptoJdpto = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        txtEstructura = new javax.swing.JTextField();
        txtCodigoAnt = new javax.swing.JTextField();
        btnEvaluar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        cmbConcepto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEvaluarAnt.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblEvaluarAnt.setText("Evaluar Anteproyecto");
        jPanel1.add(lblEvaluarAnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 180, -1));

        lblCodigoAnt.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblCodigoAnt.setText("Codigo Anteproyecto");
        jPanel1.add(lblCodigoAnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, -1));

        lblConceptos.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblConceptos.setText("-");
        jPanel1.add(lblConceptos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        lblEstructura.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblEstructura.setText("Estructura");
        jPanel1.add(lblEstructura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, -1));

        lblConceptoJdpto.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblConceptoJdpto.setText("Concepto");
        jPanel1.add(lblConceptoJdpto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 80, -1));

        lblObservaciones.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblObservaciones.setText("Observaciones");
        jPanel1.add(lblObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 100, -1));

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 217, 181, 117));
        jPanel1.add(txtEstructura, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 116, 71, -1));

        txtCodigoAnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoAntKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigoAnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 44, 71, -1));

        btnEvaluar.setText("Evaluar");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEvaluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 352, -1, -1));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 43, -1, -1));

        cmbConcepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobado", "Reprobado" }));
        jPanel1.add(cmbConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/c.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        if (txtCodigoAnt.getText().isEmpty() || txtEstructura.getText().isEmpty() || txtObservaciones.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser ingresados");
        } else {

            try {
                int codAnt = Integer.parseInt(txtCodigoAnt.getText());
                String estructura = txtEstructura.getText();

                String Observaciones = txtObservaciones.getText();

                int concepto;
                String con = (String) cmbConcepto.getSelectedItem();
                if (con.equals("Aprobado")) {
                    concepto = 1;
                } else {
                    concepto = 0;
                }

                clsFormatoTiCDTO objC = new clsFormatoTiCDTO(codAnt, estructura, concepto, Observaciones);

                boolean funciono = objetoRemotoAnteproyecto.RegistrarFormatoTiC(objC);
                if (funciono == true) {
                    JOptionPane.showMessageDialog(null, "El Anteproyecto ha sido evaluado con exito");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "El Anteproyecto no ha sido evaluado con exito");
                    this.dispose();
                }

            } catch (RemoteException ex) {
                Logger.getLogger(GUIRFormatoC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEvaluarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (txtCodigoAnt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa el codigo porfavor");
        } else {

            try {

                int flujo = objetoRemotoAnteproyecto.VerificarAnteproyecto(Integer.parseInt(txtCodigoAnt.getText()));
                boolean fueRemitido = false;
                boolean departamentoCorrecto = false;
                clsConceptosDTO Conceptos;
                Conceptos = this.objetoRemotoAnteproyecto.ConsultarConceptos(Integer.parseInt(txtCodigoAnt.getText()));
                fueRemitido = this.objetoRemotoAnteproyecto.verificarRemitido(Integer.parseInt(txtCodigoAnt.getText()));
                departamentoCorrecto = this.objetoRemotoAnteproyecto.verificarRemitidoDep(Integer.parseInt(txtCodigoAnt.getText()), depDir);

                this.lblConceptos.setText("Concepto 1:" + Conceptos.getConcepto1() + "Concepto 2:" + Conceptos.getConcepto2());
                if (Conceptos.getConcepto1() == 1 && Conceptos.getConcepto2() == 1 && fueRemitido == true && departamentoCorrecto == true && flujo == 3) {
                    this.txtEstructura.setEnabled(true);
                    this.cmbConcepto.setEnabled(true);
                    this.txtObservaciones.setEnabled(true);
                    this.btnEvaluar.setEnabled(true);
                } else if (flujo == 0) {
                    JOptionPane.showMessageDialog(null, "No se encontro Anteproyecto");
                    this.dispose();
                } else if (flujo >= 4) {
                    JOptionPane.showMessageDialog(null, "El Anteproyecto ya fue evaluador por el jefe de departamento");
                    this.dispose();
                } else if (flujo < 3) {
                    JOptionPane.showMessageDialog(null, "El Anteproyecto aun no ha completa la fase del formato b");
                    this.dispose();
                } else if (fueRemitido == false) {
                    JOptionPane.showMessageDialog(null, "El Anteproyecto no ha sido remitido por el director");
                    this.dispose();
                } else if (departamentoCorrecto == false) {
                    JOptionPane.showMessageDialog(null, "El Anteproyecto no corresponde a este Departamento");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "El Anteproyecto no fue aprobado por los evaluadores");
                    this.dispose();
                }
            } catch (RemoteException ex) {
                Logger.getLogger(GUIRFormatoC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtCodigoAntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoAntKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoAntKeyTyped

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
            java.util.logging.Logger.getLogger(GUIRFormatoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRFormatoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRFormatoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRFormatoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRFormatoC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JComboBox<String> cmbConcepto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoAnt;
    private javax.swing.JLabel lblConceptoJdpto;
    private javax.swing.JLabel lblConceptos;
    private javax.swing.JLabel lblEstructura;
    private javax.swing.JLabel lblEvaluarAnt;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JTextField txtCodigoAnt;
    private javax.swing.JTextField txtEstructura;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables
}

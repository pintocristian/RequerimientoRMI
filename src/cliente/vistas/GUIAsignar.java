/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.dto.clsFormatoTiBDTO;
import SGestionAnteproyectos.sop_rmi.GestionAnteproyectoINT;
import SGestionAnteproyectos.sop_rmi.GestionUsuariosINT;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GUIAsignar extends javax.swing.JFrame {

    /**
     * Creates new form GUIAsignar
     */
    private static GestionAnteproyectoINT objetoRemotoAnteproyecto;
    private static GestionUsuariosINT objetoRemotoUsuario;

    public GUIAsignar(GestionAnteproyectoINT objAnte, GestionUsuariosINT objUsuario) {
        initComponents();
        this.objetoRemotoAnteproyecto = objAnte;
        this.objetoRemotoUsuario = objUsuario;
    }

    public GUIAsignar() {
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
        lblAsignarAn = new javax.swing.JLabel();
        lblCodigoAnt = new javax.swing.JLabel();
        lblIdEv1 = new javax.swing.JLabel();
        lblIdEv2 = new javax.swing.JLabel();
        btnAsignar = new javax.swing.JButton();
        txtCodAnt = new javax.swing.JTextField();
        txtCodEv1 = new javax.swing.JTextField();
        txtCodEv2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAsignarAn.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblAsignarAn.setText("Asignar Anteproyecto");
        jPanel1.add(lblAsignarAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, -1));

        lblCodigoAnt.setText("Codigo del anteproyecto");
        jPanel1.add(lblCodigoAnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 46, -1, -1));

        lblIdEv1.setText("id del evaluador 1:");
        jPanel1.add(lblIdEv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 90, -1, -1));

        lblIdEv2.setText("id del evaluador 2:");
        jPanel1.add(lblIdEv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 137, -1, -1));

        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 217, -1, -1));

        txtCodAnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodAntKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodAnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 43, 63, -1));

        txtCodEv1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodEv1KeyTyped(evt);
            }
        });
        jPanel1.add(txtCodEv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 87, 63, -1));

        txtCodEv2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodEv2KeyTyped(evt);
            }
        });
        jPanel1.add(txtCodEv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 134, 63, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/asignar.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -90, 650, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        int u1 = -2;
        int u2 = -2;
        int a = -2;
        if (txtCodAnt.getText().isEmpty() || txtCodEv1.getText().isEmpty() || txtCodEv2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");

        } else if (txtCodEv1.getText().equals(txtCodEv2.getText())) {
            JOptionPane.showMessageDialog(null, "Los id de los evaluadores deben ser diferentes");
        } else {
            int codigoAnte = Integer.parseInt(txtCodAnt.getText());
            int codEva1 = Integer.parseInt(txtCodEv1.getText());
            int codEva2 = Integer.parseInt(txtCodEv2.getText());
            try {
                a = objetoRemotoAnteproyecto.consultarAnteproyecto(codigoAnte);
                u1 = objetoRemotoUsuario.consultarEvaluador(codEva1);
                u2 = objetoRemotoUsuario.consultarEvaluador(codEva2);

                if (a == 1 && u1 == 1 && u2 == 1) {
                    clsFormatoTiBDTO objB1 = new clsFormatoTiBDTO(codEva1, codigoAnte, -1, "", "");
                    clsFormatoTiBDTO objB2 = new clsFormatoTiBDTO(codEva2, codigoAnte, -1, "", "");
                    boolean asignando1 = objetoRemotoAnteproyecto.Asignar(objB1);
                    boolean asignando2 = objetoRemotoAnteproyecto.Asignar(objB2);

                    if (asignando1 == true && asignando2 == true) {
                        JOptionPane.showMessageDialog(null, "Evaluadores asignados correctamente");
                        this.dispose();
                    }
                } else if (a == -1) {
                    JOptionPane.showMessageDialog(null, "No se encuentran Anteproyectos registrados ");
                    this.dispose();
                } else if (a == 0) {
                    JOptionPane.showMessageDialog(null, "No se encuentra el anteproyecto regitrado ");
                    this.dispose();
                } else if (a == 2) {
                    JOptionPane.showMessageDialog(null, "Al anteproyecto ya se le asignaron los evaluadores ");
                    this.dispose();
                } else if (u1 == -1) {
                    JOptionPane.showMessageDialog(null, "No se encuentran Evaluadores registrados ");
                    this.dispose();
                } else if (u1 == 2) {
                    JOptionPane.showMessageDialog(null, "No existe este evaluador ");
                    this.dispose();
                }

            } catch (RemoteException ex) {
                Logger.getLogger(GUIAsignar.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_btnAsignarActionPerformed

    private void txtCodAntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodAntKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodAntKeyTyped

    private void txtCodEv1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodEv1KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodEv1KeyTyped

    private void txtCodEv2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodEv2KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodEv2KeyTyped

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
            java.util.logging.Logger.getLogger(GUIAsignar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAsignar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAsignar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAsignar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAsignar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAsignarAn;
    private javax.swing.JLabel lblCodigoAnt;
    private javax.swing.JLabel lblIdEv1;
    private javax.swing.JLabel lblIdEv2;
    private javax.swing.JTextField txtCodAnt;
    private javax.swing.JTextField txtCodEv1;
    private javax.swing.JTextField txtCodEv2;
    // End of variables declaration//GEN-END:variables
}

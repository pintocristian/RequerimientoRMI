/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.dto.clsUsuarioDTO;
import SGestionAnteproyectos.sop_rmi.GestionUsuariosINT;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GUIRegistrarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarAdmin
     */
    private static GestionUsuariosINT objetoRemotoUsuario;

    public GUIRegistrarUsuario(GestionUsuariosINT objetoRemoto) {
        initComponents();
        this.objetoRemotoUsuario = objetoRemoto;
    }

    public GUIRegistrarUsuario() {
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
        lblRegistrarUsuario = new javax.swing.JLabel();
        lblIdentificacionU = new javax.swing.JLabel();
        lblNombreComU = new javax.swing.JLabel();
        lblRolU = new javax.swing.JLabel();
        lblDepartamentoU = new javax.swing.JLabel();
        lblUsuarioU = new javax.swing.JLabel();
        lblContraseniaU = new javax.swing.JLabel();
        txtIdentificacionU = new javax.swing.JTextField();
        txtNombreComU = new javax.swing.JTextField();
        txtUsuarioU = new javax.swing.JTextField();
        txtContraseniaU = new javax.swing.JTextField();
        btnRegistrarU = new javax.swing.JButton();
        cmbRolU = new javax.swing.JComboBox<>();
        cmbDepU = new javax.swing.JComboBox<>();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Usuario");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistrarUsuario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblRegistrarUsuario.setText("Registrar Usuario");
        jPanel1.add(lblRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 22));

        lblIdentificacionU.setText("Identificacion:");
        jPanel1.add(lblIdentificacionU, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 51, 89, -1));

        lblNombreComU.setText("Nombre Completo:");
        jPanel1.add(lblNombreComU, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 77, 111, -1));

        lblRolU.setText("rol:");
        jPanel1.add(lblRolU, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 106, 31, -1));

        lblDepartamentoU.setText("Departamento:");
        jPanel1.add(lblDepartamentoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 132, 85, -1));

        lblUsuarioU.setText("Usuario:");
        jPanel1.add(lblUsuarioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 158, 58, -1));

        lblContraseniaU.setText("contrase??a:");
        jPanel1.add(lblContraseniaU, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 184, 76, -1));

        txtIdentificacionU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionUKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdentificacionU, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 48, 89, -1));
        jPanel1.add(txtNombreComU, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 77, 89, -1));
        jPanel1.add(txtUsuarioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 158, 89, -1));
        jPanel1.add(txtContraseniaU, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 184, 89, -1));

        btnRegistrarU.setText("Registrar");
        btnRegistrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 264, -1, -1));

        cmbRolU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Director", "Evaluador", "Jefe departamento", "Coordinador", "Decano" }));
        jPanel1.add(cmbRolU, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 103, 90, -1));

        cmbDepU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIET", "PIS", "PIAI" }));
        cmbDepU.setPreferredSize(new java.awt.Dimension(117, 20));
        jPanel1.add(cmbDepU, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 130, 90, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/registrar.jpg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void btnRegistrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUActionPerformed

        try {
            String numero1 = txtUsuarioU.getText();
            String numero2 = txtContraseniaU.getText();
            String Rol = (String) cmbRolU.getSelectedItem();
            int ide = Integer.parseInt(txtIdentificacionU.getText());
            boolean u = alfanumerico(txtUsuarioU.getText());
            boolean c = alfanumerico(txtContraseniaU.getText());
            int validarId = objetoRemotoUsuario.validarId(ide);
            boolean validarUs = objetoRemotoUsuario.validarUS(numero1);
            if (txtIdentificacionU.getText().isEmpty() || txtNombreComU.getText().isEmpty() || txtUsuarioU.getText().isEmpty() || txtContraseniaU.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ningun campo debe quedar vacio!!");
            } else if (u == false || c == false) {
                txtUsuarioU.setText("");
                txtContraseniaU.setText("");
                JOptionPane.showMessageDialog(null, "La contrase??a debe tener numeros y letras");

            } else if (numero1.length() < 8 || numero2.length() < 8) {
                txtUsuarioU.setText("");
                txtContraseniaU.setText("");
                JOptionPane.showMessageDialog(null, "El usuario y la contrase??a tienen que tener minimo 8 caracteres");

            } else if (validarId == 1) {
                JOptionPane.showMessageDialog(null, "El id digitado ya existe, por favor ingresa otro");
            } else if (validarUs == true) {
                JOptionPane.showMessageDialog(null, "El usuario digitado ya existe por favor ingresa otro");
            } else if (Rol.equals("Decano") && objetoRemotoUsuario.verificarDecano()) {
                JOptionPane.showMessageDialog(null, "Solamente puede existir un decano");
            } else {
                int id = Integer.parseInt(txtIdentificacionU.getText());
                String NombreCompleto = txtNombreComU.getText();

                String Departamento = (String) cmbDepU.getSelectedItem();
                String Usuario = txtUsuarioU.getText();
                String Contrasenia = (String) txtContraseniaU.getText();
                clsUsuarioDTO objUsuario = new clsUsuarioDTO(id, NombreCompleto, Rol, Departamento, Usuario, Contrasenia);
                boolean funciono = objetoRemotoUsuario.RegistrarUsuarios(objUsuario);
                if (funciono == true) {
                    JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario no se pudo Registrar con exito");
                    this.dispose();
                }
                this.dispose();

            }

        } catch (RemoteException ex) {

            Logger.getLogger(GUIRegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            this.dispose();
        }
    }//GEN-LAST:event_btnRegistrarUActionPerformed

    private void txtIdentificacionUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionUKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificacionUKeyTyped
    public boolean alfanumerico(String texto) {
        boolean bandera = false;
        char textoIngresado;

        byte conNumero = 0, conLetra = 0;

        for (byte i = 0; i < texto.length(); i++) {
            textoIngresado = texto.charAt(i);
            String aux = String.valueOf(textoIngresado);

            if (aux.matches("[a-z]") || aux.matches("[A-Z]")) {
                conLetra++;
            } else if (aux.matches("[0-9]")) {
                conNumero++;
            }
        }
        if (conNumero > 0 && conLetra > 0) {
            bandera = true;
        }

        return bandera;
    }

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
            java.util.logging.Logger.getLogger(GUIRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarU;
    private javax.swing.JComboBox<String> cmbDepU;
    private javax.swing.JComboBox<String> cmbRolU;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContraseniaU;
    private javax.swing.JLabel lblDepartamentoU;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIdentificacionU;
    private javax.swing.JLabel lblNombreComU;
    private javax.swing.JLabel lblRegistrarUsuario;
    private javax.swing.JLabel lblRolU;
    private javax.swing.JLabel lblUsuarioU;
    private javax.swing.JTextField txtContraseniaU;
    private javax.swing.JTextField txtIdentificacionU;
    private javax.swing.JTextField txtNombreComU;
    private javax.swing.JTextField txtUsuarioU;
    // End of variables declaration//GEN-END:variables
}

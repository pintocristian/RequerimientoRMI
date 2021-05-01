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
public class GUIModificarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form GUIModificarUsuario
     */
     private static GestionUsuariosINT objetoRemotoUsuario;
     private int Id;
    public GUIModificarUsuario(GestionUsuariosINT objetoRemoto) {
        initComponents();
         this.objetoRemotoUsuario=objetoRemoto;
    }
    public GUIModificarUsuario(){}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblModificarUsuario = new javax.swing.JLabel();
        lblIdentificacionMod = new javax.swing.JLabel();
        lblNombreComMod = new javax.swing.JLabel();
        lblRolMod = new javax.swing.JLabel();
        lblDepartamentoMod = new javax.swing.JLabel();
        lblContraseniaMod = new javax.swing.JLabel();
        txtIdentificacionMod = new javax.swing.JTextField();
        txtNombreComMod = new javax.swing.JTextField();
        txtDepartamentoMod = new javax.swing.JTextField();
        txtContraseniaMod = new javax.swing.JTextField();
        cmbRolMod = new javax.swing.JComboBox<>();
        btnModificarU = new javax.swing.JButton();
        btnBuscarMod = new javax.swing.JButton();
        lblUsuarioMod = new javax.swing.JLabel();
        txtUsuarioMod = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Usuario");

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblModificarUsuario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblModificarUsuario.setText("Modificar Usuario");
        jPanel1.add(lblModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 11, 147, 20));

        lblIdentificacionMod.setText("Identificacion:");
        jPanel1.add(lblIdentificacionMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 107, -1));

        lblNombreComMod.setText("Nombre Completo:");
        jPanel1.add(lblNombreComMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 107, -1));

        lblRolMod.setText("Rol:");
        jPanel1.add(lblRolMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 39, -1));

        lblDepartamentoMod.setText("Departamento");
        jPanel1.add(lblDepartamentoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 107, -1));

        lblContraseniaMod.setText("Contraseña:");
        jPanel1.add(lblContraseniaMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 82, -1));
        jPanel1.add(txtIdentificacionMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 47, 94, -1));
        jPanel1.add(txtNombreComMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 94, 20));
        jPanel1.add(txtDepartamentoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 94, -1));
        jPanel1.add(txtContraseniaMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 94, 20));

        cmbRolMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Director", "Evaluador", "Jefe departamento\t", "Coordinador", "Decano" }));
        jPanel1.add(cmbRolMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 94, -1));

        btnModificarU.setText("Modificar");
        btnModificarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        btnBuscarMod.setText("Buscar");
        btnBuscarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarModActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 46, -1, -1));

        lblUsuarioMod.setText("Usuario");
        jPanel1.add(lblUsuarioMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 60, -1));
        jPanel1.add(txtUsuarioMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 94, 20));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/modificar.jpg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarModActionPerformed
  
         try {
            Id=Integer.parseInt(txtIdentificacionMod.getText());
            clsUsuarioDTO objUsuario=objetoRemotoUsuario.ConsultarUsuario(Id);
              if(objUsuario!=null){ 
               txtContraseniaMod.setText(objUsuario.getContrasenia());
               txtDepartamentoMod.setText(objUsuario.getDepartamento());
               txtNombreComMod.setText(objUsuario.getNombreCompleto());
               cmbRolMod.setSelectedItem(objUsuario.getRole());
               txtUsuarioMod.setText(objUsuario.getUsuario());
              }else{
              JOptionPane.showMessageDialog(null,"Usuario No encontrado");
            } 
         } catch (RemoteException ex) {
             Logger.getLogger(GUIModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnBuscarModActionPerformed

    private void btnModificarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUActionPerformed

        try {
            
            if(txtIdentificacionMod.getText().isEmpty() || txtNombreComMod.getText().isEmpty() || txtDepartamentoMod.getText().isEmpty() || txtContraseniaMod.getText().isEmpty() ||  txtUsuarioMod.getText().isEmpty()){
                 JOptionPane.showMessageDialog(null,"Ningun campo debe quedar vacio!!");
            }else{
                     Id = Integer.parseInt(txtIdentificacionMod.getText());
            String Nombre = txtNombreComMod.getText();
            String Rol = (String) cmbRolMod.getSelectedItem();
            String Departamento = txtDepartamentoMod.getText();
            String Contrasenia = txtContraseniaMod.getText();
            String Usuario = txtUsuarioMod.getText();
            clsUsuarioDTO objUsuario = new clsUsuarioDTO(Id, Nombre, Rol, Departamento, Usuario, Contrasenia);

            boolean funciono = objetoRemotoUsuario.ModificarUsuario(objUsuario);
            if (funciono == true) {
                JOptionPane.showMessageDialog(null, "Usuario Modificado exitosamente");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no se pudo Modificar con exito");
                this.dispose();
            }
            this.dispose();
            }
            
            
        } catch (RemoteException ex) {
            Logger.getLogger(GUIModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnModificarUActionPerformed

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
            java.util.logging.Logger.getLogger(GUIModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIModificarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarMod;
    private javax.swing.JButton btnModificarU;
    private javax.swing.JComboBox<String> cmbRolMod;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContraseniaMod;
    private javax.swing.JLabel lblDepartamentoMod;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIdentificacionMod;
    private javax.swing.JLabel lblModificarUsuario;
    private javax.swing.JLabel lblNombreComMod;
    private javax.swing.JLabel lblRolMod;
    private javax.swing.JLabel lblUsuarioMod;
    private javax.swing.JTextField txtContraseniaMod;
    private javax.swing.JTextField txtDepartamentoMod;
    private javax.swing.JTextField txtIdentificacionMod;
    private javax.swing.JTextField txtNombreComMod;
    private javax.swing.JTextField txtUsuarioMod;
    // End of variables declaration//GEN-END:variables
}

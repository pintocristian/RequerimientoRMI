/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.dto.clsUsuarioDTO;
import SGestionAnteproyectos.sop_rmi.GestionAnteproyectoINT;
import SGestionAnteproyectos.sop_rmi.GestionUsuariosINT;
import SSeguimientoAnteproyectos.sop_rmi.GestionSeguimientoINT;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GUIInicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form GUIInicioSesion
     */
      private static GestionUsuariosINT objetoRemotoUsuario;
      private static GestionAnteproyectoINT objetoRemotoAnteproyectos;
       private static GestionSeguimientoINT objetoRemotoSeguimiento;
    public GUIInicioSesion(GestionUsuariosINT objetoRemotoU,GestionAnteproyectoINT objetoRemotoA,GestionSeguimientoINT objRemotoSeg) {
        initComponents();
        this.objetoRemotoUsuario=objetoRemotoU;
        this.objetoRemotoAnteproyectos=objetoRemotoA;
        this.objetoRemotoSeguimiento= objRemotoSeg;
    }
    public GUIInicioSesion(){}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblInicioSesion = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnGuardarInicioSesion = new javax.swing.JButton();
        txtClave = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicio Sesion");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        lblInicioSesion.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblInicioSesion.setText("Inicio de Sesion");
        jPanel1.add(lblInicioSesion);
        lblInicioSesion.setBounds(120, 20, 160, 21);

        lblUsuario.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblUsuario.setText("Usuario:");
        jPanel1.add(lblUsuario);
        lblUsuario.setBounds(30, 60, 70, 17);

        lblClave.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblClave.setText("Clave:");
        jPanel1.add(lblClave);
        lblClave.setBounds(30, 120, 50, 14);
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(180, 60, 130, 30);

        btnGuardarInicioSesion.setText("iniciar");
        btnGuardarInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarInicioSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarInicioSesion);
        btnGuardarInicioSesion.setBounds(110, 220, 80, 30);
        jPanel1.add(txtClave);
        txtClave.setBounds(180, 120, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/login.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 390, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarInicioSesionActionPerformed
        String usuarioAdmin="Admin";
        String claveAdmin="Admin";
        if(txtUsuario.getText().equals(usuarioAdmin) && txtClave.getText().equals(claveAdmin)){
            GUIAdminPrincipal GUIAdminP = new GUIAdminPrincipal(objetoRemotoUsuario,objetoRemotoAnteproyectos,objetoRemotoSeguimiento);
            GUIAdminP.setVisible(true);
            this.dispose();
        }else{
        
            try {
                String usuario=txtUsuario.getText();
                String clave=new String(txtClave.getText());
                clsUsuarioDTO objUsuario=objetoRemotoUsuario.Sesion(usuario, clave);
                if(objUsuario!=null){
                    String Rol=objUsuario.getRole();
                    switch(Rol){
                        case "Director":
                            
                            GUIMenuDirector GUIMDir =new  GUIMenuDirector(objetoRemotoUsuario,objetoRemotoAnteproyectos,objetoRemotoSeguimiento);
                            GUIMDir.setVisible(true);
                            break;
                        case "Evaluador":
                            int idEv=objUsuario.getId();
                            GUIMenuEvaluador GUIMEva =new  GUIMenuEvaluador(objetoRemotoUsuario,objetoRemotoAnteproyectos,idEv,objetoRemotoSeguimiento);
                            GUIMEva.setVisible(true);
                            break;
                        case "Jefe departamento":
                            GUIMenuJdpto GUIMJdpto =new  GUIMenuJdpto(objetoRemotoUsuario,objetoRemotoAnteproyectos,objetoRemotoSeguimiento);
                            GUIMJdpto.setVisible(true);
                            break;
                          
                        case "Coordinador":
                            GUIMenuCoordinador GUIMCoor =new  GUIMenuCoordinador(objetoRemotoUsuario,objetoRemotoAnteproyectos,objetoRemotoSeguimiento);
                            GUIMCoor.setVisible(true);
                            break;
                        case "Decano":
                            GUIMenuDecano GUIMDec =new  GUIMenuDecano(objetoRemotoUsuario,objetoRemotoAnteproyectos,objetoRemotoSeguimiento);
                            GUIMDec.setVisible(true);
                            break;
                        default :
                            JOptionPane.showMessageDialog(null,"El rol ingresado no existe"); 
                            break;
                    }
                }else{
                   JOptionPane.showMessageDialog(null,"Credenciales incorrectas"); 
               }
            } catch (RemoteException ex) {
                Logger.getLogger(GUIInicioSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
        
    }//GEN-LAST:event_btnGuardarInicioSesionActionPerformed

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
            java.util.logging.Logger.getLogger(GUIInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarInicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

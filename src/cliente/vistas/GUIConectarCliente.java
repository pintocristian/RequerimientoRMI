/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.sop_rmi.GestionAnteproyectoINT;
import SGestionAnteproyectos.sop_rmi.GestionUsuariosINT;
import cliente.utilidades.UtilidadesRegistroC;

/**
 *
 * @author Usuario
 */
public class GUIConectarCliente extends javax.swing.JFrame {

    /**
     * Creates new form GUIConectarCliente
     */
    public GUIConectarCliente() {
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

        jPanel1 = new javax.swing.JPanel();
        lblIPC = new javax.swing.JLabel();
        lblPuertoC = new javax.swing.JLabel();
        btnConectarC = new javax.swing.JButton();
        lblConexionC = new javax.swing.JLabel();
        txtIPC = new javax.swing.JTextField();
        txtPuertoC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conectar Cliente");

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(null);

        lblIPC.setText("Digite la direccion ip:");
        jPanel1.add(lblIPC);
        lblIPC.setBounds(40, 70, 100, 14);

        lblPuertoC.setText("Digite el puerto:");
        jPanel1.add(lblPuertoC);
        lblPuertoC.setBounds(40, 120, 100, 14);

        btnConectarC.setText("conectar");
        btnConectarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarCActionPerformed(evt);
            }
        });
        jPanel1.add(btnConectarC);
        btnConectarC.setBounds(130, 180, 80, 23);

        lblConexionC.setText("Conexion del cliente");
        jPanel1.add(lblConexionC);
        lblConexionC.setBounds(140, 20, 140, 14);
        jPanel1.add(txtIPC);
        txtIPC.setBounds(190, 60, 120, 30);
        jPanel1.add(txtPuertoC);
        txtPuertoC.setBounds(190, 110, 120, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarCActionPerformed
        
        int puerto=Integer.parseInt(txtPuertoC.getText());
        String direccion=txtIPC.getText();
        GestionAnteproyectoINT objRemoto;
        GestionUsuariosINT objRemotoU;
        objRemotoU =  (GestionUsuariosINT) UtilidadesRegistroC.obtenerObjRemoto(direccion,puerto,"objetoRemotoUsuario");
        objRemoto = (GestionAnteproyectoINT) UtilidadesRegistroC.obtenerObjRemoto(direccion,puerto,"objetoRemotoGestion");
        GUIInicioSesion GUISesion =new GUIInicioSesion(objRemotoU,objRemoto);
        GUISesion.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnConectarCActionPerformed

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
            java.util.logging.Logger.getLogger(GUIConectarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIConectarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIConectarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIConectarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIConectarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectarC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConexionC;
    private javax.swing.JLabel lblIPC;
    private javax.swing.JLabel lblPuertoC;
    private javax.swing.JTextField txtIPC;
    private javax.swing.JTextField txtPuertoC;
    // End of variables declaration//GEN-END:variables
}

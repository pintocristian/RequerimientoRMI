/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.vistas;

import SSeguimientoAnteproyectos.sop_rmi.GestionSeguimientoImpl;
import SSeguimientoAnteproyectos.utilidades.UtilidadesRegistroS;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GUIConectarServidor2 extends javax.swing.JFrame {

    /**
     * Creates new form GUIConectarServidor2
     */
    public GUIConectarServidor2() {
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
        lblConexion2 = new javax.swing.JLabel();
        lblIP2 = new javax.swing.JLabel();
        lblPuerto2 = new javax.swing.JLabel();
        btnConectar2 = new javax.swing.JButton();
        txtIP2 = new javax.swing.JTextField();
        txtPuerto2 = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coneccion Servidor");

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(null);

        lblConexion2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblConexion2.setText("Conexion con el servidor");
        jPanel1.add(lblConexion2);
        lblConexion2.setBounds(30, 10, 210, 30);

        lblIP2.setText("Digite la direccion IP:");
        jPanel1.add(lblIP2);
        lblIP2.setBounds(30, 90, 120, 20);

        lblPuerto2.setText("Digite el Puerto:");
        jPanel1.add(lblPuerto2);
        lblPuerto2.setBounds(30, 140, 100, 20);

        btnConectar2.setText("Conectar");
        btnConectar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConectar2);
        btnConectar2.setBounds(140, 220, 90, 23);
        jPanel1.add(txtIP2);
        txtIP2.setBounds(200, 90, 140, 30);
        jPanel1.add(txtPuerto2);
        txtPuerto2.setBounds(200, 130, 140, 30);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/conexion.jpg"))); // NOI18N
        jPanel1.add(lblFondo);
        lblFondo.setBounds(0, 0, 390, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectar2ActionPerformed
        String MensajeArrancarNS;
        String MensajeRegistrar;

        int puerto = Integer.parseInt(txtPuerto2.getText());
        String direccion = txtIP2.getText();
        try {
            GestionSeguimientoImpl objetoRemoto = new GestionSeguimientoImpl();
            MensajeArrancarNS = UtilidadesRegistroS.arrancarNS(direccion, puerto);
            MensajeRegistrar = UtilidadesRegistroS.RegistrarObjetoRemoto(objetoRemoto, direccion, puerto, "objetoRemotoSeguimiento");
            GUIMensajesServidor2 GUIS2 = new GUIMensajesServidor2();
            GUIS2.setVisible(true);
            String mensaje = MensajeArrancarNS + "\n" + MensajeRegistrar + "\n" + "\n";
            GUIS2.txtMensaje2.setText(mensaje);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No fue posible arrancar el NS o registrar el objeto remoto" + e.getMessage());
        }
    }//GEN-LAST:event_btnConectar2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIConectarServidor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIConectarServidor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIConectarServidor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIConectarServidor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIConectarServidor2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConexion2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIP2;
    private javax.swing.JLabel lblPuerto2;
    private javax.swing.JTextField txtIP2;
    private javax.swing.JTextField txtPuerto2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.sop_rmi.GestionAnteproyectoINT;
import SGestionAnteproyectos.sop_rmi.GestionUsuariosINT;
import SSeguimientoAnteproyectos.sop_rmi.GestionSeguimientoINT;

/**
 *
 * @author Usuario
 */
public class GUIMenuDirector extends javax.swing.JFrame {

    /**
     * Creates new form GUIDirector
     */
    private static GestionAnteproyectoINT objetoRemotoAnteproyecto;
    private static GestionUsuariosINT objetoRemotoUsuario;
    private static GestionSeguimientoINT objetoRemotoSeguimiento;
    public GUIMenuDirector(GestionUsuariosINT objUsuario,GestionAnteproyectoINT objAnteproyecto,GestionSeguimientoINT objRemotoSeg) {
        initComponents();
        this.objetoRemotoUsuario=objUsuario;
        this.objetoRemotoAnteproyecto=objAnteproyecto;
         this.objetoRemotoSeguimiento= objRemotoSeg;
         txtNotificacion.setEnabled(false);
    }
  public GUIMenuDirector(){}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnRFormatoA = new javax.swing.JButton();
        btnSalirA = new javax.swing.JButton();
        lblMenuDirector = new javax.swing.JLabel();
        lblNotificacion = new javax.swing.JLabel();
        txtNotificacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));
        jPanel2.setLayout(null);

        btnRFormatoA.setText("Registrar");
        btnRFormatoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRFormatoAActionPerformed(evt);
            }
        });
        jPanel2.add(btnRFormatoA);
        btnRFormatoA.setBounds(150, 90, 90, 23);

        btnSalirA.setText("Salir");
        btnSalirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalirA);
        btnSalirA.setBounds(150, 160, 90, 23);

        lblMenuDirector.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblMenuDirector.setText("Menu Director");
        jPanel2.add(lblMenuDirector);
        lblMenuDirector.setBounds(140, 10, 150, 21);

        lblNotificacion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblNotificacion.setText("Notificacion");
        jPanel2.add(lblNotificacion);
        lblNotificacion.setBounds(0, 280, 110, 18);
        jPanel2.add(txtNotificacion);
        txtNotificacion.setBounds(90, 280, 350, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/director.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 470, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirAActionPerformed
        GUIInicioSesion GUISesion =new GUIInicioSesion(objetoRemotoUsuario,objetoRemotoAnteproyecto,objetoRemotoSeguimiento);
        GUISesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirAActionPerformed

    private void btnRFormatoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRFormatoAActionPerformed
        GUIRFormatoA GUIA = new GUIRFormatoA (objetoRemotoAnteproyecto);
        GUIA.setVisible(true);
    }//GEN-LAST:event_btnRFormatoAActionPerformed

    public void Notificacion(String Mensaje){
        txtNotificacion.setText(Mensaje);
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
            java.util.logging.Logger.getLogger(GUIMenuDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenuDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenuDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenuDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMenuDirector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRFormatoA;
    private javax.swing.JButton btnSalirA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMenuDirector;
    private javax.swing.JLabel lblNotificacion;
    public javax.swing.JTextField txtNotificacion;
    // End of variables declaration//GEN-END:variables
}

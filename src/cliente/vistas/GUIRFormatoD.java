/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.dto.clsFormatoTiDDTO;
import SGestionAnteproyectos.sop_rmi.GestionAnteproyectoINT;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GUIRFormatoD extends javax.swing.JFrame {

    /**
     * Creates new form GUIRFormatoD
     */
        private static GestionAnteproyectoINT objetoRemotoAnteproyecto;
    public GUIRFormatoD(GestionAnteproyectoINT objAnteproyecto) {
        initComponents();
        this.objetoRemotoAnteproyecto=objAnteproyecto;
    }
 public GUIRFormatoD() {}
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
        lblEstructura = new javax.swing.JLabel();
        lblConcepto = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        txtEstructura = new javax.swing.JTextField();
        txtConcepto = new javax.swing.JTextField();
        btnEvaluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        txtCodigoAnt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        lblEvaluarAnt.setText("Evaluar Anteproyecto");

        lblCodigoAnt.setText("Codigo Anteproyecto");

        lblEstructura.setText("Estructura");

        lblConcepto.setText("Concepto");

        lblObservaciones.setText("Observaciones");

        btnEvaluar.setText("Evaluar");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblObservaciones)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblConcepto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEstructura)
                                    .addComponent(lblCodigoAnt))
                                .addGap(154, 154, 154)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoAnt, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(txtEstructura))))
                        .addGap(48, 48, 48))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lblEvaluarAnt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnEvaluar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEvaluarAnt)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoAnt)
                    .addComponent(txtCodigoAnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstructura)
                    .addComponent(txtEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConcepto)
                    .addComponent(txtConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblObservaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEvaluar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        if(txtCodigoAnt.getText().isEmpty() && txtConcepto.getText().isEmpty() && txtEstructura.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "EL unico campo no obligatorio son las observaciones");
        }else{
          try {
               int codAnt=Integer.parseInt(txtCodigoAnt.getText()); 
               String estructura=txtEstructura.getText();
               String Observaciones=txtObservaciones.getText();
               int concepto =Integer.parseInt(txtConcepto.getText());
               clsFormatoTiDDTO objD = new clsFormatoTiDDTO(codAnt,estructura,concepto,Observaciones);
               int flujo=objetoRemotoAnteproyecto.VerificarAnteproyecto(codAnt);
               if(flujo<4){
                JOptionPane.showMessageDialog(null, "EL Anteproyecto no ah sido evaluado");
                 this.dispose();
               }else if(flujo==0){
                 JOptionPane.showMessageDialog(null, "No se encontro Anteproyecto");
                  this.dispose();
                }else {
                   boolean funciono=objetoRemotoAnteproyecto.RegistrarFormatoTiD(objD);
                   if(funciono==true){
                   JOptionPane.showMessageDialog(null, "EL Anteproyecto  ah sido evaluado con exito");
                    this.dispose();
                   }else{
                    JOptionPane.showMessageDialog(null, "EL Anteproyecto no ah sido evaluado con exito");
                     this.dispose();
                    }
               }       
           } catch (RemoteException ex) {
               Logger.getLogger(GUIRFormatoC.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_btnEvaluarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIRFormatoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRFormatoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRFormatoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRFormatoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRFormatoD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoAnt;
    private javax.swing.JLabel lblConcepto;
    private javax.swing.JLabel lblEstructura;
    private javax.swing.JLabel lblEvaluarAnt;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JTextField txtCodigoAnt;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtEstructura;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.dto.clsFormatoTiADTO;
import SGestionAnteproyectos.dto.clsRemitidoDTO;
import SGestionAnteproyectos.sop_rmi.GestionAnteproyectoINT;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian Pinto
 */
public class GUIRemitirAnt extends javax.swing.JFrame {

    /**
     * Creates new form GUIRemitirAnteproyecto
     */
    private static GestionAnteproyectoINT objGestion;
    private ArrayList<Integer> listaRemitidos;
    private static int idDir;
    private static String depDir;

    public GUIRemitirAnt(GestionAnteproyectoINT objAnteproyecto, int idDir, String depDir) {
        initComponents();
        this.objGestion = objAnteproyecto;
        this.idDir = idDir;
        this.depDir = depDir;
        this.listaRemitidos = new ArrayList();
        try {
            
            listaRemitidos = objGestion.ListarAprobadosSinRemitir(idDir);
            if (listaRemitidos.isEmpty()) {
                this.cmbCodigos.addItem("No hay Anteproyectos para Remitir");
            } else {
                for (int i = 0; i < listaRemitidos.size(); i++) {
                    this.cmbCodigos.addItem(listaRemitidos.get(i).toString());
                }
            }
        } catch (RemoteException ex) {
            Logger.getLogger(GUIRemitirAnt.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaRemitidos.clear();
    }

    public GUIRemitirAnt() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnRemitir = new javax.swing.JButton();
        lblRemitir = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbCodigos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        btnRemitir.setText("Remitir");
        btnRemitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemitirActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemitir);
        btnRemitir.setBounds(40, 220, 90, 23);

        lblRemitir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblRemitir.setText("Remitir Anteproyecto a Jefe Departamento");
        jPanel2.add(lblRemitir);
        lblRemitir.setBounds(40, 20, 340, 21);

        btnRegresar.setText("Regresar");
        btnRegresar.setToolTipText("");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar);
        btnRegresar.setBounds(0, 290, 100, 23);

        jLabel2.setBackground(new java.awt.Color(153, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Anteproyecto a Remitir");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 60, 190, 20);

        cmbCodigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigosActionPerformed(evt);
            }
        });
        jPanel2.add(cmbCodigos);
        cmbCodigos.setBounds(40, 100, 130, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/director.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-10, -10, 400, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemitirActionPerformed
        try {
            String codigo = (String) cmbCodigos.getSelectedItem();
            int codigoInt = Integer.parseInt(codigo);
            clsRemitidoDTO objRemitido = new clsRemitidoDTO(codigoInt, depDir);
            boolean r = objGestion.RegistrarRemitido(objRemitido);
            if (r) {
                JOptionPane.showMessageDialog(null, "Anteproyecto Remitido al Jefe de Departamento Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido remitir el Anteproyecto");
            }
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido remitir el Anteproyecto.");
        }
    }//GEN-LAST:event_btnRemitirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        listaRemitidos.clear();
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cmbCodigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCodigosActionPerformed

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
            java.util.logging.Logger.getLogger(GUIRemitirAnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRemitirAnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRemitirAnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRemitirAnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRemitirAnt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRemitir;
    private javax.swing.JComboBox<String> cmbCodigos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblRemitir;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.sop_rmi.GestionAnteproyectoINT;
import SSeguimientoAnteproyectos.dto.clsFormatosDTO2;
import SSeguimientoAnteproyectos.sop_rmi.GestionSeguimientoINT;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian Pinto
 */
public class GUIConsultarHistorial extends javax.swing.JFrame {

    /**
     * Creates new form GUIConsultarHistorial
     */
    private  GestionAnteproyectoINT objetoRemotoAnteproyecto;
    private  GestionSeguimientoINT objetoRemotoSeguimiento;
    private ArrayList<clsFormatosDTO2> listaHistorial;
    
    public GUIConsultarHistorial(){}
    
    public GUIConsultarHistorial(GestionAnteproyectoINT objAnteproyecto, GestionSeguimientoINT objSeguimiento) {
        initComponents();
        this.objetoRemotoAnteproyecto = objAnteproyecto;
        this.objetoRemotoSeguimiento = objSeguimiento;
        try {
            listaHistorial = objSeguimiento.ConsultarHistorial();
        } catch (RemoteException ex) {
            Logger.getLogger(GUIConsultarHistorial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Campo");
        modelo.addColumn("Valor");
        
        this.tblHistorial.setEnabled(false);
        
        for (int i = 0; i < this.listaHistorial.size(); i++) {
            // FormatoA 
            Object [] obj = new Object[]{"Codigo Anteproyecto",listaHistorial.get(i).getFormatoA().getCodigo()};
            modelo.addRow(obj);
            obj = new Object[]{"Nombre Programa",listaHistorial.get(i).getFormatoA().getNombrePrograma()};
            modelo.addRow(obj);
            obj = new Object[]{"Titulo",listaHistorial.get(i).getFormatoA().getTitulo()};
            modelo.addRow(obj);
            obj = new Object[]{"Estudiante 1",listaHistorial.get(i).getFormatoA().getEstudiante01()};
            modelo.addRow(obj);
            obj = new Object[]{"Codigo estudiante 1",listaHistorial.get(i).getFormatoA().getCodigoestudiante01()};
            modelo.addRow(obj);
            obj = new Object[]{"Estudiante 2",listaHistorial.get(i).getFormatoA().getEstudiante02()};
            modelo.addRow(obj);
            obj = new Object[]{"Codigo estudiante 2",listaHistorial.get(i).getFormatoA().getCodigoestudiante02()};
            modelo.addRow(obj);
            obj = new Object[]{"Director",listaHistorial.get(i).getFormatoA().getDirector()};
            modelo.addRow(obj);
            obj = new Object[]{"Codirector",listaHistorial.get(i).getFormatoA().getCodirector()};
            modelo.addRow(obj);
            obj = new Object[]{"Objetivo",listaHistorial.get(i).getFormatoA().getObjetivo()};
            modelo.addRow(obj);
            // FormatoB1
            obj = new Object[]{"Id Evaluador 1",listaHistorial.get(i).getFormatoB1().getId_evaluador()};
            modelo.addRow(obj);
            obj = new Object[]{"Concepto",listaHistorial.get(i).getFormatoB1().getConcepto()};
            modelo.addRow(obj);
            obj = new Object[]{"Observaciones",listaHistorial.get(i).getFormatoB1().getObservaciones()};
            modelo.addRow(obj);
            obj = new Object[]{"Fecha",listaHistorial.get(i).getFormatoB1().getFecha()};
            modelo.addRow(obj);
            // FormatoB2
            obj = new Object[]{"Id Evaluador 2",listaHistorial.get(i).getFormatoB2().getId_evaluador()};
            modelo.addRow(obj);
            obj = new Object[]{"Concepto",listaHistorial.get(i).getFormatoB2().getConcepto()};
            modelo.addRow(obj);
            obj = new Object[]{"Observaciones",listaHistorial.get(i).getFormatoB2().getObservaciones()};
            modelo.addRow(obj);
            obj = new Object[]{"Fecha",listaHistorial.get(i).getFormatoB2().getFecha()};
            modelo.addRow(obj);
            // FormatoC
            obj = new Object[]{"Concepto Departamento",listaHistorial.get(i).getFormatoC().getConceptoDpto()};
            modelo.addRow(obj);
            obj = new Object[]{"Estructura",listaHistorial.get(i).getFormatoC().getEstructura()};
            modelo.addRow(obj);
            obj = new Object[]{"Observaciones",listaHistorial.get(i).getFormatoC().getObservaciones()};
            modelo.addRow(obj);
            // FormatoD
            obj = new Object[]{"Concepto Coordinador",listaHistorial.get(i).getFormatoD().getConceptoCoor()};
            modelo.addRow(obj);
            obj = new Object[]{"Estructura",listaHistorial.get(i).getFormatoD().getEstructura()};
            modelo.addRow(obj);
            obj = new Object[]{"Observaciones",listaHistorial.get(i).getFormatoD().getObservaciones()};
            modelo.addRow(obj);
        }
        this.tblHistorial.setModel(modelo);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHistorial = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Listado Historial de Anteproyectos");

        tblHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblHistorial);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIConsultarHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIConsultarHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIConsultarHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIConsultarHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIConsultarHistorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblHistorial;
    // End of variables declaration//GEN-END:variables
}

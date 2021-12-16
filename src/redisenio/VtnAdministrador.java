/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redisenio;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author MoisesVidalHernandez
 */
public class VtnAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public VtnAdministrador() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setIconImage(new ImageIcon(getClass().getResource("/Iconos2/SCHR.png")).getImage());
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        btnDocentes = new javax.swing.JButton();
        btnCoordinador = new javax.swing.JButton();
        btnLicenciaturas = new javax.swing.JButton();
        btnPeriodos = new javax.swing.JButton();
        btnPlanes = new javax.swing.JButton();
        btnMaterias = new javax.swing.JButton();
        btnGrupos = new javax.swing.JButton();
        btnHorarios = new javax.swing.JButton();
        btnCargaExcel = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLTituloUAPT1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 0));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnDocentes.setBackground(new java.awt.Color(102, 102, 0));
        btnDocentes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDocentes.setForeground(new java.awt.Color(255, 255, 255));
        btnDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos2/profesor.png"))); // NOI18N
        btnDocentes.setText("DOCENTES");
        btnDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocentesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(btnDocentes, gridBagConstraints);

        btnCoordinador.setBackground(new java.awt.Color(102, 102, 0));
        btnCoordinador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCoordinador.setForeground(new java.awt.Color(255, 255, 255));
        btnCoordinador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos2/usuario(1).png"))); // NOI18N
        btnCoordinador.setText("COORDINADORES");
        btnCoordinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoordinadorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(btnCoordinador, gridBagConstraints);

        btnLicenciaturas.setBackground(new java.awt.Color(102, 102, 0));
        btnLicenciaturas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLicenciaturas.setForeground(new java.awt.Color(255, 255, 255));
        btnLicenciaturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos2/profesion.png"))); // NOI18N
        btnLicenciaturas.setText("LICENCIATURAS");
        btnLicenciaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLicenciaturasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(btnLicenciaturas, gridBagConstraints);

        btnPeriodos.setBackground(new java.awt.Color(102, 102, 0));
        btnPeriodos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPeriodos.setForeground(new java.awt.Color(255, 255, 255));
        btnPeriodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos2/calendario.png"))); // NOI18N
        btnPeriodos.setText("PERIODOS");
        btnPeriodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeriodosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(btnPeriodos, gridBagConstraints);

        btnPlanes.setBackground(new java.awt.Color(102, 102, 0));
        btnPlanes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPlanes.setForeground(new java.awt.Color(255, 255, 255));
        btnPlanes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos2/plan.png"))); // NOI18N
        btnPlanes.setText("PLAN DE ESTUDIO");
        btnPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(btnPlanes, gridBagConstraints);

        btnMaterias.setBackground(new java.awt.Color(102, 102, 0));
        btnMaterias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMaterias.setForeground(new java.awt.Color(255, 255, 255));
        btnMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos2/Materias.png"))); // NOI18N
        btnMaterias.setText("MATERIAS");
        btnMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(btnMaterias, gridBagConstraints);

        btnGrupos.setBackground(new java.awt.Color(102, 102, 0));
        btnGrupos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGrupos.setForeground(new java.awt.Color(255, 255, 255));
        btnGrupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos2/grupo.png"))); // NOI18N
        btnGrupos.setText("GRUPOS");
        btnGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGruposActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(btnGrupos, gridBagConstraints);

        btnHorarios.setBackground(new java.awt.Color(102, 102, 0));
        btnHorarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHorarios.setForeground(new java.awt.Color(255, 255, 255));
        btnHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos2/horario.png"))); // NOI18N
        btnHorarios.setText("HORARIOS");
        btnHorarios.setToolTipText("");
        btnHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorariosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(btnHorarios, gridBagConstraints);

        btnCargaExcel.setBackground(new java.awt.Color(102, 102, 0));
        btnCargaExcel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCargaExcel.setForeground(new java.awt.Color(255, 255, 255));
        btnCargaExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos2/excel.png"))); // NOI18N
        btnCargaExcel.setText("CARGAR EXCEL");
        btnCargaExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaExcelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(btnCargaExcel, gridBagConstraints);

        btnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(btnEliminar, gridBagConstraints);

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos2/flecha(3).png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(btnSalir, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("PARA GESTIONAR CUALQUIERA DE LOS APARTADOS, POR FAVOR PRESIONA UN BOTÓN.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLTituloUAPT1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLTituloUAPT1.setText("BIENVENIDO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jLTituloUAPT1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("MENÚ PRINCIPAL ADMINISTRADOR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos2/logoUAEMEX.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocentesActionPerformed
        this.setVisible(false);
        new VtnDocentes().setVisible(true);
    }//GEN-LAST:event_btnDocentesActionPerformed

    private void btnCoordinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoordinadorActionPerformed
        this.setVisible(false);
        new VtnCoordinadores().setVisible(true);
    }//GEN-LAST:event_btnCoordinadorActionPerformed

    private void btnLicenciaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLicenciaturasActionPerformed
        this.setVisible(false);
        new VtnLicenciaturas().setVisible(true);
    }//GEN-LAST:event_btnLicenciaturasActionPerformed

    private void btnPeriodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeriodosActionPerformed
        this.setVisible(false);
        new VtnPeriodos().setVisible(true);
    }//GEN-LAST:event_btnPeriodosActionPerformed

    private void btnPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanesActionPerformed
        this.setVisible(false);
        new VtnPlanEstudios().setVisible(true);
    }//GEN-LAST:event_btnPlanesActionPerformed

    private void btnMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriasActionPerformed
        this.setVisible(false);
        new VtnMaterias().setVisible(true);
    }//GEN-LAST:event_btnMateriasActionPerformed

    private void btnGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGruposActionPerformed
        this.setVisible(false);
        new VtnGrupos().setVisible(true);
    }//GEN-LAST:event_btnGruposActionPerformed

    private void btnHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorariosActionPerformed
        this.setVisible(false);
        new VtnHorarios().setVisible(true);
    }//GEN-LAST:event_btnHorariosActionPerformed

    private void btnCargaExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaExcelActionPerformed
        this.setVisible(false);
        VistaExcel.valVentana = 1;
        new VistaExcel().setVisible(true);
    }//GEN-LAST:event_btnCargaExcelActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.setVisible(false);
        new VtneEliminar().setVisible(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargaExcel;
    private javax.swing.JButton btnCoordinador;
    private javax.swing.JButton btnDocentes;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrupos;
    private javax.swing.JButton btnHorarios;
    private javax.swing.JButton btnLicenciaturas;
    private javax.swing.JButton btnMaterias;
    private javax.swing.JButton btnPeriodos;
    private javax.swing.JButton btnPlanes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLTituloUAPT1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

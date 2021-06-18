/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import Objetos.Licenciatura;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VentanaMenuCoordinador extends javax.swing.JFrame {

    public static String licenciatura;
    private ArrayList<Object> lics = new ArrayList<>();
    VentanaLogin vtn = new VentanaLogin();
    
    /**
     * Creates new form VentanaPrinicipal
     */
    public VentanaMenuCoordinador() {
        initComponents();
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBMaterias = new javax.swing.JButton();
        jBHorarios = new javax.swing.JButton();
        jBDocentes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jBPlanes = new javax.swing.JButton();
        jBGrupos = new javax.swing.JButton();
        LabelLic = new javax.swing.JLabel();
        jLTituloUniversidad1 = new javax.swing.JLabel();
        jLTituloUAPT1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horarios UAPT");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("BIENVENIDO AL MENU PRINCIPAL, POR FAVOR PRESIONA UN BOTON DE ACUERDO AL SECTOR QUE QUIERAS GESTIONAR");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/UAEMex.jpg"))); // NOI18N

        jBMaterias.setBackground(new java.awt.Color(102, 102, 0));
        jBMaterias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBMaterias.setForeground(new java.awt.Color(255, 255, 255));
        jBMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Materias.png"))); // NOI18N
        jBMaterias.setText("MATERIAS");
        jBMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMateriasActionPerformed(evt);
            }
        });

        jBHorarios.setBackground(new java.awt.Color(102, 102, 0));
        jBHorarios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBHorarios.setForeground(new java.awt.Color(255, 255, 255));
        jBHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/horario.png"))); // NOI18N
        jBHorarios.setText("HORARIOS");
        jBHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHorariosActionPerformed(evt);
            }
        });

        jBDocentes.setBackground(new java.awt.Color(102, 102, 0));
        jBDocentes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBDocentes.setForeground(new java.awt.Color(255, 255, 255));
        jBDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/profesor.png"))); // NOI18N
        jBDocentes.setText("DOCENTES");
        jBDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDocentesActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha(3).png"))); // NOI18N
        jButton1.setText("SALIR");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBPlanes.setBackground(new java.awt.Color(102, 102, 0));
        jBPlanes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBPlanes.setForeground(new java.awt.Color(255, 255, 255));
        jBPlanes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/plan.png"))); // NOI18N
        jBPlanes.setText("PLANES DE ESTUDIO");
        jBPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPlanesActionPerformed(evt);
            }
        });

        jBGrupos.setBackground(new java.awt.Color(102, 102, 0));
        jBGrupos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBGrupos.setForeground(new java.awt.Color(255, 255, 255));
        jBGrupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/grupo.png"))); // NOI18N
        jBGrupos.setText("GRUPOS");
        jBGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGruposActionPerformed(evt);
            }
        });

        LabelLic.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LabelLic.setText("Unidad Académica Profesional Tianguistenco");

        jLTituloUniversidad1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLTituloUniversidad1.setText("UNIVERSIDAD AUTONOMA DEL ESTADO DE MEXICO");

        jLTituloUAPT1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLTituloUAPT1.setText("UNIDAD ACADEMICA PROFESIONAL TIANGUISTENCO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTituloUniversidad1)
                    .addComponent(jLTituloUAPT1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(jBPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LabelLic)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLTituloUAPT1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLTituloUniversidad1)
                        .addGap(18, 18, 18)
                        .addComponent(LabelLic)))
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBDocentes)
                            .addComponent(jBPlanes)
                            .addComponent(jBMaterias))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBGrupos)
                            .addComponent(jBHorarios))))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMateriasActionPerformed
        this.setVisible(false);
        new VentanaMateriasCoordinador().setVisible(true);
    }//GEN-LAST:event_jBMateriasActionPerformed

    private void jBHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHorariosActionPerformed
        this.setVisible(false);
        new VentanaHorarios().setVisible(true);
    }//GEN-LAST:event_jBHorariosActionPerformed

    private void jBDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDocentesActionPerformed
        this.setVisible(false);
        new VentanaDocentesCordinador().setVisible(true);
    }//GEN-LAST:event_jBDocentesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new VentanaLogin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPlanesActionPerformed
        this.setVisible(false);
        new VentanaPlanEstudiosCoordinador().setVisible(true);
    }//GEN-LAST:event_jBPlanesActionPerformed

    private void jBGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGruposActionPerformed
        this.setVisible(false);
        new VentanaGruposCoordinador().setVisible(true);
    }//GEN-LAST:event_jBGruposActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lics = ConsultasObjetos.consultaMuchos("licenciatura", null, null, null, null, ConectarBase.conectado());
        LabelLic.setText(buscaLic(licenciatura, null));
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(VentanaMenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaMenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaMenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaMenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenuCoordinador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLic;
    private javax.swing.JButton jBDocentes;
    private javax.swing.JButton jBGrupos;
    private javax.swing.JButton jBHorarios;
    private javax.swing.JButton jBMaterias;
    private javax.swing.JButton jBPlanes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLTituloUAPT1;
    private javax.swing.JLabel jLTituloUniversidad1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    public String buscaLic(String id, String licenciatura) {
        if (licenciatura != null)
        {
            for (Object l : lics)
            {
                Licenciatura lic = (Licenciatura) l;
                if ((lic.getLicenciatura()).equals(licenciatura))
                {
                    return lic.getIdLicenciatura();
                }
            }
        } else
        {
            for (Object l : lics)
            {
                Licenciatura lic = (Licenciatura) l;
                if (lic.getIdLicenciatura().equals(id))
                {
                    return lic.getLicenciatura();
                }
            }
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import Objetos.Profesor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VentanaAdministrador extends javax.swing.JFrame {

    int ancho = Toolkit.getDefaultToolkit().getScreenSize().width;
    int alto = Toolkit.getDefaultToolkit().getScreenSize().height;
    int alto2;

    /**
     * Creates new form VentanaPrinicipal
     */
    public VentanaAdministrador() {
        initComponents();
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
        this.setIconImage(new ImageIcon(getClass().getResource("/Iconos/SCHR.png")).getImage());
        //this.setSize(ancho, alto-40);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTituloUniversidad = new javax.swing.JLabel();
        jLTituloUAPT = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBLicenciaturas = new javax.swing.JButton();
        jBMaterias = new javax.swing.JButton();
        jBPeriodo = new javax.swing.JButton();
        jBUsuarios = new javax.swing.JButton();
        jBDocentes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jBPlanes = new javax.swing.JButton();
        jLTituloUAPT1 = new javax.swing.JLabel();
        jBMaterias1 = new javax.swing.JButton();
        jBPeriodo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horarios UAPT");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLTituloUniversidad.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLTituloUniversidad.setText("Universidad Autónoma del Estado de México");

        jLTituloUAPT.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLTituloUAPT.setText("Unidad Académica Profesional Tianguistenco");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Bienvenido al menú principal por favor presiona un boton, para gestionar culaquiera de los apartados");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/UAEMex.jpg"))); // NOI18N

        jBLicenciaturas.setBackground(new java.awt.Color(102, 102, 0));
        jBLicenciaturas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBLicenciaturas.setForeground(new java.awt.Color(255, 255, 255));
        jBLicenciaturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/profesion.png"))); // NOI18N
        jBLicenciaturas.setText("LICENCIATURAS");
        jBLicenciaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLicenciaturasActionPerformed(evt);
            }
        });

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

        jBPeriodo.setBackground(new java.awt.Color(102, 102, 0));
        jBPeriodo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        jBPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/calendario.png"))); // NOI18N
        jBPeriodo.setText("PERIODOS");
        jBPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPeriodoActionPerformed(evt);
            }
        });

        jBUsuarios.setBackground(new java.awt.Color(102, 102, 0));
        jBUsuarios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jBUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/usuario(1).png"))); // NOI18N
        jBUsuarios.setText("COORDINADORES");
        jBUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUsuariosActionPerformed(evt);
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

        jLTituloUAPT1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLTituloUAPT1.setText("Bienvenido Administrador");

        jBMaterias1.setBackground(new java.awt.Color(102, 102, 0));
        jBMaterias1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBMaterias1.setForeground(new java.awt.Color(255, 255, 255));
        jBMaterias1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/grupo.png"))); // NOI18N
        jBMaterias1.setText("GRUPOS");
        jBMaterias1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMaterias1ActionPerformed(evt);
            }
        });

        jBPeriodo1.setBackground(new java.awt.Color(102, 102, 0));
        jBPeriodo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBPeriodo1.setForeground(new java.awt.Color(255, 255, 255));
        jBPeriodo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/horario.png"))); // NOI18N
        jBPeriodo1.setText("HORARIOS");
        jBPeriodo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPeriodo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTituloUAPT)
                    .addComponent(jLTituloUniversidad))
                .addGap(71, 71, 71)
                .addComponent(jLTituloUAPT1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 159, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jBUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(jBPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBMaterias1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(jBPeriodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBLicenciaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLTituloUAPT1))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLTituloUniversidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLTituloUAPT)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDocentes)
                    .addComponent(jBUsuarios)
                    .addComponent(jBLicenciaturas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPlanes)
                    .addComponent(jBPeriodo)
                    .addComponent(jBMaterias))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBMaterias1)
                    .addComponent(jBPeriodo1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMateriasActionPerformed
        this.setVisible(false);
        new VentanaMaterias().setVisible(true);
    }//GEN-LAST:event_jBMateriasActionPerformed

    private void jBPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPeriodoActionPerformed
        this.setVisible(false);
        new VentanaPeriodos().setVisible(true);
    }//GEN-LAST:event_jBPeriodoActionPerformed

    private void jBUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUsuariosActionPerformed
        this.setVisible(false);
        new VentanaCordinadores().setVisible(true);
    }//GEN-LAST:event_jBUsuariosActionPerformed

    private void jBDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDocentesActionPerformed
        this.setVisible(false);
        new VentanaDocentes().setVisible(true);
    }//GEN-LAST:event_jBDocentesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new VentanaLogin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBLicenciaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLicenciaturasActionPerformed
        this.setVisible(false);
        new VentanaLicenciatura().setVisible(true);
    }//GEN-LAST:event_jBLicenciaturasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*
        Profesor profe = new Profesor();
        profe = (Profesor) ConsultasObjetos.consultaUnica("profesores", "nombres", "jorge carlos", ConectarBase.conectado());
         */
    }//GEN-LAST:event_formWindowOpened

    private void jBPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPlanesActionPerformed
        new VentanaPlanEstudios().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBPlanesActionPerformed

    private void jBMaterias1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMaterias1ActionPerformed
        this.setVisible(false);
        new VentanaGrupos().setVisible(true);
    }//GEN-LAST:event_jBMaterias1ActionPerformed

    private void jBPeriodo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPeriodo1ActionPerformed
        this.setVisible(false);
        new VentanaHorarios().setVisible(true);
    }//GEN-LAST:event_jBPeriodo1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDocentes;
    private javax.swing.JButton jBLicenciaturas;
    private javax.swing.JButton jBMaterias;
    private javax.swing.JButton jBMaterias1;
    private javax.swing.JButton jBPeriodo;
    private javax.swing.JButton jBPeriodo1;
    private javax.swing.JButton jBPlanes;
    private javax.swing.JButton jBUsuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLTituloUAPT;
    private javax.swing.JLabel jLTituloUAPT1;
    private javax.swing.JLabel jLTituloUniversidad;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

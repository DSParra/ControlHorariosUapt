/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Color;
import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import Clases.Querys;
import Clases.Sesion;
import Clases.Valida;
import Objetos.Usuario;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VentanaLogin extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrinicipal
     */
    public VentanaLogin() {
        initComponents();
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static Connection con = null;
    Querys q;

    public boolean login() {
        q = new Querys();
        //try {
            Usuario us = new Usuario();
            us =(Usuario)ConsultasObjetos.consultaUnica("usuarios","usuario",txtusuario.getText(), con);
            if (us  == null) {
                return false;
            }else{
                if (us.getContra().equals(jPassContrasenaia.getText())) {
                    return true;
                }else{
                    JOptionPane.showMessageDialog(null,"Contaseña incorrecta");
                }                
            }
        return false;
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
        jPassContrasenaia = new javax.swing.JPasswordField();
        btnentrar = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLTituloUniversidad = new javax.swing.JLabel();
        jLTituloUAPT = new javax.swing.JLabel();
        jLTituloUAPT1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horarios UAPT");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 83, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPassContrasenaia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPassContrasenaiaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPassContrasenaiaKeyReleased(evt);
            }
        });
        jPanel1.add(jPassContrasenaia, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 349, 233, 40));

        btnentrar.setBackground(new java.awt.Color(102, 102, 0));
        btnentrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnentrar.setForeground(new java.awt.Color(255, 255, 255));
        btnentrar.setText("Entrar");
        btnentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 419, 126, 40));

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtusuarioKeyReleased(evt);
            }
        });
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 249, 233, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 209, -1, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Bienvenido al inicio de sesión");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 167, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 307, -1, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logo usuarios.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 21, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 430, 480));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/UAEMex.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLTituloUniversidad.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLTituloUniversidad.setForeground(new java.awt.Color(1, 1, 1));
        jLTituloUniversidad.setText("Universidad Autónoma del Estado de México");
        getContentPane().add(jLTituloUniversidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        jLTituloUAPT.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLTituloUAPT.setForeground(new java.awt.Color(1, 1, 1));
        jLTituloUAPT.setText("Sistema de Control de Horarios");
        getContentPane().add(jLTituloUAPT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, 20));

        jLTituloUAPT1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLTituloUAPT1.setForeground(new java.awt.Color(1, 1, 1));
        jLTituloUAPT1.setText("Unidad Académica Profesional Tianguistenco");
        getContentPane().add(jLTituloUAPT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/SCHR.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void btnentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrarActionPerformed


        String val = ConsultasObjetos.validaEntrar(txtusuario.getText(), jPassContrasenaia.getText(), con);
        String lic = ConsultasObjetos.obtieneIDLic(txtusuario.getText(), ConectarBase.conectado());
        System.out.println("lic" + lic);
        VentanaMenuCoordinador.licenciatura = lic;
        
        if (val.equals("usuario"))
        {
            this.setVisible(false);
            new VentanaAdministrador().setVisible(true);
        }
        else if(val.equals("profesor"))
        {
            this.setVisible(false);
            new VentanaMenuCoordinador().setVisible(true);
        }
    }//GEN-LAST:event_btnentrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            con = ConectarBase.conectado();       
    }//GEN-LAST:event_formWindowOpened

    private void txtusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyPressed
        Validaciones.enter(this, evt, jPassContrasenaia);
    }//GEN-LAST:event_txtusuarioKeyPressed

    private void jPassContrasenaiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassContrasenaiaKeyPressed
        Validaciones.enter(this, evt, btnentrar);
    }//GEN-LAST:event_jPassContrasenaiaKeyPressed

    private void txtusuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyReleased
        //Valida.convertirAMayusculas(txtusuario);
        //convertirAMayusculas(txtusuario);
    }//GEN-LAST:event_txtusuarioKeyReleased

    private void jPassContrasenaiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassContrasenaiaKeyReleased
        //Valida.convertirAMayusculasP(jPassContrasenaia);
    }//GEN-LAST:event_jPassContrasenaiaKeyReleased


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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VentanaLogin().setVisible(true);
            }
        });
    }

    /*
   */

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnentrar;
    private javax.swing.JLabel jLTituloUAPT;
    private javax.swing.JLabel jLTituloUAPT1;
    private javax.swing.JLabel jLTituloUniversidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassContrasenaia;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

    /*private void convertirAMayusculas(JTextField caja) {
        String cadena = (caja.getText()).toUpperCase();
        caja.setText(cadena);
    }

    private void convertirAMayusculasP(JPasswordField contra) {
        String cadena = (contra.getText()).toUpperCase();
        contra.setText(cadena);
    }
    */
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Clases.ConectarBase;
import Clases.Conexion;
import Clases.ConsultasObjetos;
import Objetos.Licenciatura;
import Objetos.Profesor;
import cjb.ci.CtrlInterfaz;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import static cjb.ci.Validaciones.enter;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VentanaLicenciatura extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrinicipal
     */
    public VentanaLicenciatura() {
        initComponents();
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
    }
    private Boolean edicion = true;
    private DefaultTableModel modelo;
    private ArrayList<Object> profes = new ArrayList<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnelmina = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBRegresar = new javax.swing.JButton();
        jBCerrarSesion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        btnmodifica = new javax.swing.JButton();
        btnAgregar2 = new javax.swing.JButton();
        btnAgregar3 = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        comboCordis = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtcodigolic = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horarios UAPT");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Cordinadores");

        btnAgregar.setBackground(new java.awt.Color(102, 102, 0));
        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Nuevo");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnelmina.setBackground(new java.awt.Color(102, 102, 0));
        btnelmina.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnelmina.setForeground(new java.awt.Color(255, 255, 255));
        btnelmina.setText("Eliminar");
        btnelmina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelminaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de Licenciatura", "Nombre de la licenciatura", "Cordinador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jBRegresar.setBackground(new java.awt.Color(102, 102, 0));
        jBRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jBRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha(2).png"))); // NOI18N
        jBRegresar.setText("Regresar");
        jBRegresar.setToolTipText("");
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });

        jBCerrarSesion.setBackground(new java.awt.Color(102, 102, 0));
        jBCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jBCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha(3).png"))); // NOI18N
        jBCerrarSesion.setText("Cerrar Sesión");
        jBCerrarSesion.setToolTipText("");
        jBCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarSesionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("Nombre");

        txtnombre.setBackground(new java.awt.Color(255, 255, 153));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        btnmodifica.setBackground(new java.awt.Color(102, 102, 0));
        btnmodifica.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnmodifica.setForeground(new java.awt.Color(255, 255, 255));
        btnmodifica.setText("Modificar");
        btnmodifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificaActionPerformed(evt);
            }
        });

        btnAgregar2.setBackground(new java.awt.Color(102, 102, 0));
        btnAgregar2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar2.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar2.setText("Importar");
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });

        btnAgregar3.setBackground(new java.awt.Color(102, 102, 0));
        btnAgregar3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar3.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar3.setText("Exportar");
        btnAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar3ActionPerformed(evt);
            }
        });

        btncancelar.setBackground(new java.awt.Color(102, 102, 0));
        btncancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        comboCordis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setText("Cordinador");

        txtcodigolic.setBackground(new java.awt.Color(255, 255, 153));
        txtcodigolic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigolicActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setText("Codigo Licenciatura");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(txtcodigolic))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboCordis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                        .addComponent(btnmodifica, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCerrarSesion)))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(552, 552, 552))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnelmina)
                        .addGap(48, 48, 48)
                        .addComponent(btncancelar)
                        .addGap(428, 428, 428)
                        .addComponent(jBRegresar)
                        .addGap(265, 265, 265))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtcodigolic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(comboCordis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRegresar)
                    .addComponent(jBCerrarSesion)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnelmina, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodifica, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        edicion();
        if (edicion) {
            btnAgregar.setText("Aceptar");
            CtrlInterfaz.limpia(txtnombre, txtcodigolic);
            CtrlInterfaz.habilita(true, txtnombre, comboCordis, btncancelar, txtcodigolic);
            CtrlInterfaz.selecciona(txtnombre);
            llenaComboProfesores();
        } else {
            if (JOptionPane.showConfirmDialog(this, "Seguro que desea agregar a " + txtnombre.getText()) == 0) {

//                btnAgregar.setText("Nuevo");
                Licenciatura lic = new Licenciatura(txtcodigolic.getText(), txtnombre.getText(), buscaProfesor(null, (String) comboCordis.getSelectedItem()));
                System.out.println("Item"+" "+ (String) comboCordis.getSelectedItem());
                ConsultasObjetos.inserta(lic, ConectarBase.conectado(), "licenciatura");
                CtrlInterfaz.habilita(false, txtnombre, comboCordis, btncancelar);
                CtrlInterfaz.habilita(true, btnelmina, btnmodifica);
                llenaComboCordinadores();
                actualizaTabla();
            } else {
                edicion();
            }
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnelminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelminaActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar a " + txtnombre.getText()) == 0) {
            Profesor p = new Profesor(txtrfc.getText(), txtapellidoP.getText(), txtapellidoM.getText(), txtnombre.getText(), txtgradoAcademico.getText(), txtcorreo.getText(), txttelefono.getText());
            ConsultasObjetos.elimina("profesores", "rfc", txtrfc.getText(), 0, ConectarBase.conectado());
            actualizaTabla();
        }
    }//GEN-LAST:event_btnelminaActionPerformed

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        this.setVisible(false);
        new VentanaAdministrador().setVisible(true);
    }//GEN-LAST:event_jBRegresarActionPerformed

    private void jBCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarSesionActionPerformed
        this.setVisible(false);
        new VentanaLogin().setVisible(true);
    }//GEN-LAST:event_jBCerrarSesionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cancelar();
        actualizaTabla();
        llenaComboCordinadores();
    }//GEN-LAST:event_formWindowOpened

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnmodificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificaActionPerformed
        if (txtrfc.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro para editar");
        } else {
            edicion();
            if (edicion) {
                btnmodifica.setText("Aceptar");
                CtrlInterfaz.habilita(true, txtapellidoM, txtapellidoP, txtnombre, txtrfc, txtgradoAcademico, txtcorreo, txttelefono, btncancelar);
                CtrlInterfaz.habilita(false, btnelmina, btnAgregar);
            } else {
                if (JOptionPane.showConfirmDialog(this, "Seguro que desea Modificar a " + txtnombre.getText()) == 0) {
                    btnAgregar.setText("Modificar");
                    Profesor p = new Profesor(txtrfc.getText(), txtapellidoP.getText(), txtapellidoM.getText(), txtnombre.getText(), txtgradoAcademico.getText(), txtcorreo.getText(), txttelefono.getText());
                    ConsultasObjetos.Modifica(p, ConectarBase.conectado(), "profesores");
                    CtrlInterfaz.habilita(false, txtapellidoM, txtapellidoP, txtnombre, txtrfc, txtgradoAcademico, txtcorreo, txttelefono);
                    CtrlInterfaz.habilita(true, btnelmina, btnmodifica);
                    actualizaTabla();
                } else {
                    edicion();
                }
            }
        }

    }//GEN-LAST:event_btnmodificaActionPerformed

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar3ActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        txtrfc.setText((String) modelo.getValueAt(jTable1.getSelectedRow(), 0));
        txtapellidoP.setText((String) modelo.getValueAt(jTable1.getSelectedRow(), 1));
        txtapellidoM.setText((String) modelo.getValueAt(jTable1.getSelectedRow(), 2));
        txtnombre.setText((String) modelo.getValueAt(jTable1.getSelectedRow(), 3));
        txtgradoAcademico.setText((String) modelo.getValueAt(jTable1.getSelectedRow(), 4));
        txtcorreo.setText((String) modelo.getValueAt(jTable1.getSelectedRow(), 5));
        txttelefono.setText((String) modelo.getValueAt(jTable1.getSelectedRow(), 6));
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtrfcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrfcKeyPressed
        enter(this, evt, txtapellidoP);
    }//GEN-LAST:event_txtrfcKeyPressed

    private void txtapellidoPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoPKeyPressed
        enter(this, evt, txtapellidoM);
    }//GEN-LAST:event_txtapellidoPKeyPressed

    private void txtapellidoMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoMKeyPressed
        enter(this, evt, txtnombre);
    }//GEN-LAST:event_txtapellidoMKeyPressed

    private void txtnombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyPressed
        enter(this, evt, txtgradoAcademico);
    }//GEN-LAST:event_txtnombresKeyPressed

    private void txtgradoAcademicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgradoAcademicoKeyPressed
        enter(this, evt, txtcorreo);
    }//GEN-LAST:event_txtgradoAcademicoKeyPressed

    private void txtcorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyPressed
        enter(this, evt, txttelefono);
    }//GEN-LAST:event_txtcorreoKeyPressed

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        enter(this, evt, btnAgregar);
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txtcodigolicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigolicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigolicActionPerformed

    private void cancelar() {
        edicion();
        CtrlInterfaz.limpia(txtnombre);
        CtrlInterfaz.habilita(false, txtnombre, comboCordis, btncancelar, txtcodigolic);
        CtrlInterfaz.habilita(true, btnAgregar, btnmodifica, btnelmina);
        btnAgregar.setText("Nuevo");
        btnmodifica.setText("Modificar");
    }

    private void edicion() {
        if (edicion) {
            edicion = false;
        } else {
            edicion = true;
        }
    }

    public void actualizaTabla() {
        profes = ConsultasObjetos.consultaMuchos("profesores", null, null, ConectarBase.conectado());
        modelo = (DefaultTableModel) jTable1.getModel();

        ArrayList<Object> licenciatura = new ArrayList();
        licenciatura = ConsultasObjetos.consultaMuchos("licenciatura", null, null, ConectarBase.conectado());
        if (licenciatura.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encuentran registros");
        } else {
            modelo.setRowCount(0);
            for (Object p : licenciatura) {
                Licenciatura lic = (Licenciatura) p;
                modelo.addRow(new Object[]{
                    lic.getIdLicenciatura(), lic.getLicenciatura(), buscaProfesor(lic.getRfcCordinador(), null)
                });

            }
        }
    }

    public String buscaProfesor(String rfc, String nombre) {
        if (nombre != null) {
            for (Object p : profes) {
                Profesor profe = (Profesor) p;
                if ((profe.getNombres() + " " + profe.getApellidoP()).equals(nombre)) {
                    return profe.getRfc();
                }
            }
        } else {
            for (Object p : profes) {
                Profesor profe = (Profesor) p;
                if (profe.getRfc().equals(rfc)) {
                    return profe.getNombres() + " " + profe.getApellidoP();
                }
                return null;
            }

        }

    

    

    

    public void llenaComboCordinadores() {
        comboCordis.removeAllItems();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            comboCordis.addItem((String) jTable1.getValueAt(0, 2));
            System.out.println((String) jTable1.getValueAt(0, 2));
        }
    }

    public void llenaComboProfesores() {
        comboCordis.removeAllItems();
        for (int i = 0; i < profes.size(); i++) {
            comboCordis.addItem(((Profesor) profes.get(i)).getNombres() + " " + ((Profesor) profes.get(i)).getApellidoP());

        }
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
            java.util.logging.Logger.getLogger(VentanaLicenciatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLicenciatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLicenciatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLicenciatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new VentanaLicenciatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnelmina;
    private javax.swing.JButton btnmodifica;
    private javax.swing.JComboBox<String> comboCordis;
    private javax.swing.JButton jBCerrarSesion;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcodigolic;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}

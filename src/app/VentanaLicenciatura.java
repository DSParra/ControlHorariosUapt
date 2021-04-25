/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Clases.ConectarBase;
import Clases.Conexion;
import Clases.ConsultasObjetos;
import Clases.Valida;
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
        tablaLicenciatura = new javax.swing.JTable();
        jBRegresar = new javax.swing.JButton();
        jBCerrarSesion = new javax.swing.JButton();
        btnmodifica = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLTituloUAPT = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLTituloUniversidad = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JCCordinador = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcodigolic = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAgregar3 = new javax.swing.JButton();
        btnAgregar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horarios UAPT");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("GESTION LICENCIATURAS");

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

        tablaLicenciatura.setBackground(new java.awt.Color(25, 83, 0));
        tablaLicenciatura.setForeground(new java.awt.Color(254, 254, 254));
        tablaLicenciatura.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaLicenciatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLicenciaturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaLicenciatura);

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
        jBCerrarSesion.setText("Salir");
        jBCerrarSesion.setToolTipText("");
        jBCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarSesionActionPerformed(evt);
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

        btncancelar.setBackground(new java.awt.Color(102, 102, 0));
        btncancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jLTituloUAPT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLTituloUAPT.setText("UNIDAD ACADEMICA PROFESIONAL TIANGUISTENCO");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/UAEMex.jpg"))); // NOI18N

        jLTituloUniversidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLTituloUniversidad.setText("UNIVERSIDAD AUTONOMA DEL ESTADO DE MEXICO");

        jPanel1.setBackground(new java.awt.Color(25, 83, 0));

        JCCordinador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("COORDINADOR");

        txtnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnombreFocusLost(evt);
            }
        });
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("NOMBRE");
        jLabel6.setToolTipText("");

        txtcodigolic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigolicActionPerformed(evt);
            }
        });
        txtcodigolic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigolicKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigolicKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("ID ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(txtcodigolic)
                    .addComponent(jLabel6)
                    .addComponent(txtnombre)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCCordinador, 0, 211, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcodigolic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(JCCordinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        btnAgregar3.setBackground(new java.awt.Color(102, 102, 0));
        btnAgregar3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar3.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar3.setText("Exportar");
        btnAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar3ActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLTituloUniversidad))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLTituloUAPT))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnmodifica, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnelmina, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBRegresar)))))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(306, 306, 306)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLTituloUniversidad)
                        .addGap(13, 13, 13)
                        .addComponent(jLTituloUAPT))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBRegresar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnelmina, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnmodifica, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBCerrarSesion))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        edicion();
        if (edicion) {
            btnAgregar.setText("Aceptar");
            CtrlInterfaz.limpia(txtnombre, txtcodigolic);
            CtrlInterfaz.habilita(true, txtnombre, JCCordinador, btncancelar, txtcodigolic);
            CtrlInterfaz.habilita(false, btnmodifica, btnelmina);
            CtrlInterfaz.selecciona(txtcodigolic);
            llenaComboProfesores();
        } else {
            System.out.println("Rfc Retornado" + buscaProfesor(null, (String) JCCordinador.getSelectedItem()));
            Licenciatura lic = new Licenciatura(txtcodigolic.getText(), txtnombre.getText(), buscaProfesor(null, (String) JCCordinador.getSelectedItem()));
            System.out.println("Item" + " " + (String) JCCordinador.getSelectedItem());
            ConsultasObjetos.inserta(lic, ConectarBase.conectado(), "licenciatura");
            CtrlInterfaz.habilita(false, txtnombre, JCCordinador, txtcodigolic, btncancelar);
            CtrlInterfaz.habilita(true, btnelmina, btnmodifica);
            //llenaComboCordinadores();
            actualizaTabla();
            edicion();
            btncancelarActionPerformed(null);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnelminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelminaActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar a " + txtnombre.getText()) == 0) {
            ConsultasObjetos.elimina("licenciatura", "id_licenciatura", txtcodigolic.getText(), 0, ConectarBase.conectado());
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

    private void btnmodificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificaActionPerformed
        if (txtcodigolic.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro para editar");
        } else {
            edicion();
            if (edicion) {
                btnmodifica.setText("Aceptar");
                CtrlInterfaz.habilita(true, txtnombre, JCCordinador, btncancelar, txtcodigolic);
                CtrlInterfaz.habilita(false, btnelmina, btnAgregar);
            } else {
                    btnAgregar.setText("Modificar");
                    Licenciatura lic = new Licenciatura(txtcodigolic.getText(),txtnombre.getText(),buscaProfesor(null,(String)JCCordinador.getSelectedItem()));
                    ConsultasObjetos.Modifica(lic, ConectarBase.conectado(), "licenciatura",(String)tablaLicenciatura.getValueAt(tablaLicenciatura.getSelectedRow(),0));
                    CtrlInterfaz.habilita(false, txtnombre, JCCordinador, btncancelar, txtcodigolic);
                    CtrlInterfaz.habilita(true, btnelmina, btnmodifica);
                    actualizaTabla();
                    edicion();
                    btncancelarActionPerformed(null);
            }
        }

    }//GEN-LAST:event_btnmodificaActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void tablaLicenciaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLicenciaturaMouseClicked
        txtcodigolic.setText((String) modelo.getValueAt(tablaLicenciatura.getSelectedRow(), 0));
        txtnombre.setText((String) modelo.getValueAt(tablaLicenciatura.getSelectedRow(), 1));
        JCCordinador.setSelectedIndex(buscarcombo((String) modelo.getValueAt(tablaLicenciatura.getSelectedRow(), 2)));
        System.out.println("retornando " + buscarcombo((String) modelo.getValueAt(tablaLicenciatura.getSelectedRow(), 2)));
    }//GEN-LAST:event_tablaLicenciaturaMouseClicked

    private void txtrfcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrfcKeyPressed
        //enter(this, evt, JCCordinador);
    }//GEN-LAST:event_txtrfcKeyPressed

    private void txtapellidoPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoPKeyPressed
        //enter(this, evt, txtapellidoM);
    }//GEN-LAST:event_txtapellidoPKeyPressed

    private void txtapellidoMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoMKeyPressed
        enter(this, evt, txtnombre);
    }//GEN-LAST:event_txtapellidoMKeyPressed

    private void txtnombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyPressed
        enter(this, evt, JCCordinador);
    }//GEN-LAST:event_txtnombresKeyPressed

    private void txtgradoAcademicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgradoAcademicoKeyPressed
        //enter(this, evt, txtcorreo);
    }//GEN-LAST:event_txtgradoAcademicoKeyPressed

    private void txtcorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyPressed
       // enter(this, evt, txttelefono);
    }//GEN-LAST:event_txtcorreoKeyPressed

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        enter(this, evt, btnAgregar);
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txtcodigolicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigolicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigolicActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar3ActionPerformed

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void txtnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyReleased
        
    }//GEN-LAST:event_txtnombreKeyReleased

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
        enter(this, evt, JCCordinador);
    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtcodigolicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigolicKeyPressed
        enter(this, evt, txtnombre);
    }//GEN-LAST:event_txtcodigolicKeyPressed

    private void txtcodigolicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigolicKeyTyped
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_txtcodigolicKeyTyped

    private void txtnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusLost
        Valida.convertirAMayusculas(txtnombre);
    }//GEN-LAST:event_txtnombreFocusLost

    private void cancelar() {
        edicion();
        CtrlInterfaz.limpia(txtnombre);
        CtrlInterfaz.habilita(false, txtnombre, btncancelar, txtcodigolic,JCCordinador);
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
        modelo = (DefaultTableModel) tablaLicenciatura.getModel();
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
            }
        }
        return null;
    }

    
    public void llenaComboCordinadores() {
        JCCordinador.removeAllItems();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            JCCordinador.addItem((String) tablaLicenciatura.getValueAt(i, 2));
            System.out.println((String) tablaLicenciatura.getValueAt(i, 2));
        }
    }

    public void llenaComboProfesores() {
        JCCordinador.removeAllItems();
        for (int i = 0; i < profes.size(); i++) {
            JCCordinador.addItem(((Profesor) profes.get(i)).getNombres() + " " + ((Profesor) profes.get(i)).getApellidoP());
        }
    }

    public int buscarcombo(String texto) {
        for (int i = 0; i < JCCordinador.getItemCount(); i++) {
            if (texto.equals(JCCordinador.getItemAt(i))) {
                return i;
            }
        }
        return 0;
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
    private javax.swing.JComboBox<String> JCCordinador;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnelmina;
    private javax.swing.JButton btnmodifica;
    private javax.swing.JButton jBCerrarSesion;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JLabel jLTituloUAPT;
    private javax.swing.JLabel jLTituloUniversidad;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaLicenciatura;
    private javax.swing.JTextField txtcodigolic;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import Clases.Valida;
import Controlador.ControladorCoordnadores;
import Objetos.Licenciatura;
import Objetos.Profesor;
import Objetos.Usuario;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mvidalh
 */
public class VentanaCordinadores extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCordinadores
     */
    public VentanaCordinadores() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.setResizable(false);
    }

    private Boolean edicion = true;
    private DefaultTableModel modelo;
    private ArrayList<Object> usuarios = new ArrayList<>();
    private ArrayList<Object> profes = new ArrayList<>();
    private ArrayList<Object> lics = new ArrayList<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLTituloUniversidad = new javax.swing.JLabel();
        jLTituloUAPT = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboRFC = new javax.swing.JComboBox<>();
        JCLicenciatura = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jBRegresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jBCerrarSesion = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();
        btnAgregar2 = new javax.swing.JButton();
        btnAgregar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/UAEMex.jpg"))); // NOI18N

        jLTituloUniversidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLTituloUniversidad.setText("UNIVERSIDAD AUTONOMA DEL ESTADO DE MEXICO");

        jLTituloUAPT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLTituloUAPT.setText("UNIDAD ACADEMICA PROFESIONAL TIANGUISTENCO");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("GESTION DE COORDINADORES");

        jPanel1.setBackground(new java.awt.Color(25, 83, 0));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("ID");

        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Coordinador");

        txtContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseniaFocusLost(evt);
            }
        });
        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });
        txtContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseniaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraseniaKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("CONTRASEÑA");

        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("USUARIO");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("LICENCIATURA");

        ComboRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ComboRFCKeyPressed(evt);
            }
        });

        JCLicenciatura.setEnabled(false);
        JCLicenciatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JCLicenciaturaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(ComboRFC, 0, 238, Short.MAX_VALUE)
                    .addComponent(txtUsuario)
                    .addComponent(txtContrasenia)
                    .addComponent(txtID)
                    .addComponent(JCLicenciatura, 0, 238, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregar.setBackground(new java.awt.Color(102, 102, 0));
        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Aceptar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(102, 102, 0));
        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

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

        btnEliminar.setBackground(new java.awt.Color(102, 102, 0));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jBCerrarSesion.setBackground(new java.awt.Color(102, 102, 0));
        jBCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jBCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha(3).png"))); // NOI18N
        jBCerrarSesion.setText("Salir");
        jBCerrarSesion.setToolTipText("");
        jBCerrarSesion.setActionCommand("Salir");
        jBCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarSesionActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(102, 102, 0));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        TablaUsuarios.setBackground(new java.awt.Color(25, 83, 0));
        TablaUsuarios.setForeground(new java.awt.Color(254, 254, 254));
        TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "RFC", "Usuario", "Contrasenia", "licenciatura"
            }
        ));
        TablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaUsuarios);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBRegresar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(btnAgregar2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jBCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTituloUniversidad)
                            .addComponent(jLTituloUAPT)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTituloUniversidad)
                        .addGap(18, 18, 18)
                        .addComponent(jLTituloUAPT)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jBRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!edicion) {
            edicion();
            btnAgregar.setText("Aceptar");
            CtrlInterfaz.limpia(txtID, txtUsuario, txtContrasenia);
            CtrlInterfaz.habilita(true, txtID, ComboRFC, txtUsuario, txtContrasenia, JCLicenciatura, btnCancelar);
            CtrlInterfaz.habilita(false, btnEliminar, btnModificar, btnAgregar2, btnAgregar3);
            CtrlInterfaz.selecciona(txtID);
        } else {
              
            if (JCLicenciatura.getItemCount() == 0) {
                Mensaje.error(this, "Licenciatura no seleccionada, agregar o seleccionar licenciatura");
            } else {
                Usuario us = new Usuario(txtID.getText(), buscaProfesor(null, ComboRFC.getSelectedItem().toString()), txtUsuario.getText(), txtContrasenia.getText(), buscarLic(null, JCLicenciatura.getSelectedItem().toString()));
                String mensaje = Controlador.ControladorCoordnadores.insertarCoordinador(us);
                if (mensaje.equals("operacion exitosa")) {
                    btnAgregar.setText("Nuevo");
                    CtrlInterfaz.habilita(false, txtID, ComboRFC, txtUsuario, txtContrasenia, JCLicenciatura, btnCancelar);
                    CtrlInterfaz.habilita(true, btnEliminar, btnModificar, btnAgregar2, btnAgregar3);
                    CtrlInterfaz.limpia(txtID, txtContrasenia, txtID, txtUsuario);
                    actualizaTabla();
                    edicion();
                } else {
                    JOptionPane.showMessageDialog(rootPane, mensaje);
                }
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        this.setVisible(false);
        new VentanaAdministrador().setVisible(true);
    }//GEN-LAST:event_jBRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (Mensaje.pregunta(this, "¿Seguro que quieres eliminar al usuario " + txtUsuario.getText() + "?") == 0) {
            String mensaje = ControladorCoordnadores.eliminaUsuario(txtID.getText());
            if (mensaje.equals("operacion exitosa")) {
                actualizaTabla();
            } else {
                JOptionPane.showMessageDialog(rootPane, mensaje);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jBCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarSesionActionPerformed
        this.setVisible(false);
        new VentanaLogin().setVisible(true);
    }//GEN-LAST:event_jBCerrarSesionActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtID.getText().compareTo("") == 0) {
            Mensaje.error(this, "Seleccione un registo a modificar");
        } else {
            if (!edicion) {
                edicion();
                btnModificar.setText("Aceptar");
                CtrlInterfaz.habilita(true, txtUsuario, ComboRFC, txtContrasenia, JCLicenciatura, btnCancelar);
                CtrlInterfaz.habilita(false, btnEliminar, btnAgregar, btnAgregar2, btnAgregar3);
            } else {
                Usuario us = new Usuario(txtID.getText(), buscaProfesor(null, (String) ComboRFC.getSelectedItem()), txtUsuario.getText(), txtContrasenia.getText(), buscarLic(null, JCLicenciatura.getSelectedItem().toString()));
                ConsultasObjetos.Modifica(us, ConectarBase.conectado(), "usuarios", txtID.getText());
                String mensaje = ControladorCoordnadores.modifcaCoordinador(us, (String) TablaUsuarios.getValueAt(TablaUsuarios.getSelectedRow(), 1));
                if (mensaje.equals("operacion exitosa")) {
                    btnModificar.setText("Modificar");
                    CtrlInterfaz.habilita(false, txtID, ComboRFC, txtUsuario, txtContrasenia, JCLicenciatura, btnCancelar);
                    CtrlInterfaz.habilita(true, btnEliminar, btnAgregar, btnAgregar2, btnAgregar3);
                    CtrlInterfaz.limpia(txtID, txtContrasenia, txtID, txtUsuario);
                    actualizaTabla();
                    edicion();
                } else {
                    JOptionPane.showMessageDialog(rootPane, mensaje);
                }
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        Validaciones.enter(this, evt, ComboRFC);
    }//GEN-LAST:event_txtIDKeyPressed

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased

    }//GEN-LAST:event_txtIDKeyReleased

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void txtContraseniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseniaKeyPressed
        Validaciones.enter(this, evt, JCLicenciatura);
    }//GEN-LAST:event_txtContraseniaKeyPressed

    private void txtContraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseniaKeyReleased

    }//GEN-LAST:event_txtContraseniaKeyReleased

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        Validaciones.enter(this, evt, txtContrasenia);
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased

    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cancelar();
        actualizaTabla();
        llenaComboLic();
        llenaComboProfesores();
    }//GEN-LAST:event_formWindowOpened

    private void ComboRFCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ComboRFCKeyPressed
        Validaciones.enter(this, evt, txtUsuario);
    }//GEN-LAST:event_ComboRFCKeyPressed

    private void TablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaUsuariosMouseClicked
        txtID.setText((String) modelo.getValueAt(TablaUsuarios.getSelectedRow(), 0));
        ComboRFC.setSelectedIndex(buscarCombo(((String) modelo.getValueAt(TablaUsuarios.getSelectedRow(), 1))));
        txtUsuario.setText((String) modelo.getValueAt(TablaUsuarios.getSelectedRow(), 2));
        txtContrasenia.setText((String) modelo.getValueAt(TablaUsuarios.getSelectedRow(), 3));
        JCLicenciatura.setSelectedIndex(buscarComboLic((String) modelo.getValueAt(TablaUsuarios.getSelectedRow(), 4)));
    }//GEN-LAST:event_TablaUsuariosMouseClicked

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar3ActionPerformed

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtContraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseniaFocusLost
        //Valida.convertirAMayusculas(txtContrasenia);
    }//GEN-LAST:event_txtContraseniaFocusLost

    private void JCLicenciaturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JCLicenciaturaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCLicenciaturaKeyPressed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        Valida.validaLongitud(txtID, 5, evt);
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        Valida.convertirAMayusculas(txtID);
    }//GEN-LAST:event_txtIDFocusLost

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
            java.util.logging.Logger.getLogger(VentanaCordinadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCordinadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCordinadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCordinadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCordinadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboRFC;
    private javax.swing.JComboBox<String> JCLicenciatura;
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jBCerrarSesion;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JLabel jLTituloUAPT;
    private javax.swing.JLabel jLTituloUniversidad;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public void actualizaTabla() {
        lics = ConsultasObjetos.consultaMuchos("licenciatura", null, null, ConectarBase.conectado());
        profes = ConsultasObjetos.consultaMuchos("profesores", "nivel", "profesor", ConectarBase.conectado());
        modelo = (DefaultTableModel) TablaUsuarios.getModel();
        ArrayList<Object> user = new ArrayList<>();
        user = ConsultasObjetos.consultaMuchos("usuarios", "nivel", "profesor", ConectarBase.conectado());
        if (user.isEmpty()) {
            Mensaje.error(this, "NO SE ENCUENTRAN COORDINADORES REGISTRADOS");
        } else {
            modelo.setRowCount(0);
            for (Object u : user) {
                Usuario us = (Usuario) u;
                modelo.addRow(new Object[]{
                    us.getIdUsuario(), buscaProfesor(us.getRfc(), null), us.getUsuario(), us.getContra(), buscarLic(us.getLicenciatura(), null)
                });
            }
        }
    }

    public void llenaComboProfesores() {
        ComboRFC.removeAllItems();
        for (int i = 0; i < profes.size(); i++) {
            ComboRFC.addItem(((Profesor) profes.get(i)).getNombres() + " " + ((Profesor) profes.get(i)).getApellidoP());
        }
    }

    private void edicion() {
        if (edicion) {
            edicion = false;
        } else {
            edicion = true;
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

    public int buscarCombo(String texto) {
        for (int i = 0; i < ComboRFC.getItemCount(); i++) {
            if (texto.equals(ComboRFC.getItemAt(i))) {
                return i;
            }
        }
        return 0;
    }

    private void cancelar() {
        edicion();
        CtrlInterfaz.limpia(txtID, txtUsuario, txtContrasenia);
        CtrlInterfaz.habilita(false, txtID, ComboRFC, txtUsuario, txtContrasenia, JCLicenciatura, btnCancelar);
        CtrlInterfaz.habilita(true, btnAgregar, btnModificar, btnEliminar, btnAgregar2, btnAgregar3);
        btnAgregar.setText("Nuevo");
        btnModificar.setText("Modificar");
    }

    public void llenaComboLic() {
        JCLicenciatura.removeAllItems();
        System.out.println("Ya entre");
        for (int i = 0; i < lics.size(); i++) {
            JCLicenciatura.addItem(((Licenciatura) lics.get(i)).getLicenciatura());
        }
    }

    public String buscarLic(String id, String licenciatura) {
        if (licenciatura != null) {
            for (Object l : lics) {
                Licenciatura lic = (Licenciatura) l;
                if ((lic.getLicenciatura()).equals(licenciatura)) {
                    return lic.getIdLicenciatura();
                }
            }
        } else if (id != null){        
            for (Object l : lics) {
                Licenciatura lic = (Licenciatura) l;
                if (lic.getIdLicenciatura().equals(id)) {
                    return lic.getLicenciatura();
                }
            }
        }
        return null;
    }

    private int buscarComboLic(String texto) {
        for (int i = 0; i < JCLicenciatura.getItemCount(); i++) {
            if (texto.equals(JCLicenciatura.getItemAt((i)))) {
                return i;
            }
        }
        return 0;
    }

}

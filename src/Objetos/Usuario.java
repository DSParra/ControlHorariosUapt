/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Usuario {
    private String idUsuario;
    private String rfc;
    private String usuario;
    private String contra;
    private String licenciatura;
    private int nivel;
    
    private PreparedStatement ps;
    private ResultSet rs;

    

    
//    public void inserta(Object obj, Connection con) {
//       Usuarios emp =(Usuarios)obj;
//        try{
//            ps=con.prepareStatement("INSERT INTO usuarios(id_usuario,id_empleado,correo,password,tipo_usuario,fecha_alta) VALUES (?,?,?,?,?,?)");//por seguridad
//            ps.setInt(1, emp.getId_usuario());
//            ps.setInt(2, emp.getId_empleado());
//            ps.setString(3,emp.getCorreo());
//            ps.setString(4, emp.getPassword());
//            ps.setString(5, emp.getTipo_usuario());
//            ps.setDate(6, (java.sql.Date) emp.getFecha_alta());  // agregar un registro
//            
//            
//            int res=ps.executeUpdate();
//            
//            if (res>0) {
//                JOptionPane.showMessageDialog(null, "Se registro exitosamente");
//            }else{
//                JOptionPane.showMessageDialog(null, "ERROR");
//            }            
//        }catch(Exception e){
//            System.out.println(e.toString());
//        }        
//    }
//    
//    

//    
//    

    public Usuario() {
    }

    public Usuario(String idUsuario, String rfc, String usuario, String contra, String licenciatura) {
        this.idUsuario = idUsuario;
        this.rfc = rfc;
        this.usuario = usuario;
        this.contra = contra;
        this.licenciatura = licenciatura;
    }

   

    /**
     * @return the idUsuario
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contra
     */
    public String getContra() {
        return contra;
    }

    /**
     * @param contra the contra to set
     */
    public void setContra(String contra) {
        this.contra = contra;
    }

    /**
     * @return the preguntaSeguridad
     */
    public String getLicenciatura() {
        return licenciatura;
    }

    /**
     * @param preguntaSeguridad the preguntaSeguridad to set
     */
    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }



    /**
     * @return the ps
     */
    public PreparedStatement getPs() {
        return ps;
    }

    /**
     * @param ps the ps to set
     */
    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }
    
    
}

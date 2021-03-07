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
    private int idUsuario;
    private String rfc;
    private String usuario;
    private String contra;
    private String preguntaSeguridad;
    private String respuestaSeguridad;
    
    private PreparedStatement ps;
    private ResultSet rs;

    public Usuario() {
    }

    public Usuario(int idUsuario, String rfc, String usuario, String contra, String preguntaSeguridad, String respuestaSeguridad) {
        this.idUsuario = idUsuario;
        this.rfc = rfc;
        this.usuario = usuario;
        this.contra = contra;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
    }

    
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
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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
    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    /**
     * @param preguntaSeguridad the preguntaSeguridad to set
     */
    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    /**
     * @return the respuestaSeguridad
     */
    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    /**
     * @param respuestaSeguridad the respuestaSeguridad to set
     */
    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
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

    /**
     * @return the rs
     */
    public ResultSet getRs() {
        return rs;
    }

    /**
     * @param rs the rs to set
     */
    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
    
}

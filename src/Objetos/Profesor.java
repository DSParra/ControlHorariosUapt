/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Profesor {

    private String rfc;
    private String apellidoP;
    private String apellidoM;
    private String nombres;
    private String gradoAcademico;
    private String correo;
    private String telefono;

    PreparedStatement ps;
    ResultSet rs;

    public Profesor(String rfc, String apellidoP, String apellidoM, String nombres, String gradoAcademico, String correo, String telefono) {
        this.rfc = rfc;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.nombres = nombres;
        this.gradoAcademico = gradoAcademico;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Profesor() {
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
     * @return the apellidoP
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     * @param apellidoP the apellidoP to set
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    /**
     * @return the apellidoM
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     * @param apellidoM the apellidoM to set
     */
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the gradoAcademico
     */
    public String getGradoAcademico() {
        return gradoAcademico;
    }

    /**
     * @param gradoAcademico the gradoAcademico to set
     */
    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
//    public void elimina(int id, Connection con) {
//     try{
//            //con = Conexiones.conectar();
//            ps = con.prepareStatement("DELETE FROM usuarios WHERE id=?"); //Eliminar
//            ps.setInt(1,id);
//            int res=ps.executeUpdate();
//            
//            if (res>0) {
//                JOptionPane.showMessageDialog(null, "Se elimino exitosamente");
//            }else{
//                JOptionPane.showMessageDialog(null, "ERROR");
//            }                     
//        }catch(Exception e){
//            System.out.println(e.toString());
//        }   
//    }
//    
//    
}

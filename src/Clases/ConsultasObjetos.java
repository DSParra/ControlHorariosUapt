/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Objetos.Profesor;
import Objetos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JParra
 */
public class ConsultasObjetos {

    public static PreparedStatement ps;
    public static ResultSet rs;

    public static Object consultaUnica(String tabla, String campo, String valor, Connection con) {
        try {
            if (campo == null) {
                ps = con.prepareStatement("SELECT * FROM " + tabla); //traer un dato
            } else {
                ps = con.prepareStatement("SELECT * FROM " + tabla + " WHERE " + campo + " = ?"); //traer un dato
                ps.setString(1, valor);
            }
            switch (tabla) {
                case "usuarios":
                    Usuario usuario = null;
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        usuario = new Usuario();
                        usuario.setIdUsuario(rs.getInt("id_usuario"));
                        usuario.setUsuario(rs.getString("usuario"));
                        usuario.setContra(rs.getString("contrasenia"));
                        usuario.setPreguntaSeguridad(rs.getString("pregunta_seguridad"));
                        usuario.setRespuestaSeguridad(rs.getString("respuesta_seguridad"));
                        usuario.setRfc(rs.getString("rfc"));
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el usuario");
                    }
                    return usuario;
                case "profesores":
                    Profesor profe = null;
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        profe = new Profesor();
                        profe.setRfc(rs.getString("rfc"));
                        profe.setNombres(rs.getString("nombres"));
                        profe.setApellidoP(rs.getString("apellido_paterno"));
                        profe.setApellidoM(rs.getString("apellido_materno"));
                        profe.setGradoAcademico(rs.getString("grado_academico"));
                        profe.setCorreo(rs.getString("correo"));
                        profe.setTelefono(rs.getString("telefono"));
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el profesor");
                    }
                    return profe;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public static void inserta(Object obj, Connection con, String tabla) {
        try {
            int res = -1;
            switch (tabla) {
                case "usuario":
                    Usuario emp = (Usuario) obj;
                    ps = con.prepareStatement("INSERT INTO usuarios(id_usuario,rfc,usuario,pregunta_seguridad,respuesta_seguridad,) VALUES (?,?,?,?,?)");//por seguridad
                    ps.setInt(1, emp.getIdUsuario());
                    ps.setString(2, emp.getRfc());
                    ps.setString(3, emp.getUsuario());
                    ps.setString(4, emp.getPreguntaSeguridad());
                    ps.setString(5, emp.getRespuestaSeguridad());
                    //ps.setDate(6, (java.sql.Date) emp.getFecha_alta());  // agregar un registro
                    res = ps.executeUpdate();
                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Se registro exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR");
                    }
                    break;
                case "profesor":
                    Profesor prof = (Profesor) obj;
                    ps = con.prepareStatement("INSERT INTO profesores(rfc,apellido_paterno,apellido_materno,nombres,grado_academico,correo,telefono) VALUES (?,?,?,?,?,?,?)");//por seguridad
                    ps.setString(1, prof.getRfc());
                    ps.setString(2, prof.getApellidoP());
                    ps.setString(3, prof.getApellidoM());
                    ps.setString(4, prof.getNombres());
                    ps.setString(5, prof.getGradoAcademico());
                    ps.setString(6, prof.getCorreo());
                    ps.setString(7, prof.getTelefono());
                    res = ps.executeUpdate();
                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Se registro exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR");
                    }
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static ArrayList<Object> consultaMuchos(String tabla, String campo, String valor, Connection con) {
        try {
            if (campo == null) {
                ps = con.prepareStatement("SELECT * FROM " + tabla); //traer un dato
            } else {
                ps = con.prepareStatement("SELECT * FROM " + tabla + " WHERE " + campo + " = ?"); //traer un dato
                ps.setString(1, valor);
            }

            ArrayList<Object> objetos = new ArrayList();

            switch (tabla) {
                case "usuarios":

                    rs = ps.executeQuery();
                    if (rs.next()) {
                        do {
                            Usuario usuario = new Usuario();
                            System.out.println(usuario.getUsuario());
                            usuario.setIdUsuario(rs.getInt("id_usuario"));
                            usuario.setUsuario(rs.getString("usuario"));
                            usuario.setContra(rs.getString("contrasenia"));
                            usuario.setPreguntaSeguridad(rs.getString("pregunta_seguridad"));
                            usuario.setRespuestaSeguridad(rs.getString("respuesta_seguridad"));
                            usuario.setRfc(rs.getString("rfc"));
                            objetos.add(usuario);
                        } while (rs.next());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el usuario");
                    }
                    return objetos;
                case "profesores":
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        do {
                            Profesor profe = new Profesor();
                            profe.setRfc(rs.getString("rfc"));
                            profe.setNombres(rs.getString("nombres"));
                            profe.setApellidoP(rs.getString("apellido_paterno"));
                            profe.setApellidoM(rs.getString("apellido_materno"));
                            profe.setGradoAcademico(rs.getString("grado_academico"));
                            profe.setCorreo(rs.getString("correo"));
                            profe.setTelefono(rs.getString("telefono"));
                            objetos.add(profe);
                        } while (rs.next());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el profesor");
                    }
                    return objetos;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public static void elimina(String tabla, String campo, String id2, int id, Connection con) {
        try {
            if (id2 == null) {
                ps = con.prepareStatement("DELETE FROM " + tabla + " WHERE " + campo + " = ?");
                ps.setInt(1, id);
            } else {
                ps = con.prepareStatement("DELETE FROM " + tabla + " WHERE " + campo + " = ?");
                ps.setString(1, id2);
            }
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se elimino exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public static void Modifica(Object obj, Connection con,String tabla) {
        try {
            int res = -1;
            switch (tabla) {
                case "usuario":
                    Usuario emp = (Usuario) obj;
                    ps = con.prepareStatement("UPDATE "+tabla+" SET apellido_paterno=?,apellido_materno=?,nombres=?,grado_academico=?,correo=?,telefono=?  WHERE rfc =?");//por seguridad
                    ps.setInt(1, emp.getIdUsuario());
                    ps.setString(2, emp.getRfc());
                    ps.setString(3, emp.getUsuario());
                    ps.setString(4, emp.getPreguntaSeguridad());
                    ps.setString(5, emp.getRespuestaSeguridad());
                    
                    res = ps.executeUpdate();
                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Se Modifico exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR");
                    }
                    break;
                case "profesores":
                    Profesor prof = (Profesor) obj;
                    ps = con.prepareStatement("UPDATE "+tabla+" SET apellido_paterno=?,apellido_materno=?,nombres=?,grado_academico=?,correo=?,telefono=?  WHERE rfc =?");
                    ps.setString(1, prof.getApellidoP());
                    ps.setString(2, prof.getApellidoM());
                    ps.setString(3, prof.getNombres());
                    ps.setString(4, prof.getGradoAcademico());
                    ps.setString(5, prof.getCorreo());
                    ps.setString(6, prof.getTelefono());
                    ps.setString(7, prof.getRfc());
                    res = ps.executeUpdate();
                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Se Modifico exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR");
                    }
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    
}
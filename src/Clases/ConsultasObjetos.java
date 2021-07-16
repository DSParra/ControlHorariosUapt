/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Objetos.Grupo;
import Objetos.HorarioSalida;
import Objetos.Licenciatura;
import Objetos.Materia;
import Objetos.PeriodoHorarios;
import Objetos.PlanEstudios;
import Objetos.Profesor;
import Objetos.Usuario;
import Objetos.periodoEscolar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JParra
 */
public class ConsultasObjetos {

    public static PreparedStatement ps;
    public static ResultSet rs;
    public static Statement sentencia;
    public static String nivel = "";

    public static String obtieneIDLic(String usuario, Connection con) {
        try
        {
            String sql = "SELECT * FROM usuarios WHERE usuario='" + usuario + "'";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            String id = "";
            if (rs.next())
            {
                System.out.println("id_lic " + rs.getString("id_licenciatura"));
                return rs.getString("id_licenciatura");
            } else
            {
                System.out.println("no se encontro lic");
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(ConsultasObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static String validaEntrar(String usuario, String contrasenia, Connection con) {
        String sql = "SELECT * FROM usuarios WHERE usuario='" + usuario + "'";

        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            String niv = "";
            String pass = "", nombr_us = "";

            if (rs.next())
            {
                nombr_us = rs.getString("usuario");
                pass = rs.getString("Contrasenia");
                niv = rs.getString("nivel");

                if (contrasenia.equals(pass))
                {
                    System.out.println("datos correctos");
                    nivel = niv;
                    if (nivel.equals("usuario"))
                    {
                        return "usuario";
                    } else if (nivel.equals("profesor"))
                    {
                        return "profesor";
                    }
                } else
                {
                    System.out.println("Contrasenia incorrecta");
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
        } catch (Exception e)
        {
        }
        return "";
    }

    public static Object consultaUnicaHorario(String tabla, String campo, int valor, Connection con) throws SQLException {
        if (campo == null)
        {
            ps = con.prepareStatement("SELECT * FROM " + tabla); //traer un dato
        } else
        {
            ps = con.prepareStatement("SELECT * FROM " + tabla + " WHERE " + campo + " = ?"); //traer un dato
            ps.setInt(1, valor);
        }

        PeriodoHorarios horario = null;
        rs = ps.executeQuery();
        if (rs.next())
        {
            horario = new PeriodoHorarios();
            horario.setIdHorario(rs.getInt("id_horario"));
            horario.setClaveMateria(rs.getString("clave_materia"));
            horario.setIdGrupo(rs.getString("id_grupo"));
            horario.setIdPeriodo(rs.getString("id_periodo"));
            horario.setRfc(rs.getString("rfc"));
            horario.setDia(rs.getString("dia"));
            horario.setEntrada(rs.getString("hr_entrada"));
            horario.setSalida(rs.getString("hr_salida"));
        } else
        {
            System.out.println("No se encontro el horario");
        }
        return horario;

    }

    public static Object consultaUnica(String tabla, String campo, String valor, Connection con) {
        try
        {
            if (campo == null)
            {
                ps = con.prepareStatement("SELECT * FROM " + tabla); //traer un dato
            } else
            {
                ps = con.prepareStatement("SELECT * FROM " + tabla + " WHERE " + campo + " = ?"); //traer un dato
                ps.setString(1, valor);
            }
            switch (tabla)
            {
                case "usuarios":
                    Usuario usuario = null;
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        usuario = new Usuario();
                        usuario.setIdUsuario(rs.getString("id_usuario"));
                        usuario.setUsuario(rs.getString("usuario"));
                        usuario.setContra(rs.getString("contrasenia"));
                        usuario.setLicenciatura(rs.getString("id_licenciatura"));
                        usuario.setRfc(rs.getString("rfc"));
                    } else
                    {
                        System.out.println("No se encontro el usuario");
                        //JOptionPane.showMessageDialog(null, "No se encontro el usuario");
                    }
                    ConectarBase.desconectaBD();
                    return usuario;
                case "profesores":
                    Profesor profe = null;
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        profe = new Profesor();
                        profe.setRfc(rs.getString("rfc"));
                        profe.setNombres(rs.getString("nombres"));
                        profe.setApellidoP(rs.getString("apellido_paterno"));
                        profe.setApellidoM(rs.getString("apellido_materno"));
                        profe.setGradoAcademico(rs.getString("grado_academico"));
                        profe.setCorreo(rs.getString("correo"));
                        profe.setTelefono(rs.getString("telefono"));
                    } else
                    {
                        System.out.println("No se encontro el usuario");
                    }
                    ConectarBase.desconectaBD();
                    return profe;
                case "licenciatura":
                    Licenciatura licen = null;
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        licen = new Licenciatura();
                        licen.setIdLicenciatura(rs.getString("id_licenciatura"));
                        licen.setLicenciatura(rs.getString("nombre"));
                    } else
                    {
                        System.out.println("No se encontro el usuario");
                    }
                    return licen;
                case "plan_estudios":
                    PlanEstudios plan = null;
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        plan = new PlanEstudios();
                        plan.setIdPlan(rs.getString("id_plan_estudios"));
                        plan.setPlanEstudios(rs.getString("plan_estudios"));
                        plan.setClaveCarrera(rs.getString("id_licenciatura"));
                    } else
                    {
                        System.out.println("No se encontro el plan de estudios");
                    }
                    return plan;
                case "periodo_escolar":
                    periodoEscolar periodo = null;
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        periodo = new periodoEscolar();
                        periodo.setId_periodo(rs.getString("id_periodo"));
                        periodo.setPeriodo(rs.getString("periodo"));
                    } else
                    {
                        System.out.println("No se encontro el periodo");
                    }
                    ConectarBase.desconectaBD();
                    return periodo;
                case "materia":
                    Materia materia = null;
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        materia = new Materia();
                        materia.setClaveMateria(rs.getString("clave_materia"));
                        materia.setUnidadAprendizaje(rs.getString("unidad_aprendizaje"));
                        materia.setHoras(rs.getInt("horas"));
                        materia.setCreditos(rs.getInt("creditos"));
                        materia.setNumeroPeriodo(rs.getInt("numero_periodo"));
                        materia.setNucleo(rs.getString("nucleo"));
                        materia.setTipo(rs.getString("tipo"));
                        materia.setClaveCarrera(rs.getString("id_licenciatura"));
                        materia.setPlanEstudios(rs.getString("id_plan_estudios"));
                    } else
                    {
                        System.out.println("No se encontro la materia");
                    }
                    ConectarBase.desconectaBD();
                    return materia;
                case "grupo":
                    Grupo grupo = null;
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        grupo = new Grupo();
                        grupo.setIdGrupo(rs.getString("id_grupo"));
                        grupo.setNombreGrupo(rs.getString("nombre_grupo"));
                        grupo.setId_licenciatura(rs.getString("id_licenciatura"));
                    } else
                    {
                        System.out.println("No se encontro el grupo");
                    }
                    ConectarBase.desconectaBD();
                    return grupo;
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
        return null;
    }

    public static boolean inserta(Object obj, Connection con, String tabla) {
        try
        {
            int res = -1;
            switch (tabla)
            {
                case "usuarios":
                    Usuario emp = (Usuario) obj;
                    ps = con.prepareStatement("INSERT INTO usuarios(id_usuario,rfc,usuario, contrasenia,id_licenciatura) VALUES (?,?,?,?,?)");//por seguridad
                    ps.setString(1, emp.getIdUsuario());
                    ps.setString(2, emp.getRfc());
                    ps.setString(3, emp.getUsuario());
                    ps.setString(4, emp.getContra());
                    ps.setString(5, emp.getLicenciatura());
                    //ps.setDate(6, (java.sql.Date) emp.getFecha_alta());  // agregar un registro
                    res = ps.executeUpdate();

                    break;
                case "profesores":
                    Profesor prof = (Profesor) obj;
                    ps = con.prepareStatement("INSERT INTO profesores(rfc,apellido_paterno,apellido_materno,nombres,grado_academico,correo,telefono) VALUES (?,?,?,?,?,?,?)");
                    ps.setString(1, prof.getRfc());
                    ps.setString(2, prof.getApellidoP());
                    ps.setString(3, prof.getApellidoM());
                    ps.setString(4, prof.getNombres());
                    ps.setString(5, prof.getGradoAcademico());
                    ps.setString(6, prof.getCorreo());
                    ps.setString(7, prof.getTelefono());
                    res = ps.executeUpdate();
                    break;
                case "licenciatura":
                    Licenciatura licen = (Licenciatura) obj;
                    ps = con.prepareStatement("INSERT INTO licenciatura(id_licenciatura,nombre) VALUES (?,?)");
                    ps.setString(1, licen.getIdLicenciatura());
                    ps.setString(2, licen.getLicenciatura());
                    res = ps.executeUpdate();
                    break;
                case "periodo_escolar":
                    periodoEscolar periodo = (periodoEscolar) obj;
                    ps = con.prepareStatement("INSERT INTO periodo_escolar(id_periodo, periodo) VALUES (?,?)");
                    ps.setString(1, periodo.getId_periodo());
                    ps.setString(2, periodo.getPeriodo());
                    res = ps.executeUpdate();
                    break;
                case "plan_estudios":
                    PlanEstudios plan = (PlanEstudios) obj;
                    ps = con.prepareStatement("INSERT INTO plan_estudios(id_plan_estudios, plan_estudios, id_licenciatura) VALUES (?,?,?)");
                    ps.setString(1, plan.getIdPlan());
                    ps.setString(2, plan.getPlanEstudios());
                    ps.setString(3, plan.getClaveCarrera());
                    res = ps.executeUpdate();
                    break;
                case "materia":
                    Materia mat = (Materia) obj;
                    ps = con.prepareStatement("INSERT INTO materia(clave_materia, unidad_aprendizaje, horas, creditos, numero_periodo, nucleo, tipo, id_licenciatura, id_plan_estudios) VALUES (?,?,?,?,?,?,?,?,?)");
                    ps.setString(1, mat.getClaveMateria());
                    ps.setString(2, mat.getUnidadAprendizaje());
                    ps.setInt(3, mat.getHoras());
                    ps.setInt(4, mat.getCreditos());
                    ps.setInt(5, mat.getNumeroPeriodo());
                    ps.setString(6, mat.getNucleo());
                    ps.setString(7, mat.getTipo());
                    ps.setString(8, mat.getClaveCarrera());
                    ps.setString(9, mat.getPlanEstudios());
                    res = ps.executeUpdate();
                    break;
                case "grupo":
                    Grupo gr = (Grupo) obj;
                    ps = con.prepareStatement("INSERT INTO grupo(id_grupo, nombre_grupo, id_licenciatura) VALUES (?,?,?)");
                    ps.setString(1, gr.getIdGrupo());
                    ps.setString(2, gr.getNombreGrupo());
                    ps.setString(3, gr.getId_licenciatura());
                    res = ps.executeUpdate();
                    break;
                case "horarios":
                    PeriodoHorarios hr = (PeriodoHorarios) obj;
                    ps = con.prepareStatement("INSERT INTO horarios(id_horario, clave_materia, id_grupo, id_periodo, rfc, dia, hr_entrada, hr_salida) VALUES (?,?,?,?,?,?,?,?)");
                    ps.setInt(1, hr.getIdHorario());
                    ps.setString(2, hr.getClaveMateria());
                    ps.setString(3, hr.getIdGrupo());
                    ps.setString(4, hr.getIdPeriodo());
                    ps.setString(5, hr.getRfc());
                    ps.setString(6, hr.getDia());
                    ps.setString(7, hr.getEntrada());
                    ps.setString(8, hr.getSalida());
                    ps.executeUpdate();
                    break;
            }
            return (res > 0) ? true : false;

//            if (res > 0) {
//                return true;
//                //JOptionPane.showMessageDialog(null, "Se registro exitosamente");
//            } else {
//                return false;
//                //JOptionPane.showMessageDialog(null, "ERROR");
//            }
        } catch (Exception e)
        {
            System.out.println("ConsultaObjetos: error al hacer la insercion" + e);
            //JOptionPane.showMessageDialog(null, "Error al hacer la insercion");
            System.out.println(e.toString());
            return false;
        }
    }

    public static ArrayList<Object> consultaMuchos(String tabla, String campo, String valor, String campo2, String valor2, String valorOrden, Connection con) {
        try
        {
            if (campo == null)
            {
                ps = con.prepareStatement("SELECT * FROM " + tabla + " ORDER BY " + valorOrden + " ASC"); //traer un dato
            } else if (campo != null && campo2 == null)
            {
                //ps = con.prepareStatement("SELECT * FROM " + tabla + " WHERE " + campo + "=?" + " ORDER BY "+ valorOrden + " ASC"); //traer un dato
                ps = con.prepareStatement("SELECT * FROM " + tabla + " WHERE " + campo + " LIKE '%" + valor + "%' ORDER BY " + valorOrden + " ASC"); //traer un dato
                //ps.setString(1, valor);
            } else
            {
                ps = con.prepareStatement("SELECT * FROM " + tabla + " WHERE " + campo + "=? AND " + campo2 + "=?" + " ORDER BY " + valorOrden + " ASC"); //traer un dato
                ps.setString(1, valor);
                ps.setString(2, valor2);
            }

            ArrayList<Object> objetos = new ArrayList();

            switch (tabla)
            {
                case "usuarios":

                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            Usuario usuario = new Usuario();
                            System.out.println(usuario.getUsuario());
                            usuario.setIdUsuario(rs.getString("id_usuario"));
                            usuario.setRfc(rs.getString("rfc"));
                            usuario.setUsuario(rs.getString("usuario"));
                            usuario.setContra(rs.getString("contrasenia"));
                            usuario.setLicenciatura(rs.getString("id_licenciatura"));
                            objetos.add(usuario);
                        } while (rs.next());
                    } else
                    {
                        //JOptionPane.showMessageDialog(null, "No se encontro el usuario");
                    }
                    ConectarBase.desconectaBD();
                    return objetos;
                case "profesores":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
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
                    } else
                    {
                        //JOptionPane.showMessageDialog(null, "No se encontro el profesor");
                    }
                    ConectarBase.desconectaBD();
                    return objetos;
                case "licenciatura":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            Licenciatura licen = new Licenciatura();
                            licen.setIdLicenciatura(rs.getString("id_licenciatura"));
                            licen.setLicenciatura(rs.getString("nombre"));
                            objetos.add(licen);
                        } while (rs.next());
                    } else
                    {
                        //JOptionPane.showMessageDialog(null, "No se encontro la licenciatura");
                    }
                    ConectarBase.desconectaBD();
                    return objetos;
                case "periodo_escolar":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            periodoEscolar perio = new periodoEscolar();
                            perio.setId_periodo(rs.getString("id_periodo"));
                            perio.setPeriodo(rs.getString("periodo"));
                            objetos.add(perio);
                        } while (rs.next());
                    } else
                    {
                        //JOptionPane.showMessageDialog(null, "No se encontraron periodos");
                    }
                    ConectarBase.desconectaBD();
                    return objetos;
                case "plan_estudios":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            PlanEstudios plan = new PlanEstudios();
                            plan.setIdPlan(rs.getString("id_plan_estudios"));
                            plan.setPlanEstudios(rs.getString("plan_estudios"));
                            plan.setClaveCarrera(rs.getString("id_licenciatura"));
                            objetos.add(plan);
                        } while (rs.next());
                    }
                    ConectarBase.desconectaBD();
                    return objetos;
                case "grupo":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            Grupo gr = new Grupo();
                            gr.setIdGrupo(rs.getString("id_grupo"));
                            gr.setNombreGrupo(rs.getString("nombre_grupo"));
                            gr.setId_licenciatura(rs.getString("id_licenciatura"));
                            objetos.add(gr);
                        } while (rs.next());
                    }
                    ConectarBase.desconectaBD();
                    return objetos;
                case "materia":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            Materia mat = new Materia();
                            mat.setClaveMateria(rs.getString("clave_materia"));
                            mat.setUnidadAprendizaje(rs.getString("unidad_aprendizaje"));
                            mat.setHoras(rs.getInt("horas"));
                            mat.setCreditos(rs.getInt("creditos"));
                            mat.setNumeroPeriodo(rs.getInt("numero_periodo"));
                            mat.setNucleo(rs.getString("nucleo"));
                            mat.setTipo(rs.getString("tipo"));
                            mat.setClaveCarrera(rs.getString("id_licenciatura"));
                            mat.setPlanEstudios(rs.getString("id_plan_estudios"));
                            objetos.add(mat);
                        } while (rs.next());
                    }
                    ConectarBase.desconectaBD();
                    return objetos;
                case "horarios":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            PeriodoHorarios hr = new PeriodoHorarios();
                            hr.setIdHorario(rs.getInt("id_horario"));
                            hr.setClaveMateria(rs.getString("clave_materia"));
                            hr.setIdGrupo(rs.getString("id_grupo"));
                            hr.setIdPeriodo(rs.getString("id_periodo"));
                            hr.setRfc(rs.getString("rfc"));
                            hr.setDia(rs.getString("dia"));
                            hr.setEntrada(rs.getString("hr_entrada"));
                            hr.setSalida(rs.getString("hr_salida"));
                            objetos.add(hr);
                        } while (rs.next());
                    }
                    ConectarBase.desconectaBD();
                    return objetos;
                case "horariosSalida":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            HorarioSalida hr = new HorarioSalida();
                            hr.setId_horario(rs.getString("id_horario"));
                            hr.setUnidad_aprendizaje(rs.getString("clave_materia"));
                            hr.setNombre_grupo(rs.getString("id_grupo"));
                            hr.setPeriodo(rs.getString("id_periodo"));
                            hr.setProfesor(rs.getString("rfc"));
                            hr.setDia(rs.getString("dia"));
                            hr.setHr_entrada(rs.getString("hr_entrada"));
                            hr.setHr_salida(rs.getString("hr_salida"));
                            objetos.add(hr);
                        } while (rs.next());
                    }
                    ConectarBase.desconectaBD();
                    return objetos;
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
        return null;
    }

    public static boolean elimina(String tabla, String campo, String id2, int id, Connection con) {
        try
        {
            if (campo == null)
            {
                ps = con.prepareStatement("DELETE FROM " + tabla);
            }
            else if (id2 == null)
            {
                ps = con.prepareStatement("DELETE FROM " + tabla + " WHERE " + campo + " = ?");
                ps.setInt(1, id);
            } else
            {
                ps = con.prepareStatement("DELETE FROM " + tabla + " WHERE " + campo + " = ?");
                ps.setString(1, id2);
            }
            int res = ps.executeUpdate();
            return (res > 0) ? true : false;
        } catch (Exception e)
        {
            System.out.println("Aqui imprime " + e.toString());
        }
        return false;
    }

    public static boolean ModificaHorario(Object obj, Connection con, String tabla, int id) {
        try
        {
            int res = -1;
            PeriodoHorarios hr = (PeriodoHorarios) obj;
            ps = con.prepareStatement("UPDATE " + tabla + " SET clave_materia = ?, id_grupo = ?, id_periodo = ?, rfc = ?, dia = ?, hr_entrada =?, hr_salida = ? WHERE id_horario=?");
            ps.setString(1, hr.getClaveMateria());
            ps.setString(2, hr.getIdGrupo());
            ps.setString(3, hr.getIdPeriodo());
            ps.setString(4, hr.getRfc());
            ps.setString(5, hr.getDia());
            ps.setString(6, hr.getEntrada());
            ps.setString(7, hr.getSalida());
            ps.setInt(8, id);
            res = ps.executeUpdate();
        } catch (SQLException ex)
        {
            Logger.getLogger(ConsultasObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean Modifica(Object obj, Connection con, String tabla, String id) {
        try
        {
            int res = -1;
            switch (tabla)
            {
                case "usuarios":
                    Usuario emp = (Usuario) obj;
                    ps = con.prepareStatement("UPDATE " + tabla + " SET  rfc=?,usuario=?,contrasenia=?, id_licenciatura=? WHERE id_usuario =?");//por seguridad
                    ps.setString(1, emp.getRfc());
                    ps.setString(2, emp.getUsuario());
                    ps.setString(3, emp.getContra());
                    ps.setString(4, emp.getLicenciatura());
                    ps.setString(5, emp.getIdUsuario());
                    res = ps.executeUpdate();
                    break;
                case "profesores":
                    Profesor prof = (Profesor) obj;
                    ps = con.prepareStatement("UPDATE " + tabla + " SET apellido_paterno=?,apellido_materno=?,nombres=?,grado_academico=?,correo=?,telefono=?  WHERE rfc =?");
                    ps.setString(1, prof.getApellidoP());
                    ps.setString(2, prof.getApellidoM());
                    ps.setString(3, prof.getNombres());
                    ps.setString(4, prof.getGradoAcademico());
                    ps.setString(5, prof.getCorreo());
                    ps.setString(6, prof.getTelefono());
                    ps.setString(7, id);
                    res = ps.executeUpdate();
                    break;
                case "licenciatura":
                    Licenciatura lic = (Licenciatura) obj;
                    ps = con.prepareStatement("UPDATE " + tabla + " SET nombre=? WHERE id_licenciatura=?");
                    //System.out.println("Update" + tabla + "id_licenciatura ="+ lic.getIdLicenciatura() "nombre = "+ lic.getRfcCordinador() + "where id_licenciatura = "+id.);
                    ps.setString(1, lic.getLicenciatura());
                    ps.setString(2, id);
                    res = ps.executeUpdate();
                    break;
                case "periodo_escolar":
                    periodoEscolar periodo = (periodoEscolar) obj;
                    ps = con.prepareStatement("UPDATE " + tabla + " SET periodo=? WHERE id_periodo=?");
                    //System.out.println("Update" + tabla + "id_licenciatura ="+ lic.getIdLicenciatura() "nombre = "+ lic.getRfcCordinador() + "where id_licenciatura = "+id.);
                    ps.setString(1, periodo.getPeriodo());
                    ps.setString(2, id);
                    res = ps.executeUpdate();
                    break;
                case "plan_estudios":
                    PlanEstudios plan = (PlanEstudios) obj;
                    ps = con.prepareStatement("UPDATE " + tabla + " SET plan_estudios =?, id_licenciatura=? WHERE id_plan_estudios=?");
                    //ps.setInt(1, plan.getIdPlan());
                    ps.setString(1, plan.getPlanEstudios());
                    ps.setString(2, plan.getClaveCarrera());
                    ps.setString(3, id);
                    res = ps.executeUpdate();
                    break;
                case "materia":
                    Materia mat = (Materia) obj;
                    ps = con.prepareStatement("UPDATE " + tabla + " SET unidad_aprendizaje =?, horas =?, creditos =?, numero_periodo =?, nucleo =?, tipo =?, id_licenciatura =?, id_plan_estudios =? WHERE clave_materia=?");
                    ps.setString(1, mat.getUnidadAprendizaje());
                    ps.setInt(2, mat.getHoras());
                    ps.setInt(3, mat.getCreditos());
                    ps.setInt(4, mat.getNumeroPeriodo());
                    ps.setString(5, mat.getNucleo());
                    ps.setString(6, mat.getTipo());
                    ps.setString(7, mat.getClaveCarrera());
                    ps.setString(8, mat.getPlanEstudios());
                    ps.setString(9, id);
                    res = ps.executeUpdate();
                    break;
                case "grupo":
                    Grupo gr = (Grupo) obj;
                    ps = con.prepareStatement("UPDATE " + tabla + " SET nombre_grupo =?, id_licenciatura =? WHERE id_grupo=?");
                    ps.setString(1, gr.getNombreGrupo());
                    ps.setString(2, gr.getId_licenciatura());
                    ps.setString(3, id);
                    res = ps.executeUpdate();
                    break;
                case "horarios":
                    PeriodoHorarios hr = (PeriodoHorarios) obj;
                    ps = con.prepareStatement("UPDATE " + tabla + " SET clave_materia = ?, id_grupo = ?, id_periodo = ?, rfc = ?, dia = ?, hr_entrada =?, hr_salida = ? WHERE id_horario=?");
                    ps.setString(1, hr.getClaveMateria());
                    ps.setString(2, hr.getIdGrupo());
                    ps.setString(3, hr.getIdPeriodo());
                    ps.setString(4, hr.getRfc());
                    ps.setString(5, hr.getDia());
                    ps.setString(6, hr.getEntrada());
                    ps.setString(7, hr.getSalida());
                    ps.setString(8, id);
                    res = ps.executeUpdate();
                    break;
            }
            return (res > 0) ? true : false;
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
        return false;
    }

    public static ArrayList<String> llenaCombo(String tabla, String campo, Connection con) {
        ArrayList<String> lista = new ArrayList<String>();

        try
        {
            String consulta = "SELECT * FROM " + tabla;

            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();

            lista.add("Seleccione una opcion");

            while (rs.next())
            {
                lista.add(rs.getString(campo));
            }
        } catch (Exception e)
        {
            e.toString();
        }
        System.out.println(lista);
        return lista;
    }

    public static int obtieneID(String tabla, String campo, Connection con) {
        int id = 1;
        try
        {
            ps = con.prepareStatement("SELECT  MAX(id_periodo) FROM periodo_escolar");
            rs = ps.executeQuery();
            while (rs.next())
            {
                id = rs.getInt((1) + 1);
                System.out.println(id);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return id;
    }

    public static void insertaMuchos(ArrayList<Object> obj, Connection con, String tabla) {
        try
        {
            int res = -1;
            switch (tabla)
            {
//                case "usuarios":
//                    Usuario emp = (Usuario) obj;
//                    ps = con.prepareStatement("INSERT INTO usuarios(id_usuario,rfc,usuario, contrasenia,pregunta_seguridad,respuesta_seguridad) VALUES (?,?,?,?,?,?)");//por seguridad
//                    ps.setString(1, emp.getIdUsuario());
//                    ps.setString(2, emp.getRfc());
//                    ps.setString(3, emp.getUsuario());
//                    ps.setString(4, emp.getContra());
//                    ps.setString(5, emp.getPreguntaSeguridad());
//                    ps.setStvring(6, emp.getRespuestaSeguridad());
//                    //ps.setDate(6, (java.sql.Date) emp.getFecha_alta());  // agregar un registro
//                    res = ps.executeUpdate();
//                    if (res > 0) {
//                        JOptionPane.showMessageDialog(null, "Se registro exitosamente");
//                    } else {
//                        JOptionPane.showMessageDialog(null, "ERROR");
//                    }
//                    break;
                case "profesores":
                    String consulta = "INSERT INTO `profesores` (`rfc`, `apellido_paterno`, `apellido_materno`, `nombres`, `grado_academico`, `correo`, `telefono`) VALUES ";
                    String valores = "";
                    System.out.println("tamaño" + obj.size());
                    for (int i = 0; i < obj.size(); i++)
                    {
                        valores = " (";
                        valores += "\'" + ((Profesor) obj.get(i)).getRfc() + "\',";
                        valores += "\'" + ((Profesor) obj.get(i)).getApellidoP() + "\',";
                        valores += "\'" + ((Profesor) obj.get(i)).getApellidoM() + "\',";
                        valores += "\'" + ((Profesor) obj.get(i)).getNombres() + "\',";
                        valores += "\'" + ((Profesor) obj.get(i)).getGradoAcademico() + "\',";
                        valores += "\'" + ((Profesor) obj.get(i)).getCorreo() + "\',";
                        valores += "\'" + ((Profesor) obj.get(i)).getTelefono() + "\'";
                        valores += (i == obj.size() - 1) ? ")" : "),";
                        consulta += valores;
                    }
                    ps = con.prepareStatement(consulta);
                    res = ps.executeUpdate();
                    if (res > 0)
                    {
                        JOptionPane.showMessageDialog(null, "Se registro exitosamente");
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "ERROR");
                    }
                    break;
                case "horarios":
                    consulta = "INSERT INTO `horarios` (`clave_materia`, `id_grupo`, `id_periodo`, `rfc`, `dia`, `hr_entrada`,`hr_salida`) VALUES ";
                    for (int i = 0; i < obj.size(); i++)
                    {
                        valores = " (";
                        valores += "\'" + ((PeriodoHorarios) obj.get(i)).getClaveMateria() + "\',";
                        valores += "\'" + ((PeriodoHorarios) obj.get(i)).getIdGrupo() + "\',";
                        valores += "\'" + ((PeriodoHorarios) obj.get(i)).getIdPeriodo() + "\',";
                        valores += "\'" + ((PeriodoHorarios) obj.get(i)).getRfc() + "\',";
                        valores += "\'" + ((PeriodoHorarios) obj.get(i)).getDia() + "\',";
                        valores += "\'" + ((PeriodoHorarios) obj.get(i)).getEntrada() + "\',";
                        valores += "\'" + ((PeriodoHorarios) obj.get(i)).getSalida() + "\'";
                        valores += (i == obj.size() - 1) ? ")" : "),";
                        consulta += valores;
                    }
                    System.out.println(consulta);
                    ps = con.prepareStatement(consulta);
                    res = ps.executeUpdate();
                    if (res > 0)
                    {
                        JOptionPane.showMessageDialog(null, "Se registro exitosamente");
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "ERROR");
                    }
                    break;

//                case "licenciatura":
//                    Licenciatura licen =(Licenciatura)obj;
//                    ps = con.prepareStatement("INSERT INTO licenciatura(id_licenciatura,nombre,rfc_coordinador) VALUES (?,?,?)");
//                    ps.setString(1, licen.getIdLicenciatura());
//                    ps.setString(2, licen.getLicenciatura());
//                    ps.setString(3, licen.getRfcCordinador());
//                    res = ps.executeUpdate();
//                    if (res > 0) {
//                        JOptionPane.showMessageDialog(null, "Se registro exitosamente");
//                    } else {
//                        JOptionPane.showMessageDialog(null, "ERROR");
//                    }
//                    break;
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al hacer la insercion");
            System.out.println(e.toString());
        }
    }

    public static ArrayList<Object> consultaHorarios(String campo, String valor, String campo2, String valor2, Connection con) {
        String consulta = "SELECT materia.clave_materia,unidad_aprendizaje,nombre_grupo,periodo,concat(profesores.apellido_paterno,' ',profesores.nombres) as profesor,dia,hr_entrada,hr_salida "
                + "FROM `horarios`"
                + "INNER JOIN materia ON horarios.clave_materia = materia.clave_materia "
                + "INNER JOIN grupo ON horarios.id_grupo = grupo.id_grupo "
                + "INNER JOIN profesores ON horarios.rfc = profesores.rfc "
                + "INNER JOIN periodo_escolar ON horarios.id_periodo = periodo_escolar.id_periodo";

        try
        {
            if (campo == null)
            {
                ps = con.prepareStatement(consulta); //traer un dato
            } else if (campo != null && campo2 == null)
            {
                ps = con.prepareStatement(consulta + " WHERE " + campo + "=?"); //traer un dato
                ps.setString(1, valor);
            } else
            {
                ps = con.prepareStatement(consulta + "WHERE " + campo + "=? AND " + campo2 + "=?"); //traer un dato
                ps.setString(1, valor);
                ps.setString(2, valor2);
            }
            ArrayList<Object> horarios = new ArrayList();
            rs = ps.executeQuery();
            if (rs.next())
            {
                do
                {
                    HorarioSalida hr = new HorarioSalida();
                    hr.setId_horario(rs.getString("id_horario"));
                    hr.setUnidad_aprendizaje(rs.getString("unidad_aprendizaje"));
                    hr.setNombre_grupo(rs.getString("nombre_grupo"));
                    hr.setPeriodo(rs.getString("periodo"));
                    hr.setProfesor(rs.getString("profesor"));
                    hr.setDia(rs.getString("dia"));
                    hr.setHr_entrada(rs.getString("hr_entrada"));
                    hr.setHr_salida(rs.getString("hr_salida"));
                    horarios.add(hr);
                } while (rs.next());
                return horarios;
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
        return null;
    }

    public static ArrayList<Object> consultaMuchasMaterias(String tabla, String campo, String valor, String campo2, String valor2, String campo3, String valor3, String valorOrden, Connection con) {

        try
        {

            ps = con.prepareStatement("SELECT * FROM " + tabla + " WHERE " + campo + "=? AND " + campo2 + "=?" + " AND " + campo3 + "=?" + " ORDER BY " + valorOrden + " ASC"); //traer un dato
            ps.setString(1, valor);
            ps.setString(2, valor2);
            ps.setString(3, valor3);

            ArrayList<Object> objetos = new ArrayList();

            switch (tabla)
            {
                case "usuarios":

                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            Usuario usuario = new Usuario();
                            System.out.println(usuario.getUsuario());
                            usuario.setIdUsuario(rs.getString("id_usuario"));
                            usuario.setRfc(rs.getString("rfc"));
                            usuario.setUsuario(rs.getString("usuario"));
                            usuario.setContra(rs.getString("contrasenia"));
                            usuario.setLicenciatura(rs.getString("id_licenciatura"));
                            objetos.add(usuario);
                        } while (rs.next());
                    } else
                    {
                        //JOptionPane.showMessageDialog(null, "No se encontro el usuario");
                    }
                    return objetos;
                case "profesores":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
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
                    } else
                    {
                        //JOptionPane.showMessageDialog(null, "No se encontro el profesor");
                    }
                    return objetos;
                case "licenciatura":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            Licenciatura licen = new Licenciatura();
                            licen.setIdLicenciatura(rs.getString("id_licenciatura"));
                            licen.setLicenciatura(rs.getString("nombre"));
                            objetos.add(licen);
                        } while (rs.next());
                    } else
                    {
                        //JOptionPane.showMessageDialog(null, "No se encontro la licenciatura");
                    }
                    return objetos;
                case "periodo_escolar":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            periodoEscolar perio = new periodoEscolar();
                            perio.setId_periodo(rs.getString("id_periodo"));
                            perio.setPeriodo(rs.getString("periodo"));
                            objetos.add(perio);
                        } while (rs.next());
                    } else
                    {
                        //JOptionPane.showMessageDialog(null, "No se encontraron periodos");
                    }
                    return objetos;
                case "plan_estudios":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            PlanEstudios plan = new PlanEstudios();
                            plan.setIdPlan(rs.getString("id_plan_estudios"));
                            plan.setPlanEstudios(rs.getString("plan_estudios"));
                            plan.setClaveCarrera(rs.getString("id_licenciatura"));
                            objetos.add(plan);
                        } while (rs.next());
                    }
                    return objetos;
                case "materia":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            Materia mat = new Materia();
                            mat.setClaveMateria(rs.getString("clave_materia"));
                            mat.setUnidadAprendizaje(rs.getString("unidad_aprendizaje"));
                            mat.setHoras(rs.getInt("horas"));
                            mat.setCreditos(rs.getInt("creditos"));
                            mat.setNumeroPeriodo(rs.getInt("numero_periodo"));
                            mat.setNucleo(rs.getString("nucleo"));
                            mat.setTipo(rs.getString("tipo"));
                            mat.setClaveCarrera(rs.getString("id_licenciatura"));
                            mat.setPlanEstudios(rs.getString("id_plan_estudios"));
                            objetos.add(mat);
                        } while (rs.next());
                    }
                    ConectarBase.desconectaBD();
                    return objetos;
                case "grupo":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            Grupo gr = new Grupo();
                            gr.setIdGrupo(rs.getString("id_grupo"));
                            gr.setNombreGrupo(rs.getString("nombre_grupo"));
                            gr.setId_licenciatura(rs.getString("id_licenciatura"));
                            objetos.add(gr);
                        } while (rs.next());
                    }
                    return objetos;
                case "horarios":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            PeriodoHorarios hr = new PeriodoHorarios();
                            hr.setIdHorario(rs.getInt("id_horario"));
                            hr.setClaveMateria(rs.getString("clave_materia"));
                            hr.setIdGrupo(rs.getString("id_grupo"));
                            hr.setIdPeriodo(rs.getString("id_periodo"));
                            hr.setRfc(rs.getString("rfc"));
                            hr.setDia(rs.getString("dia"));
                            hr.setEntrada(rs.getString("hr_entrada"));
                            hr.setSalida(rs.getString("hr_salida"));
                            objetos.add(hr);
                        } while (rs.next());
                    }
                    ConectarBase.desconectaBD();
                    return objetos;
                case "horariosSalida":
                    rs = ps.executeQuery();
                    if (rs.next())
                    {
                        do
                        {
                            HorarioSalida hr = new HorarioSalida();
                            hr.setId_horario(rs.getString("id_horario"));
                            hr.setUnidad_aprendizaje(rs.getString("clave_materia"));
                            hr.setNombre_grupo(rs.getString("id_grupo"));
                            hr.setPeriodo(rs.getString("id_periodo"));
                            hr.setProfesor(rs.getString("rfc"));
                            hr.setDia(rs.getString("dia"));
                            hr.setHr_entrada(rs.getString("hr_entrada"));
                            hr.setHr_salida(rs.getString("hr_salida"));
                            objetos.add(hr);
                        } while (rs.next());
                    }
                    return objetos;
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
        return null;
    }
}

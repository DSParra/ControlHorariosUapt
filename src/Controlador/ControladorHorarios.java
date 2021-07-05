/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import static Controlador.ControladorProfesores.evaluaDatos;
import Objetos.PeriodoHorarios;
import Objetos.Profesor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JParra
 */
public class ControladorHorarios {

    public static ArrayList ConsultaHorarios() {
        ArrayList horarios = ConsultasObjetos.consultaMuchos("horarios", null, null, null, null, "hr_entrada", ConectarBase.conectado());

        return horarios;
    }

    public static int numdia(String dia) {
        if (dia.equals("Lunes") || dia.equals("lunes") || dia.equals("lun") || dia.equals("LUNES") || dia.equals("L") || dia.equals("l"))
        {
            return 1;
        } else if (dia.equals("Martes") || dia.equals("martes") || dia.equals("mar") || dia.equals("MARTES") || dia.equals("M") || dia.equals("m"))
        {
            return 2;
        } else if (dia.equals("Miercoles") || dia.equals("miercoles") || dia.equals("mie") || dia.equals("MIERCOLES") || dia.equals("MI") || dia.equals("mi") || dia.equals("Mi"))
        {
            return 3;
        } else if (dia.equals("Jueves") || dia.equals("jueves") || dia.equals("jue") || dia.equals("JUEVES") || dia.equals("J") || dia.equals("j"))
        {
            return 4;
        } else if (dia.equals("Viernes") || dia.equals("viernes") || dia.equals("vie") || dia.equals("VIERNES") || dia.equals("V") || dia.equals("v"))
        {
            return 5;
        } else if (dia.equals("Sabado") || dia.equals("sabado") || dia.equals("sab") || dia.equals("SABADO") || dia.equals("S") || dia.equals("s"))
        {
            return 6;
        }
        return 0;
    }

    public static String numdia(int dia) {
        if (dia == 1)
        {
            return "LUNES";
        } else if (dia == 2)
        {
            return "MARTES";
        } else if (dia == 3)
        {
            return "MIERCOLES";
        } else if (dia == 4)
        {
            return "JUEVES";
        } else if (dia == 5)
        {
            return "VIERNES";
        } else if (dia == 6)
        {
            return "SABADO";
        }
        return "No encontrado";
    }

//        public static String InsertaProfesor(Profesor profe) {
//        String mensaje = "Error en los datos: ";
//        if (profe.getRfc() == null || profe.getRfc().equals("")) {
//            return "Rfc Vacio";
//        } else if (profe.getNombres() == null || profe.getNombres().equals("")) {
//            return "Nombre vacio";
//        } else if (profe.getApellidoP() == null || profe.getApellidoP().equals("")) {
//            return "Apellido Paterno vacio";
//        } else if (profe.getApellidoM() == null || profe.getApellidoM().equals("")) {
//            return "Apellido Materno vacio";
//        } else if (profe.getGradoAcademico() == null || profe.getGradoAcademico().equals(mensaje)) {
//            return "Grado Academico vacio";
//        } else if (profe.getCorreo() == null || profe.getCorreo().equals(mensaje)) {
//            return "Correo vaicio";
//        } else if (profe.getTelefono() == null || profe.getTelefono().equals(mensaje)) {
//            return "Grado Academico vacio";
//        } else {
//            Object rfc, correo;
//            rfc = ConsultasObjetos.consultaUnica("profesores", "rfc", profe.getRfc(), ConectarBase.conectado());
//            correo = ConsultasObjetos.consultaUnica("profesores", "correo", profe.getCorreo(), ConectarBase.conectado());
//
//            if (rfc != null) {
//                return "Rfc repetido";
//            } else if (correo != null) {
//                return "correo repetido";
//            } else {
//
//                Boolean registro = ConsultasObjetos.inserta(profe, ConectarBase.conectado(), "profesores");
//                if (registro) {
//                    System.out.println("Controlador: operacion exitosa");
//                    return "operacion exitosa";
//                } else {
//                    mensaje += "no registrado";
//                }
//            }
//
//        }
//
//        return mensaje;
//    }
    public static String evaluaDatos(PeriodoHorarios horario) {
        String mensaje = "";
        if (horario.getIdPeriodo() == null || horario.getIdPeriodo().equals(""))
        {
            mensaje += "Periodo vacio o no asignado";
        } else if (horario.getIdGrupo() == null || horario.getIdGrupo().equals(""))
        {
            mensaje += "Grupo vacio o sin asignar";
        } else if (horario.getClaveMateria() == null || horario.getClaveMateria().equals(""))
        {
            mensaje += "Materia vacia o no asignada";
        } else if (horario.getRfc() == null || horario.getRfc().equals(""))
        {
            mensaje += "Rfc Vacio";
        } else if (horario.getClaveMateria() == null || horario.getClaveMateria().equals(""))
        {
            mensaje += "Clave Materiavacio";
        } else if (horario.getEntrada() == null || horario.getEntrada().equals(""))
        {
            mensaje += "Hora de entrada vacia";
        } else if (horario.getSalida() == null || horario.getSalida().equals(""))
        {
            mensaje += "Hora de salida vacia";
        }
        return mensaje;
    }

    public static String insertaMuchos(ArrayList<Object> horarios) {
        String mensaje = null;
        for (Object horario : horarios)
        {
            PeriodoHorarios p = (PeriodoHorarios) horario;
            if (!evaluaDatos(p).equals(""))
            {
                return evaluaDatos(p);
            }
        }
//        if (mensaje == null) {
//            ArrayList bdProfes = ConsultasObjetos.consultaMuchos("profesor", null, null, ConectarBase.conectado());
//            for (Object profe : profesores) {
//                Profesor p = (Profesor) profe;
//                for (int i = 0; i < bdProfes.size(); i++) {
//                    if (p.getRfc().equals(((Profesor) bdProfes.get(i)).getRfc())) {
//                        return "RFC de " + p.getNombres() + " repetido";
//                    } else if (p.getCorreo().equals(((Profesor) bdProfes.get(i)).getCorreo())) {
//                        return "Correo de " + p.getNombres() + " repetido";    
//                    }
//                }
//            }
//        }
        ConsultasObjetos.insertaMuchos(horarios, ConectarBase.conectado(), "horarios");
        return "Operacion exitosa";
    }

    public static String insertaHorarioUnico(PeriodoHorarios horario) {
        String mensaje = evaluaDatos(horario);
        if (mensaje.equals(""))
        {
            try {
                Object id_horario;
                id_horario = ConsultasObjetos.consultaUnicaHorario("horarios", "id_horario", horario.getIdHorario(), ConectarBase.conectado());
                if (id_horario != null)
                {
                    return "ID de horario repetido inserte uno nuevo o diferente";
                } else
                {
                    return "operacion exitosa";
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorHorarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public static boolean insertaEnBaseUnicoHorario(PeriodoHorarios horario) {
        boolean registro = ConsultasObjetos.inserta(horario, ConectarBase.conectado(), "horarios");
        return registro;
    }

    public static String modificaHorarioUnico(PeriodoHorarios horario, int id) {
        String mensaje = evaluaDatos(horario);
        if (mensaje.equals(""))
        {
            return "operacion exitosa";
        } else
        {
            return "Error al modificar la materia";
        }
    }

    public static boolean modificaEnBaseUnicoHorario(PeriodoHorarios horario, int id) {
        Boolean registro = ConsultasObjetos.ModificaHorario(horario, ConectarBase.conectado(), "horarios", id);
        ConsultasObjetos.ModificaHorario(horario, ConectarBase.conectado(), "horarios", id);
        return registro;
    }

    public static String eliminaHorario(String id_horario) {
        if (id_horario == null || id_horario.equals(""))
        {
            return "No a seleccionado una materia a eliminiar";
        } else
        {
            Object idHorario = ConsultasObjetos.consultaUnica("horarios", "id_horario", id_horario, ConectarBase.conectado());
            if (idHorario == null)
            {
                return "Horario no encontrado";
            } else
            {
                if (ConsultasObjetos.elimina("horarios", "id_horario", id_horario, 0, ConectarBase.conectado()))
                {
                    return "operacion exitosa";
                } else
                {
                    return "No se pudo eliminar la materia";
                }
            }
        }
    }

}

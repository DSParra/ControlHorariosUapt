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
import java.util.ArrayList;

/**
 *
 * @author JParra
 */
public class ControladorHorarios {

    
   public static ArrayList ConsultaHorarios(){
        ArrayList horarios = ConsultasObjetos.consultaMuchos("horarios", null, null, null, null, "hr_entrada", ConectarBase.conectado());
        
       return horarios;
   }
    
    public static int numdia(String dia) {
        if (dia.equals("Lunes") || dia.equals("lunes") || dia.equals("lun") || dia.equals("LUNES")) {
            return 1;
        } else if (dia.equals("Martes") || dia.equals("martes") || dia.equals("mar") || dia.equals("MARTES")) {
            return 2;
        } else if (dia.equals("Miercoles") || dia.equals("miercoles") || dia.equals("mie") || dia.equals("MIERCOLES")) {
            return 3;
        } else if (dia.equals("Jueves") || dia.equals("jueves") || dia.equals("jue") || dia.equals("JUEVES")) {
            return 4;
        } else if (dia.equals("Viernes") || dia.equals("viernes") || dia.equals("vie") || dia.equals("VIERNES")) {
            return 5;
        } else if (dia.equals("Sabado") || dia.equals("sabado") || dia.equals("sab") || dia.equals("SABADO")) {
            return 6;
        }
        return 0;
    }
    
    public static String numdia(int dia) {
        if (dia == 1) {
            return "LUNES";
        } else if (dia == 2) {
            return "MARTES";
        } else if (dia == 3) {
            return "MIERCOLES";
        } else if (dia == 4) {
            return "JUEVES";
        } else if (dia == 5) {
            return "VIERNES"; 
        } else if (dia == 6) {
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
        if (horario.getRfc() == null || horario.getRfc().equals("")) {
            mensaje += "Rfc Vacio";
        } else if (horario.getClaveMateria()== null || horario.getClaveMateria().equals("")) {
            mensaje += "Clave Materiavacio";
        }/* else if (Integer.valueOf(horario.getDia()) == 0 ) {
            mensaje += "Dia incorrecto";
        } else if (horario.getEntrada()== null || horario.getEntrada().equals("")) {
            mensaje += "Hora entrada vacia ";
        } else if (Integer.valueOf(horario.getIdGrupo())== 0) {
            mensaje += "grupo incorrecto";
        } else if (Integer.valueOf(horario.getIdPeriodo())== 0) {
            mensaje += "periodo incorrecto";
        }*/ else if (horario.getSalida() == null || horario.getSalida().equals("")) {
            mensaje += "Hora salida vacia";
        }
        return mensaje;
    }
    
        
        
        public static String insertaMuchos(ArrayList<Object> horarios) {
        String mensaje = null;
        for (Object horario : horarios) {
            PeriodoHorarios p = (PeriodoHorarios) horario;
            if (!evaluaDatos(p).equals("")) {
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
            Object id_horario;
            id_horario = ConsultasObjetos.consultaUnica("horarios", null, null, ConectarBase.conectado());
            if (id_horario != null)
            {
                return "ID de horario repetido inserte uno nuevo o diferente";
            }
            else 
            {
                Boolean registro = ConsultasObjetos.inserta(horario, ConectarBase.conectado(), "horarios");
                if (registro)
                {
                    System.out.println("operacion exitosa en el controlador horarios");
                    return "operacion exitosa";
                }
                else
                {
                    mensaje += "No se pudo registrar el horario";
                }
            }
        }
        return mensaje;
    }
}

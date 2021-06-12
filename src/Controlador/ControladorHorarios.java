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

    
    
    
        public static String InsertaProfesor(Profesor profe) {
        String mensaje = "Error en los datos: ";
        if (profe.getRfc() == null || profe.getRfc().equals("")) {
            return "Rfc Vacio";
        } else if (profe.getNombres() == null || profe.getNombres().equals("")) {
            return "Nombre vacio";
        } else if (profe.getApellidoP() == null || profe.getApellidoP().equals("")) {
            return "Apellido Paterno vacio";
        } else if (profe.getApellidoM() == null || profe.getApellidoM().equals("")) {
            return "Apellido Materno vacio";
        } else if (profe.getGradoAcademico() == null || profe.getGradoAcademico().equals(mensaje)) {
            return "Grado Academico vacio";
        } else if (profe.getCorreo() == null || profe.getCorreo().equals(mensaje)) {
            return "Correo vaicio";
        } else if (profe.getTelefono() == null || profe.getTelefono().equals(mensaje)) {
            return "Grado Academico vacio";
        } else {
            Object rfc, correo;
            rfc = ConsultasObjetos.consultaUnica("profesores", "rfc", profe.getRfc(), ConectarBase.conectado());
            correo = ConsultasObjetos.consultaUnica("profesores", "correo", profe.getCorreo(), ConectarBase.conectado());

            if (rfc != null) {
                return "Rfc repetido";
            } else if (correo != null) {
                return "correo repetido";
            } else {

                Boolean registro = ConsultasObjetos.inserta(profe, ConectarBase.conectado(), "profesores");
                if (registro) {
                    System.out.println("Controlador: operacion exitosa");
                    return "operacion exitosa";
                } else {
                    mensaje += "no registrado";
                }
            }

        }

        return mensaje;
    }


        
        public static String evaluaDatos(PeriodoHorarios horario) {
        String mensaje = "";
        if (horario.getRfc() == null || horario.getRfc().equals("")) {
            mensaje += "Rfc Vacio";
        } else if (horario.getClaveMateria()== null || horario.getClaveMateria().equals("")) {
            mensaje += "Clave Materiavacio";
        } else if (Integer.valueOf(horario.getDia()) == 0 ) {
            mensaje += "Dia incorrecto";
        } else if (horario.getEntrada()== null || horario.getEntrada().equals("")) {
            mensaje += "Hora entrada vacia ";
        } else if (Integer.valueOf(horario.getIdGrupo())== 0) {
            mensaje += "grupo incorrecto";
        } else if (Integer.valueOf(horario.getIdPeriodo())== 0) {
            mensaje += "periodo incorrecto";
        } else if (horario.getSalida() == null || horario.getSalida().equals("")) {
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
    
    
}

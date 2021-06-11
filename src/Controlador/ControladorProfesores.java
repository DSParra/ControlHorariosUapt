/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import Objetos.Profesor;
import java.util.ArrayList;

/**
 *
 * @author JParra
 */
public class ControladorProfesores {

    public static String InsertaProfesor(Profesor profe) {
        String mensaje = evaluaDatos(profe);
        if (mensaje.equals("")) {
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

    public static String modificaProfesor(Profesor profe, String id) {
        String mensaje = evaluaDatos(profe);
        if (mensaje.equals("")) {
//            Object rfc, correo;
//            rfc = ConsultasObjetos.consultaUnica("profesores", "rfc", profe.getRfc(), ConectarBase.conectado());
//            correo = ConsultasObjetos.consultaUnica("profesores", "correo", profe.getCorreo(), ConectarBase.conectado());
//            if (rfc != null) {
//                return "Rfc repetido";
//            } else if (correo != null) {
//                return "correo repetido";
//            } else {
                //Boolean registro = ConsultasObjetos.inserta(profe, ConectarBase.conectado(), "profesores");
                Boolean registro = ConsultasObjetos.Modifica(profe, ConectarBase.conectado(), "profesores", id);
                ConsultasObjetos.Modifica(profe, ConectarBase.conectado(), "profesores", id);
                if (registro) {
                    System.out.println("Controlador: operacion exitosa");
                    return "operacion exitosa";
                } else {
                    mensaje += "no registrado";
                }
//            }
        }
        return mensaje;
    }

    public static String eliminaProfesor(String rfc) {
        if (rfc == null || rfc.equals("")) {
            return "Rfc Vacio";
        } else {
            Object rfc1 = ConsultasObjetos.consultaUnica("profesores", "rfc", rfc, ConectarBase.conectado());
            if (rfc1 == null) {
                return "Rfc no encontrado";
            } else {
                if (ConsultasObjetos.elimina("profesores", "rfc", rfc, 0, ConectarBase.conectado())) {
                    return "operacion exitosa";
                } else {
                    return "no se logro eliminar";
                }
            }
        }
    }

    public static String evaluaDatos(Profesor profe) {
        String mensaje = "";
        if (profe.getRfc() == null || profe.getRfc().equals("")) {
            mensaje += "Rfc Vacio";
        } else if (profe.getNombres() == null || profe.getNombres().equals("")) {
            mensaje += "Nombre vacio";
        } else if (profe.getApellidoP() == null || profe.getApellidoP().equals("")) {
            mensaje += "Apellido Paterno vacio";
        } else if (profe.getApellidoM() == null || profe.getApellidoM().equals("")) {
            mensaje += "Apellido Materno vacio";
        } else if (profe.getGradoAcademico() == null || profe.getGradoAcademico().equals("")) {
            mensaje += "Grado Academico vacio";
        } else if (profe.getCorreo() == null || profe.getCorreo().equals("")) {
            mensaje += "Correo vaicio";
        } else if (profe.getTelefono() == null || profe.getTelefono().equals("")) {
            mensaje += "Telefono vacio";
        }
        return mensaje;
    }


    public static String insertaMuchos(ArrayList<Object> profesores) {
        String mensaje = null;
        for (Object profe : profesores) {
            Profesor p = (Profesor) profe;
            if (evaluaDatos(p).equals("")) {
                //Evaluar si ya hay registros comparando rfc y nombre 
            } else {
                return evaluaDatos(p);
            }
        }
        if (mensaje == null) {
            ArrayList bdProfes = ConsultasObjetos.consultaMuchos("profesor", null, null, null, null, ConectarBase.conectado());
            for (Object profe : profesores) {
                Profesor p = (Profesor) profe;
                for (int i = 0; i < bdProfes.size(); i++) {
                    if (p.getRfc().equals(((Profesor) bdProfes.get(i)).getRfc())) {
                        return "RFC de " + p.getNombres() + " repetido";
                    } else if (p.getCorreo().equals(((Profesor) bdProfes.get(i)).getCorreo())) {
                        return "Correo de " + p.getNombres() + " repetido";    
                    }
                }
            }
        }
        ConsultasObjetos.insertaMuchos(profesores, ConectarBase.conectado(), "profesores");
        return "Operacion exitosa";
    }
    
    
    
    public void evaluaProfesores(){
        
    }
}




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import Objetos.Profesor;

/**
 *
 * @author JParra
 */
public class ControladorProfesores {

    public static String InsertaProfesor(Profesor profe) {
        String mensaje="Error en los datos: ";
        if (profe.getRfc() == null || profe.getRfc().equals("")) {
            return "Rfc Vacio"; 
        }else if (profe.getNombres()== null || profe.getNombres().equals("")){
            return "Nombre vacio";
        }else if (profe.getApellidoP()== null || profe.getApellidoP().equals("")){
            return "Apellido Paterno vacio";
        }else if (profe.getApellidoM()== null || profe.getApellidoM().equals("")){
            return "Apellido Materno vacio";
        }else if (profe.getGradoAcademico()== null || profe.getGradoAcademico().equals(mensaje)){
            return "Grado Academico vacio";
        }else if (profe.getCorreo()== null || profe.getCorreo().equals(mensaje)){
            return "Correo vaicio";
        }else if (profe.getTelefono()== null || profe.getTelefono().equals(mensaje)){
            return "Grado Academico vacio";
        }else{
            Object rfc,correo;
            rfc = ConsultasObjetos.consultaUnica("profesores", "rfc", profe.getRfc(), ConectarBase.conectado());
            correo = ConsultasObjetos.consultaUnica("profesores", "correo", profe.getCorreo(), ConectarBase.conectado());
            
            if (rfc != null) {
                return "Rfc repetido";
            }else if (correo != null){
                return "correo repetido";
            }else{
                
                Boolean registro = ConsultasObjetos.inserta(profe,ConectarBase.conectado() ,"profesores");
                if (registro) {
                    System.out.println("Controlador: operacion exitosa");
                    return "operacion exitosa";
                }else{
                    mensaje += "no registrado";
                }
            }
            
            
        }
        
        
        
        return mensaje;
    }
    public static String modificaProfesor(Profesor profe, String id) {
        String mensaje="Error en los datos: ";
        if (profe.getRfc() == null || profe.getRfc().equals("")) {
            return "Rfc Vacio"; 
        }else if (profe.getNombres()== null || profe.getNombres().equals("")){
            return "Nombre vacio";
        }else if (profe.getApellidoP()== null || profe.getApellidoP().equals("")){
            return "Apellido Paterno vacio";
        }else if (profe.getApellidoM()== null || profe.getApellidoM().equals("")){
            return "Apellido Materno vacio";
        }else if (profe.getGradoAcademico()== null || profe.getGradoAcademico().equals(mensaje)){
            return "Grado Academico vacio";
        }else if (profe.getCorreo()== null || profe.getCorreo().equals(mensaje)){
            return "Correo vaicio";
        }else if (profe.getTelefono()== null || profe.getTelefono().equals(mensaje)){
            return "Grado Academico vacio";
        }else{
            Object rfc,correo;
            rfc = ConsultasObjetos.consultaUnica("profesores", "rfc", profe.getRfc(), ConectarBase.conectado());
            correo = ConsultasObjetos.consultaUnica("profesores", "correo", profe.getCorreo(), ConectarBase.conectado());
            
            if (rfc != null) {
                return "Rfc repetido";
            }else if (correo != null){
                return "correo repetido";
            }else{
                
                Boolean registro = ConsultasObjetos.inserta(profe,ConectarBase.conectado() ,"profesores");
                ConsultasObjetos.Modifica(profe, ConectarBase.conectado(), "profesores", id);
                if (registro) {
                    System.out.println("Controlador: operacion exitosa");
                    return "operacion exitosa";
                }else{
                    mensaje += "no registrado";
                }
            }
            
            
        }
        
        
        
        return mensaje;
    }
}

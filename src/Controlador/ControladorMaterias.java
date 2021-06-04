/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import Objetos.Materia;

/**
 *
 * @author mvidalh
 */
public class ControladorMaterias
{

    public static String insertaMateria(Materia mat) {
        String mensaje = evaluaDatos(mat);
        if (mensaje.equals(""))
        {
            Object idMateria;
            idMateria = ConsultasObjetos.consultaUnica("materia", "clave_materia", mat.getClaveCarrera(), ConectarBase.conectado());
            if (idMateria != null)
            {
                return "Matricula de materia repetida, inserte una diferente";
            }
            else 
            {
                Boolean registro = ConsultasObjetos.inserta(mat, ConectarBase.conectado(), "materia");
                if (registro)
                {
                    System.out.println("Operacion exitosa del controlador en materia");
                    return "operacion exitosa";
                }
                else
                {
                    mensaje += "No se pudo registrar la materia";
                }
            }
        }
        return mensaje;
    }

    public static String modifcaMateria(Materia materia, String id) {
        String mensaje = evaluaDatos(materia);
        if (mensaje.equals(""))
        {
            Boolean registro = ConsultasObjetos.Modifica(materia, ConectarBase.conectado(), "materia", id);
            ConsultasObjetos.Modifica(materia, ConectarBase.conectado(), "materia", id);
            if (registro)
            {
                System.out.println("Operacion exitosa del controlador en materia");
                return "operacion exitosa";
            }
            else
            {
                return "Error al modificar la materia";
            }
        }
        return mensaje;
    }

    public static String eliminaMateria(String id_materia) {
        if (id_materia == null || id_materia.equals(""))
        {
            return "No a seleccionado una materia a eliminiar";
        }
        else
        {
            Object idmateria = ConsultasObjetos.consultaUnica("materia", "clave_materia", id_materia, ConectarBase.conectado());
            if (idmateria == null)
            {
                return "Matricula de materia no encontrada";
            }
            else
            {
                if (ConsultasObjetos.elimina("materia", "clave_materia", id_materia, 0, ConectarBase.conectado()))
                {
                    return "operacion exitosa";
                }
                else
                {
                    return "No se pudo eliminar la materia";
                }
            }
        }
    }

    private static String evaluaDatos(Materia mat) {
        String  mensaje = "";
        if (mat.getClaveMateria() == null || mat.getClaveMateria().equals(""))
        {
            return "Matricula de materia vacia, por favor llene la el campo Matricula";
        }
        else if (mat.getUnidadAprendizaje() == null || mat.getUnidadAprendizaje().equals(""))
        {
            return "Nombre de materia no asignado, por favor llene el campo Nombre";
        }
        else if (mat.getHoras() == 0)
        {
            return "Horas no asignadas, por favor inserte un numero de horas";
        }
        else if (mat.getCreditos() == 0)
        {
            return "Creditos no asignados, por favor inserte un numero de creditos";
        }
        else if (mat.getNumeroPeriodo() == 0)
        {
            return "Periodo sin asignar, por favor inserte un periodo";
        }
        else if (mat.getNucleo() == null || mat.getNucleo().equals(""))
        {
            return "Nucleo no asignado, por favor seleccione un nucleo";
        }
        else if (mat.getTipo() == null || mat.getTipo().equals(""))
        {
            return "Tipo no asignado, por favor asigne un Tipo";
        }
         return mensaje;   
    }
    
}

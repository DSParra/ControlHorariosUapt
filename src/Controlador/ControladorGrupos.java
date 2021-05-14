/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import Objetos.Grupo;

/**
 *
 * @author mvidalh
 */
public class ControladorGrupos
{

    public static String eliminarGrupo(String id_grupo) {
         if (id_grupo == null || id_grupo.equals(""))
        {
            return "No seleccionado ningun grupo a eliminar";
        }
        else
        {
            Object idGrupo = ConsultasObjetos.consultaUnica("grupo", "id_grupo", id_grupo, ConectarBase.conectado());
            if (idGrupo == null)
            {
                return "ID de grupo no encontrado";
            }
            else
            {
                if (ConsultasObjetos.elimina("grupo", "id_grupo", id_grupo, 0, ConectarBase.conectado()))
                {
                    return "operacion exitosa";
                }
                else
                {
                    return "No se pudo eliminar el Grupo";
                }
            }
        }
    }

    public static String modificaGrupo(Grupo grup, String id) {
        String mensaje = evaluaDatos(grup);
        if (mensaje.equals(""))
        {
            Boolean registro = ConsultasObjetos.Modifica(grup, ConectarBase.conectado(), "grupo", id);
            ConsultasObjetos.Modifica(grup, ConectarBase.conectado(), "grupo", id);
            if (registro)
            {
                System.out.println("operacion exitosa del controlador");
                return "operacion exitosa";
            }
            else
            {
                return "Error al modificar el Grupo";
            }
        }
        return mensaje;
    }

    public static String insertaGrupo(Grupo grup) {
        String mensaje = evaluaDatos(grup);
        if (mensaje.equals(""))
        {
            Object idgrup, grupo;
            idgrup = ConsultasObjetos.consultaUnica("grupo", "id_grupo", grup.getIdGrupo(), ConectarBase.conectado());
            grupo = ConsultasObjetos.consultaUnica("grupo", "nombre_grupo", grup.getNombreGrupo(), ConectarBase.conectado());
            if (idgrup != null)
            {
                return "ID de grupo repetido, ingrese un ID diferente";
            }
            else if (grupo != null)
            {
                return "PGruporepetido, inserte un grupo diferente";
            }
            else
            {
                Boolean registro = ConsultasObjetos.inserta(grup, ConectarBase.conectado(), "grupo");
                if (registro)
                {
                    System.out.println("Operación exitosa del controlador");
                    return "operacion exitosa";
                }
                else
                {
                    mensaje += "Grupo de estudios no registrado";
                }
            }
        }
        return mensaje;
    }

    private static String evaluaDatos(Grupo grup) {
        String mensaje = "";
        if (grup.getIdGrupo() == null || grup.getIdGrupo().equals(""))
        {
            return "ID de grupo vacio, llene el campo ID";
        }
        else if (grup.getNombreGrupo() == null || grup.getNombreGrupo().equals(""))
        {
            return "Nombre de grupo vacio, llene el campo Grupo";
        }
        return mensaje;
    }
    
}

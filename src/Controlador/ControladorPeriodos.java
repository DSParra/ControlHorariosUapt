/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import Objetos.periodoEscolar;

/**
 *
 * @author mvidalh
 */
public class ControladorPeriodos
{

    public static String insertaPeriodo(periodoEscolar per) {
        String mensaje = evaluaDatos(per);
        if (mensaje.equals(""))
        {
            Object idPer, nomPer;
            idPer = ConsultasObjetos.consultaUnica("periodo_escolar", "id_periodo", per.getId_periodo(), ConectarBase.conectado());
            nomPer = ConsultasObjetos.consultaUnica("periodos_escolar", "periodo", per.getId_periodo(), ConectarBase.conectado());
            if (idPer != null)
            {
                return "ID de periodo repetido, inserte uno diferente";
            } else if (nomPer != null)
            {
                return "Periodo ya asignado, inserte uno nuevo";
            } else
            {
                Boolean registro = ConsultasObjetos.inserta(per, ConectarBase.conectado(), "periodo_escolar");
                if (registro)
                {
                    return "operacion exitosa";
                } else
                {
                    mensaje += "No se pudo registrar el periodo";
                }
            }
        }
        return mensaje;
    }

    public static String modificaPeriodo(periodoEscolar perio, String id) {
        String mensaje = evaluaDatos(perio);
        if (mensaje.equals(""))
        {
            Boolean registro = ConsultasObjetos.Modifica(perio, ConectarBase.conectado(), "periodo_escolar", id);
            ConsultasObjetos.Modifica(perio, ConectarBase.conectado(), "periodo_escolar", id);
            if (registro)
            {
                return "operacion exitosa";
            } else
            {
                mensaje += "no registrado";
            }
        }
        return mensaje;
    }

    public static String eliminarPeriodo(String id_periodo) {
        if (id_periodo == null || id_periodo.equals(""))
        {
            return "No ha seleccionado ningun periodo";
        } else
        {
            System.out.println("ide " + id_periodo);
            Object id = ConsultasObjetos.consultaUnica("periodo_escolar", "id_periodo", id_periodo, ConectarBase.conectado());
            if (id == null)
            {
                return "ID no retornado";
            } else
            {
                if (ConsultasObjetos.elimina("periodo_escolar", "id_periodo", id_periodo, 0, ConectarBase.conectado()))
                {
                    return "operacion exitosa";
                } else
                {
                    return "No se pudo elimiar este periodo";
                }
            }
        }
    }

    private static String evaluaDatos(periodoEscolar per) {
        String mensaje = "";
        if (per.getId_periodo() == null || per.getId_periodo().equals(""))
        {
            mensaje += "ID periodo vacio, llene el campo ID";
        } else if (per.getPeriodo() == null || per.getPeriodo().equals(""))
        {
            mensaje = "Periodo vacio, llene el campo Periodo";
        }
        return mensaje;
    }

}

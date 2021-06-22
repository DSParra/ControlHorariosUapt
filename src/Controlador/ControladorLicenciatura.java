/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import Objetos.Licenciatura;
import java.util.ArrayList;

/**
 *
 * @author mvidalh
 */
public class ControladorLicenciatura
{

    public static String eliminaLicenciatura(String id_licenciatura) {
        if (id_licenciatura == null || id_licenciatura.equals(""))
        {
            return "ID de licenciatura vacio";
        } else
        {
            Object idLicenciatura = ConsultasObjetos.consultaUnica("licenciatura", "id_licenciatura", id_licenciatura, ConectarBase.conectado());
            if (idLicenciatura == null)
            {
                return "ID de licenciatura no encontrado";
            } else
            {
                if (ConsultasObjetos.elimina("licenciatura", "id_licenciatura", id_licenciatura, 0, ConectarBase.conectado()))
                {
                    return "operacion exitosa";
                } else
                {
                    return "No se pudo eliminar la licenciatura, tal vez tenga registros que dependientes como materias, planes de estidio, etc.";
                }
            }
        }
    }

    public static String modificaLicenciatura(Licenciatura lic, String id) {
        String mensaje = evaluaDatos(lic);
        if (mensaje.equals(""))
        {
            Boolean registro = ConsultasObjetos.Modifica(lic, ConectarBase.conectado(), "licenciatura", id);
            ConsultasObjetos.Modifica(lic, ConectarBase.conectado(), "licenciatura", id);
            if (registro)
            {
                System.out.println("Operacion de controlador exitosa");
                return "operacion exitosa";
            } else
            {
                mensaje += "Licenciatura no registrada";
            }
        }
        return mensaje;
    }

    public static String insertaLicenciatura(Licenciatura lic) {
        String mensaje = evaluaDatos(lic);
        if (mensaje.equals(""))
        {
            Object idLicenciatura, licenciatura, rfcCoordinador;
            idLicenciatura = ConsultasObjetos.consultaUnica("licenciatura", "id_licenciatura", lic.getIdLicenciatura(), ConectarBase.conectado());
            licenciatura = ConsultasObjetos.consultaUnica("licenciatura", "nombre", lic.getLicenciatura(), ConectarBase.conectado());
            if (idLicenciatura != null)
            {
                return "ID de licenciatura repetido, ingrese uno diferente";
            } else if (licenciatura != null)
            {
                return "Nombre de licenciatura ya ingresado, ingrese uno diferente";
            }  else
            {
                Boolean registro = ConsultasObjetos.inserta(lic, ConectarBase.conectado(), "licenciatura");
                if (registro)
                {
                    System.out.println("Operacion de controlador exitosa");
                    return "operacion exitosa";
                } else
                {
                    mensaje += "Licenciatura no registrada";
                }
            }
        }
        return mensaje;
    }

    private static String evaluaDatos(Licenciatura lic) {
        String mensaje = "";
        if (lic.getIdLicenciatura() == null || lic.getIdLicenciatura().equals(""))
        {
            mensaje += "ID de licenciatura vacio, inserte un valor";
        } else if (lic.getLicenciatura() == null || lic.getLicenciatura().equals(""))
        {
            mensaje += "Nombre de licenciatura vacio, por favor inserte un nombre";
        } 
        return mensaje;
    }

    public static String insertaMuchos(ArrayList<Object> licenciaturas) {
        String mensaje = null;
        for (Object lic : licenciaturas)
        {
            Licenciatura l = (Licenciatura) lic;
            if (evaluaDatos(l).equals(""))
            {

            } else
            {
                return evaluaDatos(l);
            }
        }
        if (mensaje == null)
        {
            ArrayList bdlics = ConsultasObjetos.consultaMuchos("licenciaturas", null, null, null, null, "nombre", ConectarBase.conectado());
            for (Object lic : licenciaturas)
            {
                Licenciatura l = (Licenciatura) lic;
                for (int i = 0; i < bdlics.size(); i++)
                {
                    if (l.getIdLicenciatura().equals(((Licenciatura)bdlics.get(i)).getIdLicenciatura()))
                    {
                        return "ID licenciatura de " + l.getLicenciatura() + " repetido";
                    }
                    else if (l.getLicenciatura().equals(((Licenciatura)bdlics.get(i)).getLicenciatura()))
                    {
                        return "Nombre de " + l.getLicenciatura() + " repetido";
                    }
                }
            }
        }
        ConsultasObjetos.insertaMuchos(licenciaturas, ConectarBase.conectado(), "licenciatura");
        return "operacion exitosa";
    }
}

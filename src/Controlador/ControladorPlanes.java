/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import Objetos.Grupo;
import Objetos.PlanEstudios;
import java.util.ArrayList;

/**
 *
 * @author mvidalh
 */
public class ControladorPlanes
{

    public static String insertarPlan(PlanEstudios plan) {
        String mensaje = evaluaDatos(plan);
        if (mensaje.equals(""))
        {
            Object idplan, planestudios, carrera;
            idplan = ConsultasObjetos.consultaUnica("plan_estudios", "id_plan_estudios", plan.getIdPlan(), ConectarBase.conectado());
            planestudios = ConsultasObjetos.consultaUnica("plan_estudios", "plan_estudios", plan.getPlanEstudios(), ConectarBase.conectado());
            if (idplan != null)
            {
                return "ID de plan repetido, ingrese un ID diferente";
            }
            else if (planestudios != null)
            {
                return "Plan de estudios repetido, inserte un plan diferente";
            }
            else
            {
                Boolean registro = ConsultasObjetos.inserta(plan, ConectarBase.conectado(), "plan_estudios");
                if (registro)
                {
                    System.out.println("Operación exitosa del controlador");
                    return "operacion exitosa";
                }
                else
                {
                    mensaje += "Plan de estudios no registrado";
                }
            }
        }
        return mensaje;
    }

    public static String eliminarPlan(String id_plan) {
        if (id_plan == null || id_plan.equals(""))
        {
            return "No seleccionado ningun plan a eliminar";
        }
        else
        {
            Object idPlan = ConsultasObjetos.consultaUnica("plan_estudios", "id_plan_estudios", id_plan, ConectarBase.conectado());
            if (idPlan == null)
            {
                return "ID de plan de estudios no encontrado";
            }
            else
            {
                if (ConsultasObjetos.elimina("plan_estudios", "id_plan_estudios", id_plan, 0, ConectarBase.conectado()))
                {
                    return "operacion exitosa";
                }
                else
                {
                    return "No se pudo eliminar el Plan de estudios";
                }
            }
        }
    }

    public static String modificarPlan(PlanEstudios plan, String id) {
        String mensaje = evaluaDatos(plan);
        if (mensaje.equals(""))
        {
            Boolean registro = ConsultasObjetos.Modifica(plan, ConectarBase.conectado(), "plan_estudios", id);
            ConsultasObjetos.Modifica(plan, ConectarBase.conectado(), "plan_estudios", id);
            if (registro)
            {
                System.out.println("operacion exitosa del controlador");
                return "operacion exitosa";
            }
            else
            {
                return "Error al modificar el plan";
            }
        }
        return mensaje;
    }

    private static String evaluaDatos(PlanEstudios plan) {
        String mensaje = "";
        if (plan.getIdPlan() == null || plan.getIdPlan().equals(""))
        {
            return "ID de plan vacio, llene el campo ID";
        }
        else if (plan.getPlanEstudios() == null || plan.getPlanEstudios().equals(""))
        {
            return "Nombre de plan vacio, llene el campo Plan de estudios";
        }
        else if (plan.getClaveCarrera()== null || plan.getClaveCarrera().equals(""))
        {
            return "Licenciatura vacia, insertar licenciaturas para completar esta acción";
        }
        return mensaje;
    }
    
    
    public static String insertaMuchos(ArrayList<Object> planes)
    {
        String mensaje = null;
        for(Object p: planes)
        {
            PlanEstudios pl = (PlanEstudios)p;
            if (evaluaDatos(pl).equals(""))
            {
                
            }
            else
            {
                return evaluaDatos(pl);
            }
        }
        if (mensaje == null)
        {
            ArrayList bdPlanes = ConsultasObjetos.consultaMuchos("plan_estudios", null, null, null, null, "plan_estudios", ConectarBase.conectado());
            for(Object pl: bdPlanes)
            {
                PlanEstudios p  = (PlanEstudios)pl;
                for (int i = 0; i < bdPlanes.size(); i++)
                {
                    if (p.getIdPlan().equals(((PlanEstudios)bdPlanes.get(i)).getIdPlan()))
                    {
                        return "ID de " + p.getPlanEstudios() +" repetido";
                    }
                    else if (p.getPlanEstudios().equals(((PlanEstudios)bdPlanes.get(i)).getPlanEstudios()))
                    {
                        return "Nombre de plan " + p.getPlanEstudios() + " repetido";
                    }
                    else if (p.getClaveCarrera().equals(((PlanEstudios)bdPlanes.get(i)).getClaveCarrera()))
                    {
                        return "Licenciatura " + p.getClaveCarrera() + " ya seleccionada en otro plan de estudios";
                    }
                }
            }
        }
        ConsultasObjetos.insertaMuchos(planes, ConectarBase.conectado(), "plan_estudios");
        return "operacion exitosa";
    }
}

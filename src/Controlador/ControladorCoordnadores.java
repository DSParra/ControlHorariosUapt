/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import Objetos.Usuario;
import java.util.ArrayList;

/**
 *
 * @author mvidalh
 */
public class ControladorCoordnadores
{
    
    public static String insertarCoordinador(Usuario us) {
        String mensaje = evaluaDatos(us);
        if (mensaje.equals(""))
        {
            Object idUsuario, rfc, usuario;            
            idUsuario = ConsultasObjetos.consultaUnica("usuarios", "id_usuario", us.getIdUsuario(), ConectarBase.conectado());
            rfc = ConsultasObjetos.consultaUnica("usuarios", "rfc", us.getRfc(), ConectarBase.conectado());
            usuario = ConsultasObjetos.consultaUnica("usuarios", "usuario", us.getUsuario(), ConectarBase.conectado());
            if (idUsuario != null)
            {
                return "ID de usuario repetido, ingrese otro ID";
            } else if (rfc != null)
            {
                return "Este docente ya esta designado como coordinador, Seleccione otro docente";
                
            }
            else if (usuario != null)
            {
                return "Usuario repetido, inserte otro usuario";
            }
            else
            {
                Boolean registro = ConsultasObjetos.inserta(us, ConectarBase.conectado(), "usuarios");
                if (registro)
                {
                    System.out.println("Operación exitosa del controlador");
                    return "operacion exitosa";
                }
                else
                {
                    mensaje += "no registrado";
                }
            }
        }
        return mensaje;
    }
    
    public static String modifcaCoordinador(Usuario us, String id)
    {
        String mensaje = evaluaDatos(us);
        if (mensaje.equals(""))
        {
            Boolean registro = ConsultasObjetos.Modifica(us, ConectarBase.conectado(), "usuarios", id);
            ConsultasObjetos.Modifica(us, ConectarBase.conectado(), "usuarios", id);
            if (registro)
            {
                System.out.println("Operación exitosa del controlador");
                return "operacion exitosa";
            }
            else
            {
                mensaje += "no registrado";
            }
        }
        return mensaje;
    }
    
    public static String eliminaUsuario(String id_usuario)
    {
        if (id_usuario == null || id_usuario.equals(""))
        {
            return "No ha seleccionado a ningun coordinador a eliminar";
        }
        else
        {
            Object idUsuario = ConsultasObjetos.consultaUnica("usuarios", "id_usuario", id_usuario, ConectarBase.conectado());
            if (idUsuario == null)
            {
                return "ID no encontrado";
            }
            else
            {
                if (ConsultasObjetos.elimina("usuarios", "id_usuario", id_usuario, 0, ConectarBase.conectado()))
                {
                    return "operacion exitosa";
                }
                else
                {
                    return "No se pudo eliminar a este usuario";
                }
            }
        }
    }
    
    private static String evaluaDatos(Usuario us) {
        String mensaje = "";
        if (us.getIdUsuario() == null || us.getIdUsuario().equals(""))
        {
            mensaje += "ID usuario vacio, llene el campo ID";
        }
        else if (us.getRfc() == null || us.getRfc().equals(""))
        {
            mensaje += "RFC vacio, llene el campo RFC";
        }
        else if (us.getUsuario()== null || us.getUsuario().equals(""))
        {
            mensaje += "Usuario vacio, llene el campo Uusuario";
        }
        else if (us.getContra() == null || us.getContra().equals(""))
        {
            mensaje += "Contraseña vacía, llene el campo Contraseña";
        }else if (us.getLicenciatura()== null || us.getLicenciatura().equals(""))
        {
            mensaje += "Licenciatura vacía, Seleccione o agregue una licenciatura";
        }
        return mensaje;
    }
    
    public static String insertarMuchos(ArrayList<Object> usuarios)
    {
        String mensaje = null;
        for (Object us: usuarios)
        {
            Usuario u = (Usuario)us;
            if (evaluaDatos(u).equals(""))
            {
                
            }
            else
            {
                return evaluaDatos(u);
            }
        }
        if (mensaje == null)
        {
            ArrayList bdUsuarios = ConsultasObjetos.consultaMuchos("usuarios", null, null, null, null, "rfc", ConectarBase.conectado());
            for (Object us: usuarios)
            {
                Usuario u = (Usuario) us;
                for (int i = 0; i < bdUsuarios.size(); i++)
                {
                    if (u.getIdUsuario().equals(((Usuario)bdUsuarios.get(i)).getIdUsuario()))
                    {
                        return "ID de " + u.getUsuario() + " repetido";
                    }
                    else if (u.getUsuario().equals(((Usuario)bdUsuarios.get(i)).getUsuario()))
                    {
                        return "Correo de " + u.getUsuario() + " repetido";
                    }
                }
            }
        }
        ConsultasObjetos.insertaMuchos(usuarios, ConectarBase.conectado(), "usuarios");
        return "operacion exitosa";
    }
}

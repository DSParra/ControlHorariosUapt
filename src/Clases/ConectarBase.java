/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import cjb.ci.Mensaje;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author mosh_
 */
public class ConectarBase {

    public static Connection instancia;

    public static Connection conectado() {
        Conexion con = new Conexion();
        try
        {
            if (instancia == null)
            {
                instancia = con.Conecta("31.170.161.64:3306", "u791379416_horariosUAPT", "u791379416_UAPT", "HeUAPT01.", 2);
                //instancia = con.Conecta("localhost:3306", "horariosUAPT", "root", "", 2);
                System.out.println("Conectado");
                Mensaje.exito(jf, "Conectado a la base de datos");
            } else
            {
                System.out.println("Ya existe la conexion");
                Mensaje.error(jf, "ELSE: No se ha conectado a la base de datos");
            }
            
        } catch (Exception e)
        {
            System.out.println(e.toString());
            Mensaje.error(jf, "ERROR: Exception");
            Mensaje.error(jf, e.toString());
        }
        return instancia;
    }

    public static Connection conectaBD() {
        Conexion conec = new Conexion();
        try
        {
            return conec.Conecta("31.170.161.64:3306", "u791379416_horariosUAPT", "u791379416_UAPT", "HeUAPT01.", 2);
            //return conec.Conecta("localhost:3306", "horariosUAPT", "root", "", 2);
        } catch (Exception e)
        {
            return null;
        }
    }

    public static void desconectaBD() {

        Conexion conec = new Conexion();
        conec.desconectar(instancia);
        instancia = null;
    }
}

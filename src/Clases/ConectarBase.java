/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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
        try{
        if (instancia == null) {
            instancia = con.Conecta("localhost:3306", "horariosuapt", "root", "", 2);
            System.out.println("Conectado");
        }else{
            System.out.println("Ya existe la conexion");
        }
        return instancia;
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return instancia;
    }

    public static Connection conectaBD() {
        Conexion conec = new Conexion();
        try {
            return conec.Conecta("localhost:3306", "horariosuapt", "root", "", 2);
        } catch (Exception e) {
            return null;
        }
    }

    public static void desconectaBD(Connection con) {
        Conexion conec = new Conexion();
        conec.desconectar(con);
    }
}

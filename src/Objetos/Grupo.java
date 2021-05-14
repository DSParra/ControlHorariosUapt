/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author DELL
 */
public class Grupo {
   private String idGrupo;
   private String nombreGrupo;
   private String id_licenciatura;

    public Grupo(String idGrupo, String nombreGrupo, String id_licenciatura) {
        this.idGrupo = idGrupo;
        this.nombreGrupo = nombreGrupo;
        this.id_licenciatura = id_licenciatura;
    }

    

    public Grupo() {
    }

    /**
     * @return the idGrupo
     */
    public String getIdGrupo() {
        return idGrupo;
    }

    /**
     * @param idGrupo the idGrupo to set
     */
    public void setIdGrupo(String idGrupo) {
        this.idGrupo = idGrupo;
    }

    /**
     * @return the nombreGrupo
     */
    public String getNombreGrupo() {
        return nombreGrupo;
    }

    /**
     * @param nombreGrupo the nombreGrupo to set
     */
    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    /**
     * @return the id_licenciatura
     */
    public String getId_licenciatura() {
        return id_licenciatura;
    }

    /**
     * @param id_licenciatura the id_licenciatura to set
     */
    public void setId_licenciatura(String id_licenciatura) {
        this.id_licenciatura = id_licenciatura;
    }
   
   
}

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

    public Grupo(String idGrupo, String nombreGrupo) {
        this.idGrupo = idGrupo;
        this.nombreGrupo = nombreGrupo;
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
   
   
}

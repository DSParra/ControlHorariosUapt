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
public class PeriodoHorarios {
    private String claveMateria;
    private int idGrupo;
    private int idPeriodo;
    private String rfc;
    private int dia;
    private String entrada;
    private String salida;

    public PeriodoHorarios(String claveMateria, int idGrupo, int idPeriodo, String rfc, int dia, String entrada, String salida) {
        this.claveMateria = claveMateria;
        this.idGrupo = idGrupo;
        this.idPeriodo = idPeriodo;
        this.rfc = rfc;
        this.dia = dia;
        this.entrada = entrada;
        this.salida = salida;
    }

    public PeriodoHorarios() {
    }

    /**
     * @return the claveMateria
     */
    public String getClaveMateria() {
        return claveMateria;
    }

    /**
     * @param claveMateria the claveMateria to set
     */
    public void setClaveMateria(String claveMateria) {
        this.claveMateria = claveMateria;
    }

    /**
     * @return the idGrupo
     */
    public int getIdGrupo() {
        return idGrupo;
    }

    /**
     * @param idGrupo the idGrupo to set
     */
    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    /**
     * @return the idPeriodo
     */
    public int getIdPeriodo() {
        return idPeriodo;
    }

    /**
     * @param idPeriodo the idPeriodo to set
     */
    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the entrada
     */
    public String getEntrada() {
        return entrada;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    /**
     * @return the salida
     */
    public String getSalida() {
        return salida;
    }

    /**
     * @param salida the salida to set
     */
    public void setSalida(String salida) {
        this.salida = salida;
    }
    
    
}


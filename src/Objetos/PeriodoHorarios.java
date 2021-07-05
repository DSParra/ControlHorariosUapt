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
    private int idHorario;
    private String claveMateria;
    private String idGrupo;
    private String idPeriodo;
    private String rfc;
    private String dia;
    private String entrada;
    private String salida;


    public PeriodoHorarios() {
    }

    public PeriodoHorarios(int idHorario, String claveMateria, String idGrupo, String idPeriodo, String rfc, String dia, String entrada, String salida) {
        this.idHorario = idHorario;
        this.claveMateria = claveMateria;
        this.idGrupo = idGrupo;
        this.idPeriodo = idPeriodo;
        this.rfc = rfc;
        this.dia = dia;
        this.entrada = entrada;
        this.salida = salida;
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
     * @return the idPeriodo
     */
    public String getIdPeriodo() {
        return idPeriodo;
    }

    /**
     * @param idPeriodo the idPeriodo to set
     */
    public void setIdPeriodo(String idPeriodo) {
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
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
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

    /**
     * @return the idHorario
     */
    public int getIdHorario() {
        return idHorario;
    }

    /**
     * @param idHorario the idHorario to set
     */
    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }
    
    
}


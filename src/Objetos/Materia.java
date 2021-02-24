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
public class Materia {
   private String claveMateria; 
   private String unidadAprendizaje; 
   private int horasPracticas; 
   private int horasTeoricas; 
   private int creditos; 
   private int numeroPeriodo; 
   private String nucleo; 
   private String tipo; 
   private String claveCarrera; 
   private int planEstudios;

    public Materia(String claveMateria, String unidadAprendizaje, int horasPracticas, int horasTeoricas, int creditos, int numeroPeriodo, String nucleo, String tipo, String claveCarrera, int planEstudios) {
        this.claveMateria = claveMateria;
        this.unidadAprendizaje = unidadAprendizaje;
        this.horasPracticas = horasPracticas;
        this.horasTeoricas = horasTeoricas;
        this.creditos = creditos;
        this.numeroPeriodo = numeroPeriodo;
        this.nucleo = nucleo;
        this.tipo = tipo;
        this.claveCarrera = claveCarrera;
        this.planEstudios = planEstudios;
    }

    public Materia() {
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
     * @return the unidadAprendizaje
     */
    public String getUnidadAprendizaje() {
        return unidadAprendizaje;
    }

    /**
     * @param unidadAprendizaje the unidadAprendizaje to set
     */
    public void setUnidadAprendizaje(String unidadAprendizaje) {
        this.unidadAprendizaje = unidadAprendizaje;
    }

    /**
     * @return the horasPracticas
     */
    public int getHorasPracticas() {
        return horasPracticas;
    }

    /**
     * @param horasPracticas the horasPracticas to set
     */
    public void setHorasPracticas(int horasPracticas) {
        this.horasPracticas = horasPracticas;
    }

    /**
     * @return the horasTeoricas
     */
    public int getHorasTeoricas() {
        return horasTeoricas;
    }

    /**
     * @param horasTeoricas the horasTeoricas to set
     */
    public void setHorasTeoricas(int horasTeoricas) {
        this.horasTeoricas = horasTeoricas;
    }

    /**
     * @return the creditos
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    /**
     * @return the numeroPeriodo
     */
    public int getNumeroPeriodo() {
        return numeroPeriodo;
    }

    /**
     * @param numeroPeriodo the numeroPeriodo to set
     */
    public void setNumeroPeriodo(int numeroPeriodo) {
        this.numeroPeriodo = numeroPeriodo;
    }

    /**
     * @return the nucleo
     */
    public String getNucleo() {
        return nucleo;
    }

    /**
     * @param nucleo the nucleo to set
     */
    public void setNucleo(String nucleo) {
        this.nucleo = nucleo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the claveCarrera
     */
    public String getClaveCarrera() {
        return claveCarrera;
    }

    /**
     * @param claveCarrera the claveCarrera to set
     */
    public void setClaveCarrera(String claveCarrera) {
        this.claveCarrera = claveCarrera;
    }

    /**
     * @return the planEstudios
     */
    public int getPlanEstudios() {
        return planEstudios;
    }

    /**
     * @param planEstudios the planEstudios to set
     */
    public void setPlanEstudios(int planEstudios) {
        this.planEstudios = planEstudios;
    }
    
    
   
   
   
}

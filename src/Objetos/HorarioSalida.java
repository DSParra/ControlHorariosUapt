/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author JParra
 */
public class HorarioSalida {
    private String clave_horario;
    private String unidad_aprendizaje;
    private String nombre_grupo;
    private String periodo;
    private String profesor;
    private String dia;
    private String hr_entrada;
    private String hr_salida;

    public HorarioSalida(String clave_horario, String unidad_aprendizaje, String nombre_grupo, String periodo, String profesor, String dia, String hr_entrada, String hr_salida) {
        this.clave_horario = clave_horario;
        this.unidad_aprendizaje = unidad_aprendizaje;
        this.nombre_grupo = nombre_grupo;
        this.periodo = periodo;
        this.profesor = profesor;
        this.dia = dia;
        this.hr_entrada = hr_entrada;
        this.hr_salida = hr_salida;
    }

    public HorarioSalida() {
    }

    /**
     * @return the clave_materia
     */
    public String getClave_materia() {
        return clave_horario;
    }

    /**
     * @param clave_materia the clave_materia to set
     */
    public void setClave_materia(String clave_horario) {
        this.clave_horario = clave_horario;
    }

    /**
     * @return the unidad_aprendizaje
     */
    public String getUnidad_aprendizaje() {
        return unidad_aprendizaje;
    }

    /**
     * @param unidad_aprendizaje the unidad_aprendizaje to set
     */
    public void setUnidad_aprendizaje(String unidad_aprendizaje) {
        this.unidad_aprendizaje = unidad_aprendizaje;
    }

    /**
     * @return the nombre_grupo
     */
    public String getNombre_grupo() {
        return nombre_grupo;
    }

    /**
     * @param nombre_grupo the nombre_grupo to set
     */
    public void setNombre_grupo(String nombre_grupo) {
        this.nombre_grupo = nombre_grupo;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the profesor
     */
    public String getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(String profesor) {
        this.profesor = profesor;
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
     * @return the hr_entrada
     */
    public String getHr_entrada() {
        return hr_entrada;
    }

    /**
     * @param hr_entrada the hr_entrada to set
     */
    public void setHr_entrada(String hr_entrada) {
        this.hr_entrada = hr_entrada;
    }

    /**
     * @return the hr_salida
     */
    public String getHr_salida() {
        return hr_salida;
    }

    /**
     * @param hr_salida the hr_salida to set
     */
    public void setHr_salida(String hr_salida) {
        this.hr_salida = hr_salida;
    }    
}

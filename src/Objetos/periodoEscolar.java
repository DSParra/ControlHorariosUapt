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
public class periodoEscolar {
    private String id_periodo;
    private String periodo;

    public periodoEscolar() {
    }

    
    public periodoEscolar(String id_periodo, String periodo) {
        this.id_periodo = id_periodo;
        this.periodo = periodo;
    }

    /**
     * @return the id_periodo
     */
    public String getId_periodo() {
        return id_periodo;
    }

    /**
     * @param id_periodo the id_periodo to set
     */
    public void setId_periodo(String id_periodo) {
        this.id_periodo = id_periodo;
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
    
    
}

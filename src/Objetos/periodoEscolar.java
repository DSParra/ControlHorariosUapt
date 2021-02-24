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
    private int id_periodo;
    private int periodo;

    public periodoEscolar(int id_periodo, int periodo) {
        this.id_periodo = id_periodo;
        this.periodo = periodo;
    }

    /**
     * @return the id_periodo
     */
    public int getId_periodo() {
        return id_periodo;
    }

    /**
     * @param id_periodo the id_periodo to set
     */
    public void setId_periodo(int id_periodo) {
        this.id_periodo = id_periodo;
    }

    /**
     * @return the periodo
     */
    public int getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    
}

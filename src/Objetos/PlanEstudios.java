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
public class PlanEstudios {
    private String idPlan;
    private String planEstudios;
    private String claveCarrera;

    public PlanEstudios(String idPlan, String planEstudios, String claveCarrera) {
        this.idPlan = idPlan;
        this.planEstudios = planEstudios;
        this.claveCarrera = claveCarrera;
    }

    public PlanEstudios() {
    }

    /**
     * @return the idPlan
     */
    public String getIdPlan() {
        return idPlan;
    }

    /**
     * @param idPlan the idPlan to set
     */
    public void setIdPlan(String idPlan) {
        this.idPlan = idPlan;
    }

    /**
     * @return the planEstudios
     */
    public String getPlanEstudios() {
        return planEstudios;
    }

    /**
     * @param planEstudios the planEstudios to set
     */
    public void setPlanEstudios(String planEstudios) {
        this.planEstudios = planEstudios;
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
    
    
    
}

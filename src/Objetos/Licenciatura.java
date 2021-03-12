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
public class Licenciatura {
    private String CodigoLicenciatura;
    private String licenciatura;
    private String rfcCordinador;

    public Licenciatura(String idLicenciatura, String licenciatura, String rfcCordinador) {
        this.CodigoLicenciatura = idLicenciatura;
        this.licenciatura = licenciatura;
        this.rfcCordinador = rfcCordinador;
    }

    public Licenciatura() {
    }

    /**
     * @return the idLicenciatura
     */
    public String getIdLicenciatura() {
        return CodigoLicenciatura;
    }

    /**
     * @param idLicenciatura the idLicenciatura to set
     */
    public void setIdLicenciatura(String idLicenciatura) {
        this.CodigoLicenciatura = idLicenciatura;
    }

    /**
     * @return the licenciatura
     */
    public String getLicenciatura() {
        return licenciatura;
    }

    /**
     * @param licenciatura the licenciatura to set
     */
    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }

    /**
     * @return the rfcCordinador
     */
    public String getRfcCordinador() {
        return rfcCordinador;
    }

    /**
     * @param rfcCordinador the rfcCordinador to set
     */
    public void setRfcCordinador(String rfcCordinador) {
        this.rfcCordinador = rfcCordinador;
    }
    
    
    
    
}

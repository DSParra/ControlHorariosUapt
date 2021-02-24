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
public class Carrera {
    private String Carrera;
    private String nombre;
    private String rfcCordinador;

    public Carrera(String Carrera, String nombre, String rfcCordinador) {
        this.Carrera = Carrera;
        this.nombre = nombre;
        this.rfcCordinador = rfcCordinador;
    }

    public Carrera() {
    }

    /**
     * @return the Carrera
     */
    public String getCarrera() {
        return Carrera;
    }

    /**
     * @param Carrera the Carrera to set
     */
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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

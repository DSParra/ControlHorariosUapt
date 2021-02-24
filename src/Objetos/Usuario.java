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
public class Usuario {
    private int idUsuario;
    private String usuario;
    private String contra;
    private String preguntaSeguridad;
    private String respuestaSeguridad;

    public Usuario(int idUsuario, String usuario, String contra, String preguntaSeguridad, String respuestaSeguridad) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contra = contra;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
    }

    public Usuario() {
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contra
     */
    public String getContra() {
        return contra;
    }

    /**
     * @param contra the contra to set
     */
    public void setContra(String contra) {
        this.contra = contra;
    }

    /**
     * @return the preguntaSeguridad
     */
    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    /**
     * @param preguntaSeguridad the preguntaSeguridad to set
     */
    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    /**
     * @return the respuestaSeguridad
     */
    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    /**
     * @param respuestaSeguridad the respuestaSeguridad to set
     */
    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_residuos;

/**
 *
 * @author Sanchez Mesia
 */
public class Conductor extends Persona {

    /**
     * @return the licencia
     */
    public String getLicencia() {
        return licencia;
    }

    /**
     * @param licencia the licencia to set
     */
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    /**
     * @return the tipo_licencia
     */
    public String getTipo_licencia() {
        return tipo_licencia;
    }

    /**
     * @param tipo_licencia the tipo_licencia to set
     */
    public void setTipo_licencia(String tipo_licencia) {
        this.tipo_licencia = tipo_licencia;
    }
    private String licencia;
    private String tipo_licencia;
    
}

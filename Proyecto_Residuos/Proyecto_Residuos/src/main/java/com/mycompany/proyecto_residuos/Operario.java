/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_residuos;

/**
 *
 * @author Sanchez Mesia
 */
public class Operario extends Persona{

    /**
     * @return the Documento
     */
    public String getDocumento() {
        return Documento;
    }

    /**
     * @param Documento the Documento to set
     */
    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    private String Documento;
    private double sueldo ;
    
}

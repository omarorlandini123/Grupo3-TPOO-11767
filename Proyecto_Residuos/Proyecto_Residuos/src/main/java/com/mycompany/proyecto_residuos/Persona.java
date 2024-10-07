/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_residuos;

import java.util.Date;

/**
 *
 * @author Sanchez Mesia
 */
public class Persona {

   
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Documento
     */
    public String getDocumento() {
        return Documento;
    }

    /**
     * @param Documento the Documento to set
    publi     */
public void setDocumento(String Documento) {
        this.Documento = Documento;
    }
    private String Nombre;
    private String Apellido;
    private Date Fecha;
    private String Documento;
}

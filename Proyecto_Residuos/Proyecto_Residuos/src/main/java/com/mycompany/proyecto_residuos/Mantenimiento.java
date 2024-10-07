/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_residuos;

import java.util.Date;

/**
 *
 
 */
public class Mantenimiento {

    /**
     * @return the CodigoVehiculo
     */
    public String getCodigoVehiculo() {
        return CodigoVehiculo;
    }

    /**
     * @param CodigoVehiculo the CodigoVehiculo to set
     */
    public void setCodigoVehiculo(String CodigoVehiculo) {
        this.CodigoVehiculo = CodigoVehiculo;
    }

    /**
     * @return the Secuencia
     */
    public Integer getSecuencia() {
        return Secuencia;
    }

    /**
     * @param Secuencia the Secuencia to set
     */
    public void setSecuencia(Integer Secuencia) {
        this.Secuencia = Secuencia;
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
     * @return the Observacion
     */
    public String getObservacion() {
        return Observacion;
    }

    /**
     * @param Observacion the Observacion to set
     */
    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }
    private String CodigoVehiculo;
    private Integer Secuencia;
    private Date Fecha;
    private String Observacion;
}

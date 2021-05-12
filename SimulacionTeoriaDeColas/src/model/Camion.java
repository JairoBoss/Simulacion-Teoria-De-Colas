/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;

/**
 *
 * @author megabit
 */
public final class Camion {

    private Integer noCamion;
    private Double aleatorio;
    private Double tiempoEntreLlegada;
    private Double tiempoDeLlegada;
    private Double tiempoDeinicioServicio;
    private Double tiempoDeEspera;
    private Double tiempoDeServicio;
    private Double tiempoDeTerminacionServicio;
    private Double tiempoEnElSistema;
    private Double tiempoOcio;

    private Integer tasaDeLlegada;
    private Integer tiempoDeServicioMin;

    public Camion(Integer noCamion, Integer tasa, Integer tiempoDeServicio, Double tiempoDeLlegadaAnterior, Double tiempoDeFinalizacionAnterior) {

        this.noCamion = noCamion;
        this.tasaDeLlegada = tasa;
        this.tiempoDeServicioMin = tiempoDeServicio;

        setAleatorio();
        setTiempoEntreLlegada();
        setTiempoDeLlegada(tiempoDeLlegadaAnterior);
        setTiempoDeinicioServicio(tiempoDeFinalizacionAnterior);
        setTiempoDeEspera();
        setTiempoDeServicio();
        setTiempoDeTerminacionServicio();
        setTiempoEnElSistema();
        setTiempoOcio(tiempoDeFinalizacionAnterior);

    }

    public void setAleatorio() {
        this.aleatorio = Math.random();
    }

    public void setTiempoEntreLlegada() {
        this.tiempoEntreLlegada = (-Math.log(1 - this.aleatorio) / this.tasaDeLlegada) * 60;
    }

    public void setTiempoDeLlegada(Double tiempoDeLlegadaAnterior) {
        if (this.noCamion == 1) {
            this.tiempoDeLlegada = this.tiempoEntreLlegada;
        } else {
            this.tiempoDeLlegada = this.tiempoEntreLlegada + tiempoDeLlegadaAnterior;
        }
    }

    public void setTiempoDeinicioServicio(Double tiempoDeFinalizacionAnterior) {
        if (this.noCamion == 1) {
            this.tiempoDeinicioServicio = this.tiempoDeLlegada;
        } else {
            this.tiempoDeinicioServicio = selectMax(this.tiempoDeLlegada, tiempoDeFinalizacionAnterior);;
        }
    }

    public void setTiempoDeEspera() {
        this.tiempoDeEspera = this.tiempoDeinicioServicio - this.tiempoDeLlegada;
    }

    public void setTiempoDeServicio() {
        this.tiempoDeServicio = -Math.log(1 - Math.random()) / this.tiempoDeServicioMin * 60; //tasa de servicio
    }

    public void setTiempoDeTerminacionServicio() {
        this.tiempoDeTerminacionServicio = this.tiempoDeServicio + this.tiempoDeLlegada;
    }

    public void setTiempoEnElSistema() {
        this.tiempoEnElSistema = this.tiempoDeEspera + this.tiempoDeServicio;
    }

    public void setTiempoOcio(Double tiempoDeFinalizacionAnterior) {
        if (this.noCamion == 1) {
            this.tiempoOcio = this.tiempoDeinicioServicio;
        } else {
            this.tiempoOcio = this.tiempoDeinicioServicio - tiempoDeFinalizacionAnterior;
        }
    }

    private Double selectMax(Double x, Double y) {
        return x > y ? x : y;
    }

    public Integer getNoCamion() {
        return noCamion;
    }

    public Double getAleatorio() {
        return aleatorio;
    }

    public Double getTiempoEntreLlegada() {
        return tiempoEntreLlegada;
    }

    public Double getTiempoDeLlegada() {
        return tiempoDeLlegada;
    }

    public Double getTiempoDeinicioServicio() {
        return tiempoDeinicioServicio;
    }

    public Double getTiempoDeEspera() {
        return tiempoDeEspera;
    }

    public Double getTiempoDeServicio() {
        return tiempoDeServicio;
    }

    public Double getTiempoDeTerminacionServicio() {
        return tiempoDeTerminacionServicio;
    }

    public Double getTiempoEnElSistema() {
        return tiempoEnElSistema;
    }

    public Double getTiempoOcio() {
        return tiempoOcio;
    }

    public Integer getTasaDeLlegada() {
        return tasaDeLlegada;
    }

    public Integer getTiempoDeServicioMin() {
        return tiempoDeServicioMin;
    }

    @Override
    public String toString() {
        return String.format("%d, %.2f, %.2f, %.2f, %.2f, %.2f, %.2f, %.2f, %.2f, %f",noCamion, aleatorio, tiempoEntreLlegada, tiempoDeLlegada, tiempoDeinicioServicio,tiempoDeEspera,tiempoDeServicio,tiempoDeTerminacionServicio,tiempoEnElSistema,tiempoOcio);
    }
    
    
    
}

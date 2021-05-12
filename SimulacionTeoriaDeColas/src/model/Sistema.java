/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author megabit
 */
public class Sistema {
    
    
    private Integer tazaDeLlegada;
    private Integer tazaDeServicio;
    private Integer noPersonasXMinuto; //cada 3 minutos esta llegando una persona al negocio
    private Integer tiempoPromedioDeOfrecerServicio; //Capacidad promedio de atender al cliente
    private ArrayList<Camion> camiones; 

    public Sistema(Integer tazaDeLlegada, Integer tazaDeServicio) {
        
        this.tazaDeLlegada = tazaDeLlegada;
        this.tazaDeServicio = tazaDeServicio;
        this.camiones = new ArrayList<>();
        noPersonasXMinuto = 60 / this.tazaDeLlegada;
        tiempoPromedioDeOfrecerServicio = 60 / this.tazaDeServicio;
    }
    
    public void inicializar(){
        
        camiones.add(new Camion(1, 20, 30, 0.0, 0.0));
        for (int i = 2; i < 51; i++) {                        
            camiones.add(new Camion(i, this.tazaDeLlegada, this.tazaDeServicio, camiones.get(i-2).getTiempoDeLlegada(), camiones.get(i-2).getTiempoDeTerminacionServicio()));
        }
        for (Camion camione : camiones) {
            System.out.println(camione.toString());
        }
    }
    
    
    

    
    
    
    
    
    
    
}

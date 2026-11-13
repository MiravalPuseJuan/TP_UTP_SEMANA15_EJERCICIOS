/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juand
 */
public class Nave {
    private int capacidad;
    private String modelo;
    private String nombreNave;
    
    
    public Nave(int capacidad,String modelo,String nombreNave){
    this.capacidad=capacidad;
    this.modelo=modelo;
    this.nombreNave=nombreNave;
    
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @return the nombreNave
     */
    public String getNombreNave() {
        return nombreNave;
    }
    
    @Override
    public String toString(){
      return String.format("Nave: %s (modelo %s) - %d tripulantes",nombreNave,modelo,capacidad);
    }
    
}

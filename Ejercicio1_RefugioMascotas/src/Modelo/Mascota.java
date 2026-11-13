/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juand
 */
public class Mascota {
    private Adoptante adoptante;//CAMBIO
    private int edad;
    private String especie;
    private String nombre;
    
    public Mascota(Adoptante adoptante,int edad,String especie,String nombre){
        this.adoptante=adoptante;
        this.edad=edad;
        this.especie=especie;
        this.nombre=nombre;
    }

    /**
     * @return the adoptante
     */
    public Adoptante getAdoptante() {
        return adoptante;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    @Override 
    public String toString(){
      return String.format("Mascota: %s [%s, %d años]\n",nombre,especie,edad)
              + ("  -> Adoptante: " +adoptante.toString());  
    }
    
    public boolean esCachorro(){
        if(edad<2){
            return true;
        }else{
            return false;
        }
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juand
 */
public class Mision {
    private int anioLanzamiento;
    private Astronauta astronauta;
    private String codigo;
    private String destino;
    private Nave nave;
    
    public Mision(int anioLanzamiento,Astronauta astronauta,String codigo,String destino,Nave nave){
      this.anioLanzamiento=anioLanzamiento;
      this.astronauta=astronauta;
      this.codigo=codigo;
      this.destino=destino;
      this.nave=nave;
    
    }

    /**
     * @return the anioLanzamiento
     */
    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    /**
     * @return the astronauta
     */
    public Astronauta getAstronauta() {
        return astronauta;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @return the nave
     */
    public Nave getNave() {
        return nave;
    }
    
    @Override
    public String toString(){
        return String.format("Misión [%s]: destino %s (%d)\n",codigo,destino,anioLanzamiento)
                +"  -> Comandante: " +astronauta.toString()
                +"\n  -> " +nave.toString();
    }
    
}

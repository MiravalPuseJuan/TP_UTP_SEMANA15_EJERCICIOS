/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juand
 */
public class Presentacion {
    private Banda banda;
    private String codigo;
    private int duracionMinutos;
    private String escenario;
    
    public Presentacion(Banda banda,String codigo,int duracionMinutos,String escenario){
        this.banda=banda;
        this.codigo=codigo;
        this.duracionMinutos=duracionMinutos;
        this.escenario=escenario;
        
    }

    /**
     * @return the banda
     */
    public Banda getBanda() {
        return banda;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the duracionMinutos
     */
    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    /**
     * @return the escenario
     */
    public String getEscenario() {
        return escenario;
    }
    
    @Override
    public String toString(){
        return String.format("Presentación [%s] en escenario Principal (%d min)\n",codigo,duracionMinutos)
                +("  -> Banda: " +banda.toString());
                
    }
    
}

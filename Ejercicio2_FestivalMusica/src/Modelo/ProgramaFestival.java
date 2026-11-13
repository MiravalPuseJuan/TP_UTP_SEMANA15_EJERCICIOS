/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juand
 */
public class ProgramaFestival {
    private int contador;
    private Presentacion[] presentaciones;
    
    public ProgramaFestival(int capacidad){
        this.contador=0;
        this.presentaciones=new Presentacion[capacidad];
    }
    
    public Presentacion[] obtenerTodas(){
        Presentacion[] resultado=new Presentacion[contador];
        for(int i=0;i<contador;i++){
            resultado[i]=presentaciones[i];
        }
        return resultado;
    }
    public boolean agregar(Presentacion p){
        if(contador<presentaciones.length){
            presentaciones[contador]=p;
            contador++;
            return true;
        }else{
            return false;
        }
        
    }
    public int calcularDuracionTotal(){
       int total=0;
       for(int i=0;i<contador;i++){
           total+=presentaciones[i].getDuracionMinutos();
       }
       return total;
        
    }
    public String listar(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<contador;i++){
        sb.append(
                String.format("%d. %s - %s - %d min\n",i+1,presentaciones[i].getCodigo()
                ,presentaciones[i].getBanda().getNombre(),presentaciones[i].getDuracionMinutos())
        );
        
   
        }
        sb.append(
                String.format("Duración total: %d min",calcularDuracionTotal())
        ); 
        return sb.toString();
    }
}

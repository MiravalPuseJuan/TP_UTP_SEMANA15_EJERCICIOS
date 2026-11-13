/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juand
 */
public class RegistroMision {
    private int contador;
    private Mision[] misiones;
    
    public RegistroMision(int capacidad){
      this.contador=0;
      this.misiones=new Mision[capacidad];
    
    }
    public Mision[] obtenerTodas(){
        Mision[] resultado= new Mision[contador];
        for(int i=0;i<contador;i++){
            resultado[i]=misiones[i];
            
        }
        return resultado;
    }
    
    public boolean agregar(Mision m){
        if(contador<misiones.length){
            misiones[contador]=m;
            contador++;
           return true;
        }else{
            return false;
        }
    }
    
    public static String generarReporte(Mision[] lista){
        StringBuilder sb= new StringBuilder();
        sb.append(
                String.format("%-10s | %-15s | %-5s | %-20s | %-15s\n","CÓDIGO","DESTINO","AÑO","COMANDANTE","NAVE"
                )
        );
        sb.append("-----------------------------------------------------------------------------\n");
        for(int i=0;i<lista.length;i++){
           sb.append(
                String.format("%-10s | %-15s | %-5d | %-20s | %-15s\n",lista[i].getCodigo(),lista[i].getDestino(),
                        lista[i].getAnioLanzamiento(),lista[i].getAstronauta().getNombre(),lista[i].getNave().getNombreNave())
                
        ); 
           
        }
        sb.append("-----------------------------------------------------------------------------\n");
        sb.append(
            String.format("Total de misiones: %d\n",lista.length)
        );
        return sb.toString();
    }
}

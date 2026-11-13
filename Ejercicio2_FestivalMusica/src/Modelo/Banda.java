package Modelo;

public class Banda {
private String genero;
private String nombre;
private String pais;

public Banda(String genero,String nombre,String pais){
  this.genero=genero;
  this.nombre=nombre;
  this.pais=pais;
  
  


}

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }
    
    
    @Override
    public String toString(){
        return String.format("%s (%s, %s)",nombre,genero,pais);
    }
}


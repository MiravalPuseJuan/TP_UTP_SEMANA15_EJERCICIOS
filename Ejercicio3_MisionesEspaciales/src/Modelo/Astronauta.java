package Modelo;

public class Astronauta {

    private int horasVuelo;
    private String nombre;
    private String pais;

    public Astronauta(int horasVuelo, String nombre, String pais) {
        this.horasVuelo = horasVuelo;
        this.nombre = nombre;
        this.pais = pais;

    }

    /**
     * @return the horasVuelo
     */
    public int getHorasVuelo() {
        return horasVuelo;
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
       return String.format("%s (%s, %d h de vuelo)",nombre,pais,horasVuelo);
    
    }
    

}

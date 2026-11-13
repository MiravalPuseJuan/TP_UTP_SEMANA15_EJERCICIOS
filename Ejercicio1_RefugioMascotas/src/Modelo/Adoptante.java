package Modelo;

public class Adoptante {

    private String distrito;
    private int edad;
    private String nombre;

    public Adoptante(String distrito, int edad, String nombre) {
        this.distrito = distrito;
        this.edad = edad;
        this.nombre = nombre;

    }

    /**
     * @return the distrito
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString(){
        return String.format("%s (%d años) - %s",nombre,edad,distrito);
    }

}

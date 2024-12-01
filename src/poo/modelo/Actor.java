package poo.modelo;

public class Actor {
    private String nombre;
    private String pais;
    
    public Actor(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    
    public String getNombre() {
        return nombre;
    }
}

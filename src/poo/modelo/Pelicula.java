package poo.modelo;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;

    public Pelicula(String titulo, int duracion, String genero, String estudio) {
        super(titulo, duracion, genero);
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Pelicula: " + getTitulo() + ", Duración: " + getDuracion() + " min, Género: " + getGenero() + ", Estudio: " + estudio);
    }
}


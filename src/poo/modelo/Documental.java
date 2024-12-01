package poo.modelo;

public class Documental extends ContenidoAudiovisual {
    private String tema;

    public Documental(String titulo, int duracion, String genero, String tema) {
        super(titulo, duracion, genero);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Documental: " + getTitulo() + ", Duración: " + getDuracion() + " min, Género: " + getGenero() + ", Tema: " + tema);
    }
}


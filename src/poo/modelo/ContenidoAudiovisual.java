package poo.modelo;

public abstract class ContenidoAudiovisual {
    private String titulo;
    private int duracion; // en minutos
    private String genero;

    public ContenidoAudiovisual(String titulo, int duracion, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public abstract void mostrarDetalles(); // Método abstracto para mostrar detalles
}

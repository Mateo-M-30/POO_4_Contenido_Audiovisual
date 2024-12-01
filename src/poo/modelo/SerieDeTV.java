package poo.modelo;

import java.util.*;

public class SerieDeTV extends ContenidoAudiovisual {
    private int numeroTemporadas;
    private List<Temporada> listaTemporadas = new ArrayList<>();

    public SerieDeTV(String titulo, int duracion, String genero, int numeroTemporadas) {
        super(titulo, duracion, genero);
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public List<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Serie: " + getTitulo() + ", Duración: " + getDuracion() + " min, Género: " + getGenero() + ", Número de temporadas: " + numeroTemporadas);
    }
}

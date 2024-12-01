package poo.util;

import poo.modelo.*;
import java.io.*;
import java.util.*;

public class ArchivoUtil {

    // Método para escribir en un archivo CSV
    public static void escribirEnArchivo(String archivo, List<ContenidoAudiovisual> contenidos) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
        
        for (ContenidoAudiovisual contenido : contenidos) {
            if (contenido instanceof Pelicula) {
                Pelicula pelicula = (Pelicula) contenido;
                writer.write("Pelicula," + pelicula.getTitulo() + "," + pelicula.getDuracion() + "," + pelicula.getGenero() + "," + pelicula.getEstudio() + "\n");
            } else if (contenido instanceof SerieDeTV) {
                SerieDeTV serie = (SerieDeTV) contenido;
                writer.write("SerieDeTV," + serie.getTitulo() + "," + serie.getDuracion() + "," + serie.getGenero() + "," + serie.getListaTemporadas().size() + "\n");
            } else if (contenido instanceof Documental) {
                Documental documental = (Documental) contenido;
                writer.write("Documental," + documental.getTitulo() + "," + documental.getDuracion() + "," + documental.getGenero() + "," + documental.getTema() + "\n");
            }
        }
        writer.close();
    }

    // Método para leer contenidos desde un archivo CSV
    public static List<ContenidoAudiovisual> leerDeArchivo(String archivo) throws IOException {
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(archivo));
        String linea;

        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            String tipo = datos[0];

            if ("Pelicula".equals(tipo)) {
                String titulo = datos[1];
                int duracion = Integer.parseInt(datos[2]);
                String genero = datos[3];
                String estudio = datos[4];
                contenidos.add(new Pelicula(titulo, duracion, genero, estudio));
            } else if ("SerieDeTV".equals(tipo)) {
                String titulo = datos[1];
                int duracion = Integer.parseInt(datos[2]);
                String genero = datos[3];
                int numeroTemporadas = Integer.parseInt(datos[4]);
                contenidos.add(new SerieDeTV(titulo, duracion, genero, numeroTemporadas));
            } else if ("Documental".equals(tipo)) {
                String titulo = datos[1];
                int duracion = Integer.parseInt(datos[2]);
                String genero = datos[3];
                String tema = datos[4];
                contenidos.add(new Documental(titulo, duracion, genero, tema));
            }
        }
        reader.close();
        return contenidos;
    }
}

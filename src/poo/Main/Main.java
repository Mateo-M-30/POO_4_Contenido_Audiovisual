package poo.Main;

import poo.modelo.*;
import poo.util.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Crear una lista para almacenar los contenidos
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Menú para agregar contenidos
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Agregar Película");
            System.out.println("2. Agregar Serie de TV");
            System.out.println("3. Agregar Documental");
            System.out.println("4. Guardar en archivo CSV");
            System.out.println("5. Mostrar contenidos almacenados");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1: // Agregar Película
                    System.out.print("Ingrese el título de la película: ");
                    String tituloPelicula = scanner.nextLine();
                    System.out.print("Ingrese la duración (minutos): ");
                    int duracionPelicula = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer
                    System.out.print("Ingrese el género: ");
                    String generoPelicula = scanner.nextLine();
                    System.out.print("Ingrese el estudio: ");
                    String estudio = scanner.nextLine();
                    contenidos.add(new Pelicula(tituloPelicula, duracionPelicula, generoPelicula, estudio));
                    break;

                case 2: // Agregar Serie de TV
                    System.out.print("Ingrese el título de la serie: ");
                    String tituloSerie = scanner.nextLine();
                    System.out.print("Ingrese la duración (minutos): ");
                    int duracionSerie = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer
                    System.out.print("Ingrese el género: ");
                    String generoSerie = scanner.nextLine();
                    System.out.print("Ingrese el número de temporadas: ");
                    int numeroTemporadas = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer
                    contenidos.add(new SerieDeTV(tituloSerie, duracionSerie, generoSerie, numeroTemporadas));
                    break;

                case 3: // Agregar Documental
                    System.out.print("Ingrese el título del documental: ");
                    String tituloDocumental = scanner.nextLine();
                    System.out.print("Ingrese la duración (minutos): ");
                    int duracionDocumental = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer
                    System.out.print("Ingrese el género: ");
                    String generoDocumental = scanner.nextLine();
                    System.out.print("Ingrese el tema del documental: ");
                    String tema = scanner.nextLine();
                    contenidos.add(new Documental(tituloDocumental, duracionDocumental, generoDocumental, tema));
                    break;

                case 4: // Guardar en archivo CSV
                    try {
                        ArchivoUtil.escribirEnArchivo("contenidos.csv", contenidos);
                        System.out.println("Contenido guardado exitosamente en el archivo contenidos.csv");
                    } catch (IOException e) {
                        System.out.println("Error al guardar en el archivo: " + e.getMessage());
                    }
                    break;

                case 5: // Mostrar los contenidos almacenados
                    try {
                        List<ContenidoAudiovisual> contenidosLeidos = ArchivoUtil.leerDeArchivo("contenidos.csv");
                        System.out.println("\n--- Contenidos Almacenados ---");
                        for (ContenidoAudiovisual contenido : contenidosLeidos) {
                            contenido.mostrarDetalles();
                        }
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo: " + e.getMessage());
                    }
                    break;

                case 6: // Salir
                    continuar = false;
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}

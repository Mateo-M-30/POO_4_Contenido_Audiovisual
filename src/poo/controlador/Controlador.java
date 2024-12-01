package poo.controlador;

import poo.modelo.*;
import poo.util.*;
import poo.vista.*;
import java.io.IOException;
import java.util.*;

public class Controlador {
    
    private List<ContenidoAudiovisual> contenidos = new ArrayList<>();
    
    public void ejecutar() throws IOException {
        int opcion;
        do {
            Vista.mostrarMenu();
            opcion = Vista.leerOpcion();
            
            switch (opcion) {
                case 1:
                    contenidos = ArchivoUtil.leerDeArchivo("contenidos.csv");
                    break;
                case 2:
                    Vista.mostrarContenidos(contenidos);
                    break;
                case 3:
                    ArchivoUtil.escribirEnArchivo("contenidos.csv", contenidos);
                    break;
                case 4:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 4);
    }
}

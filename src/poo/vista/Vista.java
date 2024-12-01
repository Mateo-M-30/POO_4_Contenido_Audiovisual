package poo.vista;

import poo.modelo.*;
import poo.util.*;
import java.io.IOException;
import java.util.*;

public class Vista {
    
    public static void mostrarMenu() {
        System.out.println("1. Leer contenidos desde archivo");
        System.out.println("2. Mostrar contenidos");
        System.out.println("3. Guardar contenidos en archivo");
        System.out.println("4. Salir");
    }
    
    public static void mostrarContenidos(List<ContenidoAudiovisual> contenidos) {
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
    
    public static int leerOpcion() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}

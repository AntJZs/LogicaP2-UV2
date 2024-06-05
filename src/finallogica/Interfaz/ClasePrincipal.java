package finallogica.Interfaz;

import finallogica.Clases.Directivo;
import finallogica.Clases.Director;
import finallogica.Clases.Estudiante;
import finallogica.Clases.Fijas.Posgrado;
import finallogica.Clases.Fijas.Pregrado;
import finallogica.Clases.Fijas.TrabajoDeGrado;
import finallogica.Clases.Graduando;
import finallogica.Modelo.BasesDeDatos.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;

/**
 *
 * @author AntJZ
 * @comment main class of the package
 * 
 * 
 * 
 */
public class ClasePrincipal {
    private static java.net.URL url = ClassLoader.getSystemResource("finallogica/Interfaz/img/favicon.png");
    
    public static Image favicon = Toolkit.getDefaultToolkit().createImage(url);
    public static LinkedList<Pregrado> pregrado = new LinkedList<>();
    public static LinkedList<Posgrado> posgrado = new LinkedList<>();
    public static LinkedList<Estudiante> estudiante = new LinkedList<>();
    public static LinkedList<Graduando> graduando = new LinkedList<>();
    public static LinkedList<Director> director = new LinkedList<>();
    public static LinkedList<TrabajoDeGrado> tg = new LinkedList<>();
    public static Directivo directivo = new Directivo("admin");
    public static int IdSesion;
    public static void main(String[] args) {
        /*
            CARGAR BASES DE DATOS.
          Se cargan primero las listas en CSV, para así tener las relaciones hechas.
        */
        
        Bd_Pregrado pregrados_s = new Bd_Pregrado("PREGRADOS.csv");
        pregrado = pregrados_s.obtener();
        Bd_Posgrado posgrados_s = new Bd_Posgrado("POSGRADOS.csv");
        posgrado = posgrados_s.obtener();
        Bd_TrabajoDeGrado trabajos_s = new Bd_TrabajoDeGrado("TRABAJOSDEGRADO.csv");
        tg = trabajos_s.obtener();
        Bd_Director directores_s = new Bd_Director("DIRECTORES.csv");
        director =  directores_s.obtener();
        Bd_Estudiante estudiantes_s = new Bd_Estudiante("ESTUDIANTES.csv");
        estudiante = estudiantes_s.obtener();
        Bd_Graduando graduandos_s = new Bd_Graduando("GRADUANDOS.csv");
        // graduando = graduandos_s.obtener(); // A implementar...
        
        // El codigo va a ser siempre 604802 por conveniencia, luego se va a permitir cambiar.
        
        // Hacer estudiantes egresados (graduandos). Esto se debe hacer cuando vaya a realizar
        // La solicitud y cumpla con los requisitos.
        
        // Se inicia la Interfaz
        Inicio init = new Inicio();
        init.setVisible(true);
    }

}

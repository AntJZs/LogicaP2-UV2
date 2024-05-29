package finallogica.Interfaz;

import finallogica.Clases.Carrera;
import finallogica.Clases.Directivo;
import finallogica.Clases.Director;
import finallogica.Clases.Estudiante;
import finallogica.Clases.Fijas.Posgrado;
import finallogica.Clases.Fijas.Pregrado;
import finallogica.Clases.Fijas.TrabajoDeGrado;
import finallogica.Clases.Graduando;
import java.util.ArrayList;
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
    public static LinkedList<Pregrado> pregrado = new LinkedList<>();
    public static LinkedList<Posgrado> posgrado = new LinkedList<>();
    public static LinkedList<Estudiante> estudiante = new LinkedList<>();
    public static LinkedList<Graduando> graduando = new LinkedList<>();
    public static LinkedList<Director> director = new LinkedList<>();
    public static ArrayList<TrabajoDeGrado> tg = new ArrayList<>();
    public static Directivo directivo = new Directivo("admin");

    public static void main(String[] args) {
        // Se agrega el directivo y el nombre de usuario del directivo
        
        // El codigo va a ser siempre 604802 por conveniencia, luego se va a permitir cambiar.
        
        // Hacer estudiantes egresados (graduandos). Esto se debe hacer cuando vaya a realizar
        // La solicitud y cumpla con los requisitos.
        
        // Se inicia la Interfaz
        Inicio init = new Inicio();
        init.setVisible(true);
    }

}

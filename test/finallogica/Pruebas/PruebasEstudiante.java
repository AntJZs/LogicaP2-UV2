package finallogica.Pruebas;

import finallogica.Clases.Carrera;
import finallogica.Clases.Directivo;
import finallogica.Clases.Estudiante;
import finallogica.Clases.Fijas.Pregrado;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author AntJZ
 * @comment main class of the package
 */
public class PruebasEstudiante {
    public static LinkedList<Estudiante> estudiante = new LinkedList<>();
    
    public static void main(String[] args) {
        
        Pregrado c = new Pregrado(60, "Pavimentación aerea", Carrera.facultades.INGENIERIAS);
        estudiante.add(new Estudiante("Antonio", "De León",Estudiante.tipo_documento.TARJETA_IDENTIDAD, "105060", "3016302",c,Estudiante.estado_matricula.ACTIVO, Estudiante.estado_graduacion.EGRESADO));
        Directivo directivo = new Directivo("admin"); // El codigo va a ser siempre 604802
    }

}

/*
 * 
 */
package finallogica.Pruebas;

import finallogica.ArchivosPlanos.BasesDeDatos.Bd_Posgrado;
import finallogica.ArchivosPlanos.BasesDeDatos.Bd_Pregrado;
import finallogica.Clases.Fijas.Posgrado;
import finallogica.Clases.Fijas.Pregrado;
import finallogica.Clases.Carrera;
import finallogica.Clases.Estudiante;
import finallogica.ArchivosPlanos.BasesDeDatos.Bd_Estudiante;
import java.util.LinkedList;

/**
 *
 * @author AntJZ
 * 
 *  Este es un documento para probar las listas, y que los tipos de 
 */
public class PruebasCarrera {
    public static LinkedList<Pregrado> pregrado = new LinkedList<>();
    public static LinkedList<Posgrado> posgrado = new LinkedList<>();
    public static LinkedList<Carrera> carreras = new LinkedList<>();
    public static LinkedList<Estudiante> estudiantes = new LinkedList<>();
    
    public static void main(String[] args) {
        // Añade una nueva carrera de una facultad. Pregrado y Posgrado
        Bd_Pregrado s_pregrados = new Bd_Pregrado("PREGRADOS.csv");
        Bd_Posgrado s_posgrados = new Bd_Posgrado("POSGRADOS.csv");
        Bd_Estudiante s_estudiantes = new Bd_Estudiante("ESTUDIANTES.csv");
        
        pregrado = s_pregrados.obtener();
        posgrado = s_posgrados.obtener();
        // Clasificando estudiantes...
        estudiantes = s_estudiantes.obtener();
        // Crear nuevo estudiante

        estudiantes.add(new Estudiante("Antonio", "De León",Estudiante.tipo_documento.TARJETA_IDENTIDAD, "15001912", "30163024040",pregrado.getFirst() ,Estudiante.estado_matricula.ACTIVO, Estudiante.estado_graduacion.EGRESADO));
        estudiantes.add(new Estudiante("Martha", "De La Hoz", Estudiante.tipo_documento.CEDULA_CIUDADANIA, "9322544", "3206462453", posgrado.getLast(), Estudiante.estado_matricula.ACTIVO, Estudiante.estado_graduacion.GRADUADO));
        s_estudiantes.actualizar(estudiantes);
        
        
        
    }
}

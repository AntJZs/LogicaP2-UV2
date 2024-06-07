package finallogica.Modelo.BasesDeDatos;

import finallogica.Clases.Carrera;
import finallogica.Clases.Fijas.Posgrado;
import finallogica.Modelo.BasesDeDatos.Bd_Pregrado;
import finallogica.Clases.Fijas.Pregrado;
import finallogica.Modelo.Operaciones;
import java.util.LinkedList;

/**
 *
 * @author AntJZ
 * @comment main class of the package
 */
public class MainArchivos {

    public static LinkedList<Pregrado> pregrado = new LinkedList<>();//ClasePrincipal.carrera;
    public static LinkedList<Posgrado> posgrado = new LinkedList<>();//ClasePrincipal.carrera;
    // Ya creada una lista para almacenar todos los pregrados, se hace lo siguente
    public static void main(String[] args) {
        
        // Se carga la base de datos de pregrado
        Bd_Pregrado db_pregrado = new Bd_Pregrado("PREGRADOS.csv");
        Bd_Posgrado db_posgrado = new Bd_Posgrado("POSGRADOS.csv");
        // Se obtienen todos los datos de pregrado para cargarlos al programa.
        pregrado = db_pregrado.obtener();
        posgrado = db_posgrado.obtener();
        // PROFIT!...


    }

}

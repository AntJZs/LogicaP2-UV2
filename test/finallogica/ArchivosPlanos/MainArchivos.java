package finallogica.ArchivosPlanos;

import finallogica.ArchivosPlanos.BasesDeDatos.Bd_Pregrado;
import finallogica.Clases.Fijas.Pregrado;
import java.util.LinkedList;

/**
 *
 * @author AntJZ
 * @comment main class of the package
 */
public class MainArchivos {

    public static LinkedList<Pregrado> pregrado = new LinkedList<>();//ClasePrincipal.carrera;
    public static void main(String[] args) {
        Bd_Pregrado db_pregrado = new Bd_Pregrado("PREGRADO.csv");
        pregrado = db_pregrado.obtener();
        for (Pregrado p : pregrado) {
            p.getNombre();
        }
    }

}

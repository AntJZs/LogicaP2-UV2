package finallogica.Interfaz;

import finallogica.Clases.Estudiante;
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
    public static LinkedList<Estudiante> estudiante = new LinkedList<>();
    
    public static void main(String[] args) {
        Inicio init = new Inicio();
        init.setVisible(true);
    }

}

/*
 * 
 */
package finallogica.Modelo;

import finallogica.Clases.Director;
import finallogica.Clases.Estudiante;
import finallogica.Clases.Graduando;
import finallogica.Interfaz.ClasePrincipal;

/**
 *
 * @author AntJZ
 */
public class Operaciones {
    /*
     BÚSQUEDA
    Estos buscan dentro de todos los LinkedList que existen en ClasePrincipal,
    para llegar a una coincidencia o ninguna, esto ahorra trabajo, sabiendo que
    todas las tablas ya estan llenas cuando estas operaciones se realicen.
    
    Puede que estas funciones solo funcionen dentro del código realizado, mas no
    se use en las interfaces.
    */
    
    // public static Estudiante buscarEstudiante(int codigo)
    
    // No existe buscarEstudiante, ya que mientras esté con la sesión abierta
    // no se va a necesitar.
    
    public static Director buscarDirector(int director) {
        for (Director d : ClasePrincipal.director) {
            if (d.getNumeroDirector() == director) {
                return d;
            }
        }
        return null;
    }
}

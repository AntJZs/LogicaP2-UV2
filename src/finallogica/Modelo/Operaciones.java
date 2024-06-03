/*
 * 
 */
package finallogica.Modelo;

import finallogica.Clases.Director;
import finallogica.Clases.Estudiante;
import finallogica.Clases.Fijas.Posgrado;
import finallogica.Clases.Fijas.Pregrado;
import finallogica.Clases.Fijas.TrabajoDeGrado;
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
    
        /*
     ELIMINACIÓN
    Estas son propias del prorgama, por lo que deben ser usadas por separado.
    Para hacer esta operación conjunta, se tiene que hacer una sobrecarga de
    constructores, y tener en cuenta la clase principal...
    
    NOTA: Esto es experimental, y si se borran datos, estos no deben aparecer
    en otros usuarios, ya que si se intentan buscar al principio de la ejecución
    no podrán ser creados. Esto se tiene muy en cuenta con
        Estudiante <-> Graduando
        TrabajoDeGrado <-> Director
    
    X - El código no va a estar implementado a tiempo, por lo que esto puede no funcionar
    tan bien, y pueden romperse ciertas relaciones cuando se eliminen, lo que perjudica
    la estabilidad.
    X - ¿Por qué objetos?
        Son más fáciles de trabajar, y si el objeto tiene que ver con la clase de cada uno
        Significa que está ahí dentro, y lo elimina. Ya cuando se ejecute, se actualiza la
        tabla, y ya desaparece. Clever Programming.
    */
    
    public static boolean eliminarRegistro(Object o) {
        if (ClasePrincipal.estudiante.contains(o)) {
            ClasePrincipal.estudiante.remove(o);
            return true;
        } else if (ClasePrincipal.tg.contains(o)) {
            ClasePrincipal.tg.remove(o);
            return true;
        } else if (ClasePrincipal.pregrado.contains(o)) {
            ClasePrincipal.pregrado.remove(o);
            return true;
        } else if (ClasePrincipal.posgrado.contains(o)) {
            ClasePrincipal.posgrado.remove(o);
            return true;
        } else if (ClasePrincipal.director.contains(o)) {
            ClasePrincipal.director.remove(o);
            return true;
        }
        System.out.println("Operaciones.Registros: No se pudo eliminar, revisa el tipo de dato e intenta de nuevo.");
        return false;
    }
}

/*
 * 
 */
package finallogica.Modelo;

import finallogica.Clases.Director;
import finallogica.Clases.Estudiante;
import finallogica.Clases.Fijas.Posgrado;
import finallogica.Clases.Fijas.Pregrado;
import finallogica.Clases.Fijas.TrabajoDeGrado;
import finallogica.Interfaz.ClasePrincipal;
import finallogica.Modelo.BasesDeDatos.Bd_Director;
import finallogica.Modelo.BasesDeDatos.Bd_Estudiante;
import finallogica.Modelo.BasesDeDatos.Bd_Graduando;
import finallogica.Modelo.BasesDeDatos.Bd_Posgrado;
import finallogica.Modelo.BasesDeDatos.Bd_Pregrado;
import finallogica.Modelo.BasesDeDatos.Bd_TrabajoDeGrado;

/**
 *
 * @author AntJZ
 */
public class Operaciones {
    
    private static Bd_Pregrado pregrados_s = new Bd_Pregrado("PREGRADOS.csv");
    private static Bd_Posgrado posgrados_s = new Bd_Posgrado("POSGRADOS.csv");
    private static Bd_TrabajoDeGrado trabajos_s = new Bd_TrabajoDeGrado("TRABAJOSDEGRADO.csv");
    private static Bd_Director directores_s = new Bd_Director("DIRECTORES.csv");
    private static Bd_Estudiante estudiantes_s = new Bd_Estudiante("ESTUDIANTES.csv");
    // private static Bd_Graduando graduandos_s = new Bd_Graduando("GRADUANDOS.csv");
    
    
    /*
     BÚSQUEDA
    Estos buscan dentro de todos los LinkedList que existen en ClasePrincipal,
    para llegar a una coincidencia o ninguna, esto ahorra trabajo, sabiendo que
    todas las tablas ya estan llenas cuando estas operaciones se realicen.
    
    Puede que estas funciones solo funcionen dentro del código realizado, mas no
    se use en las interfaces.
    */
    
    // public static Estudiante buscarEstudiante(int codigo)
    
    
    public static void cargarBasesDeDatos() {
        ClasePrincipal.pregrado = pregrados_s.obtener();
        ClasePrincipal.posgrado = posgrados_s.obtener();
        // tg = trabajos_s.obtener();
        // director =  directores_s.obtener();
        ClasePrincipal.estudiante = estudiantes_s.obtener();
        
    }
    public static boolean actualizarBasesDeDatos() {
    System.out.println("Actualizando base de datos...");
    return estudiantes_s.actualizar(ClasePrincipal.estudiante);
    }
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
     BÚSQUEDA AVANZADA
    Estas son propias del programa, son flexibles y útiles en el transcurso del
    programa. Estas buscan si están empaquetadas dentro de algun objeto, y devuelve
    el tipo de objeto y el índice de dónde se encuentra. 
    */
    public static int  buscarTipo(Object data) {
        if (ClasePrincipal.estudiante.contains(data)) {
            return 0;
        } else if (ClasePrincipal.tg.contains(data)) {
            return 1;
        } else if (ClasePrincipal.pregrado.contains(data)) {
            return 2;
        } else if (ClasePrincipal.posgrado.contains(data)) {
            return 3;
        }
        System.out.println("Operaciones.buscarTipo: No se ha encontrado el tipo de dato. Compruebe los datos disponibles y si el objeto es válido.");
        return -1;
    }
   
    public static int buscarIndice(Object data) {
        if (ClasePrincipal.estudiante.contains(data)) {
            return ClasePrincipal.estudiante.indexOf(data);
        } else if (ClasePrincipal.pregrado.contains(data)) {
            return ClasePrincipal.estudiante.indexOf(data);
        } else if (ClasePrincipal.posgrado.contains(data)) {
            return ClasePrincipal.estudiante.indexOf(data);
        } else if (ClasePrincipal.tg.contains(data)) {
            return ClasePrincipal.tg.indexOf(data);
        }
        System.out.println("Operaciones.buscarIndice: No se ha encontrado el dato. Compruebe los datos disponibles y si el objeto es válido.");
        return -1;
    }
        public static Object buscarCarrera(int cod_carrera) {
                  for (Pregrado pregrado : ClasePrincipal.pregrado) {
                    if (pregrado.isPregrado(cod_carrera)) {
                        return pregrado;
                    }
                }
                for (Posgrado posgrado : ClasePrincipal.posgrado) {
                    if (posgrado.isPosgrado(cod_carrera)) {
                        return posgrado;
                        }
                }
                return null;
    }
        /*
     ADICIÓN
    Propias del programa, usadas por clases de la interfaz. Detecta el tipo de dato
    y lo agrega al final de la lista.
        */

        public static void agregarRegistro(Object o) {
            if (Estudiante.class.isInstance(o)) {
                ClasePrincipal.estudiante.add(Estudiante.class.cast(o)); 
            } else if (TrabajoDeGrado.class.isInstance(o)) {
                ClasePrincipal.tg.add(TrabajoDeGrado.class.cast(o)); 
            } else if (Pregrado.class.isInstance(o)) {
                ClasePrincipal.pregrado.add(Pregrado.class.cast(o)); 
            } else if (Posgrado.class.isInstance(o)) {
                ClasePrincipal.posgrado.add(Posgrado.class.cast(o)); 
            } else {
                System.out.println("Operaciones.agregarEstudiante: El objeto ingresado es invalido.");
            }
        }
        public static void agregarEstudiante(Object o) {
            if(o != null) {
                ClasePrincipal.estudiante.add(Estudiante.class.cast(o)); 
            }
            else {
                System.out.println("Operaciones.agregarEstudiante: El estudiante ingresado es invalido.");
                System.out.println(o);
            }
        }
        /*
     ELIMINACIÓN
    Estas son propias del prorgama, por lo que deben ser usadas por separado..
    
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
            ClasePrincipal.estudiante.remove(Estudiante.class.cast(o));
            return actualizarBasesDeDatos();
        } else if (ClasePrincipal.tg.contains(o)) {
            ClasePrincipal.tg.remove(TrabajoDeGrado.class.cast(o));
            return true;
        } else if (ClasePrincipal.pregrado.contains(o)) {
            ClasePrincipal.pregrado.remove(Pregrado.class.cast(o));
            return true;
        } else if (ClasePrincipal.posgrado.contains(o)) {
            ClasePrincipal.posgrado.remove(Posgrado.class.cast(o));
            return true;
        } else if (ClasePrincipal.director.contains(o)) {
            ClasePrincipal.director.remove(Director.class.cast(o));
            return true;
        }
        System.out.println("Operaciones.Registros: No se pudo eliminar, revisa el tipo de dato e intenta de nuevo.");
        return false;
    }
    
    // Otras clases interesantes
    // Verifica si un String se puede convertir en entero
    public static boolean isInteger(String str) {
    if (str == null) {
        return false;
    }
    int length = str.length();
    if (length == 0) {
        return false;
    }
    int i = 0;
    if (str.charAt(0) == '-') {
        if (length == 1) {
            return false;
        }
        i = 1;
    }
    for (; i < length; i++) {
        char c = str.charAt(i);
        if (c < '0' || c > '9') {
            return false;
        }
    }
    return true;
}
}

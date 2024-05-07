package finallogica.Pruebas;

import finallogica.Clases.Directivo;
import finallogica.Clases.Estudiante;
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
        
        estudiante.add(new Estudiante("Antonio", "De León", 105060, 3016302, Estudiante.estado_matricula.ACTIVO, Estudiante.estado_graduacion.EGRESADO));
        Directivo directivo = new Directivo("admin"); // El codigo va a ser siempre 604802
        
        // Iniciamos sesión:
        int IdSesion; // Esta va a ser la sesión que tendremos en el programa, que va a ser el indice del array
        int codigo = 1414828;
        
        if (codigo == directivo.getCodigo()) {
            // Entra a la interfaz de directivo, no entra en un ID.            
        } else {
            
        for (Estudiante e : estudiante) {
            if (e.getCodigo() == codigo) {
                IdSesion = estudiante.indexOf(e);
                // Entra a la interfaz de estudiante
            }
            else {
                // Se le notifica que el usuario y el código son incorrectos.
            }
        }
            
            for (String l : estudiante.getFirst().tableString()) {
                System.out.println(l);
            }
        
    }
                
        
    }

}

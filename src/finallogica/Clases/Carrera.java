/*
 * 
 */
package finallogica.Clases;

import finallogica.Clases.Fijas.Posgrado;
import finallogica.Clases.Fijas.Pregrado;

/**
 *
 * @author lpagc
 * 
 *  Interpretación. (por Antonio)
 * 
 *  Al final, las facultades son las mismas para todas las clases, así que van a
 *  ser heredadas de esta clase, cualquier cambio que vayan a hacer a las dos,
 *  tiene que hacerse por acá, por la forma en que está estructurado. La carrera
 *  es lo que se va a llamar. Según su facultad, se dirá si es pregrado o pos-
 *  grado.
 * 
 *
 */
public abstract class Carrera {
    public int codigo;
    public enum facultades{CIENCIAS_POLITICAS_JURIDICAS,
                            CIENCIAS_EMPRESARIALES,
                            CIENCIAS_HUMANAS_ED,
                            INGENIERIAS}
    facultades facultades;    

    public Carrera(int codigo, facultades facultades) {
        this.codigo = codigo;
        this.facultades = facultades;
    }

    public facultades getFacultades() {
        return facultades;
    }

    public void setFacultades(facultades facultades) {
        this.facultades = facultades;
    }
    
    
    
    
}

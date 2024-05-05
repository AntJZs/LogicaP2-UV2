/*
 * 
 */
package finallogica.Pruebas;

import finallogica.Clases.Carrera;
import finallogica.Clases.Fijas.Posgrado;
import finallogica.Clases.Fijas.Pregrado;
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
    public static void main(String[] args) {
        // Añade una nueva carrera de una facultad. Pregrado y Posgrado
        pregrado.add(new Pregrado("Derecho", Pregrado.facultades.CIENCIAS_HUMANAS_ED));
        posgrado.add(new Posgrado("Ciencias sociales", Posgrado.tipo.MAESTRIA, Carrera.facultades.INGENIERIAS));
        
        // Cómo llamar los linkedList
        System.out.println(posgrado.get(0).getTipo_posgrado());
    }
}

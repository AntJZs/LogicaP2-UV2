package finallogica.Modelo.BasesDeDatos;

import finallogica.Clases.Carrera;
import finallogica.Clases.Fijas.Pregrado;
import finallogica.Clases.Fijas.TrabajoDeGrado;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Bd_TrabajoDeGrado {

    public LinkedList<TrabajoDeGrado> obtener() {
        LinkedList<Pregrado> productos = null;
        Archivo archivo = new Archivo("PREGRADO.csv");
        LinkedList<String> lineas = archivo.obtenerTexto();
        if (lineas != null) {
            productos = new LinkedList();
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer token = new StringTokenizer(linea, ";");
                
                int codigo = Integer.parseInt(token.nextToken());
                String nombre = token.nextToken();
                String facultad = token.nextToken();
                
//                String linea = lineas.get(i);
//                StringTokenizer tokens = new StringTokenizer(linea, ";");
//                String codigo = tokens.nextToken();
//                String nombre = tokens.nextToken();
//                String descripcion = tokens.nextToken();
//                float precio = Float.parseFloat(tokens.nextToken());
//                int existencias = Integer.parseInt(tokens.nextToken());
                productos.add(new Pregrado(codigo, nombre, Carrera.facultades.valueOf(facultad)));

            }

        }
        return productos;

    }

    public boolean registrarFacultad(Pregrado p) {
        Archivo archivo = new Archivo("PREGRADO.csv");
        return archivo.registrar(p.getCodigo() + ";" + p.getNombre() + ";" + p.getFacultades());
    }

    public boolean borrarTodo() {
        Archivo archivo = new Archivo("PREGRADO.csv");
        return archivo.borrarContenido();
    }

}

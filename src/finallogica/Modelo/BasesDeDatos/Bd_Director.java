package finallogica.Modelo.BasesDeDatos;

import finallogica.Clases.Carrera;
import finallogica.Clases.Director;
import finallogica.Clases.Fijas.Pregrado;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Bd_Director {
    private String nombre = "DIRECTOR.csv";

    public Bd_Director(String nombre) {
        this.nombre = nombre;
    }
    

    public LinkedList<Director> obtener() {
        LinkedList<Director> director = null;
        Archivo archivo = new Archivo(this.nombre);
        LinkedList<String> lineas = archivo.obtenerTexto();
        if (lineas != null) {
            director = new LinkedList();
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer token = new StringTokenizer(linea, ";");
                
                int codigo = Integer.parseInt(token.nextToken());
                String nombre = token.nextToken();
                
//                String linea = lineas.get(i);
//                StringTokenizer tokens = new StringTokenizer(linea, ";");
//                String codigo = tokens.nextToken();
//                String nombre = tokens.nextToken();
//                String descripcion = tokens.nextToken();
//                float precio = Float.parseFloat(tokens.nextToken());
//                int existencias = Integer.parseInt(tokens.nextToken());
                director.add(new Director(nombre));

            }

        }
        return director;

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

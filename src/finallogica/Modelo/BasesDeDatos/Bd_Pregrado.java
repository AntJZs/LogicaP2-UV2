package finallogica.Modelo.BasesDeDatos;

import finallogica.Clases.Carrera;
import finallogica.Clases.Fijas.Pregrado;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Bd_Pregrado {
    private String nombre = "POSGRADO.csv";

    public Bd_Pregrado(String nombre) {
        this.nombre = nombre;
    }
    
    
    public LinkedList<Pregrado> obtener() {
        LinkedList<Pregrado> productos = null;
        Archivo archivo = new Archivo(this.nombre);
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
        Archivo archivo = new Archivo(this.nombre);
        return archivo.registrar(p.getCodigo() + ";" + p.getNombre() + ";" + p.getFacultades());
    }

    public boolean borrarTodo() {
        Archivo archivo = new Archivo(this.nombre);
        return archivo.borrarContenido();
    }

}

package finallogica.ArchivosPlanos.BasesDeDatos;

import finallogica.Clases.Carrera;
import finallogica.Clases.Fijas.Posgrado;
import finallogica.Clases.Fijas.Pregrado;
import finallogica.Modelo.Archivo;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Bd_Posgrado {
    private String nombre;

    public Bd_Posgrado(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Posgrado> obtener() {
        LinkedList<Posgrado> productos = null;
        Archivo archivo = new Archivo(this.nombre);
        LinkedList<String> lineas = archivo.obtenerTexto();
        if (lineas != null) {
            productos = new LinkedList();
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer token = new StringTokenizer(linea, ";");
                
                int codigo = Integer.parseInt(token.nextToken());
                String nombre = token.nextToken();
                String tipo = token.nextToken();
                String facultad = token.nextToken();
                
//                String linea = lineas.get(i);
//                StringTokenizer tokens = new StringTokenizer(linea, ";");
//                String codigo = tokens.nextToken();
//                String nombre = tokens.nextToken();
//                String descripcion = tokens.nextToken();
//                float precio = Float.parseFloat(tokens.nextToken());
//                int existencias = Integer.parseInt(tokens.nextToken());
                productos.add(new Posgrado(codigo, nombre, Posgrado.tipo.valueOf(tipo),  Carrera.facultades.valueOf(facultad)));

            }

        }
        return productos;

    }

    public boolean registararEstudiante(Pregrado p) {
        Archivo archivo = new Archivo(this.nombre);
        return archivo.registrar(p.getCodigo() + ";" + p.getNombre() + ";" + p.getDescripcion()
                + ";" + p.getPrecio() + ";" + p.getExistencias());
    }

    public boolean borrarTodo() {
        Archivo archivo = new Archivo(this.nombre);
        return archivo.borrarContenido();
    }

}

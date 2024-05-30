package finallogica.Modelo.BasesDeDatos;

import finallogica.Clases.Estudiante;
import finallogica.Clases.Fijas.Posgrado;
import finallogica.Clases.Fijas.Pregrado;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Bd_Graduando {
    private String nombre;

    public Bd_Graduando(String nombre) {
        this.nombre = nombre;
    }
    
    public LinkedList<Estudiante> obtener() {
        LinkedList<Estudiante> estudiantes = null;
        Archivo archivo = new Archivo(this.nombre);
        LinkedList<String> lineas = archivo.obtenerTexto();
        if (lineas != null) {
            estudiantes = new LinkedList();
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer token = new StringTokenizer(linea, ";");
                String codigo = token.nextToken();
                boolean deudasbibilioteca = token.nextToken();
                String trabajodegrado = token.nextToken();
                String  mora = token.nextToken();
                String deudas_u = token.nextToken();
                String deudas_a = token.nextToken();
                String cert = token.nextToken();
                Date fecha = token.nextToken();
                String saberpro = token.nextToken();
                Date fecha_grad = token.nextToken();
                String nota = token.nextToken();
                    
            }

        }
        return estudiantes;

    }

    public boolean registrarFacultad(Pregrado p) {
        Archivo archivo = new Archivo(this.nombre);
        return archivo.registrar(p.getCodigo() + ";" + p.getNombre() + ";" + p.getFacultades()); // IWP
    }

    public boolean borrarTodo() {
        Archivo archivo = new Archivo(this.nombre);
        return archivo.borrarContenido();
    }

}

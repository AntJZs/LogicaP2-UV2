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
                String nombre = token.nextToken();
                String apellido = token.nextToken();
                String tipo_identidad = token.nextToken();
                String num_identidad = token.nextToken();
                String telefono = token.nextToken();
                String matricula = token.nextToken();
                String estado = token.nextToken();
                int cod_carrera = Integer.parseInt(token.nextToken());
                for (Pregrado p : MainArchivos.pregrado) {
                    if (p.isPregrado(cod_carrera)) {
                        estudiantes.add(new Estudiante(nombre, apellido, Estudiante.tipo_documento.valueOf(tipo_identidad), num_identidad, telefono, p ,Estudiante.estado_matricula.valueOf(matricula), Estudiante.estado_graduacion.valueOf(estado)));
                    }
                }
                for (Posgrado p : MainArchivos.posgrado) {
                    if (p.isPosgrado(cod_carrera)) {
                        estudiantes.add(new Estudiante(nombre, apellido, Estudiante.tipo_documento.valueOf(tipo_identidad), num_identidad, telefono, p, Estudiante.estado_matricula.valueOf(matricula), Estudiante.estado_graduacion.valueOf(estado)));
                    }
                }
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

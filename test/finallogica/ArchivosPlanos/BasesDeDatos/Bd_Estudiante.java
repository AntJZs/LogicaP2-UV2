package finallogica.ArchivosPlanos.BasesDeDatos;

import finallogica.ArchivosPlanos.Archivo;
import finallogica.Clases.Estudiante;
import finallogica.Clases.Fijas.Posgrado;
import finallogica.Clases.Fijas.Pregrado;
import finallogica.Pruebas.PruebasCarrera;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Bd_Estudiante {

    public LinkedList<Estudiante> obtener() {
        LinkedList<Estudiante> estudiantes = null;
        Archivo archivo = new Archivo("ESTUDIANTES.csv");
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
                for (Pregrado pregrado : PruebasCarrera.pregrado) {
                    if (pregrado.isPregrado(cod_carrera)) {
                        estudiantes.add(new Estudiante(nombre, apellido, Estudiante.tipo_documento.valueOf(tipo_identidad), num_identidad, telefono, pregrado ,Estudiante.estado_matricula.valueOf(matricula), Estudiante.estado_graduacion.valueOf(estado)));
                    }
                }
                for (Posgrado posgrado : PruebasCarrera.posgrado) {
                    if (posgrado.isPosgrado(cod_carrera)) {
                        estudiantes.add(new Estudiante(nombre, apellido, Estudiante.tipo_documento.valueOf(tipo_identidad), num_identidad, telefono, posgrado, Estudiante.estado_matricula.valueOf(matricula), Estudiante.estado_graduacion.valueOf(estado)));
                    }
                } 
            }

        }
        return estudiantes;

    }

    public boolean registrarFacultad(Pregrado p) {
        Archivo archivo = new Archivo("ESTUDIANTES.csv");
        return archivo.registrar(p.getCodigo() + ";" + p.getNombre() + ";" + p.getFacultades());
    }

    public boolean borrarTodo() {
        Archivo archivo = new Archivo("ESTUDIANTES.csv");
        return archivo.borrarContenido();
    }

}

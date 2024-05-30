package finallogica.Modelo.BasesDeDatos;

import finallogica.Clases.Estudiante;
import finallogica.Clases.Fijas.Posgrado;
import finallogica.Clases.Fijas.Pregrado;
import finallogica.Interfaz.ClasePrincipal;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Bd_Estudiante {
    private String nombre;

    public Bd_Estudiante(String nombre) {
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
                for (Pregrado p : ClasePrincipal.pregrado) {
                    if (p.isPregrado(cod_carrera)) {
                        estudiantes.add(new Estudiante(nombre, apellido, Estudiante.tipo_documento.valueOf(tipo_identidad), num_identidad, telefono, p ,Estudiante.estado_matricula.valueOf(matricula), Estudiante.estado_graduacion.valueOf(estado)));
                    }
                }
                for (Posgrado p : ClasePrincipal.posgrado) {
                    if (p.isPosgrado(cod_carrera)) {
                        estudiantes.add(new Estudiante(nombre, apellido, Estudiante.tipo_documento.valueOf(tipo_identidad), num_identidad, telefono, p, Estudiante.estado_matricula.valueOf(matricula), Estudiante.estado_graduacion.valueOf(estado)));
                    }
                }
                
                
            }

        }
        return estudiantes;

    }
    public boolean registrarFacultad(Estudiante e) {
        Archivo archivo = new Archivo(this.nombre);
        return archivo.registrar(e.getCodigo() + ";" + e.getNombre() + ";" + e.getApellido() + ";" + e.getTipo_documento() + ";" + e.getNumero_documento() + ";" + e.getNumero_telefono() + ";" + e.getEstado_matricula() + ";" + e.getEstado_graduacion() + ";" + e.getCarrera().getCodigo());
    }

    public boolean borrarTodo() {
        Archivo archivo = new Archivo(this.nombre);
        return archivo.borrarContenido();
    }

}

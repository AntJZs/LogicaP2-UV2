    package finallogica.ArchivosPlanos.BasesDeDatos;

import finallogica.Modelo.BasesDeDatos.*;
import finallogica.Clases.Estudiante;
import finallogica.Clases.Fijas.Posgrado;
import finallogica.Clases.Fijas.Pregrado;
import finallogica.Interfaz.ClasePrincipal;
import finallogica.Modelo.Operaciones;
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
                Object p = Operaciones.buscarCarrera(cod_carrera);
                if (Pregrado.class.isInstance(p)) {
                estudiantes.add(new Estudiante(nombre, apellido, Estudiante.tipo_documento.valueOf(tipo_identidad), num_identidad, telefono, Pregrado.class.cast(p) ,Estudiante.estado_matricula.valueOf(matricula), Estudiante.estado_graduacion.valueOf(estado)));  
                }else {
                estudiantes.add(new Estudiante(nombre, apellido, Estudiante.tipo_documento.valueOf(tipo_identidad), num_identidad, telefono, Posgrado.class.cast(p) ,Estudiante.estado_matricula.valueOf(matricula), Estudiante.estado_graduacion.valueOf(estado)));   
                }
                
            }

        }
        return estudiantes;

    }
    public boolean registrar(Estudiante e) {
        Archivo archivo = new Archivo(this.nombre);
        return archivo.registrar(e.getCodigo() + ";" + e.getNombre() + ";" + e.getApellido() + ";" + e.getTipo_documento() + ";" + e.getNumero_documento() + ";" + e.getNumero_telefono() + ";" + e.getEstado_matricula() + ";" + e.getEstado_graduacion() + ";" + e.getCarrera().getCodigo());
    }
    
        public boolean actualizar(LinkedList<Estudiante> estudiante) {
            boolean chk = true;
            this.borrarTodo();
        Archivo archivo = new Archivo(this.nombre);
            for (Estudiante e : estudiante) {
                chk &= archivo.registrar(e.getCodigo() + ";" + e.getNombre() + ";" + e.getApellido() + ";" + e.getTipo_documento() + ";" + e.getNumero_documento() + ";" + e.getNumero_telefono() + ";" + e.getEstado_matricula() + ";" + e.getEstado_graduacion() + ";" + e.getCarrera().getCodigo());
            }
            if (chk == false) {
                System.out.println("Bd_Estudiante.actualizar: Uno o más estudiantes fallaron en ser registrados, revise el archivo y la lógica del código...");
            }
        return chk;
    }
    

    public boolean borrarTodo() {
        Archivo archivo = new Archivo(this.nombre);
        return archivo.borrarContenido();
    }

}

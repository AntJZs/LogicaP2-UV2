package finallogica.Modelo.BasesDeDatos;

import finallogica.Clases.Carrera;
import finallogica.Clases.Fijas.TrabajoDeGrado;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Bd_TrabajoDeGrado {
        private String nombre;

    public Bd_TrabajoDeGrado(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<TrabajoDeGrado> obtener() {
        LinkedList<TrabajoDeGrado> tg = null;
        Archivo archivo = new Archivo(this.nombre);
        LinkedList<String> lineas = archivo.obtenerTexto();
        if (lineas != null) {
            tg = new LinkedList();
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer token = new StringTokenizer(linea, ";");
                String nombre;
                String tipo_trabajo;
                String director;
                String categoria;
                switch (token.countTokens()) {
                    case 2:
                        nombre = token.nextToken();
                        tipo_trabajo = token.nextToken();
                        tg.add(new TrabajoDeGrado(nombre, TrabajoDeGrado.tipo_trabajo.valueOf(tipo_trabajo)));
                        break;
                    case 3:
                        nombre = token.nextToken();
                        tipo_trabajo = token.nextToken();
                        director = token.nextToken();
                        tg.add(new TrabajoDeGrado(nombre, TrabajoDeGrado.tipo_trabajo.valueOf(tipo_trabajo), Integer.parseInt(director)));
                        break;
                    case 4:
                        nombre = token.nextToken();
                        tipo_trabajo = token.nextToken();
                        director = token.nextToken();
                        categoria = token.nextToken();
                        tg.add(new TrabajoDeGrado(nombre, TrabajoDeGrado.tipo_trabajo.valueOf(tipo_trabajo), Integer.parseInt(director), TrabajoDeGrado.categoria.valueOf(categoria)));
                        break;
                    default:
                        System.out.println("TrabajoDeGrado: Malformación en la entrada, linea: " + linea + " revisar db..." );
                        break;
                }

                

            }

        }
        return tg;

    }

    public boolean registrarFacultad(TrabajoDeGrado p) {
        Archivo archivo = new Archivo(this.nombre);
        switch (p.toTableString().length) {
            case 2: return archivo.registrar(p.getNombre()+ ";" + p.getTipo_trabajo());
            case 3: return archivo.registrar(p.getNombre()+ ";" + p.getTipo_trabajo() + ";" + p.getDirector().getNumeroDirector());
            case 4: return archivo.registrar(p.getNombre()+ ";" + p.getTipo_trabajo() + ";" + p.getDirector().getNumeroDirector() + ";" + p.getCategoria());
            default: System.out.println("TrabajoDeGrado: No se pudo guardar... Error algo dificil de que salga...");
        }
    return false;
    }

    public boolean borrarTodo() {
        Archivo archivo = new Archivo(this.nombre);
        return archivo.borrarContenido();
    }

}

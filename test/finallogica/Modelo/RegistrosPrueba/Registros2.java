/*
 * 
 */
package finallogica.Modelo.RegistrosPrueba;

/**
 *
 * @author AntJZ
 */
public class Registros2 {
    private String nombre;
    private boolean heredado;

    public Registros2(String nombre, boolean heredado) {
        this.nombre = nombre;
        this.heredado = heredado;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isHeredado() {
        return heredado;
    }
    
    public String[] toTableString() {
        String[] lista = {this.nombre, Boolean.toString(this.heredado)};
        return lista;
    }
    
}

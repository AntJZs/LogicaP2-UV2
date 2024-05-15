/*
 * 
 */
package finallogica.Modelo.RegistrosPrueba;

/**
 *
 * @author AntJZ
 */
public class Registros1 {
    private String nombre;
    private int edad;
    private Registros2 hijo;

    public Registros1(String nombre, int edad, Registros2 hijo) {
        this.nombre = nombre;
        this.edad = edad;
        this.hijo = hijo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Registros2 getHijo() {
        return hijo;
    }
    public String[] toTableString() {
        String[] lista = {this.nombre, String.valueOf(this.edad), this.hijo.getNombre()};
        return lista;
    }
}

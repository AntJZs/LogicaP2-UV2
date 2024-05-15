package finallogica.Modelo.RegistrosPrueba;

import finallogica.Modelo.LlenarTabla;
import finallogica.Pruebas.TestFrame;
import java.util.LinkedList;

/**
 *
 * @author AntJZ
 * @comment main class of the package
 */
public class MainRegistros {
    public static LinkedList<Registros1> padres = new LinkedList<>();
    public static LinkedList<Registros2> hijos = new LinkedList<>();
    
    public static void main(String[] args) {
        hijos.add(new Registros2("retoño", true));
        padres.add(new Registros1("toño", 17, hijos.getFirst()));
        TestFrame interfaz = new TestFrame();
        interfaz.setVisible(true);
    }
}

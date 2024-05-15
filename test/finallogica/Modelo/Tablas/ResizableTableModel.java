/*
 * 
 */
package finallogica.Modelo.Tablas;

import finallogica.Clases.Estudiante;
import finallogica.Modelo.RegistrosPrueba.MainRegistros;
import finallogica.Modelo.RegistrosPrueba.Registros1;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AntJZ
 *      Deben haber dos tablemodel, uno para el primer registro, y otro para el segundo registro.
 *      Primer registro, tres columnas.
 */
public class ResizableTableModel extends AbstractTableModel {
    // Escribe un String con todas las columnas
    String [] rows = {"Nombre", "Edad", "Nombre Hijo"};
    LinkedList<Registros1> cols = MainRegistros.padres;

    @Override
    public int getRowCount() {
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.cols.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        for (String Thing : cols.get(rowIndex).toTableString()) {
            System.out.println(Thing);
        }
        return "R";
    }
}

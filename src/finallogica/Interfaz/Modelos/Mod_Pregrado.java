/*
 * 
 */
package finallogica.Interfaz.Modelos;

import finallogica.Clases.Fijas.Pregrado;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AntJZ
 */
public class Mod_Pregrado extends AbstractTableModel {
    String [] cols = {"Código", "Nombre", "Facultad"};
    LinkedList<Pregrado> rows = new LinkedList<>();

    public Mod_Pregrado (LinkedList<Pregrado> rows) {
        this.rows = rows;
    }
    

    @Override
    public int getRowCount() {
        return this.rows.size();
    }

    @Override
    public int getColumnCount() {
        return this.cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows.get(rowIndex).toTableString()[columnIndex];
    }
        @Override
    public String getColumnName(int column) {
        return cols[column];
    }
            
}

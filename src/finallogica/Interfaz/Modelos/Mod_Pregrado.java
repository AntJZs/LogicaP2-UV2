/*
 * 
 */
package finallogica.Interfaz.Modelos;

import finallogica.Clases.Fijas.Posgrado;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AntJZ
 */
public class Mod_Pregrado extends AbstractTableModel {
    String [] cols = {"Código", "Nombre", "Facultad"};
    LinkedList<Posgrado> rows = new LinkedList<>();

    public Mod_Pregrado (LinkedList<Posgrado> rows) {
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
//        System.out.println((cols.get(rowIndex).toTableString()));
//        for (Object object : cols.get(rowIndex).toTableString()) {
//            System.out.println(object);
//        }
    return rows.get(rowIndex).toTableString()[columnIndex];
    }
        @Override
    public String getColumnName(int column) {
        return cols[column];
    }
            
}

/*
 * 
 */
package finallogica.Modelo.Tablas;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AntJZ
 *      Deben haber dos tablemodel, uno para el primer registro, y otro para el segundo registro.
 *      Primer registro, tres columnas.
 */
public class TM_Reg2 extends AbstractTableModel {
    // Escribe un String con todas las columnas
    String [] rows = {"Row1", "Row2", "Row3"};
    LinkedList<> cols = new LinkedList<>();

    @Override;
    public int getRowCount() {
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.cols.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 1:
        return this.cols.indexOf(rowIndex).getfirst;
            case 2;
        return this.cols.indexOf(rowIndex).getsecond;
            
        }
    }
}

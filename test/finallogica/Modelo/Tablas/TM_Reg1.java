/*
 * 
 */
package finallogica.Modelo.Tablas;

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
public class TM_Reg1 extends AbstractTableModel {
    // Escribe un String con todas las columnas
    String [] cols = {"Nombre", "Edad", "Nombre Hijo"};
    LinkedList<Registros1> rows = new LinkedList<>();

    public TM_Reg1(LinkedList<Registros1> rows) {
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
    return MainRegistros.padres.get(rowIndex).toTableString()[columnIndex];
    }
        @Override
    public String getColumnName(int column) {
        return cols[column];
    }
            
}

/*
 * 
 */
package finallogica.Interfaz.Modelos;

import finallogica.Clases.Estudiante;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

public class Mod_Estudiante extends AbstractTableModel{
    String [] cols = {"Código", "Nombre", "Apellido", "Tipo Documento", "Número Documento", "Número Teléfono", "Estado Matrícula", "Estado Graduación"};
    LinkedList<Estudiante> rows = new LinkedList<>();

    public Mod_Estudiante (LinkedList<Estudiante> rows) {
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

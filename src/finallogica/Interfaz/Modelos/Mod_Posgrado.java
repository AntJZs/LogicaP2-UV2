/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallogica.Interfaz.Modelos;
;
import finallogica.Clases.Fijas.Posgrado;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Maria Camila
 */
public class Mod_Posgrado extends AbstractTableModel {
    String [] cols = {"Código", "Nombre", "Tipo", "Facultad"};
    LinkedList<Posgrado> rows = new LinkedList<>();

    public Mod_Posgrado (LinkedList<Posgrado> rows) {
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

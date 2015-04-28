package ex3;
import javax.swing.*;
import javax.swing.table.*;

public class TestModel extends AbstractTableModel {
	final int rows = 100, cols = 10;
    public int    getRowCount()    { return rows; }
    public int    getColumnCount() { return cols; }
    public Object getValueAt(int row, int col) {
       return "(" + row + "," + col + ")";
    }
 }


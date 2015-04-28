package ex3;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Test extends JFrame {

	public static void main(String[] args) {
		Test frame = new Test();
	      frame.setTitle("Tables and Models");
	      frame.setBounds(300, 300, 450, 300);
	      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	      frame.show();
	   }
	   public Test() {
		   final TableSortDecorator decorator = new TableSortDecorator(table.getModel());  
	      TableModel model = new TestModel();   
	      getContentPane().add(new JScrollPane(new JTable(model)));
	      
	      table.setModel(decorator);
	   }
	   private static class TestModel extends AbstractTableModel {
		      final int rows = 100, cols = 10;
		      public int    getRowCount()    { return rows; }
		      public int    getColumnCount() { return cols; }
		      public Object getValueAt(int row, int col) {
		         return "(" + row + "," + col + ")";
		      }
		   }
	}

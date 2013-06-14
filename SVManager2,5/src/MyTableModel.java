/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nvettera
 */
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
 
public class MyTableModel extends AbstractTableModel{
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> data=new ArrayList<String>(800);
        private Server server;
        
    public MyTableModel(List<String> data,Server server) {
        this.data = data;
        this.server=server;
    }
    
    public int getColumnCount() {
        return 5;
    }
 
    public int getRowCount() {
        return 200;
    }
 
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0) return (rowIndex+1);
        else return data.get(((rowIndex*4)+columnIndex-1));
     
    }
 
    public String getColumnName(int column) {
        switch (column) {
        case 0:
            return "Runde";
        case 1:
            return "Bahn 1";
        case 2:
            return "Bahn 2";
        case 3:
            return "Bahn 3";
        case 4:
            return "Bahn 4";
        default: 
            throw new IllegalArgumentException(String.format("Column {0} does not exist", column));
        }
    }
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex==0)
        	return false;
        else return true;
    }
    
    public void setValueAt(Object value, int row, int col) {
    	data.set(((row*4)+(col-1)),(String)value);
    	server.addPlatz((String)value, row, col-1);
        if ((server.getRunde()<=(row+1))&&((row+1)<=server.getRunde()+2)){
        	server.sendLineUp();
	}server.serialOs();
    }
    }


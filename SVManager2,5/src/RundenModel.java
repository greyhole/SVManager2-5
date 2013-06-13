/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nvettera
 */
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
 
public class RundenModel extends AbstractTableModel implements Serializable{
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> data=new ArrayList<String>(800);
        private int runde;
        
    public RundenModel(List<String> data,int Runde) {
        this.data = data;
        this.runde=runde;
    }
    
    public int getColumnCount() {
        return 6;
    }
 
    public int getRowCount() {
        return 3;
    }
 
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            if (rowIndex==0)return "momentan:";
            else if (rowIndex==1)return "nächste:";
            else return "über nächste:"; 
        }
        if (columnIndex==1){
            return (runde+rowIndex);   
        }
        else{
            return data.get((rowIndex*4)+columnIndex-2);
        }
    }
 
    public String getColumnName(int column) {
        switch (column) {
        case 0:
            return "";
        case 1:
            return "Runde";
        case 2:
            return "Bahn1";
        case 3:
            return "Bahn2";
        case 4:
            return "Bahn3";
        case 5:
            return "Bahn4";
        default: 
            throw new IllegalArgumentException(String.format("Column {0} does not exist", column));
        }
    }
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        	return false;
        
    }
}

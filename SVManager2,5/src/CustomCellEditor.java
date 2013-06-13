
import java.awt.event.MouseEvent;
import java.io.Serializable;
import java.util.EventObject;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nvettera
 */
public class CustomCellEditor extends DefaultCellEditor implements Serializable{
  private static final long serialVersionUID = 1L;
 int r;

 public CustomCellEditor(JComboBox obj) {
       super(obj);
    }
    

    public boolean isCellEditable(EventObject evt) {
        
    	if (evt instanceof MouseEvent) {
            int clickCount;
 
            // For single-click activation
            //clickCount = 1;
 
            // For double-click activation
            clickCount = 2;
 
            // For triple-click activation
            //clickCount = 3;
 
            return ((MouseEvent)evt).getClickCount() >= clickCount;
        }
        return true;
    }  
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Comparator;

public class XComparator implements Comparator<Punkt>{
    private int id;
    XComparator(int id){
        this.id=id;
    }
    @Override 
    public int compare( Punkt punkt1, Punkt punkt2 ){
                switch (id){
                    case 0:return punkt2.getErg()-punkt1.getErg();
                    case 1:return punkt1.getBahn()-punkt2.getBahn();
                    default:return punkt1.getRunde()-punkt2.getRunde();
          }
	    
	  
    }
}

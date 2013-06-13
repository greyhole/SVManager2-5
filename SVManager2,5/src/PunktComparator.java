/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Comparator;

public class PunktComparator implements Comparator<Punkt>{

	@Override public int compare( Punkt punkt1, Punkt punkt2 )
	  {
	    return punkt2.getErg()-punkt1.getErg();
	  }
}

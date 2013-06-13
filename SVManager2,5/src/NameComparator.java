/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Comparator;

public class NameComparator implements Comparator<String>{

	@Override public int compare( String user1, String user2 )
	  {
	    return user1.compareTo(user2);
	  }
}
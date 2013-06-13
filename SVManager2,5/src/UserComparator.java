/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Comparator;

public class UserComparator implements Comparator<Person2>{

	@Override public int compare( Person2 user1, Person2 user2 )
	  {
	    return user2.getSum()-user1.getSum();
	  }
}

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nvetter
 */
public class Person2 extends Person implements Serializable{
	private List<Punkt> punkte;
	private static final long serialVersionUID = 1L;
	public Person2(){}
	
        public Person2(String name,boolean sex){
                super(name,sex);
                punkte=new ArrayList<Punkt>(30);
	}
	
        public void addPunkt(int index,int punkt){
            punkte.add(new Punkt(index,punkt));
            
        }
        public List<Punkt> getListe(int id){
            Collections.sort(punkte, new XComparator(id));
            return punkte;
        }
        public int getSum(){
            Collections.sort(punkte, new PunktComparator());
            return (punkte.get(0).getErg()+punkte.get(1).getErg()+punkte.get(2).getErg());
        }
        
        public int getErster(){
            Collections.sort(punkte, new PunktComparator());
            return punkte.get(0).getErg();
        }
        public int getZweiter(){
            Collections.sort(punkte, new PunktComparator());
            return punkte.get(1).getErg();
        }
        public int getDritter(){
            Collections.sort(punkte, new PunktComparator());
            return punkte.get(2).getErg();
        }
        public boolean isOK(){
            if (punkte.size()<3) return false;
            else return true;
        }
}

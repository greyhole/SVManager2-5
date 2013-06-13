
import java.io.Serializable;


public class Index implements Serializable{
        private static final long serialVersionUID = 1L;
	private int punkt;
	private String person;
	
	public Index(){
		this.punkt=-1;
		this.person="Frei";
	}
	public Index(String name,int punkt){
		this.punkt=punkt;
		this.person=name;
	}
	
	public void setPunkt(int punkt){
		this.punkt=punkt;
	}
	public int getPunkt(){
		return punkt;
	}
	public String getPerson(){
		return person;
	}
	public String toString(){
		return person;
	}
        public void setPerson(String person){
		this.person=person;
	}
}

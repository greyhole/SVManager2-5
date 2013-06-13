import java.io.Serializable;


public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	String name;
	boolean sex;
	
	public Person(){
		this.name="frei";
		this.sex=true;
	}
	public Person(String name,boolean sex){
		this.name=name;
		this.sex=sex;
	}
    @Override
	public String toString(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSex(boolean sex){
		this.sex=sex;
	}
	public String getName(){
		return name;
	}
	public boolean getSex(){
		return sex;
	}
}

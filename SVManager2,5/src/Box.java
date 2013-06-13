
public class Box {
	private String typ;
	private Object object;
	
	Box(){}
	
	Box(String typ, Object object){
		this.typ=typ;
		this.object=object;
	}
	
 public String getTyp(){
	 return typ;
 }
 public Object getObject(){
	 return object;
 }
 public void setObject(Object object){
	 this.object=object;
 }
 public void setTyp(String typ){
	 this.typ=typ;
 }
}

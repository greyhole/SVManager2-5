
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nvetter
 */
public class Punkt implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int index,punkt;

Punkt(){}

Punkt(int index,int punkt){
	this.punkt=punkt;
	this.index=index;
}
public int getErg(){
	return punkt;
}
public int getBahn(){
	return index%4;
}
public int getRunde(){
	return index/4;
}

public void setPunkt(int punkt){
	this.punkt=punkt;
}
public void setIndex(int index){
	this.index=index;
}
public int getIndex(){
    return index;
}

}

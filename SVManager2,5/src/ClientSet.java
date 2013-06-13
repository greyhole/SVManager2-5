import java.io.*;
import java.net.*;

public class ClientSet {
	
	private Socket socket;
	private ObjectOutputStream oos;
	private String typ;
	public ClientSet(){};
	
	public ClientSet(String typ,Socket socket,ObjectOutputStream oos){
		this.socket=socket;
		this.oos=oos;
		this.typ=typ;
	};
	
	public ObjectOutputStream getStream(){
		return oos;
	}
	
	public Socket getSocket(){
		return socket;
	}
	public void setStream(ObjectOutputStream oos){
		this.oos=oos;
	}
	
	public void getSocket(Socket socket){
		this.socket=socket;
	}
	public String toString(){
		return typ;
	}
	public String getTyp(){
		return typ;
	}
	public void setString(String typ){
		this.typ=typ;
	}
}

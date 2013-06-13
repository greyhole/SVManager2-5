import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ServerThread extends Thread{

	private Server server;
	private Socket socket;
	private ObjectInputStream ois;
	
	public ServerThread(Server server, Socket socket){
		this.server=server;
		this.socket=socket;
		setDaemon(true);
		start();
	}
	
	public void run(){
		try {
			ois=new ObjectInputStream(socket.getInputStream());
                        while(true){
				ArrayList tmp=(ArrayList)ois.readObject();
                                switch ((int)tmp.get(0)){
                                    case 0:server.addRunde();break;
                                    case 1:server.remRunde();break;
                                }				
			}
		}catch(EOFException ie){System.out.println("null");}
		 catch(IOException ie){ie.printStackTrace();} 
		catch (ClassNotFoundException e) {e.printStackTrace();}
		 finally{
			 server.removeConnection(socket);
			 
		 }
	}
}

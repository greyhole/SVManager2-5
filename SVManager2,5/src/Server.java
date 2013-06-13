import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class Server extends Thread {
        private NewJFrame frame;
	private ServerSocket ss;
	private int port;
        private int runde;
        private Hashtable oOutputStreams= new Hashtable();
	private List<Index> game= new ArrayList<Index>(800);
        private List<Person> personen= new ArrayList<Person>(50);
        private Socket s;
        private ObjectOutputStream oout;
        
        
        public Server(){ 
            setDaemon(true);
            init();
        }
        
        private void init(){
            runde=1;
            personen.add(new Person("",true));
            personen.add(new Person("Frei",true));
            personen.add(new Person("Adrian Vetter",true));
            personen.add(new Person("Detlef Mackel",true));
            personen.add(new Person("Botho Klein",true));
            personen.add(new Person("Friedhelm Hirte",true));
            personen.add(new Person("Stefan Gadow",true));
            personen.add(new Person("Tino Leverenz",true));
            personen.add(new Person("Marco Mackel",true));
            personen.add(new Person("Dietmar Rose",true));
            personen.add(new Person("Mathias Kuhrmann",true));
            personen.add(new Person("Alfred Bülow",true));
            personen.add(new Person("Hartmut Meierholz",true));
            personen.add(new Person("Franko Bülow",true));
            personen.add(new Person("Olaf Niemann",true));
            personen.add(new Person("Mathias Balluneit",true));
            personen.add(new Person("Helmut Mardaus",true));
            personen.add(new Person("Hartmut Winst",true));
            personen.add(new Person("Gero Schulz",true));
            personen.add(new Person("Guido Eggert",true));
            personen.add(new Person("Michael Jastram",true));
            personen.add(new Person("Christoph Weidlich",true));
            personen.add(new Person("Tobias Knüppel",true));
            personen.add(new Person("Steffen Gottschalk",true));
            personen.add(new Person("Hannes Rosskoth",true));
            personen.add(new Person("Rico Zimmermann",true));
            personen.add(new Person("Ende",true));
            personen.add(new Person("Elmar Guhl",true));
            personen.add(new Person("Sonja Mackel",false));
            personen.add(new Person("Andrea Kuhrmann",false));
            personen.add(new Person("Melanie Jastram",false));
            personen.add(new Person("Nicole Niemann",false));
            personen.add(new Person("Bianca Altenburg",false));
            personen.add(new Person("Ilse Schulz",false));
            personen.add(new Person("Cornelia Scholz",false));
            for (int i=0;i<800;i++){
                game.add(new Index());
            }
        }
	public void setServer(NewJFrame frame,int port){
            this.frame=frame;
            this.port=port;
        }
        public void run() {
            try {
                ss=new ServerSocket(port);
            }catch (IOException e){System.out.println("Kann Port nicht öffnen!");
                    }            
        
        while(!isInterrupted()){
                try{
                    s=ss.accept();
                    }catch (IOException ex){
                           break;
                            }
                try {
                    oout = new ObjectOutputStream(s.getOutputStream());
                    }catch (IOException ex) {
                         Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    
                oOutputStreams.put(s,oout);
                
                new ServerThread(this,s);
        }
        
        }
	public void removeConnection(Socket socket) {
                        synchronized(oOutputStreams){
                            oOutputStreams.remove(socket);
                            try {
                            socket.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
		
	}
        public void sendLineUp(){
            Vector lineup=new Vector();
            for (int i=0;i<3;i++){
                Vector seclineup=new Vector();
                switch (i){
                    case 0:seclineup.add("momentan:");break;
                    case 1:seclineup.add("nächste:");break;
                    case 2:seclineup.add("über nächste:");break;
                }
                seclineup.add(runde+i);
                for (int j=0;j<4;j++){
                    seclineup.add(game.get((i+runde-1)*4+j).getPerson());
                }
                lineup.add(seclineup);
            }
            Vector lineupHeader=new Vector();
            lineupHeader.add("");
            lineupHeader.add("Runde");
            lineupHeader.add("Bahn1");
            lineupHeader.add("Bahn2");
            lineupHeader.add("Bahn3");
            lineupHeader.add("Bahn4");
            DefaultTableModel send=new DefaultTableModel(lineup,lineupHeader);
            ArrayList t=new ArrayList(2);
            t.add(1);
            t.add(send);
            broadcast(t);
        }  
        private Enumeration getOutputStreams(){
            return oOutputStreams.elements();
        }
        public void broadcast(ArrayList obj){
            synchronized(oOutputStreams){
                for(Enumeration e=getOutputStreams();e.hasMoreElements();){
                    ObjectOutputStream oout = (ObjectOutputStream)e.nextElement();
                    try{oout.writeObject(obj);
                    }catch(IOException ie){System.out.println(ie);}
                }
            }
        }
        
        public List<String> getNamen(){                     //für model usw
            List<String> tmp=new ArrayList<String>(50);
            for(Person tmp2:personen){
                tmp.add(tmp2.getName());
            } 
            Collections.sort(tmp, new NameComparator());
            return tmp;
        }
        public void stopIt(){
        try {
            this.ss.close();
            this.interrupt();
                 
        } catch (IOException ex){Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);}
        }
        
        public void addPerson(String name, boolean sex){
            personen.add(new Person(name,sex));
            frame.updateModel();
        }
        public Index getIndex(int index){
        	return game.get(index);
        }
        public void addPunkt(int punkt,int runde, int bahn){
            game.get((4*runde)+bahn).setPunkt(punkt);
        }
        public void addPlatz(String name, int runde, int bahn){
           game.get((4*runde)+bahn).setPerson(name);
       }
        public void sendErg(){   
           List<Person2> tmpMList=new ArrayList<Person2>(50);
           List<Person2> tmpFList=new ArrayList<Person2>(50);
           synchronized(personen){
            for (Person tmp:personen){
               Person2 tmpPerson2=gather(tmp);
               if (tmpPerson2.isOK()==false) continue;
               else if(tmpPerson2.getSex()==true) tmpMList.add(tmpPerson2);
               else tmpFList.add(tmpPerson2);
            }
           }
           if (!(tmpFList.isEmpty()&&tmpMList.isEmpty())){
               Collections.sort(tmpMList, new UserComparator());
               Collections.sort(tmpFList, new UserComparator());
               Vector mVector=new Vector();
               Vector fVector=new Vector();
            
               for (int i=0;i<10;i++){
                   Vector m=new Vector();
                   if (i<tmpMList.size()){
                	m.add(i+1+".");
                    m.add(tmpMList.get(i).getName());                 
                    m.add(String.valueOf(tmpMList.get(i).getErster()));                   
                    m.add(String.valueOf(tmpMList.get(i).getZweiter()));                 
                    m.add(String.valueOf(tmpMList.get(i).getDritter()));                 
                    m.add(String.valueOf(tmpMList.get(i).getSum()));                 
                   }
                   else for (int j=0;j<5;j++) m.add("");
                   mVector.add(m);         
                   Vector f=new Vector();
                   if (i<tmpFList.size()){
                	f.add(i+1+".");
                	f.add(tmpFList.get(i).getName());
                    f.add(String.valueOf(tmpFList.get(i).getErster()));
                    f.add(String.valueOf(tmpFList.get(i).getZweiter()));
                    f.add(String.valueOf(tmpFList.get(i).getDritter()));
                    f.add(String.valueOf(tmpFList.get(i).getSum()));
                   }
                   else for (int j=0;j<5;j++) f.add("");
                   fVector.add(f);
               }   Vector haeder=new Vector();
                    haeder.add("Platz");
               		haeder.add("Name");
                    haeder.add("Schuss1");
                    haeder.add("Schuss2");
                    haeder.add("Schuss3");
                    haeder.add("Summe");
                   DefaultTableModel mList=new DefaultTableModel(mVector,haeder);
                   DefaultTableModel fList=new DefaultTableModel(fVector,haeder);
                   ArrayList send=new ArrayList(3);
                   send.add(2);
                   send.add(mList);
                   send.add(fList);
                   broadcast(send); 
           }
       }
        public Person2 gather(Person person){
           synchronized(game){
           Person2 tmpPerson=new Person2(person.getName(),person.getSex());
           for (int i=0;i<game.size();i++){
               if (game.get(i).getPerson().equals(person.getName())&&(game.get(i).getPunkt()>=0)){
                   tmpPerson.addPunkt(i,game.get(i).getPunkt());
               }
           }
           return tmpPerson;
       }
       }
        public void addRunde(){
           if (runde<200){
        	this.runde=this.runde+1;
           this.sendLineUp();
           frame.setRoundLabel(runde);
           }
       }
        public void remRunde(){
           if (runde>1){
        	this.runde=this.runde-1;
           this.sendLineUp();
           frame.setRoundLabel(runde);
           }
       }
        public int getRunde(){
        return runde;
    }
        
       public List<Person> getPersonen(){
           return personen;
       }
       
       public DefaultTableModel getVerwaltungPunkteModel(String name,int sort){
           int i;
           Vector personV=new Vector();
           Person2 person=new Person2();
            for (Person tmp:getPersonen()){
                if (tmp.getName().equals(name)){
                    person=gather(tmp);
                }
            }
        for (Punkt p:person.getListe(sort)){
            Vector sub=new Vector();
            sub.add(p.getErg());
            sub.add(p.getBahn()+1);
            sub.add(p.getRunde()+1);
            personV.add(sub);
        }
        Vector header=new Vector();
        header.add("Punkt");
        header.add("Bahn");
        header.add("Runde");
        return new DefaultTableModel(personV,header);
       }
       public void delPerson(String name){
           int i;
           for (i=0;i<game.size();i++){
             if (game.get(i).getPerson().equals(name))
                 game.set(i, new Index());
           }
           List<String> tmp=frame.tableList;
           for (i=0;i<tmp.size();i++)
               if (tmp.get(i).equals(name))
                   tmp.set(i, "Frei");
           for (i=0;i<personen.size();i++)
               if (personen.get(i).getName().equals(name))
                   personen.remove(i);
                       
           frame.chMainTable(tmp);
           this.sendErg();
           this.sendLineUp();
       }
       public void chName(String altname,String neuname){
          int i;
           for (i=0;i<game.size();i++){
             if (game.get(i).getPerson().equals(altname))
                 game.get(i).setPerson(neuname);
           }
           List<String> tmp=frame.tableList;
           for (i=0;i<tmp.size();i++)
               if (tmp.get(i).equals(altname))
                   tmp.set(i, neuname);
           for (i=0;i<personen.size();i++)
               if (personen.get(i).getName().equals(altname))
                   personen.get(i).setName(neuname);
                       
           frame.chMainTable(tmp);
           this.sendErg();
           this.sendLineUp();
           this.serialOs();
      }
       public void serialOs(){
       		OutputStream fos = null;
       		try
       			{	
       				fos = new FileOutputStream( "Serialisierung" );
       				ObjectOutputStream o = new ObjectOutputStream( fos );
       				o.writeObject(game);
       				o.writeObject(personen);
       			}
       		catch ( IOException e ) { System.err.println( e ); }
       		finally { try { fos.close(); } catch ( Exception e ) { e.printStackTrace(); } 
   		
   		}
       }
       public void laden(){
    	   File tab=new File("Serialisierung");
    	   InputStream fis = null;
    	   try
    	   {
    		   fis = new FileInputStream( "Serialisierung" );
    		   ObjectInputStream o = new ObjectInputStream( fis );
    	  game= (ArrayList<Index>) o.readObject();
    	  personen= (ArrayList<Person>) o.readObject();
    	  List<String> tmpList=new ArrayList<String>(800);
    	  for(Index tmp:game)tmpList.add(tmp.getPerson());
    	  frame.chMainTable(tmpList);
    	  frame.updateModel();
    	  this.sendLineUp();
    	  this.sendErg();
    	 
    	}
    	catch ( IOException e ) { }
    	catch ( ClassNotFoundException e ) { System.err.println( e ); }

    	finally { try { fis.close(); } catch ( Exception e ) { } }

       }
}

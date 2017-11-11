import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject ;



public class Implementation extends UnicastRemoteObject {//implements Interface {

//constructeur de la classe Implementation

   public Implementation() throws RemoteException
  {
    super();
 };
/*
   // la méthode getnom : retourne le nom de la machine sur le réseau 
    public void getnom()throws RemoteException{
    	//InetAddress address = InetAddress.getLocalHost();
    	//System.out.println("Nom d'hôte : " + address.getHostName());
    }

    
// la méthode getip : retourne l'@ip d'un équipement

    public  String getip() throws RemoteException{
    	//InetAddress address = InetAddress.getLocalHost();
		//System.out.println("IP : " + address.getHostAddress());
	//return address.getHostAddress();
    	return "hello";
    }
    	
    	
 // la méthode getmac : retourne l'@mac d'un équipement
    	
    public void getmac() throws RemoteException{
    	// InetAddress address = InetAddress.getMacAddress();
    	// System.out.println("la Mac adresse du poste : "  address.);
    }
    	
 // la méthode getram : retourne l'utilisation de la ram d'un équipement

    public void getram(){
    	
    	
    	
    }
    	
 // la méthode getprocesseur : retourne l'utilisation du processeur d'un équipement
    public void getprocesseur(){
    	
    }
    	



*/
}

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.*;

import java.rmi.server.*;


public class Serveur extends UnicastRemoteObject implements Interface {

	

// constructeur par défaut
public Serveur() throws RemoteException {

super(); }

///

//la méthode getnom : retourne le nom de la machine sur le réseau 
public String getnom() throws RemoteException, UnknownHostException{

	InetAddress address = InetAddress.getLocalHost();
	
	return address.getHostName();
}


//la méthode getip : retourne l'@ip d'un équipement

public  String getip() throws RemoteException, UnknownHostException{
	InetAddress address = InetAddress.getLocalHost();
	
return address.getHostAddress();
	
}	
	
	
// la méthode getmac : retourne l'@mac d'un équipement
	
public String getmac() throws RemoteException, UnknownHostException{
	
	 InetAddress address = InetAddress.getLoopbackAddress();
	 
	 return address.getHostAddress();
}
	
// la méthode getram : retourne l'utilisation de la ram d'un équipement

public String getram(){
	InetAddress address = InetAddress.getByName(getnom());
	
	return address.;
}
	
// la méthode getprocesseur : retourne l'utilisation du processeur d'un équipement
public String getprocesseur(){

	return " ";
}
	


///













public static void main(String[] args) {

try {

Serveur objet = new Serveur();

Naming.rebind("rmi://localhost/Serveur", objet);

System.out.println("Serveur prêt");

}

catch(Exception e) {

System.err.println("Erreur: " + e.getMessage());

}

}

}


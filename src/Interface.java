import java.net.UnknownHostException;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Interface extends Remote {

//la méthode getnom : retourne le nom de la machine sur le réseau 
	public String getnom()throws RemoteException, UnknownHostException;
	
// la méthode getip : retourne l'@ip d'un équipement

public String   getip() throws RemoteException, UnknownHostException;	
	
	
// la méthode getmac : retourne l'@mac d'un équipement
	
public String getmac()throws RemoteException, UnknownHostException;
	
// la méthode getram : retourne l'utilisation de la ram d'un équipement

public String getram()throws RemoteException, UnknownHostException;
	
// la méthode getprocesseur : retourne l'utilisation du processeur d'un équipement
public String getprocesseur()throws RemoteException, UnknownHostException;
	
//public void addition()

}
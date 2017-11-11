 import java.rmi.Naming;
public class Client {

  static String resultat1;
  static String resultat2;
  static String resultat3;
  static String resultat4;

public static void main(String[] args) {

try {

Interface reference = (Interface)Naming.lookup("rmi://localhost/Serveur");

resultat1 = reference.getnom() ;
System.out.println("Le nom: " + resultat1); 


resultat2 = reference.getip() ;
System.out.println("L'@dresse ip: " + resultat2); 


resultat3 = reference.getmac() ;
System.out.println("L'@dresse mac: " + resultat3); 


resultat4 = reference.getram() ;
System.out.println("ram: " + resultat4); 


}
//System.out.println("La somme est: " + resultat); }

catch(Exception e) { System.err.println("Erreur: " + e.getMessage()); }


} }

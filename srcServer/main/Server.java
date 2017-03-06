package main;

import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;

/**
 * @author morat 
 */
public class Server {
  /**
   * @param args
   */
  public static void main(final String args[]) {
    String nom="";
    int nombre=1; int port = 1099;
    Registry registry=null;
    // récupération des arguments
    if (args.length!=3){
      System.out.println("Server <nom générique des objets distants> <nombre de noms> <port du registry>");
      System.exit(1);
    }
    try  {
      nom = args[0];
      port = Integer.parseInt(args[2]);
      nombre = Integer.parseInt(args[1]);
    }catch(Exception e) {
      System.out.println("Server <nom générique des objets distants> <nombre de noms> <port du registry>");
      System.exit(1);
    }
    // installation d'un securityManager
    // A COMPLETER : INSTALLATIOND'UN SECURITYMANAGER
    // A COMPLETER : MISE EN PLACE DU REGISTRY
    System.getSecurityManager();
    try {
		registry = LocateRegistry.createRegistry(port);
	} catch (RemoteException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    Supplier supp;
    try {
      for(int i=1;i<=nombre;i++){
      	supp=new Supplier(nom,i);
      	Naming.bind(supp.name(), supp);
      }
      System.out.println("Tous les objets sont enregistrés dans le serveur d'objets distants");
    } catch (Exception e) {
      System.out.println("Server err: " + e);
    }
  }
}

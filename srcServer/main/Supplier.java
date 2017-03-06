package main;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Supplier extends UnicastRemoteObject implements ISupplier {

	int num;
	String nom;
	
	protected Supplier(String nom, int num) throws RemoteException {
		super();
		this.num = num;
		this.nom = nom;
	}

	@Override
	public String question() throws RemoteException {
		// TODO Auto-generated method stub
		return "norm";
	}

	@Override
	public String question(String s) throws RemoteException {
		// TODO Auto-generated method stub
		return System.getProperty(s);
	}

	@Override
	public String name() throws RemoteException {
		return nom+num;
	}
	
	public String toString(){ return "supplier"+num ;}

}

package main;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Supplier extends UnicastRemoteObject implements ISupplier {

	@Override
	public String question() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String question(String s) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String name() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}

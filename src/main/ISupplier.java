package main;
import java.rmi.Remote; 
import java.rmi.RemoteException; 

/**
 * @author morat 
 */
public interface ISupplier extends Remote {
	/**
	 * renvoie la velur de la propri�t� os.name
	 * @return la valeur de os.name
	 * @throws RemoteException
	 */
	public String question() throws RemoteException;
	/**
	 * renvoie la valeur de la propti�t� de nom s
	 * @param s le nom de la propri�t� choisie
	 * @return la valeur de cette propri�t�
	 * @throws RemoteException
	 */
	public String question(String s) throws RemoteException;

	/**
	 * renvoie le nom du Provider : nom g�n�rique suivi du rang
	 * @return le nom du Provider
	 * @throws RemoteException
	 */
	public String name() throws RemoteException;
}
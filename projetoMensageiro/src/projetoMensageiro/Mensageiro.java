package projetoMensageiro;
import java.rmi.RemoteException;
import java.rmi.*;

public interface Mensageiro extends Remote{
	public String lerMensagem() throws RemoteException;
	public void enviarMensagem(String msg) throws RemoteException;
}

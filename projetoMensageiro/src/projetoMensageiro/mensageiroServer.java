package projetoMensageiro;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class mensageiroServer extends UnicastRemoteObject implements Mensageiro{
	public mensageiroServer() throws RemoteException{
		super();
	}
	public void enviarMensagem(String msg) throws RemoteException{
		System.out.println(msg);
	}
	
	@Override
	public String lerMensagem() throws RemoteException{
		return "Mensagem enviada";
	}
	public static void main(String[] args) {
		try {
 			reg.rebind("server", new mensageiroServer());
			System.out.println("Servidor OK");
		}catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
}
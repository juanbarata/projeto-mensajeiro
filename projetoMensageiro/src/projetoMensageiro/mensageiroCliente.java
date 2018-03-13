package projetoMensageiro;


import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class mensageiroCliente {
	public static void main(String[] args) { 
	try {
		Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
		Mensageiro rmi = (Mensageiro) reg.lookup("server");
		rmi.enviarMensagem("Olá");
		
		} catch(RemoteException e){
			System.out.println("Erro: " + e.getMessage() );
		} catch(NotBoundException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}

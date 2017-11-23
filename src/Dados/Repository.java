package Dados;
import java.util.ArrayList;
import Negocio.Cliente;
import Negocio.Evento;
import Negocio.Funcionario;

public class Repository implements BdIn {
	
	private ArrayList <Cliente> clients = new ArrayList <Cliente>();
	
	private ArrayList <Funcionario> funcs = new ArrayList <Funcionario>();
	
	private ArrayList <Evento> event = new ArrayList <Evento>();
	
	public void AddCliente(Cliente pClient){
		clients.add(pClient);
	}
	
	public void AddFunc(Funcionario pFunc){
		//clients.contains(pFunc);
		funcs.add(pFunc);
	}
	
	public void AddEvento(Evento pEvent){
		event.add(pEvent);
	}
	
	public boolean RemoveCliente(int idClient){
	
		for(int i = 0; i < clients.size(); i++){
			if(this.clients.get(i).id == idClient){
				clients.remove(i);
				return true;
			}
		}
		
		return false;
	}

	
	public boolean RemoveFunc(int idFunc){

		for(int i = 0; i < funcs.size(); i++){
			if(this.funcs.get(i).id == idFunc){
				funcs.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	public boolean RemoveEvento(int idEvent){
		for(int i = 0; i < funcs.size(); i++){
			if(this.event.get(i).id == idEvent){
				event.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	public Evento getEvento(int pPosition) {
		return event.get(pPosition);
	}
	
	public Cliente getCliente(int pPosition) {
		return clients.get(pPosition);
	}
	
	public Funcionario getFuncionario(int pPosition) {
		return funcs.get(pPosition);
	}
	
	public int getCountClients() {
		return clients.size();
	}
	
	public int getCountEvents() {
		return event.size();
	}
	
	public int getCountFuncionarios() {
		return funcs.size();
	}
	
	public void ImprimeClients() {
		for(int i = 0; i < clients.size(); i++){
			System.out.println(clients.get(i).getNome());
		}
	}
	
	public void ImprimeFuncs() {
		for(int i = 0; i < funcs.size(); i++){
			System.out.println(funcs.get(i).getNome());
		}
	}		
}

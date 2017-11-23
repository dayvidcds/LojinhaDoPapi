package Negocio;
import Dados.*;

public class Negocio {

	BdIn repositorio = new Repository();
	
	public void AddCliente(Cliente pClient){
		repositorio.AddCliente(pClient);
	}
	
	public void AddFunc(Funcionario pFunc){
		repositorio.AddFunc(pFunc);
	}
	
	public void AddEvento(Evento pEvent){
		repositorio.AddEvento(pEvent);
	}
	
	public void RemoveCliente(int idClient){
		repositorio.RemoveCliente(idClient);
	}
	
	public void RemoveFunc(int idFunc){
		repositorio.RemoveFunc(idFunc);
	}
	
	public void RemoveEvento(int idEvent){
		repositorio.RemoveEvento(idEvent);
	}
	
	public Evento getEvento(int pPosition) {
		return repositorio.getEvento(pPosition);
	}
	
	public Cliente getCliente(int pPosition) {
		return repositorio.getCliente(pPosition);
	}
	
	public Funcionario getFuncionario(int pPosition) {
		return repositorio.getFuncionario(pPosition);
	}
	
	public int getCountClients() {
		return repositorio.getCountClients();
	}
	
	public int getCountEvents() {
		return repositorio.getCountEvents();
	}
	
	public int getCountFuncionarios() {
		return repositorio.getCountFuncionarios();
	}
	
	public void ImprimeClients() {
		repositorio.ImprimeClients();
	}
	
	public void ImprimeFuncs() {
		repositorio.ImprimeFuncs();
	}
	
}

package Dados;
import Negocio.Cliente;
import Negocio.Evento;
import Negocio.Funcionario;

public interface BdIn {
	void AddCliente(Cliente pClient);
	boolean RemoveCliente(int id);
	void AddFunc(Funcionario pFunc);
	boolean RemoveFunc(int id);
	void AddEvento(Evento pEvent);
	boolean RemoveEvento(int id);
	void ImprimeClients();
	void ImprimeFuncs();
	Evento getEvento(int id);
	Funcionario getFuncionario(int id);
	Cliente getCliente(int id);
	int getCountEvents();
	int getCountFuncionarios();
	int getCountClients();
}

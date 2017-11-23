package Negocio;
public class Funcionario extends Pessoa {
	
	private float salario;
	private int quantEventos = 0;
	private boolean disponivel = false;

	Funcionario(String pNome, String pCpf, String pNumTelefone, String pEndereco, float pSalario, int idFunc) {
		super(pNome, pCpf, pNumTelefone, pEndereco, idFunc);
		setSalario(pSalario);
	}
	
	private void setSalario(float pSalario) {
		this.salario = pSalario;
	}
	
	public void setQuantEventos(int pQuantEventos) {
		this.quantEventos = pQuantEventos;
	}
	
	public void setDisponibilidade(boolean pDisponivel) {
		this.disponivel = pDisponivel;
	}
	
	public boolean getDisponibilidade() {
		return this.disponivel;
	}
	
	public float getSalario() {
		return this.salario;
	}
	
	public int getQuantEventos() {
		return this.quantEventos;
	}
}

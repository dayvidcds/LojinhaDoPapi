package Negocio;

public class Evento {
	
	public int id;
	private float preco;
	private String local;
	private String horario;
	private int idCliente;
	private String tipoEvento;
	
	public Evento(float pPreco, String pLocal, String pHorario, String pTipoEvento, int pIdCliente) {
		setPreco(pPreco);
		setLocal(pLocal);
		setHorario(pHorario);
		setTipoEvento(pTipoEvento);
		setId(pIdCliente);
	}
	
	private void setTipoEvento(String pTipoEvento) {
		this.tipoEvento = pTipoEvento;
	}
	
	private void setPreco(float pPreco) {
		this.preco = pPreco;
	}
	
	private void setLocal(String pLocal) {
		this.local = pLocal;
	}
	
	private void setHorario(String pHorario) {
		this.horario = pHorario;
	}
	
	protected void setId(int pId) {
		this.idCliente = pId;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public String getLocal() {
		return this.local;
	}
	
	public String getHorario() {
		return this.horario;
	}
	
	public int getIdCliente() {
		return this.idCliente;
	}
	
	public String getTipoEvento() {
		return this.tipoEvento;
	}
	
}

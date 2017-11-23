package Negocio;

import java.util.InputMismatchException;

abstract class Pessoa {
	
	public int id = 0;
	protected String nome;
	private String cpf;
	private String numTelefone;
	private String endereco;
	
	Pessoa(String pNome, String pCpf, String pNumTelefone, String pEndereco, int pId) {
		setNome(pNome);
		setCpf(pCpf);
		setEndereco(pEndereco);
		setNumTelefone(pNumTelefone);
		this.id = pId;
	}
	
	protected void setId(int pId) {
		this.id = pId;
	}
	
	private void setNome(String pNome) {
		this.nome = pNome;
	}
	
	private void setCpf(String pCpf) {
		this.cpf = pCpf;
	}
	
	private void setNumTelefone(String pNumtelefone) {
		this.numTelefone = pNumtelefone; 
	}
	
	private void setEndereco(String pEndereco) {
		this.endereco = pEndereco;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getNumTelefone() {
		return this.numTelefone;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public boolean validarCpf() {
		  
	    String CPF = this.cpf;
	    CPF = CPF.replace("-", "");
		  
	    if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
	        CPF.equals("22222222222") || CPF.equals("33333333333") ||
	        CPF.equals("44444444444") || CPF.equals("55555555555") ||
	        CPF.equals("66666666666") || CPF.equals("77777777777") ||
	        CPF.equals("88888888888") || CPF.equals("99999999999") ||
	       (CPF.length() != 11)) return(false);
	    
	    char dig10, dig11;
	    int sm, i, r, num, peso;

	    try {
	    	
	      sm = 0;
	      peso = 10;
	      for (i = 0; i < 9; i++) {
	        num = (int)(CPF.charAt(i) - 48);
	        sm = sm + (num * peso);
	        peso = peso - 1;
	      }

	      r = 11 - (sm % 11);
	      
	      if ((r == 10) || (r == 11)) dig10 = '0';
	      else dig10 = (char)(r + 48); 

	      sm = 0;
	      peso = 11;
	      for(i = 0; i < 10; i++) {
	        num = (int)(CPF.charAt(i) - 48);
	        sm = sm + (num * peso);
	        peso = peso - 1;
	      }

	      r = 11 - (sm % 11);
	      
	      if ((r == 10) || (r == 11)) dig11 = '0';
	      else dig11 = (char)(r + 48);

	      if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) return(true);
	      else return(false);
	      
	    } 
	    catch (InputMismatchException a) {
	        return(false);
	    }
	}
}

package Padrao;

public class Pessoa {
	
	private String nome;
	private String CPF;
	
	public Pessoa (String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String imprimeDados() {
		return "Nome: " + this.getNome() + "\n" +
	           "CPF: " + this.getCPF() + "\n";
	}

}

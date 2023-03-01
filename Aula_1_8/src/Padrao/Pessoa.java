package Padrao;

public class Pessoa {
	
	public int identificador;
	public String CPF;
	public String nome;
	public double altura;
	public double peso;
	public int ano_nascimento;
	
	public Pessoa (int id) {
		identificador = id;
	}
	
	public Pessoa (int id, String CPF, String nome) {
		this.identificador = id;
		this.CPF = CPF;
		this.nome = nome;
	}
	
	public Pessoa (int id, String CPF, String nome, double altura, double peso) {
		this.identificador = id;
		this.CPF = CPF;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	
	public String imprimeDados() {
		return "Identificador: " + this.identificador + "\n" +
	           "CPF: " + this.CPF + "\n" +
			   "Nome: " + this.nome + "\n" +
	           "Altura: " + this.altura + "\n" +
			   "Peso: " + this.peso;
		
	}

}

package Padrao;

public class Pessoa {
	
	private int identificador;
	private String CPF;
	private String nome;
	private double altura;
	private double peso;
	private int ano_nascimento;
	
	
	
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getAno_nascimento() {
		return ano_nascimento;
	}

	public void setAno_nascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}

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

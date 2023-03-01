package FP;

public abstract class Empregado {
	private String nome;
	private String CPF;
	private double salarioFixo;
	private double valorPrevidencia;
	private double valorBeneficios;
	
	protected abstract double calculaSalario();
	
	public Empregado(String nome, String CPF, double salarioFixo) {
		this.setNome(nome);
		this.setCPF(CPF);
		this.setSalarioFixo(salarioFixo);
	}
	
	protected String imprimirDados() {
		return "Nome: " + this.getNome() + "\n" +
				"CPF: " + this.getCPF() + "\n" +
				"Salario Fixo: " + this.getSalarioFixo() + "\n" +
				"Valor Beneficios: " + this.getValorBeneficios() + "\n" +
				"Valor Previdencia: " + this.getValorPrevidencia()+ "\n";
				
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

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public double getValorPrevidencia() {
		return valorPrevidencia;
	}

	public void setValorPrevidencia(double valorPrevidencia) {
		this.valorPrevidencia = valorPrevidencia;
	}

	public double getValorBeneficios() {
		return valorBeneficios;
	}

	public void setValorBeneficios(double valorBeneficios) {
		this.valorBeneficios = valorBeneficios;
	}
	
	
	
	
}

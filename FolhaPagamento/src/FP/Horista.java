package FP;

public class Horista extends Empregado {
	private double quantidadeHoras;
	private double valorHora;
	
	public Horista (String nome, String CPF, double salarioFixo, double qtdeHoras, double valorHora) {
		super(nome, CPF, salarioFixo);
		
		this.setQuantidadeHoras(qtdeHoras);
		this.setValorHora(valorHora);
	}
	
	protected double calculaSalario () {
		return  (this.getSalarioFixo() +	this.getValorBeneficios() +
				(this.getQuantidadeHoras() * this.getValorHora())) - this.getValorPrevidencia();
	}
	
	public String imprimirDados() {
		return super.imprimirDados() +
				"Quantidade de Horas: " + this.getQuantidadeHoras() + "\n" +
				"Valor da Hora: " + this.getValorHora() + "\n" +
				"Valor a Receber: " + this.calculaSalario() + "\n";
	}
	
	public double getQuantidadeHoras() {
		return quantidadeHoras;
	}
	public void setQuantidadeHoras(double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
}

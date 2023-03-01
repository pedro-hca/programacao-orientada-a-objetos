package Padrao;

public class EmpregadoHorista extends Empregado {
	
	private double quantidade_horas_trabalhadas;
	private double valor_hora;
	
	public EmpregadoHorista(String nome, String CPF) {
		super(nome, CPF);
	}
	
	public EmpregadoHorista(String nome, String CPF, double qtde_horas, double valor_hora){
		super(nome, CPF);
		this.setQuantidade_horas_trabalhadas(qtde_horas);
		this.setValor_hora(valor_hora);
	}
	
	public double calcula_salario_mensal() {
		return this.getSalario_fixo() + (this.getQuantidade_horas_trabalhadas() * this.getValor_hora());
		
	}
	
	public String imprimeDados() {
		return super.imprimeDados() + "\n" +
				"Qtde de horas trab: " + this.getQuantidade_horas_trabalhadas()+ "\n" +
				"Valor Hora: " + this.getValor_hora();
	}
	

	public double getQuantidade_horas_trabalhadas() {
		return quantidade_horas_trabalhadas;
	}

	public void setQuantidade_horas_trabalhadas(double quantidade_horas_trabalhadas) {
		this.quantidade_horas_trabalhadas = quantidade_horas_trabalhadas;
	}

	public double getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(double valor_hora) {
		this.valor_hora = valor_hora;
	}
	
	

}

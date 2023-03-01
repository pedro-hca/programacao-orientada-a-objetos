package FP;

public class Comissionado extends Empregado {
	private double totalVenda;
	private double percentualComissao;
	
	public Comissionado(String nome, String CPF, double salarioFixo, double totalVendas, double perc) {
		super(nome, CPF, salarioFixo);
		this.setTotalVenda(totalVendas);
		this.setPercentualComissao(perc);
	}

	protected double calculaSalario () {
		return  (this.getSalarioFixo() +	this.getValorBeneficios() +
				(this.getTotalVenda() * this.getPercentualComissao())) - this.getValorPrevidencia();
	}
	
	public String imprimirDados() {
		return super.imprimirDados() +
				"Total de Vendas: " + this.getTotalVenda() + "\n" +
				"Percentual de Comissao: " + this.getPercentualComissao() + "\n" +
				"Valor a Receber: " + this.calculaSalario() + "\n";
	}
	
	public double getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	
	

}

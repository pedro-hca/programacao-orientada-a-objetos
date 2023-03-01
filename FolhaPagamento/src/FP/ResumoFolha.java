package FP;

import java.util.*;

public class ResumoFolha {
	
	private ArrayList<Empregado> empregados = new ArrayList();
	
	private double totalFolha;
	private double totalHoras;
	private double totalVendas;
	
	public int calcularTotalEmpregados() {return this.empregados.size();}
	
	
	public void addEmpregado(Horista empregado) {
		this.empregados.add(empregado);
		this.totalFolha += empregado.calculaSalario();
		this.totalHoras += empregado.getQuantidadeHoras();
		}
	
	public void addEmpregado(Comissionado empregado) {
		this.empregados.add(empregado);
		this.totalFolha += empregado.calculaSalario();
		this.totalVendas += empregado.getTotalVenda();
		
	}
	
	public ArrayList<Empregado> getEmpregados() {
		return empregados;
	}

	public double getTotalFolha() {
		return totalFolha;
	}

	public double getTotalHoras() {
		return totalHoras;
	}

	public double getTotalVendas() {
		return totalVendas;
	}
	
	public String imprimirResumo() {
		String retorno = "";
		
		for(Empregado emp : empregados)
			retorno += emp.imprimirDados() + "\n";
		
		retorno += "****** Resumo final ******\n" +
				"Total Vendas: " + this.getTotalVendas() + "\n" +
				"Total Horas: " + this.getTotalHoras() + "\n" +
				"Total da Folha: " + this.getTotalFolha();
		return retorno;
	}
	

	
	
}

package FP;

public class Pagamento {

	public static void main(String[] args) {
		ResumoFolha resumo = new ResumoFolha();
		
		Horista emp = new Horista("Joaquin Borges", "047.025.855-55", 0, 40, 220);
		emp.setValorBeneficios(800);
		emp.setValorPrevidencia(450);
		resumo.addEmpregado(emp);
		
		emp = new Horista("Ana Gotardo", "011.025.852-63", 1500, 37, 220);
		emp.setValorBeneficios(800);
		emp.setValorPrevidencia(470);
		resumo.addEmpregado(emp);
		
		Comissionado emp2 = new Comissionado("Alex Silva", "745.698.552-64", 0, 85000, 0.04);
		emp2.setValorBeneficios(800);
		emp2.setValorPrevidencia(500);
		resumo.addEmpregado(emp2);
		
		emp2 = new Comissionado("Paulo Gouveia", "888.698.325-92", 0, 190000, 0.037);
		emp2.setValorBeneficios(800);
		emp2.setValorPrevidencia(500);
		resumo.addEmpregado(emp2);
		
		System.out.println(resumo.imprimirResumo());
		System.out.println(resumo.calcularTotalEmpregados());
		
	}

}

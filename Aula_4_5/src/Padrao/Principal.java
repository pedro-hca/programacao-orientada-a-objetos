package Padrao;

public class Principal {

	public static void main(String[] args) {
		Pessoa pes = new Pessoa("Maria Auxilidora da Costa", "123.456.789-00");
		System.out.println(pes.imprimeDados());
		
		Empregado emp= new Empregado("Joaquim Cardoso", "987.654.321-11",
				 					29, 3000, 555888999);
		System.out.println(emp.imprimeDadosComSalarioMensal());
		
		EmpregadoHorista eh= new EmpregadoHorista("Celso Silva", "444.555.666-01",
								220, 60);
		System.out.println(eh.imprimeDadosComSalarioMensal());
}

}

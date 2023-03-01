package Padrao;

public class Principal {

	public static void main(String[] args) {
		Pessoa pes1 = new Pessoa(3532);
		pes1.setCPF("046.124.552-52");
		pes1.setNome("Carlos Silva");
		pes1.setAltura(1.85);
		pes1.setPeso(90);
		System.out.println(pes1.imprimeDados());
		System.out.println("Altura com Encapsulamento: " + pes1.getAltura());
		
		Pessoa pes2 = new Pessoa(3590, "125.258.852-96", "José Costa");
		pes2.setAltura(1.58);
		pes2.setPeso(62);
		System.out.println(pes2.imprimeDados());
		
		
		Pessoa pes3 = new Pessoa(3280,"123.987.452-91", "Carla Almeida", 1.74, 56);
		System.out.println(pes3.imprimeDados());
		
	}

}

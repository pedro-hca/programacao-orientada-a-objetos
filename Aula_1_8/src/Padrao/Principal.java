package Padrao;

public class Principal {

	public static void main(String[] args) {
		Pessoa pes1 = new Pessoa(3532);
		pes1.CPF = "046.124.552-52";
		pes1.nome = "Carlos Silva";
		pes1.altura = 1.85;
		pes1.peso = 90;
		System.out.println(pes1.imprimeDados());
		
		IMC objIMC = new IMC(pes1.altura, pes1.peso);
		System.out.println("IMC: " + objIMC.calculaIMC() + "\n" +
				           "Classificação: " + objIMC.verificaClassificacaoIMC());
		
		
		Pessoa pes2 = new Pessoa(3590, "125.258.852-96", "José Costa");
		pes2.altura = 1.58;
		pes2.peso = 62;
		System.out.println(pes2.imprimeDados());
		
		IMC objIMC2 = new IMC(pes2.altura, pes2.peso);
		System.out.println("IMC: " + objIMC2.calculaIMC() + "\n" +
				           "Classificação: " + objIMC2.verificaClassificacaoIMC());
		
		Pessoa pes3 = new Pessoa(3280,"123.987.452-91", "Carla Almeida", 1.74, 56);
		System.out.println(pes3.imprimeDados());
		
		IMC objIMC3 = new IMC(pes3.altura, pes3.peso);
		System.out.println("IMC: " + objIMC3.calculaIMC() + "\n" +
				           "Classificação: " + objIMC3.verificaClassificacaoIMC());
		

	}

}

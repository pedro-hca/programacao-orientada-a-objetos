package Padrao;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		ArrayList<Integer> numeros = new ArrayList();
		numeros.add(10);
		numeros.add(14);
		numeros.add(19);
		numeros.add(17);
		numeros.add(6);
		
		
				
		System.out.println(calc.somar(numeros));

	}

}

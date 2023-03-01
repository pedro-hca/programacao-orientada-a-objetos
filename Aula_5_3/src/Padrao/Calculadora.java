package Padrao;

import java.util.ArrayList;

public class Calculadora {
	
	public int somar(int a, int b) {
		return this.somar(a, b, 0);
	}
	
	public int somar(int a, int b, int c) {
		return a + b + c;
	}
	
	public double somar(double c, double d) {
		return c + d;
		
	}
	
	public int somar(ArrayList<Integer> numeros) {
		int total = 0;
		
		for (Integer elemento : numeros)
			total = total + elemento;
		
		return total;
	}

}

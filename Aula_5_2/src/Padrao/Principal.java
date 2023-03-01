package Padrao;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Animal> animais = new ArrayList();
		
		Animal an = new Vaca();
		animais.add(an);
		
		an = new Cachorro();
		animais.add(an);
		
		an = new Gato();
		animais.add(an);
		
		for(Animal ani : animais)
			System.out.println(ani.consultaVoz());
		

	}

}

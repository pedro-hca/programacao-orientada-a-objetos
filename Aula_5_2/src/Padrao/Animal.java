package Padrao;

public abstract class Animal {
	
	protected abstract String retornaMinhaVoz();
	
	public String consultaVoz() {
		return "Minha voz: " + this.retornaMinhaVoz();
	}

}

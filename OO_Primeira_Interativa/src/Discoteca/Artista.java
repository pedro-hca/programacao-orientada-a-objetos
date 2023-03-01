package Discoteca;

public class Artista {
	private int identificador;
	private String nome_artista;
	
	public Artista(int id,String nome) {
		this.setIdentificador(id);
		this.setNome_artista(nome);
	}
	
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNome_artista() {
		return nome_artista;
	}
	public void setNome_artista(String nome_artista) {
		this.nome_artista = nome_artista;
	}
	
	
	
	

}

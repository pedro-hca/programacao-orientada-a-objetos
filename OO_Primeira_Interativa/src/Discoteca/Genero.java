package Discoteca;

public class Genero {
	
	private int identificador;
	private String descricao;
	
	public Genero(int id, String descricao) {
		this.setIdentificador(id);
		this.setDescricao(descricao);
		
	}
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}

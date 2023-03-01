package Discoteca;

import java.util.ArrayList;

public class Album {
	private int identificador;
	private String nome_album;
	private int ano_lancamento;
	private ArrayList<Musica> musicas;
	
	public Album(int id, String nome, int ano_lancamento) {
		this.setIdentificador(id);
		this.setNome_album(nome);
		this.setAno_lancamento(ano_lancamento);
		musicas = new ArrayList();
	}
	
	public double buscaTempoTotal() {
		double total = 0;
		
		for(Musica m : this.musicas)
			total = total + m.getTempo();
		
		return total;
		
	}
	
	public int buscaTotalMusicas() {
		return this.musicas.size();
	}
	
	public String imprimirDados() {
		String retorno = 
				"Álbum: " + this.getIdentificador() + " - " + this.getNome_album()	+ "\n" +
				"Ano lançamento: " + this.getAno_lancamento() + "\n"+
				"Total de Musicas: " + this.buscaTotalMusicas() + "\n"+
				"Tempo Total: " + this.buscaTempoTotal() + "\n";
					
				retorno = retorno + "--- Músicas ---" + "\n";
				for (Musica m: musicas)
					retorno += m.imprimirDados(true);
				
				return retorno;
		
	}
	
	
	public void addMusica(Musica musica) {
		this.musicas.add(musica);
	}
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNome_album() {
		return nome_album;
	}
	public void setNome_album(String nome_album) {
		this.nome_album = nome_album;
	}
	public int getAno_lancamento() {
		return ano_lancamento;
	}
	public void setAno_lancamento(int ano_lancamento) {
		this.ano_lancamento = ano_lancamento;
	}
	
	
}

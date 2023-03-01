package Discoteca;

public class Musica {
	private int identificador;
	private String nome;
	private double tempo;
	private Genero genero;
	private Artista artista;
	
	public Musica(int identificador, String nome, double tempo, Genero genero, Artista artista) {
		this.setIdentificador(identificador);
		this.setNome(nome);
		this.setTempo(tempo);
		this.setGenero(genero);
		this.setArtista(artista);
	}
	
	public String imprimirDados(boolean imprimirArtista) {
		String retorno =
			"Identificador: " + this.getIdentificador() + " - " +
			"Nome:" + this.getNome() + " - " +
		    "Tempo: " + this.getTempo()	+ " - " +
			"Genero: " + this.getGenero().getDescricao();
		
		if(imprimirArtista)
			retorno = retorno + "- Artista: " + this.getArtista().getNome_artista() + "\n";
		return retorno;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTempo() {
		return tempo;
	}
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Artista getArtista() {
		return artista;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	
	

}

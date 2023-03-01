package Discoteca;

public class Catalogo {

	public static void main(String[] args) {
		Genero genRock = new Genero(1, "Rock");
		Genero genPop = new Genero(2,"Pop");
		Genero genMPB = new Genero(3,"MPB");
		
		Artista art1= new Artista(1, "Michael Jackson");
		Artista art2= new Artista(2, "Elvis Presley");
		Artista art3= new Artista(3, "Chico Buarque");
		
		Musica m1 = new Musica(979496, "Thriller", 358, genPop, art1);
		Musica m2 = new Musica(842598, "Baby Be Mine", 261, genPop, art1);
		Musica m3 = new Musica(589874, "Beat It", 259, genPop, art1);
		Musica m4 = new Musica(123698, "Billie Jean", 295, genPop, art1);
		
		Album a1 = new Album(1, "Álbum Thriller", 1982);
		a1.addMusica(m1);
		a1.addMusica(m2);
		a1.addMusica(m3);
		a1.addMusica(m4);
		System.out.println(a1.imprimirDados());
		
		Musica m5 = new Musica(457896, "Suspicious Minds", 271, genRock, art2);
		Musica m6 = new Musica(432461, "SLove me Tender", 163, genRock, art2);
		Musica m7 = new Musica(321563, "It's Now or Never", 195, genRock, art2);
		
		Album a2 = new Album(2, "The Essential Elvis Presley", 2006);
		a2.addMusica(m5);
		a2.addMusica(m6);
		a2.addMusica(m7);
		System.out.println(a2.imprimirDados());
		
		Musica m8 = new Musica(371285, "O que sera", 166, genMPB, art3);
		Musica m9 = new Musica(372125, "Mulheres de Atenas", 260, genMPB, art3);
		Musica m10 = new Musica(375325, "Olhos nos Olhos", 273, genMPB, art3);
		Musica m11 = new Musica(363281, "Vai trabalhar vagabundo", 137, genMPB, art3);
		Musica m12 = new Musica(356782, "A noiva da cidade", 228, genMPB, art3);
		Album a3 = new Album(3, "Meus Caros Amigos", 1976);
		
		a3.addMusica(m8);
		a3.addMusica(m9);
		a3.addMusica(m10);
		a3.addMusica(m11);
		a3.addMusica(m12);
		System.out.println(a3.imprimirDados());
		
		Album a4 = new Album(4, "Meu álbum preferido", 2022);
		a4.addMusica(m1);
		a4.addMusica(m5);
		a4.addMusica(m4);
		a4.addMusica(m9);
		a4.addMusica(m10);
		a4.addMusica(m12);
		System.out.println(a4.imprimirDados());
		
		
		
		
	}

}

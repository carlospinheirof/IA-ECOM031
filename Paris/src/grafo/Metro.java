package grafo;

import java.util.ArrayList;

public class Metro {
	private ArrayList<Estacao> estacoes = new ArrayList<Estacao>();
	private ProximoFactory fabricap = new ProximoFactory();
	private Estacao estacao1 = new Estacao();
	private Estacao estacao2 = new Estacao();
	private Estacao estacao3 = new Estacao();
	private Estacao estacao4 = new Estacao();
	private Estacao estacao5 = new Estacao();
	private Estacao estacao6 = new Estacao();
	private Estacao estacao7 = new Estacao();
	private Estacao estacao8 = new Estacao();
	private Estacao estacao9 = new Estacao();
	private Estacao estacao10 = new Estacao();
	private Estacao estacao11 = new Estacao();
	private Estacao estacao12 = new Estacao();
	private Estacao estacao13 = new Estacao();
	private Estacao estacao14 = new Estacao();
	
	public ArrayList<Estacao> createMetro(){
		//Adicionando as heuristicas de cada uma das estações.
		int [] heuris1 = {-1, 0, 11, 20, 27, 40, 43, 39, 28, 18, 10, 18, 30, 30, 32};
		estacao1.setHeuristicas(heuris1);
		estacao1.setNome(1);
		int [] heuris2 = {-1, 11, 0, 9, 16, 29, 32, 28, 19, 11, 4, 17, 23, 21, 24};
		estacao2.setHeuristicas(heuris2);
		estacao2.setNome(2);
		int [] heuris3 = {-1, 20, 9, 0, 7, 20, 22, 19, 15, 10, 11, 21, 21, 13, 18};
		estacao3.setHeuristicas(heuris3);
		estacao3.setNome(3);
		int [] heuris4 = {-1, 27, 16, 7, 0, 13, 16, 12, 13, 13, 18, 26, 21, 11, 17};
		estacao4.setHeuristicas(heuris4);
		estacao4.setNome(4);
		int [] heuris5 = {-1 , 40, 29, 20, 13, 0, 3, 2, 21, 25, 31, 38, 27, 16, 20};
		estacao5.setHeuristicas(heuris5);
		estacao5.setNome(5);
		int [] heuris6 = {-1, 43, 32, 22, 16, 3, 0, 4, 23, 28, 33, 41, 30, 17, 20};
		estacao6.setHeuristicas(heuris6);
		estacao6.setNome(6);
		int [] heuris7 = {-1, 39, 28, 19, 12, 2, 4, 0, 22, 25, 29, 38, 28, 13, 17};
		estacao7.setHeuristicas(heuris7);
		estacao7.setNome(7);
		int [] heuris8 = {-1, 28, 19, 15, 13, 21, 23, 22, 0, 9, 22, 18, 7, 25, 30};
		estacao8.setHeuristicas(heuris8);
		estacao8.setNome(8);
		int [] heuris9 = {-1, 18, 11, 10, 13, 25, 28, 25, 9, 0, 13, 12, 12, 23, 28};
		estacao9.setHeuristicas(heuris9);
		estacao9.setNome(9);
		int [] heuris10 = {-1, 10, 4, 11, 18, 31, 33, 29, 22, 13, 0, 20, 27, 20, 23};
		estacao10.setHeuristicas(heuris10);
		estacao10.setNome(10);
		int [] heuris11 = {-1, 18, 17, 21, 26, 38, 41, 38, 18, 12, 20, 0, 15, 35, 39};
		estacao11.setHeuristicas(heuris11);
		estacao11.setNome(11);
		int [] heuris12 = {-1, 30, 23, 21, 21, 27, 30, 28, 7, 12, 27, 15, 0, 31, 37};
		estacao12.setHeuristicas(heuris12);
		estacao12.setNome(12);
		int [] heuris13 = {-1, 30, 21, 13, 11, 16, 17, 13, 25, 23, 20, 35, 31, 0, 5};
		estacao13.setHeuristicas(heuris13);
		estacao13.setNome(13);
		int [] heuris14 = {-1, 32, 24, 18, 17, 20, 20, 17, 30, 28, 23, 39, 37, 5, 0};
		estacao14.setHeuristicas(heuris14);
		estacao14.setNome(14);
		//Adicionandos os vizinhos.
		//Cores 1 - Azul; 2 - Amarelo; 3 - Vermelho; 4 - Verde.
		estacao1.addProximo(fabricap.createProximo(1, estacao2));
		estacoes.add(estacao1);
		
		estacao2.addProximo(fabricap.createProximo(1, estacao1));
		estacao2.addProximo(fabricap.createProximo(2, estacao10));
		estacao2.addProximo(fabricap.createProximo(2, estacao9));
		estacao2.addProximo(fabricap.createProximo(1, estacao3));
		estacoes.add(estacao2);
		
		estacao3.addProximo(fabricap.createProximo(1, estacao2));
		estacao3.addProximo(fabricap.createProximo(1, estacao4));
		estacao3.addProximo(fabricap.createProximo(3, estacao13));
		estacao3.addProximo(fabricap.createProximo(3, estacao9));
		estacoes.add(estacao3);
		
		estacao4.addProximo(fabricap.createProximo(1, estacao3));
		estacao4.addProximo(fabricap.createProximo(1, estacao5));
		estacao4.addProximo(fabricap.createProximo(4, estacao8));
		estacao4.addProximo(fabricap.createProximo(4, estacao13));
		estacoes.add(estacao4);
		
		estacao5.addProximo(fabricap.createProximo(1, estacao4));
		estacao5.addProximo(fabricap.createProximo(1, estacao6));
		estacao5.addProximo(fabricap.createProximo(2, estacao8));
		estacao5.addProximo(fabricap.createProximo(2, estacao7));
		
		estacoes.add(estacao5);
		
		
		estacao6.addProximo(fabricap.createProximo(1, estacao5));
		estacoes.add(estacao6);
		
		estacao7.addProximo(fabricap.createProximo(2, estacao5));
		estacoes.add(estacao7);
		
		estacao8.addProximo(fabricap.createProximo(4, estacao12));
		estacao8.addProximo(fabricap.createProximo(2, estacao9));
		estacao8.addProximo(fabricap.createProximo(4, estacao4));
		estacao8.addProximo(fabricap.createProximo(2, estacao5));
		estacoes.add(estacao8);

		estacao9.addProximo(fabricap.createProximo(3, estacao11));
		estacao9.addProximo(fabricap.createProximo(2, estacao2));
		estacao9.addProximo(fabricap.createProximo(3, estacao3));
		estacao9.addProximo(fabricap.createProximo(2, estacao8));
		estacoes.add(estacao9);
		
		estacao10.addProximo(fabricap.createProximo(2, estacao2));
		estacoes.add(estacao10);
		
		estacao11.addProximo(fabricap.createProximo(3, estacao9));
		estacoes.add(estacao11);
		
		estacao12.addProximo(fabricap.createProximo(4, estacao8));
		estacoes.add(estacao12);
		
		estacao13.addProximo(fabricap.createProximo(4, estacao4));
		estacao13.addProximo(fabricap.createProximo(4, estacao14));
		estacao13.addProximo(fabricap.createProximo(3, estacao3));
		estacoes.add(estacao13);
		
		estacao14.addProximo(fabricap.createProximo(4, estacao13));
		estacoes.add(estacao14);
		
		return this.estacoes;
	}
	
	
}

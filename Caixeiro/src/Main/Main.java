package Main;

import java.util.ArrayList;

import Grafo.Cidade;
import Grafo.Mapa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mapa mapa = new Mapa();
		ArrayList<Cidade> melhor;
		ArrayList<Cidade> grafo = mapa.criarMapa();
		System.out.printf("%d", grafo.get(2).getNome());
	}

}

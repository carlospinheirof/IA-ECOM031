package Grafo;

import java.util.ArrayList;

public class Cidade {
		private int nome;
		private ArrayList<Proximo> ligados = new ArrayList<Proximo>();
		
		Cidade(int nome){
			this.nome = nome;
		}
		
		public void addProximo(Proximo novo){
			this.ligados.add(novo);
		}

		public int getNome() {
			return nome;
		}

		public ArrayList<Proximo> getLigados() {
			return ligados;
		}
		
		
}

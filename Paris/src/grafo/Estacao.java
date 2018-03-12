package grafo;

import java.util.ArrayList;

public class Estacao {
	private int nome;
	private int [] heuristicas = new int[15]; 
	private ArrayList<Proximo> proximos = new ArrayList<Proximo>();
	private int antecor; 

	public int getNome() {
		return nome;
	}
	public void setNome(int nome) {
		this.nome = nome;
	}	
	public int getAntecor() {
		return antecor;
	}
	public void setAntecor(int antecor) {
		this.antecor = antecor;
	}
	public int[] getHeuristicas() {
		return heuristicas;
	}
	public void setHeuristicas(int[] heuristicas) {
		this.heuristicas = heuristicas;
	}
	public void addProximo(Proximo proximo){
		
		this.proximos.add(proximo);
	}
	public ArrayList<Proximo> getProximos() {
		return this.proximos;
	}
	
}

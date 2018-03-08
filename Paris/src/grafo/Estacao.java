package grafo;

import java.util.ArrayList;

public class Estacao {
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private int [] heuristicas = new int[15]; 
	private ArrayList<Proximo> proximos = new ArrayList<Proximo>();
	private int antecor; 
	
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

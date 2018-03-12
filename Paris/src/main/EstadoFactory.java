package main;

import grafo.Estacao;

public class EstadoFactory {
	
	
	public Estado createEstado(Estacao estacao, int cor, float custo, Estado pai){
		Estado novo = new Estado(estacao, cor, custo, pai);
		return novo;
	}
}

package main;

import grafo.Estacao;

public class EstadoFactory {
	Estado novo;
	
	public Estado createEstado(Estacao estacao, int cor, int custo, Estado pai){
		this.novo = new Estado(estacao, cor, custo, pai);
		return this.novo;
	}
}

package main;

public class EstadoFactory {
	
	public Estado novoEstado(int esquerda_m, int esquerda_c, int direita_m, 
							int direita_c, int posicaoBarco, int passos, Estado anterior){
		Estado novo = new Estado(esquerda_m, esquerda_c, direita_m, direita_c, posicaoBarco, passos, anterior);
		return novo;
	}
}

package grafo;

public class ProximoFactory {
	
	public Proximo createProximo(int cor, Estacao estacao){
		Proximo novo = new Proximo(estacao, cor);
	
		return novo;
	}
}

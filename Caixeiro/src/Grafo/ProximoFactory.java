package Grafo;

public class ProximoFactory {
	
	public Proximo gerarProximo(Cidade cidade, int custo){
		Proximo novo = new Proximo(cidade, custo);
		return novo;
	}
}

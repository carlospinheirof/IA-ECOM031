package grafo;

public class ProximoFactory {
	private Proximo novo = new Proximo();
	
	public Proximo createProximo(int cor, Estacao estacao){
		novo.setCor(cor);
		novo.setEstacao(estacao);
		return this.novo;
	}
}

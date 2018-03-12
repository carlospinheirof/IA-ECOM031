package grafo;

public class Proximo {
	private int cor;
	private Estacao estacao;
	Proximo(Estacao estacao, int cor){
		this.estacao = estacao;
		this.cor = cor;
	}
	public int getCor() {
		return cor;
	}
	
	public Estacao getEstacao() {
		return estacao;
	}
	
	
}

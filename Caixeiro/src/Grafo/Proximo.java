package Grafo;

public class Proximo {
		private Cidade cidade;
		private int custo;
		Proximo(Cidade cidade, int custo){
			this.cidade = cidade;
			this.custo = custo;
		}
		public Cidade getCidade() {
			return cidade;
		}
		public int getCusto() {
			return custo;
		}
}

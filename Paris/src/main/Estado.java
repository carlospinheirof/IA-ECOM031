package main;

import java.util.LinkedList;

import grafo.Estacao;

public class Estado{
		private Estacao estacao = new Estacao();
		private int coranterior;
		private float custodoestado;
		private EstadoFactory fabrica = new EstadoFactory();
		private Estado pai;
		private LinkedList<Estado> filhos = new LinkedList<Estado>();
		private float calculo;
		private int [] aux = new int[15];
		private int [] h = new int[15];
		Estado(Estacao estacao, int cordopai, float custo, Estado pai){
			this.estacao = estacao;
			this.coranterior = cordopai;
			this.custodoestado = custo;
			this.pai = pai;
		}
		
		public LinkedList<Estado> gerarFuturos(int objetivo){
			
			int i = this.estacao.getProximos().size();
			int j;
			for(i = 0; i < this.estacao.getProximos().size(); i++){
				calculo = this.custodoestado;
				if(this.coranterior != 0 && this.coranterior != estacao.getProximos().get(i).getCor()){
					calculo += 4;
				}
				aux = this.estacao.getHeuristicas();
				h = this.estacao.getProximos().get(i).getEstacao().getHeuristicas();
				j = this.estacao.getProximos().get(i).getEstacao().getNome();
				calculo += h[objetivo]/0.5 + aux[j]/0.5;
				this.filhos.add(fabrica.createEstado(estacao.getProximos().get(i).getEstacao(), estacao.getProximos().get(i).getCor(), calculo, this));
			}
			
			return this.filhos;
		}
		
		public Estado getPai() {
			return pai;
		}

		public Estacao getEstacao() {
			return estacao;
		}

		public int getCoranterior() {
			return coranterior;
		}

		public float getCustodoestado() {
			return custodoestado;
		}
}

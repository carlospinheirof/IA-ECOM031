package main;

import java.util.LinkedList;

import grafo.Estacao;

public class Estado implements Comparable<Estado>{
		private Estacao estacao = new Estacao();
		private int coranterior;
		private int custodoestado;
		private EstadoFactory fabrica = new EstadoFactory();
		private Estado pai;
		private LinkedList<Estado> filhos = new LinkedList<Estado>();
		Estado(Estacao estacao, int cordopai, int custo, Estado pai){
			this.estacao = estacao;
			this.coranterior = cordopai;
			this.custodoestado = custo;
			this.pai = pai;
		}
		
		public LinkedList<Estado> gerarFuturos(){
			
			
			
			
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

		public int getCustodoestado() {
			return custodoestado;
		}

		@Override
		public int compareTo(Estado estado) {
			 if (this.custodoestado < estado.custodoestado) {
		            return -1;
		        }
		        if (this.custodoestado > estado.custodoestado) {
		            return 1;
		        }
		        return 0;
		}
}

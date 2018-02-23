package main;
import java.util.ArrayList;

public class Estado {
	
	private Barco barco = new Barco();
	private Estado pai = null;
	private int mis_esquerda = 0, mis_direita = 0, cani_esquerda = 0, cani_direita = 0;
	private int passosdados = 0;
	private EstadoFactory ef = new EstadoFactory();

	public Estado(int esquerda_m, int esquerda_c, int direita_m, int direita_c, int posicaoBarco, int passos,
			Estado anterior) {
		this.mis_esquerda = esquerda_m;	
		this.cani_esquerda = esquerda_c;
		this.mis_direita = direita_m;
		this.cani_direita = direita_c;
		this.barco.setLado(posicaoBarco);
		this.passosdados = passos;
		this.pai = anterior;
	}

	public int getMis_esquerda() {
		return mis_esquerda;
	}

	public int getMis_direita() {
		return mis_direita;
	}

	public int getCani_esquerda() {
		return cani_esquerda;
	}

	public int getCani_direita() {
		return cani_direita;
	}

	public Barco getBarco() {
		return this.barco;
	}

	public Estado getPai() {
		return this.pai;
	}

	public int getPassosdados() {
		return this.passosdados;
	}
	
	public boolean Valido(){
		
		boolean validade = true;
		if((mis_esquerda < cani_esquerda) && mis_esquerda != 0){
			validade = false;
		}
		if((mis_direita < cani_direita) && mis_direita != 0){
			validade = false;
		}	
		return validade;
	}
	
	public boolean Resposta(){
		if((this.mis_direita + this.cani_direita) == 6){
			return true;
		}
		return false;
	}
	
	public ArrayList<Estado> criarSucessores(){
		ArrayList<Estado> sucessores = new ArrayList<Estado>();
		
			if(this.barco.getLado() == 0){ // se o barco estiver na esquerda.
				if(this.mis_esquerda >= 2){
					sucessores.add(ef.novoEstado(this.mis_esquerda - 2, this.cani_esquerda, 
												 this.mis_direita + 2, this.cani_direita, 
												 1, this.passosdados + 1, this));
				}
				if(this.mis_esquerda >= 1){
					sucessores.add(ef.novoEstado(this.mis_esquerda - 1, this.cani_esquerda, 
												 this.mis_direita + 1, this.cani_direita, 
												 1, this.passosdados + 1, this));
				}
				if(this.mis_esquerda >= 1 && this.cani_esquerda >= 1){
					sucessores.add(ef.novoEstado(this.mis_esquerda - 1, this.cani_esquerda - 1, 
												 this.mis_direita + 1, this.cani_direita + 1, 
												 1, this.passosdados + 1, this));
				}
				if(this.cani_esquerda >= 2){
					sucessores.add(ef.novoEstado(this.mis_esquerda, this.cani_esquerda - 2, 
												 this.mis_direita, this.cani_direita + 2, 
												 1, this.passosdados + 1, this));
				}
				if(this.cani_esquerda >= 1){
					sucessores.add(ef.novoEstado(this.mis_esquerda, this.cani_esquerda - 1, 
							 					 this.mis_direita, this.cani_direita + 1, 
							 					 1, this.passosdados + 1, this));
				}
			}else{ //se o barco estiver na direita.
				
				if(this.mis_direita >= 2){
					sucessores.add(ef.novoEstado(this.mis_esquerda + 2, this.cani_esquerda, 
												 this.mis_direita - 2, this.cani_direita, 
												 0, this.passosdados + 1, this));
				}
				if(this.mis_direita >= 1){
					sucessores.add(ef.novoEstado(this.mis_esquerda + 1, this.cani_esquerda, 
												 this.mis_direita - 1, this.cani_direita, 
												 0, this.passosdados + 1, this));
				}
				if(this.mis_direita >= 1 && this.cani_direita >= 1){
					sucessores.add(ef.novoEstado(this.mis_esquerda + 1, this.cani_esquerda + 1, 
												 this.mis_direita - 1, this.cani_direita - 1, 
												 0, this.passosdados + 1, this));
				}
				if(this.cani_direita >= 2){
					sucessores.add(ef.novoEstado(this.mis_esquerda, this.cani_esquerda + 2, 
												 this.mis_direita, this.cani_direita - 2, 
												 0, this.passosdados + 1, this));
				}
				if(this.cani_direita >= 1){
					sucessores.add(ef.novoEstado(this.mis_esquerda, this.cani_esquerda + 1, 
							 					 this.mis_direita, this.cani_direita - 1, 
							 					 0, this.passosdados + 1, this));
				}
			}
		return sucessores;
	}

	
}

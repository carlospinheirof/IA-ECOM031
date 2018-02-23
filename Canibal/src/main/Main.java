package main;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Estado inicial = new Estado(3, 3, 0, 0, 0, 0, null);
		Estado teste = null;
		LinkedList<Estado> fronteira = new LinkedList<Estado>();
		ArrayList<Estado> filhos;
		fronteira.addLast(inicial);
		int i;
		LinkedList<Estado> caminho = new LinkedList<Estado>();
		
		boolean resultado = false;
		while(!resultado){
			teste = fronteira.removeFirst();
			
			
			if(teste.Valido()){
				if(teste.Resposta()){
					resultado = true;
				}else{
					filhos = teste.criarSucessores();
					for(i = 0; i < filhos.size(); i++){
						fronteira.addLast(filhos.get(i));
					}
				}
			}
			
		}
		System.out.printf("Foram necessários %d passos.\n", teste.getPassosdados());
		while(teste != null){
			caminho.addFirst(teste);
			teste = teste.getPai();
		}
		int tam_caminho = caminho.size();
		for(i = 0; i < tam_caminho; i++){
			teste = caminho.removeFirst();
			System.out.println("*************************");
			System.out.printf("No lado esquerdo tem %d missionarios e %d canibais\n", teste.getMis_esquerda(), teste.getCani_esquerda());
			System.out.printf("No lado direito tem %d missionarios e %d canibais\n", teste.getMis_direita(), teste.getCani_direita());
			if(teste.getBarco().getLado() == 0){
				System.out.println("E o barco está do lado esquerdo.");
			}else{
				System.out.println("E o barco está do lado direito.");
			}
			System.out.println("*************************");
		}
	}

}

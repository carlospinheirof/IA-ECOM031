package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import grafo.Estacao;
import grafo.Metro;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Metro metro = new Metro();
		ArrayList<Estacao> estacoes = new ArrayList<Estacao>();
		estacoes = metro.createMetro();
		boolean v = false;
		int inicio = 0, fim = 0;
		Scanner ler = new Scanner(System.in);
		
		while(!v){
			try{
				System.out.println("Escolha sua estação de partida.\n"
									+ "Numero entre 1 e 14.");
				inicio = ler.nextInt();
				System.out.println("Escolha sua estação de destino.\n"
									+ "Numero entre 1 e 14.");
				fim = ler.nextInt();
				if(inicio < 15 && inicio > 0 && fim < 15 && fim > 0){
					v = true;
				}else{
					System.out.println("Você escolheu um número fora do intervalo.");
				}
			}catch(Exception e){
				System.out.println("Digite novamente.");
			}
		}
		Estacao primeiro = estacoes.get(inicio-1);
		
		System.out.printf("Foi escolhido a estação %d como partida.\n", primeiro.getNome());
		System.out.printf("Foi escolhido a estação %d como destino.\n\n\n", fim);
		Comparator<Estado> comparador = new ComparadorCustos(); 
		PriorityQueue<Estado> fronteira = new PriorityQueue(10, comparador); // fronteira
		LinkedList<Estado> caminho = new LinkedList<Estado>();
		LinkedList<Estado> gerados = new LinkedList<Estado>();
		Estado inicial = new Estado(primeiro, 0, 0, null); //criando o primeiro estado.
		int i,j;
		fronteira.add(inicial);
		Estado atual = fronteira.poll();
		int max = 0;
		while(atual.getEstacao().getNome() != fim && max < 15){
			max++;
			gerados = atual.gerarFuturos(fim);
			j = gerados.size();
			for(i = 0; i < j; i++){
				fronteira.add(gerados.pollFirst());
			}
			atual = fronteira.poll();
		}
		while(atual != null){
			caminho.addFirst(atual);
			atual = atual.getPai();
		}
		System.out.println("Caminho a seguir");
		while(caminho.peek() != null){
			System.out.printf("Estacao %d", caminho.pollFirst().getEstacao().getNome());
			if(caminho.peek() != null){
				System.out.printf(" --> ");
			}
		}
		System.out.printf("\n");
	}

}

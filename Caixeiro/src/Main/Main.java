package Main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Grafo.Cidade;
import Grafo.Mapa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mapa mapa = new Mapa();
		ArrayList<Integer> melhor;
		ArrayList<Integer> teste;
		ArrayList<Cidade> grafo = mapa.criarMapa();
		Desempenho desempenho = new Desempenho();
		int custo = 0;
		int inicio = 0;
		Random gerador = new Random();
		Scanner ler = new Scanner(System.in);
		boolean v = false;
		while(!v){
			try{
				System.out.println("Escolha sua cidade de partida.\n"
									+ "Numero entre 1 e 10.");
				inicio = ler.nextInt();
				if(inicio < 10 && inicio > 0){
					v = true;
				}else{
					System.out.println("Você escolheu um número fora do intervalo.");
				}
			}catch(Exception e){
				System.out.println("Digite novamente.");
			}
		}
		System.out.printf("Numero escolhido foi: %d\n", inicio);
		
	}

}

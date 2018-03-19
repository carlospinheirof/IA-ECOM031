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
		ArrayList<Integer> melhor = null;
		ArrayList<Integer> melhora;
		ArrayList<Integer> teste;
		ArrayList<Integer> teste1;
		ArrayList<Cidade> grafo = mapa.criarMapa();
		Desempenho desempenho = new Desempenho();
		GeradorFilhos filho = new GeradorFilhos();
		int custo = 0;
		int inicio = 0;
		int [] colocados = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		Random gerador = new Random();
		Scanner ler = new Scanner(System.in);
		boolean v = false;
		int aux_random;
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
		inicio -= 1;
		System.out.printf("Cidade escolhida foi: %d\n", grafo.get(inicio).getNome());
		colocados[inicio] = 1;
		int custot;
		int custom = 9999999;
		for(int max = 0; max < 10000; max++){
			
			for(int n = 0; n < 10; n++){
				colocados[n] = 0;
			}
			
			colocados[inicio] = 1;
			teste = new ArrayList<Integer>();
			//Criando o primeiro teste.
			teste.add(inicio);
			while(teste.size() != 10){
				aux_random = gerador.nextInt(10);
				//System.out.printf("gerador: %d\n", aux_random);
				if(colocados[aux_random] == 0){
				//	System.out.printf("gerador adicionado: %d\n", aux_random);
					colocados[aux_random] = 1;
					teste.add(aux_random);
				}
			}
			teste.add(inicio);
			custo = desempenho.getDesempenho(teste, grafo);	
		//	System.out.printf("custo do primeiro: %d\n", custo);
			if(custo != -1){    //ver se é válido, se for vai gerar os filhos.
				melhora = teste;
				for(int trocar1 = 1; trocar1 < teste.size() - 2; trocar1++){
					for(int trocar2 = 2; trocar2 < teste.size() - 1; trocar2++){
						teste1 = filho.gerarFilho(trocar1, trocar2, teste);
						custot = desempenho.getDesempenho(teste1, grafo);
						if(custo > custot){
							custo = custot;
							melhora = teste1;
						}
					}
				}
				if(custo < custom){
					custom = custo;
					melhor = melhora;
				}
			}
			
		}
		System.out.printf("Melhor custo: %d\n", desempenho.getDesempenho(melhor, grafo));
		
		for(int i = 0; i < melhor.size(); i++){
			System.out.printf("cidade %d ", melhor.get(i)+1);
			if(i + 1 < melhor.size()){
				System.out.print("--> ");
			}
		}
		System.out.print("\n");
		
	}

}

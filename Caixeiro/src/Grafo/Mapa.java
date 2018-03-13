package Grafo;

import java.util.ArrayList;

public class Mapa {
	private Cidade c1 = new Cidade(1);
	private Cidade c2 = new Cidade(2);
	private Cidade c3 = new Cidade(3);
	private Cidade c4 = new Cidade(4);
	private Cidade c5 = new Cidade(5);
	private Cidade c6 = new Cidade(6);
	private Cidade c7 = new Cidade(7);
	private Cidade c8 = new Cidade(8);
	private Cidade c9 = new Cidade(9);
	private Cidade c10 = new Cidade(10);
	private ProximoFactory fabricap = new ProximoFactory();
	private ArrayList<Cidade> mapa = new ArrayList<Cidade>();
	
	public ArrayList<Cidade> criarMapa(){
		c1.addProximo(fabricap.gerarProximo(c2, 30));
		c1.addProximo(fabricap.gerarProximo(c3, 84));
		c1.addProximo(fabricap.gerarProximo(c4, 56));
		c1.addProximo(fabricap.gerarProximo(c8, 75));
		c1.addProximo(fabricap.gerarProximo(c10, 80));
		mapa.add(c1);
		
		c2.addProximo(fabricap.gerarProximo(c1, 30));
		c2.addProximo(fabricap.gerarProximo(c3, 65));
		c2.addProximo(fabricap.gerarProximo(c7, 70));
		c2.addProximo(fabricap.gerarProximo(c10, 40));
		mapa.add(c2);
		
		c3.addProximo(fabricap.gerarProximo(c1, 84));
		c3.addProximo(fabricap.gerarProximo(c2, 65));
		c3.addProximo(fabricap.gerarProximo(c4, 74));
		c3.addProximo(fabricap.gerarProximo(c5, 52));
		c3.addProximo(fabricap.gerarProximo(c6, 55));
		c3.addProximo(fabricap.gerarProximo(c8, 60));
		c3.addProximo(fabricap.gerarProximo(c9, 143));
		c3.addProximo(fabricap.gerarProximo(c10, 48));
		mapa.add(c3);
		
		c4.addProximo(fabricap.gerarProximo(c1, 56));
		c4.addProximo(fabricap.gerarProximo(c3, 74));
		c4.addProximo(fabricap.gerarProximo(c5, 135));
		c4.addProximo(fabricap.gerarProximo(c8, 20));
		mapa.add(c4);
		
		c5.addProximo(fabricap.gerarProximo(c3, 52));
		c5.addProximo(fabricap.gerarProximo(c4, 135));
		c5.addProximo(fabricap.gerarProximo(c6, 70));
		c5.addProximo(fabricap.gerarProximo(c8, 122));
		c5.addProximo(fabricap.gerarProximo(c9, 98));
		c5.addProximo(fabricap.gerarProximo(c10, 80));
		mapa.add(c5);
		
		c6.addProximo(fabricap.gerarProximo(c1, 70));
		c6.addProximo(fabricap.gerarProximo(c3, 55));
		c6.addProximo(fabricap.gerarProximo(c5, 70));
		c6.addProximo(fabricap.gerarProximo(c7, 63));
		c6.addProximo(fabricap.gerarProximo(c9, 82));
		c6.addProximo(fabricap.gerarProximo(c10, 35));
		mapa.add(c6);
		
		c7.addProximo(fabricap.gerarProximo(c2, 70));
		c7.addProximo(fabricap.gerarProximo(c6, 63));
		c7.addProximo(fabricap.gerarProximo(c9, 120));
		c7.addProximo(fabricap.gerarProximo(c10, 57));
		mapa.add(c7);
		
		c8.addProximo(fabricap.gerarProximo(c1, 75));
		c8.addProximo(fabricap.gerarProximo(c3, 135));
		c8.addProximo(fabricap.gerarProximo(c4, 20));
		c8.addProximo(fabricap.gerarProximo(c5, 122));
		mapa.add(c8);
		
		c9.addProximo(fabricap.gerarProximo(c3, 143));
		c9.addProximo(fabricap.gerarProximo(c5, 98));
		c9.addProximo(fabricap.gerarProximo(c6, 82));
		c9.addProximo(fabricap.gerarProximo(c7, 120));
		mapa.add(c9);
		
		c10.addProximo(fabricap.gerarProximo(c1, 80));
		c10.addProximo(fabricap.gerarProximo(c2, 40));
		c10.addProximo(fabricap.gerarProximo(c3, 48));
		c10.addProximo(fabricap.gerarProximo(c5, 80));
		c10.addProximo(fabricap.gerarProximo(c6, 35));
		c10.addProximo(fabricap.gerarProximo(c7, 57));
		mapa.add(c10);
		
		return this.mapa;
	}
	
}

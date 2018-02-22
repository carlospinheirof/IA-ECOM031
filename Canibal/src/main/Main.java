package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Estado inicial = new Estado(3, 3, 0, 0, 0, 0, null);
		LinkedList<Estado> fronteira = new LinkedList<Estado>();
		fronteira.add(inicial);
		boolean resultado = false;
		while(!resultado){
			fronteira.removeFirst();
		}
		
	}

}

package Main;

import Grafo.Cidade;
import Grafo.Mapa;
import java.util.ArrayList;
public class Desempenho {
		
	public int getDesempenho(ArrayList<Integer> x, ArrayList<Cidade> mapa){
		Cidade aux1, aux2;
		int estanosproximos;
		int custo = 0;
		for(int i = 0; i < x.size() - 1; i++){
			aux1 = mapa.get(x.get(i));
			aux2 = mapa.get(x.get(i)+1);
			estanosproximos = 0;
			for(int j = 0; j < aux1.getLigados().size(); j++){
				if(aux1.getLigados().get(j).getCidade().getNome() == aux2.getNome()){
					estanosproximos = 1;
					custo += aux1.getLigados().get(j).getCusto();
				}
			}
			if(estanosproximos == 0){
				return -1;
			}
		}
		return custo;
	}
}

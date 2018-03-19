package Main;

import java.util.ArrayList;

public class GeradorFilhos {
		
	public ArrayList<Integer> gerarFilho(int trocar1, int trocar2, ArrayList<Integer> pai){
		ArrayList<Integer> filhote = new ArrayList<Integer>();
		for(int i = 0; i < pai.size(); i++){
			if(i == trocar1){
				filhote.add(pai.get(trocar2));
			}else if(i == trocar2){
				filhote.add(pai.get(trocar1));
			}else{
				filhote.add(pai.get(i));
			}
		}
		return filhote;
	}
}

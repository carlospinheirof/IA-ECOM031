package main;

import java.util.Comparator;

public class ComparadorCustos implements Comparator<Estado> {

	@Override
	public int compare(Estado est1, Estado est2) {
		// TODO Auto-generated method stub
		 if (est1.getCustodoestado() < est2.getCustodoestado()) {
	            return -1;
	        }
	        if (est1.getCustodoestado() > est2.getCustodoestado()) {
	            return 1;
	        }
	        return 0;
	}

}

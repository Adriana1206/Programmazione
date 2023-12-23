package stringhe_esercizi.main;

import stringhe_esercizi.StringaAlContrario;

public class StringaAlContrarioMain {

	public static void main(String[] args) {
		StringaAlContrario s = new StringaAlContrario();
		String stringa = s.getStringa();		
		
		System.out.println("Stringa: " + stringa );
		
		System.out.println("Stringa al contrario: " + s.stringaReverse());
	}
}

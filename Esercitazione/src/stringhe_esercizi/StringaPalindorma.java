package stringhe_esercizi;

public class StringaPalindorma {

	private String casa = "casa";
	
	
	
	public boolean  palindorma() {
		//trasformare la stringa in un array
		char[] stringa = casa.toCharArray();
		
		
		for(int i = 0; i<stringa.length; i++) {
			if(stringa[i] != stringa[stringa.length-1 - i]) {
				return false;
			}
		}
		
		return true;
	}
	
}

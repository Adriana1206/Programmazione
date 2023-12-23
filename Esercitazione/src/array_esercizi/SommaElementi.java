package array_esercizi;

public class SommaElementi {
	private int[] elementi = {1,2,3,4,5,6,7,8,9,10};
	
	
	
	public int somma() {
		int somma = 0;
		for(int num : elementi) {
			somma += num;
		}
		
		return somma;
	}
	
}

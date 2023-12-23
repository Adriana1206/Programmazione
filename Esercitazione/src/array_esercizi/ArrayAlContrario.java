package array_esercizi;

public class ArrayAlContrario {

	public int[] numeri = {1,2,3,4,5,6,7,8,9,10};
	
	public int[] reverse() {
		int[] numeriReverse = new int[numeri.length];
		
		/*
		for(int j=0; j<numeriReverse.length; j++) {
			for(int i=numeri.length-1; i>=0; i--) {
				numeriReverse[j] = numeri[i];
			}
		}
		*/
		
		for(int i=0; i<numeri.length; i++) {
			numeriReverse[i] = numeri[numeri.length -1 - i];
		}
		
		
		return numeriReverse;
		
	}
	
}

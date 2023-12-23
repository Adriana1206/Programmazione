package array_esercizi;

import java.util.Arrays;

public class RicercaElemento {

	private int[] arrayElementi = {1,2,3,4,5,6};
	int elemento = 2;
	
	
	
	public int ricerca() {
		
		for(int i=0; i<arrayElementi.length; i++) {
			if(arrayElementi[i] == elemento) {
				return i+1;
			}
		}
		
		return -1;	
	}
			
		
	public void risultato() {
		int posizioneElemento = ricerca();
		if(posizioneElemento == -1) {
			System.out.println("Elemento non presente all'interno dell'Array");
		}else {
			System.out.println("Elemento trovato in posizione: " + posizioneElemento);
		}			
	}
	
	public void risultatoConMetodoSerach() {
		int posizioneElemento = Arrays.binarySearch(arrayElementi, elemento);
		if(posizioneElemento == -1) {
			System.out.println("Elemento non presente all'interno dell'Array");
		}else {
			System.out.println("Elemento trovato in posizione: " + (posizioneElemento + 1));
		}			
	}
}


/* Entrambi i metodi hanno ora una singola responsabilità concettuale e 
 * possono essere modificati indipendentemente l'uno dall'altro. Questo 
 * segue i principi di SRP e promuove la modularità del codice.
 */
 
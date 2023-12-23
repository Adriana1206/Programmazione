package esercizi_di_base;

import java.util.Scanner;

public class NumeroPrimo {

	private int numero;
	private boolean isPrimo;
	
	public NumeroPrimo() {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci un numero: ");
		this.numero = s.nextInt();
	}
	
	public void verificaNumeroPrimo() {
		if(numero <= 1) {
			System.out.println("I numeri minori o uguali a 1 non sono primi");
			return; // Aggiunto per evitare l'esecuzione del resto del metodo
		}
		
		for(int i=2; i<=Math.sqrt(numero); i++) {
			if(numero % i == 0) {
				isPrimo = false;
				break;	
			}
		}
		
		if(isPrimo) {
			System.out.println("è un numero primo");
		}else {
			System.out.println("non è un numero primo");
		}
		
		
			
	}
	
}

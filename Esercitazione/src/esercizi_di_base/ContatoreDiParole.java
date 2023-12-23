package esercizi_di_base;

import java.util.Scanner;

/*	Crea un programma che conti il numero di parole in una stringa data in input */

public class ContatoreDiParole {
	
	private String input;
	
	public ContatoreDiParole() {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci una stringa: ");
		input = s.nextLine();	
	}
	
	public void contaParole() {
		/*divido la stringa in un array di stringhe
		  utilizzando uno o più spazi come delimitatori */
		
		String[] parole = input.split("\\s+");
		
		System.out.println("Il numero di parole nel testo è: " + parole.length);
	}
	
	public void contaParoleSenzaSpilt() {
		int numeroParole = 0;
	    boolean allInsideWord = false;

	    for (int i = 0; i < input.length(); i++) {
	        char carattereCorrente = input.charAt(i);

	        // Verifica se il carattere corrente è uno spazio
	        boolean isSpazio = carattereCorrente == ' ';

	        if (isSpazio) {
	            allInsideWord = false;
	        } else {
	            // Se non è uno spazio e siamo appena entrati in una parola, incrementa il contatore
	            if (!allInsideWord) {
	                numeroParole++;
	            }
	            allInsideWord = true;
	        }
	    }

	    System.out.println("Il numero di parole nel testo è: " + numeroParole);
	}
}

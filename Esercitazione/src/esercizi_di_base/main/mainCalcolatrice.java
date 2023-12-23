package esercizi_di_base.main;

import java.util.Scanner;

import esercizi_di_base.CalcolatriceSemplice;

public class mainCalcolatrice {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		CalcolatriceSemplice c = new CalcolatriceSemplice();
		
		
;		System.out.println("somma: " + c.somma());
		System.out.println("sottrazione: " + c.sottrazione());
		System.out.println("moltiplicazione: " + c.moltiplicazione());
		System.out.println("divisione: " + c.divisione());
		
		
		System.out.println("Inserisci il primo numero: ");
		double numero1 = s.nextDouble();
		
		System.out.println("Inserisci il secondo numero: ");
		double numero2 = s.nextDouble();
		
		CalcolatriceSemplice c2 = new CalcolatriceSemplice(numero1, numero2);
		
		System.out.println("somma: " + c2.somma());
		System.out.println("sottrazione: " + c2.sottrazione());
		System.out.println("moltiplicazione: " + c2.moltiplicazione());
		System.out.println("divisione: " + c2.divisione());
	}
}

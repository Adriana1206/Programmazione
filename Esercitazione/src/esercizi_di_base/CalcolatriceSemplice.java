package esercizi_di_base;

public class CalcolatriceSemplice {
	
	private double a;
	private double b;
	
	public CalcolatriceSemplice() {
		this.a  = 12.0;
		this.b = 14.0;
	}
	
	public CalcolatriceSemplice(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double somma() {
		return a + b;
	}

	public double sottrazione() {
		return a-b;
	}

	public double moltiplicazione() {
		return a*b;
	}

	public double divisione() {
		if(b > 0) {
			return a/b;
		}
		System.out.println("Errore: Divisione per zero non consentita.");
		return -1;
		
	}
}

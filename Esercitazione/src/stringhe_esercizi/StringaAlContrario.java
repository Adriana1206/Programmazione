package stringhe_esercizi;

public class StringaAlContrario {

	private String input = "casa";
	
	
	public String stringaReverse() {
		/* Uso il metodo toCharArray per trasformare una stringa in un array*/
		char[] inputArray=input.toCharArray();
		char[] inputReverse = new char[inputArray.length];
		
		for(int i=0; i<inputArray.length; i++) {
			inputReverse[i] = inputArray[inputArray.length - 1 - i];
		}
		String stringaDaArray = new String(inputReverse);
		return stringaDaArray;
	}
	
	public String getStringa() {
		return this.input;
	}
	
	
	
}

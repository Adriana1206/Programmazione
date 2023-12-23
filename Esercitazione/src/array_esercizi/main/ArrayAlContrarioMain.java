package array_esercizi.main;

import java.util.Arrays;

import array_esercizi.ArrayAlContrario;


public class ArrayAlContrarioMain {

	public static void main(String[] args) {
		ArrayAlContrario a = new ArrayAlContrario();
		System.out.println("Array al contrario\n");
		System.out.println("Prima: \n" + Arrays.toString(a.numeri));
		System.out.println("Dopo: \n" + Arrays.toString(a.reverse()));
	}
}

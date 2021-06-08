package vocalConsonanteException;

import java.util.Scanner;

public class LetraMain {

	public static void main(String[] args) throws VocalException, ConsonanteException {
		// TODO Auto-generated method stub

		Letra l1=new Letra();
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce letra");
		char l =teclado.next().charAt(0);
		l1.isVocal(l);
	}

}

package vocalConsonanteException;

import java.util.Scanner;

public class Letra {

	private char letra;

	public Letra() {
		super();
	}

	public Letra(char letra) {
		super();
		this.letra = letra;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	public void isVocal(char l) throws VocalException, ConsonanteException{
		
		try {
			
			this.letra=l;
			
			if(l=='a' || l=='e' || l=='i' || l=='o' || l=='u') {
				throw new VocalException("Vocal");
			}else {
				throw new ConsonanteException("CONSONANTE");
			}
			
		}catch(Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
	
}

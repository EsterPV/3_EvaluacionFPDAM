package parImparException;

import java.util.Scanner;

public class Numero {

	private int num;

	public Numero() {
		super();
	}

	public Numero(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void isPar(Scanner teclado, int num) throws ParException, ImparException{
		
		try {
			this.num=num;
			
			if(num%2==0) {
				throw new ParException("numero par");
				
			
			}else {
				throw new ImparException("numero impar");
			}
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
}

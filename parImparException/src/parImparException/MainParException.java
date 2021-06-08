package parImparException;

import java.util.Scanner;

public class MainParException {

	public static void main(String[] args) throws ParException, ImparException {
		// TODO Auto-generated method stub

		Numero n=new Numero();
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce numero");
		int num=teclado.nextInt();
		
		n.isPar(teclado, num);
		
	}

}

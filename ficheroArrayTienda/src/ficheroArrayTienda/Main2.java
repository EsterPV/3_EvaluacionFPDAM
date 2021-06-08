package ficheroArrayTienda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> tiendas = new ArrayList<String>();
		
		String path ="listaTiendas.txt";
		String tienda;
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			BufferedWriter bw=new BufferedWriter(new FileWriter(new File(path)));
			int i=0;
			do {
				
				i++;
				System.out.println("Introduzca nombre tienda(fin para salir)");
				tienda =teclado.nextLine();
				
				if(!tienda.equals("fin"))
					tiendas.add(tienda);
				else
					break;
		
				
			}while(!tienda.equalsIgnoreCase("fin"));

			for(i=0;i<tiendas.size();i++) {
				bw.write(tiendas.get(i));
				bw.newLine();
				System.out.println(tiendas.get(i)+" tiene "+tiendas.get(i).length()+" caracteres");
			}
			bw.close();
			
		}catch(Exception e) {
			System.out.println("Error de lectura");
		}
		
	}

}

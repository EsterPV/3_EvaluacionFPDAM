package ficheroArrayTienda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path="tiendas.txt";
		String linea;
		ArrayList<String> lista=new ArrayList<String>();
		try {
		
			BufferedWriter bw= new BufferedWriter(new FileWriter(new File(path)));
			bw.write("Zara"+"\n"+"Massimo Dutti"+"\n"+"Home&&Cook"+"\n"+"Mercadona"+"\n"+"Carrefour"+"\n"+"Corte Inglés");
			bw.close();
			
			
			
		}catch(FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		}catch(Exception e) {
			System.out.println("Error de lectura");
		}
		
		
		try {
			Scanner sc = new Scanner(new File(path));
			while(sc.hasNext()) {
				linea=sc.nextLine();
				lista.add(linea);
				}
			System.out.println("-------------+--------------");
			System.out.println("Lista de tiendas");
			System.out.println("-------------+--------------");
			for(int i=0;i<lista.size();i++)
				
				System.out.println(lista.get(i));
			
			System.out.println("-------------+--------------");
			System.out.println("Lista de tiendas por posiciones pares");
			System.out.println("-------------+--------------");
			for(int i=0; i<lista.size();i++) {
				if(i%2==0)
					System.out.println(lista.get(i));
			}
			System.out.println("-------------+--------------");
			System.out.println("Lista por cantidad de caracteres ");
			System.out.println("-------------+--------------");
			for(int i=0; i<lista.size();i++) {
				System.out.println(lista.get(i)+" - "+lista.get(i).length()+" caracteres");
			}
		}catch(Exception e) {
			System.out.println("Error de escritura");
		}
		
	}

}

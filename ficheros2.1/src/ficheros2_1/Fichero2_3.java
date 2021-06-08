package ficheros2_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Fichero2_3 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=teclado.nextInt();
		System.out.println("Introduce una ruta");
		String path=teclado.next();
		
		int contenido=0;
		
		
		
		
		try {
			
			ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(new File(path)));
			
			for(int i=0; i<num; i++) {
				contenido++;
				oos.writeInt(contenido);}
			
			oos.close();
			
			
		}catch (FileNotFoundException e) {
			System.out.println("Error al crear el fichero.");
		} catch (Exception e) {
			System.out.println("Error.");
		}

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path)));
			
			for(int i=0; i<num; i++) {
				contenido = ois.readInt();
				
				
				System.out.print(contenido+" ");}
			
			ois.close();
			
			} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		
	}

}

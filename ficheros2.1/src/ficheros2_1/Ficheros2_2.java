package ficheros2_1;

import java.io.File;

public class Ficheros2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fichero = new File("test.txt");
		
		try {
			fichero.createNewFile();
			
			System.out.println("El nombre del fichero es: "+fichero.getName());
			System.out.println("La ruta del fichero es: "+fichero.getPath());
			System.out.println("La ruta absoluta es: "+fichero.getAbsolutePath());
			System.out.println("Se puede escribir?: "+fichero.canWrite());
			System.out.println("Se puede leer?: "+fichero.canRead());
			System.out.println("Tamaño: "+fichero.length());
			System.out.println("Es un directorio?: "+fichero.isDirectory());
			System.out.println("Es un fichero: "+fichero.isFile());
		}catch(Exception e) {
			e.getMessage();
		}
		
		
	}

}

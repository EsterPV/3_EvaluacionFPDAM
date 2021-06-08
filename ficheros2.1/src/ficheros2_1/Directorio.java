package ficheros2_1;

import java.io.File;

public class Directorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
			String nuevoDir="nuevoDIR";
		
			boolean exito= (new File(nuevoDir)).mkdir();
		
			if(exito)
				System.out.println("Directorio "+nuevoDir+" creado");
		}catch (Exception e) {
		 	System.out.println("Error: " + e.getMessage());
	}
	

	
	try {
		
		String path="nuevoDIR\\fichero1.txt";
		String path2="nuevoDIR\\fichero2.txt";
		File fichero1 =new File(path);
		File fichero2 =new File(path2);
		
		//creo los ficheros
		if(fichero1.createNewFile() && fichero2.createNewFile() )
			System.out.println("Los ficheros se crearon correctamente");
		
		
		
		//renombro el fichero 1
		File fichero1nuevo = new File("nuevoDIR\\fichero1NUEVO.txt");
		boolean correcto = fichero1.renameTo(fichero1nuevo);
		if(correcto)
			System.out.println("Se ha renombrado el fichero 1");
		
		
		
		//elimino el fichero 2
		fichero2.delete();
		
		if(!fichero2.exists())
			System.out.println("Se ha eliminado el f1chero 2");
		
	}catch (Exception ioe) {
		ioe.getMessage();
	}
	
try {
		
		String path3="nuevoDIR\\fichero3.txt";
		
		File fichero3 =new File(path3);
		
		
		
		
		
		if(fichero3.createNewFile()  )
			System.out.println("El fichero 3 se ha creado correctamente");
		
	
		
		
		
	}catch (Exception ioe) {
		ioe.getMessage();
	}
	

	
	
	}
}

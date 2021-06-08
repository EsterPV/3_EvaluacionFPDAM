package excepcionEx2;

public class MainTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			TryCat2 x1 = new TryCat2("Esto es una prueba");
			System.out.println(x1);
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}

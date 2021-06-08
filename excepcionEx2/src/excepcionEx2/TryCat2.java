package excepcionEx2;

public class TryCat2 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String frase;
	
	
	
	public TryCat2(String frase) {
		super();
		this.frase = frase;
	}
	public String getFrase() {
		return frase;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "TryCat2 [frase=" + frase + "]";
	}
	
	
}

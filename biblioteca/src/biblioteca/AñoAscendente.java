package biblioteca;

import java.util.Comparator;

public class AñoAscendente implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o1.getAno() - o2.getAno();
	}

}

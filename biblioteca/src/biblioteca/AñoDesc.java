package biblioteca;

import java.util.Comparator;

public class A�oDesc implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o2.getAno() - o1.getAno();
	}

}

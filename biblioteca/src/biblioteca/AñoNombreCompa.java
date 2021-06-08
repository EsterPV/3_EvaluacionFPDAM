package biblioteca;

import java.util.Comparator;

public class AñoNombreCompa implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		if(o1.getAno()==o2.getAno())
			return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
		else
			return o1.getAno()-o2.getAno();
	}

}

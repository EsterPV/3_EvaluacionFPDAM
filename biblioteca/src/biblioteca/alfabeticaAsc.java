package biblioteca;

import java.util.Comparator;

public class alfabeticaAsc implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
		//para ordenar descendente solo hay que poner primero o2 compareto o1
	}

}

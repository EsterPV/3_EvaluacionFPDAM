package biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;



public class BibliotecaMain {

	
	public static void a�adir(Scanner teclado, LinkedList<Libro> biblioteca) {
		
		LinkedList<String> autores= new LinkedList<String>();
		LinkedList<String> personajes= new LinkedList<String>();
		int a�adir;
		
		System.out.println("ISBN: ");
		int isbn=teclado.nextInt();
		System.out.println("Titulo: ");
		String titulo=teclado.next();
		System.out.println("A�o: ");
		int ano=teclado.nextInt();
		System.out.println("Personajes: ");
		Libro.a�adirPersonajes(personajes, teclado);
		System.out.println("Autores: ");
		Libro.a�adirAutores(autores, teclado);
		
		System.out.println("A�adir libro al principio->1");
		System.out.println("A�adir al final->2");
		a�adir=teclado.nextInt();
		if(a�adir==1)
			biblioteca.addFirst(new Libro(isbn, titulo, ano, personajes, autores));
		else if(a�adir==2)
			biblioteca.addLast(new Libro(isbn, titulo, ano, personajes, autores));
	}

	public static void eliminar(Scanner teclado, LinkedList<Libro> biblioteca) {
		
		int opciones;
		
		do {
			System.out.println("1. Eliminar por isbn");
			System.out.println("2. Eliminar todo");
			System.out.println("0. salir");
			opciones=teclado.nextInt();
			switch(opciones) {
			case 1:
				
				System.out.println("Introduce isbn");
				int isbn =teclado.nextInt();
				
				Iterator<Libro> iterator = biblioteca.iterator();
				while( iterator.hasNext()) {
					Libro libro = (Libro) iterator.next();
					if(libro.getISBN()==isbn) {
						iterator.remove();
					}
				}
				System.out.println("Libro eliminado");
				break; 
			case 2:
				biblioteca.removeAll(biblioteca);
				System.out.println("Biblioteca eliminada");
				break;
			case 0:
				break;
			}
		}while(opciones!=0);
		
	}
	public static void ordenarA�o(LinkedList<Libro> biblioteca) {
		
		Collections.sort(biblioteca,new  A�oAscendente());
		System.out.println("Ascendente: "+biblioteca);
		
		Collections.sort(biblioteca, new A�oDesc());
		System.out.println("Descendiente: "+biblioteca);
	}
	
	public static void ordenarNombre(LinkedList<Libro> biblioteca) {
		Collections.sort(biblioteca, new alfabeticaAsc());
		System.out.println("ascendende: "+biblioteca);
		
	}
	
	public static void repetidos(LinkedList<Libro> biblioteca) {
		Collections.sort(biblioteca, new A�oNombreCompa());
		System.out.println(biblioteca);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		LinkedList<Libro> biblioteca=new LinkedList<Libro>();
		
		int opciones;
		
		do {
			System.out.println("1. a�adir datos");
			System.out.println("2. motrar");
			System.out.println("3. Eliminar");
			System.out.println("4. total de libros almacenados");
			System.out.println("5. Ordenar por a�o");
			System.out.println("6. Ordenar nombre");
			System.out.println("7. Ordenar repetidoss");
			System.out.println("0. salir");
			opciones=teclado.nextInt();
			
			switch(opciones) {
			case 1:
				a�adir(teclado, biblioteca);
				break;
			case 2:
				System.out.println(biblioteca);
				if(biblioteca.size()==0) {
					System.out.println("Biblioteca vac�a");
				}else {
					System.out.println("Primer libro de la lista: "+ biblioteca.get(0));
					System.out.println("Ultimo libro de la lista: "+biblioteca.get(biblioteca.size()-1));
				}
				
				break;
			case 3:
				eliminar(teclado, biblioteca);
				break;
			case 4:
				System.out.println("Total de libros "+biblioteca.size());
				break;
			case 5:
				ordenarA�o(biblioteca);
				break;
			case 6:
				ordenarNombre(biblioteca);
				break;
			case 7:
				repetidos(biblioteca);
			}
		}while(opciones!=0);
		
	}

}

package biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;



public class BibliotecaMain {

	
	public static void añadir(Scanner teclado, LinkedList<Libro> biblioteca) {
		
		LinkedList<String> autores= new LinkedList<String>();
		LinkedList<String> personajes= new LinkedList<String>();
		int añadir;
		
		System.out.println("ISBN: ");
		int isbn=teclado.nextInt();
		System.out.println("Titulo: ");
		String titulo=teclado.next();
		System.out.println("Año: ");
		int ano=teclado.nextInt();
		System.out.println("Personajes: ");
		Libro.añadirPersonajes(personajes, teclado);
		System.out.println("Autores: ");
		Libro.añadirAutores(autores, teclado);
		
		System.out.println("Añadir libro al principio->1");
		System.out.println("Añadir al final->2");
		añadir=teclado.nextInt();
		if(añadir==1)
			biblioteca.addFirst(new Libro(isbn, titulo, ano, personajes, autores));
		else if(añadir==2)
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
	public static void ordenarAño(LinkedList<Libro> biblioteca) {
		
		Collections.sort(biblioteca,new  AñoAscendente());
		System.out.println("Ascendente: "+biblioteca);
		
		Collections.sort(biblioteca, new AñoDesc());
		System.out.println("Descendiente: "+biblioteca);
	}
	
	public static void ordenarNombre(LinkedList<Libro> biblioteca) {
		Collections.sort(biblioteca, new alfabeticaAsc());
		System.out.println("ascendende: "+biblioteca);
		
	}
	
	public static void repetidos(LinkedList<Libro> biblioteca) {
		Collections.sort(biblioteca, new AñoNombreCompa());
		System.out.println(biblioteca);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		LinkedList<Libro> biblioteca=new LinkedList<Libro>();
		
		int opciones;
		
		do {
			System.out.println("1. añadir datos");
			System.out.println("2. motrar");
			System.out.println("3. Eliminar");
			System.out.println("4. total de libros almacenados");
			System.out.println("5. Ordenar por año");
			System.out.println("6. Ordenar nombre");
			System.out.println("7. Ordenar repetidoss");
			System.out.println("0. salir");
			opciones=teclado.nextInt();
			
			switch(opciones) {
			case 1:
				añadir(teclado, biblioteca);
				break;
			case 2:
				System.out.println(biblioteca);
				if(biblioteca.size()==0) {
					System.out.println("Biblioteca vacía");
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
				ordenarAño(biblioteca);
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

package biblioteca;

import java.util.LinkedList;
import java.util.Scanner;

public class Libro {

	private int ISBN;
	private String titulo;
	private int ano;
	private LinkedList<String> personajes;
	private LinkedList<String> autores;
	
	public Libro() {
		super();
	}

	public Libro(int iSBN, String titulo, int ano, LinkedList<String> personajes, LinkedList<String> autores) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.ano = ano;
		this.personajes = personajes;
		this.autores = autores;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public LinkedList<String> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(LinkedList<String> personajes) {
		this.personajes = personajes;
	}

	public LinkedList<String> getAutores() {
		return autores;
	}

	public void setAutores(LinkedList<String> autores) {
		this.autores = autores;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", ano=" + ano + ", personajes=" + personajes
				+ ", autores=" + autores + "]";
	}

	public static void añadirPersonajes(LinkedList<String> personajes, Scanner teclado) {
		int salir;
		
		do {
			System.out.println("Introduce personajes:");
			String p=teclado.next();
			personajes.add(p);
			
			System.out.println("salir? 1-no 0-si");
			salir=teclado.nextInt();
		}while(salir!=0);
	}
	
	public static void añadirAutores(LinkedList<String> autores, Scanner teclado) {
		
		int salir;

		do {
			System.out.println("Introduce autores:");
			String a=teclado.next();
			autores.add(a);
			
			System.out.println("salir? 1-no 0-si");
			salir=teclado.nextInt();
		}while(salir!=0);
		
	}
	
}

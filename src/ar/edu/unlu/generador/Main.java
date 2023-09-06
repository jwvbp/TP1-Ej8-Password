package ar.edu.unlu.generador;

public class Main {

	public static void main(String[] args) {
		/*
		 * generarListaDeClaves(longitud de la clave, cantidad de claves en la lista)
		 * 
		 */

		Generador g = new Generador();

		g.generarListaDeClaves(8, 15);

		g.mostrarListaDeClaves();
	}
}

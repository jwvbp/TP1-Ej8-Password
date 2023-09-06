package ar.edu.unlu.generador;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Generador {
// 62
	private String origen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private String clave = "";
	private ArrayList<String> misClaves = new ArrayList<String>();

	private int numRandom(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}

	private String generarClave(int longitud) {
		clave = "";
		for (int i = 0; i < longitud; i++) {
			int numero = numRandom(0, 61);
			char caracterRandom = origen.charAt(numero);
			clave += caracterRandom;
		}
		return clave;
	}

	public void generarListaDeClaves(int longClave, int longLista) {
		for (int i = 0; i < longLista; i++) {
			String clave = generarClave(longClave);
			misClaves.add(clave);
		}
	}

	public void mostrarListaDeClaves() {
		for (int i = 0; i < misClaves.size(); i++) {
			analizarClave(misClaves.get(i));
		}
	}

	private void analizarClave(String clave) {
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		System.out.print(clave);
		for (int i = 0; i < clave.length(); i++) {
			if (Character.isUpperCase(clave.charAt(i))) {
				mayusculas++;
			}
			if (Character.isLowerCase(clave.charAt(i))) {
				minusculas++;
			}
			if (Character.isDigit(clave.charAt(i))) {
				numeros++;
			}
		}
		if ((mayusculas > 2) && (minusculas > 1) && (numeros > 1)) {
			System.out.println(" - Fuerte (M:" + mayusculas + "  m:" + minusculas + "  N:" + numeros + ")");
		} else {
			System.out.println(" - Debil (M:" + mayusculas + "  m:" + minusculas + "  N:" + numeros + ")");
		}
	}
}

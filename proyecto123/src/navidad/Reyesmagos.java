package navidad;

import java.util.Scanner;

public class Reyesmagos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palabra = "";
		String frase = "";
		String[] palabras;

		StringBuilder frase2 = new StringBuilder();
		while (!frase.equals("FIN")) {
			frase = entrada.nextLine();
			frase = frase.toUpperCase();
			frase2.append(frase+" ");
		}

	}

	public static String palabras(String frase) {
		String[] palabras=frase.split(" ");

		for (int i = 0; i < frase.length(); i++) {
			letras = palabras.toCharArray(i);
			int ascii = letras[i];
			ascii = (ascii + 1);
			letras[i] = (char) ascii;
			if (ascii == 91) {
				letras[i] = 'A';
			} else if (ascii == 33) {
				letras[i] = ' ';
			}
		}
		for (int i = 0; i < palabras[i].length(); i++) {
			palabra = letras[i];
		}

		return palabra;

	}

}

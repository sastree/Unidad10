package navidad;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Final {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String frase = "";
		char []palabra2= new char[10];
		StringBuilder frase2 = new StringBuilder();
		while (!frase.equals("FIN")) {
			frase = entrada.nextLine();
			frase = frase.toUpperCase();
			frase2.append(frase + " ");
		}
		frase = frase2.toString();
		String[] palabras = frase.split(" ");
		
		for (int i = 0; i < frase2.length(); i++) {
			char letra = frase2.charAt(i);
			for (int a = 0; a < frase2.length(); a++) {
				int ascii = letra;
				ascii = (ascii + 1);
				letra = (char) ascii;
				if (ascii == 91) {
					letra = 'A';
				} else if (ascii == 33) {
					letra = ' ';
				}
				palabra2[i]=letra;

			}
		}
		for(int i=0;i<palabra2.length;i++) {
		System.out.print(palabra2[i]);
		}
	}

}
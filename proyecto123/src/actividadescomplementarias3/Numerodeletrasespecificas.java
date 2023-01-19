package actividadescomplementarias3;

import java.util.Scanner;

public class Numerodeletrasespecificas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		System.out.println("Elige una letra: ");
		String letra = entrada.nextLine();
		char[] letra2 = letra.toCharArray();
		System.out.println("Frase: ");
		String frase = entrada.nextLine();
		for (int i = 0; i < frase.length(); i++) { //char letra=entrada.next().charAt(0); ojo
			char letras = frase.charAt(i);
			if (letras == letra2[0]) {
				contador++;

			}
		}
		System.out.println("Hay " + contador + " " + letra+".");

	}

}

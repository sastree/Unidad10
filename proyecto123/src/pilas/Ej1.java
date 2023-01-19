package pilas;

import java.util.*;

public class Ej1 {

	public static void main(String[] args) {
		final String ANSI_YELLOW = "\u001B[33m";
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_GREEN = "\u001B[32m";
		Scanner entrada = new Scanner(System.in);
		Stack<Character> parentesis = new Stack<>();
		System.out.println(ANSI_YELLOW + "Di algo entre parentesis." + ANSI_RESET);
		String numeros = entrada.nextLine();
		char partes[] = numeros.toCharArray();
		for (int i = 0; i < partes.length; i++) {
			if (partes[i] == ('(')) {
				parentesis.push(partes[i]);
			}
			if (partes[i] == (')')) {
				if (parentesis.isEmpty()) {
					System.err.println("Incorrecto");
					break;
				}
				parentesis.pop();
			}
		}
		if (parentesis.isEmpty()) {
			System.out.println(ANSI_GREEN + "Esta correcto." + ANSI_RESET);
		} else {
			System.err.println("Incorrecto");
		}

	}

}

package conjuntos;

import java.util.*;

public class Retoaceptado {

	public static void main(String[] args) {
		final String ANSI_GREEN = "\u001B[32m";
		final String ANSI_YELLOW = "\u001B[33m";
		final String ANSI_RESET = "\u001B[0m";
		Scanner entrada = new Scanner(System.in);
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
		System.out.println(ANSI_YELLOW + "Introduzca los números (1–5): " + ANSI_RESET);
		do {
			int numero = entrada.nextInt();
			if (numero >= 1 && numero <= 5) {

				numeros.add(numero);
			} else {
				System.out.println("Numero mayor o menor de 5");
			}

		} while (numeros.size() <= 4);
		System.out.print(ANSI_GREEN + "Los números introducidos son: ");
		for (Integer i : numeros) {
			System.out.print(i + " ");
		}
	}
}

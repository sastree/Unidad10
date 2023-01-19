package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		final String ANSI_YELLOW = "\u001B[33m";
		final String ANSI_RESET = "\u001B[0m";
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		System.out.println("Introduce el numero inicial: ");
		int num1 = entrada.nextInt();
		System.out.println("Introduce el numero final: ");
		int num2 = entrada.nextInt();
		int diferencia = num2 - num1;
		numeros.add(0, num1);
		System.out.println("Multiplos a localizar: ");
		int multiplo = entrada.nextInt();
		for (int i = 1; i < diferencia + 1; i++) {
			numeros.add(i, num1 + i);
			if (!(numeros.get(i) % multiplo == 0)) {
				numeros.set(i, 0);
			}
		}
		System.out.println(ANSI_YELLOW + numeros + ANSI_RESET);
	}
}

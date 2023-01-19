package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		final String ANSI_GREEN = "\u001B[32m";
		final String ANSI_RESET = "\u001B[0m";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce 10 numeros: ");
		ArrayList<Integer> numeros = new ArrayList<>();
		int suma = 0;
		for (int i = 0; i < 10; i++) {
			numeros.add(entrada.nextInt());
			suma += numeros.get(i);
		}
		System.out.println("Los numeros son: " + numeros);
		System.out.println(ANSI_GREEN+"La suma es: " + suma+ANSI_RESET);
		System.out.println("Que posicion quieres ver: ");
		int posicion = entrada.nextInt();
		System.out.println("En la posicion "+posicion+" esta el numero: "+numeros.get(posicion));
		entrada.close();
	}

}

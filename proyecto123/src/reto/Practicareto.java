package reto;

import java.util.Scanner;

public class Practicareto {
	static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		casoPrueba();

	}

	public static void casoPrueba() {
		int num;
		num = entrada.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("Hola mundo.");
		}

		entrada.close();
	}

}

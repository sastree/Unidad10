package sentenciaif;

import java.util.Scanner;

public class Numeropar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int numero = entrada.nextInt();
		if (numero % 2 == 0) {
		
			System.out.println("Tu numero es par.");
		}
		
		else
			System.out.println("Tu numero no es par.");
		
		System.out.println("Buenas tardes.");
		entrada.close();
		
		
		
	}

}

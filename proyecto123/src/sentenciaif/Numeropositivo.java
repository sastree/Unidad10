package sentenciaif;

import java.util.Scanner;

public class Numeropositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// perdir numero cifras, le decimos si tiene 1 2 o mas
		Scanner entrada = new Scanner(System.in);	
		System.out.println("Introcude un numero: ");
		int numero = entrada.nextInt();
		if(numero<10) {
			System.out.println("Tu numero tiene 1 cifra.");
		}
		else if(numero<100&&numero>=10) {
			System.err.println("Tu numero tiene 2 cifras.");
		}
		else if(numero>=100&&numero<1000) {
			System.out.println("Tu numero tiene 3 cifras.");
		}
		else {
			System.out.println("Tu numero tiene mas de 3 cifras.");
		}
		
			
		
		
		
		
		
		
		
		
		
		entrada.close();
	}

}

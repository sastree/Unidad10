package sentenciaif;

import java.util.Scanner;


public class Elnumeromasalto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//operador ternario
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero1 = entrada.nextInt();
		System.out.println("Introduce otro numero: ");
		int numero2 = entrada.nextInt();
		if(numero1==numero2) {
			System.out.println("Los numeros son iguales.");
		}
		
		else {
			int a = numero1>numero2 ? numero1:numero2;
			System.out.println("El numero "+a+" es el mayor.");
		}
		
		entrada.close();
		
		
		// int a = numero1>numero2 ? numero1:numero2; //operador ternario
		

		
		
	}

}

package operadores;

import java.util.Scanner;

public class Horasminutosegundos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantos segundos quieres calcular: ");
		int segundos1 = entrada.nextInt();
		int segundos = segundos1%60;
		int division1 = segundos1/60;
		int minutos = division1%60;
		int horas = division1/60;
		
		
		
	
		
		

		
		
		System.out.println("El resultado es: "+horas+" horas "+minutos+" minutos y "+segundos+" segundos.");
		
		
		
		
		
		
		
		
		
		
		entrada.close();
		
		
		
		
		
	}

}

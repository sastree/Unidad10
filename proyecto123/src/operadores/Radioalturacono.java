package operadores;

import java.util.Scanner;


public class Radioalturacono {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la altura del cono: ");
		int altura = entrada.nextInt();
		System.out.println("Introduce el radio del cono: ");
		int radio = entrada.nextInt();
		double pi = (Math.PI);
		double radioe = Math.pow(radio, 2);
		
		double solucion = (pi*radioe*altura)/3;
		System.out.printf("El area del cono es: %.3f",solucion);
		
		entrada.close();
		
		
		
		
		

	}

}

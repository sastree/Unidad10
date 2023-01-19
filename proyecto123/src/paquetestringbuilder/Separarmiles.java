package paquetestringbuilder;

import java.util.Scanner;

public class Separarmiles {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		String numero = entrada.nextLine();
		
		StringBuilder numero2 = new StringBuilder(numero);
		numero2.reverse();
		
		for (int i = 0; i < numero.length(); i++) {
			for (int a = 3; a < numero.length() ; a+=4) {
				if (i == a){
					numero2.insert(i, ".");
					
				
					
					
				}
			}
		}
		numero2.reverse();
		System.out.println(numero2);

	}

}

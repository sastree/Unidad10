package actividadescomplementarias3;

import java.util.Scanner;

public class Contadordetodo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num_digitos=0;
		int num_letras=0;
		int num_esp=0;
		System.out.println("Frase: ");
		String frase=entrada.nextLine();
		StringBuilder frase2= new StringBuilder(frase);
		for(int i=0;i<frase.length();i++) {
			char letras= frase2.charAt(i);
			if(Character.isDigit(letras)){
				num_digitos++;
			}
			else if(Character.isLetter(letras)) {
				num_letras++;
			}
			else if(Character.isWhitespace(letras)){
				num_esp++;
			}
		
			
		}
		System.out.println("Hay "+num_digitos+" numeros.");
		System.out.println("Hay "+num_letras+" letras.");
		System.out.println("Hay "+num_esp+" espacios.");

	}

}

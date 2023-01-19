package actividadescomplementarias3;

import java.util.Scanner;

public class Tautologia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe: 'palabra1 es palabra2");
		String frase = entrada.nextLine();
		StringBuilder frase_builder = new StringBuilder(frase);
		int long1 = 0;
		int long2 = 0;
		StringBuilder palabra1 = frase_builder.insert(0, Character.isWhitespace(0));
	
	System.out.println(palabra1);

	}

}

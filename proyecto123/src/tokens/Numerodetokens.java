package tokens;

import java.util.StringTokenizer;
import java.util.Scanner;

public class Numerodetokens {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Di una frase: ");
		String frase = entrada.nextLine();
		
		analizafrase(frase);
		
	}

	public static void analizafrase(String frase) {
		StringTokenizer tokens = new StringTokenizer(frase);
		System.out.println("Hay " + tokens.countTokens() + " tokens.");
		while (tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}

	}
	

}

package navidad;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Di una frase: ");
		String frase = entrada.nextLine();
		StringTokenizer tokens = new StringTokenizer(frase);
		while (tokens.hasMoreTokens()) {
			System.out.print(tokens.nextToken()+" ");
		}
		for(int i =0;i<tokens.countTokens();i++) {
			tokens.nextToken().toCharArray();
		}
		
		
			

	}

}

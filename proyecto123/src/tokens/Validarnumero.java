package tokens;

import java.util.Scanner;

public class Validarnumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numero: ");
		String numero = entrada.nextLine();
		System.out.println(validarNombre(numero));

	}
	public static boolean validarNombre(String numero) {
		return numero.matches("^[-]?[0-9]{3}$");
	}

}
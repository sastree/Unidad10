package tokens;

import java.util.Scanner;

public class Nombre {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nombre: ");
		String nombre = entrada.nextLine();
		System.out.println(validarNombre(nombre));

	}
	public static boolean validarNombre(String nombre) {
		return nombre.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
	}

}
//1ro Mayus resto minus, puede ser compuesto(2), [A-Z]? opcional
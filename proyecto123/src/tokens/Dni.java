package tokens;

import java.util.Scanner;

public class Dni {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("DNI: ");
		String dni=entrada.nextLine();
		System.out.println(validarDNI(dni));
		entrada.close();
	}
    public static boolean validarDNI(String dni) {
		
		return dni.matches("^[0-9]{8}[A-Z]$");
	}
    

}

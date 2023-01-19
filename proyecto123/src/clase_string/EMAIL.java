package clase_string;

import java.util.Scanner;

public class EMAIL {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String mail;
		int contador = 0;
		System.out.println("Mail: ");
		mail = entrada.nextLine();
		char[] letras_mail = mail.toCharArray();// @gmail.com
		for (int a = 0; a < letras_mail.length; a++) {
		if (letras_mail.length < 10) {
			while (letras_mail.length < 10) {
				System.out.println("El mail es muy corto, debe tener minimo 10 caracteres en total.");
				System.out.println("Mail: ");
				mail = entrada.nextLine();
				letras_mail = mail.toCharArray();

			}
		}
		if (!mail.substring(letras_mail.length - 4, letras_mail.length).equals(".com")
				|| !mail.substring(letras_mail.length - 3, letras_mail.length).equals(".es")) {

			while (!mail.substring(letras_mail.length - 4, letras_mail.length).equals(".com")
					&& !mail.substring(letras_mail.length - 3, letras_mail.length).equals(".es")) {
				System.out.println("Falta el '.es' o '.com' o esta mal introducido.");
				System.out.println("Mail: ");
				mail = entrada.nextLine();
				letras_mail = mail.toCharArray();

			}

		}
		if (letras_mail.length > 20) {
			while (letras_mail.length > 20) {
				System.out.println("El mail es muy largo, puede contener un maximo de 20 caracteres.");
				System.out.println("Mail: ");
				mail = entrada.nextLine();
				letras_mail = mail.toCharArray();// aaa@gmail.com

			}

		}
		if (!mail.contains("@")) {
			System.out.println("Falta el '@'");
			System.out.println("Mail: ");
			mail = entrada.nextLine();
			letras_mail = mail.toCharArray();
		}
		for (int i = 0; i < letras_mail.length; i++) {
			if (letras_mail[i] == 64) {
				contador++;
			}
		}
		if (contador >= 2) {
			System.out.println("Hay mas de 1 '@' en el mail.");
		}
		if (mail.contains(".com")) {
			while (letras_mail[letras_mail.length - 10] != 64) {
				System.out.println("El '@' esta mal introducido");
				System.out.println("Mail: ");
				mail = entrada.nextLine();
				letras_mail = mail.toCharArray();
			}
		} 
		else {
			while (letras_mail[letras_mail.length - 9] != 64) {
				System.out.println("El '@' esta mal introducido");
				System.out.println("Mail: ");
				mail = entrada.nextLine();
				letras_mail = mail.toCharArray();
			}

		}
		}
	}
}
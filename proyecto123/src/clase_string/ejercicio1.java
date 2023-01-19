package clase_string;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String frase;
		System.out.println("Palabra: ");
		frase = entrada.nextLine();
		if(frase.contains("%20")|frase.contains("%3D")|frase.contains("%AB")){
		frase = frase.replace("%20"," ");
		frase = frase.replace("%3D", "?");
		frase = frase.replace("%AB", ".");}
		System.out.println(frase);

	}

}
if(!(mail.contains(".es"))||!(mail.contains(".com"))){
	while(!mail.contains(".es")||!mail.contains(".com")) {
		System.out.println("Falta el '.es' o '.com'");
		System.out.println("Mail: ");
		mail= entrada.nextLine();
	}
	
}
if(!mail.contains("@")) {
	while(!mail.contains("@")) {
		System.out.println("Falta el '@'");
		System.out.println("Mail: ");
		mail= entrada.nextLine();
		
	
	}
}
if(array[0]=='@') {
	System.out.println("El '@' esta mal puesto.");
	System.out.println("Mail: ");
	mail= entrada.nextLine();
	
	
}

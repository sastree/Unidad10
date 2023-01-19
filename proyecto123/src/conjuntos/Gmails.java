package conjuntos; 
import java.util.*;
public class Gmails {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); //paco@gmail.es;paco123@hotmail.ru;paquito@yahoo.com;silvia;pacoooo@gmail.com
		System.out.println("Introduce los emails separados por ';' sin espacios: ");
		String mails = entrada.nextLine();
		mails.toLowerCase();
		String[] mailsplit = mails.split(";");
		HashSet<String> dominio = new HashSet<>();
		HashSet<String> usuarios = new HashSet<>();
		for(String i:mailsplit) {
			System.out.println(i);
		}
		String gmails [] = {};
		String gmailsmalos [] = {};
		for(int i=0;i<mailsplit.length;i++){
			gmails=mailsplit[i].split("@");
			if(!(gmails.length==1)) {
			usuarios.add(gmails[0]);
            dominio.add(gmails[1]);
			}
			else {
				System.out.println("\nHay un mail mal introducido ("+mailsplit[i]+").");	
			}
		}
		System.out.println("\nUsuarios: "+usuarios);
		System.out.println("Dominios: "+dominio);
	}
}

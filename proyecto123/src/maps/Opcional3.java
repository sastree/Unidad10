package maps;
import java.util.*;
public class Opcional3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		TreeMap<String, Integer> cuenta = new TreeMap<>(); //almacenar palabras en un 
		String fin = ("");
		while(!fin.equals("fin")) {
			String texto = entrada.nextLine();
			int linea = 1;
			String palabras []=texto.split(" ");
			for(int i=0;i<palabras.length;i++) {
				cuenta.put(palabras[i], linea);
			}
		}
	
		

	}

}

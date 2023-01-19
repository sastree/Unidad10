package conjuntos;
import java.util.*;
public class Reto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numeros: ");
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		
		int numero = 0;
		do {
			numero = entrada.nextInt();
			lista.add(numero);
		}
		while(!lista.contains(numero));
	
		
	}
}



package maps;
import java.util.*;
public class Opcional1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		LinkedHashMap<String,Integer> reyes = new LinkedHashMap<>();
		System.out.println("Reyes: ");
		String nombres = entrada.nextLine();
		String lista [] = nombres.split(" ");
		
		
		
		for (int i = 0; i < lista.length; i++) {
			String nombre = lista[i];
			
			if (!reyes.containsKey(nombre)) {
				reyes.put(nombre, 1);
			} else
				reyes.put(nombre, reyes.get(nombre) + 1);

		}
		System.out.println("Rey a preguntar: ");
		String preg = entrada.nextLine();
		System.out.println(reyes.get(preg)+1);
			
		
		
       entrada.close();
	}

}

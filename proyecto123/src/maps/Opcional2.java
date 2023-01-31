package maps;
import java.util.*;
public class Opcional2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		HashMap<String,Integer> notas = new HashMap<>();
		System.out.println("Nombre y nota: ");
		String palabra = ("");
		
		do {
			palabra = entrada.nextLine();
			if(!palabra.equals("fin")) {
			String separado [] = palabra.split(" ");
			int numero = Integer.valueOf(separado[1]);
			if(!notas.containsKey(separado[0])) {
			notas.put(separado[0], numero);
			}else {
				notas.put(separado[0], notas.get(separado[0])+numero);
			}
			}
		}while(!palabra.equals("fin"));
		Iterator<String> nombres = notas.keySet().iterator();
		while(nombres.hasNext()) {
			String nombre = nombres.next();
			System.out.println(nombre+": "+notas.get(nombre)+" puntos.");
		}
		
		
		
		
		
    entrada.close();
	}

}

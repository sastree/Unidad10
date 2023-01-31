package maps;
import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		HashMap<String, Integer> notas = new HashMap<>();
		notas.put("Pedro", 7);
		notas.put("Silvia", 8);
		notas.put("Maria", 4);
		notas.put("Ana", 3);
		notas.put("Alberto", 4);
		notas.put("Sergio", 6);
		
		System.out.println("Nota de Silvia: "+notas.get("Silvia"));
		
		System.out.println("Esta la nota de Alberto?: "+notas.containsKey("Alberto"));
		System.out.println("Esta la nota de Sergio?: "+notas.containsKey("Sergio"+"\n"+notas.get("Sergio")));
		
		System.out.println(notas.values());
		int suma=0;
		double media = 0;
		for(int i: notas.values()) {
			suma += i;
		}
		media = suma/notas.size();
		System.out.println(media);
	}

}

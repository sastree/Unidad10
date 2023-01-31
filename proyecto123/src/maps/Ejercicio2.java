package maps;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		HashMap<String, String> diccionario = new HashMap<>();
		diccionario.put("hola", "hello");
		diccionario.put("perro", "dog");
		diccionario.put("nariz", "nidea");
		diccionario.put("barrio", "hood");
		diccionario.put("gamba", "prawn");
		diccionario.put("adios", "goodbye");
		diccionario.put("bocata", "sandwich");
		System.out.println("Que palabra quieres traducir: ");
		String palabra = entrada.nextLine();
		do {
			System.out.println("La traduccion es: "+diccionario.get(palabra)); 
			System.out.println("Que palabra quieres traducir: ");
			palabra = entrada.nextLine();
		}while(diccionario.containsKey(palabra));
		System.err.println("No esta.");
		
		
		
    entrada.close();
	}
	

}

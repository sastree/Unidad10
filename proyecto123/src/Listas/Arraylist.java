package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<String> Lista = Arrays.asList("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo");
		ArrayList<String> arraylista = new ArrayList<>(Lista);
		
		ArrayList<Integer> numeros = new ArrayList();
		numeros.
		numeros.add(2);
		numeros.addAll(Arrays.asList(2,3,88));
		int posicion = numeros.indexOf(88);
		// numeros.add((posicion+1),1);
		numeros.set((posicion),1);
		System.out.println(numeros);
		// eliminar elemento
		numeros.remove(0);
		System.out.println(numeros);
	}

}

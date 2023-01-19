package Listas;

import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.Iterator;

public class listas {

	public static void main(String[] args) {
		List<String> Lista = Arrays.asList("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo");
		System.out.println("El primer elemento de la lista es: " + Lista.get(0));
		System.out.println("El tamaño de la lista es: " + Lista.size());
		for (int i = 0; i < Lista.size(); i++) {
			System.out.print(Lista.get(i) + " ");
		}
		for (String dia : Lista) {
			System.out.println(dia);
		}
		Iterator<String> it = Lista.iterator();
		do {
			System.out.print(it.next()+" ");
		} while (it.hasNext());
		System.err.println("\n-------------------------------------");
		ListIterator<String> li = Lista.listIterator(Lista.size());
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}
		System.err.println("\n-------------------------------------");
		System.out.println("El elemento 'jueves' esta en la posicion: "+Lista.indexOf("jueves"));
		System.err.println("\n-------------------------------------");
		List<Integer> Lista_Numeros = Arrays.asList(1,2,3,4,5,1);
		System.out.println(Lista_Numeros.indexOf(4));
		System.out.println(Lista_Numeros.indexOf(1)+" "+Lista_Numeros.lastIndexOf(1));
		int contador=0;
		for(Integer num:Lista_Numeros) {
			if(num.equals(1)) {
				contador++;
			}
		}
		
	}
}

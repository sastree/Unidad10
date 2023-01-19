package conjuntos;

import java.util.*;

public class Ejerciciotreeset {

	public static void main(String[] args) {
		//creamos tree set int, eliminamos todos los elementos del treeset, si el arbol esta vacio imprimir true o false, añadimos un 100, 10, 50, 1, 13, imprimimos,comprobamos si tiene el elemento 50, nos situamos en el elem 50 e imprimimos los elementos de debajo, y nos situamos 50 e imp los de arriba incluido 50  
		//mostramos todos los elemen del arbl con iterator elim elem 10
		TreeSet<Integer> arbol = new TreeSet<>();
		arbol.removeAll(arbol);
		System.err.println("Esta vacio?: "+arbol.isEmpty());
		arbol.add(100);
		arbol.add(10);
		arbol.add(50);
		arbol.add(1);
		arbol.add(13);
		System.out.println(arbol);
		arbol.remove(10);
		System.out.println("Tiene el 50?: "+arbol.contains(50));
		System.out.println(arbol.headSet(50));
		System.out.println(arbol.tailSet(50));	
		Iterator<Integer> itarbol = arbol.iterator();
		while(itarbol.hasNext()) {
	         System.out.print(itarbol.next()+" ");
	      }
	}

}

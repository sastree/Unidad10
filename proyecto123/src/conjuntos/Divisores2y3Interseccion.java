package conjuntos;

import java.util.*;

public class Divisores2y3Interseccion {

	public static void main(String[] args) {
		//dos hashsets de numeros aleatorios, usar funciones, ordenar elementos, muestra los conjuntos, muestra la interseccion de ambos,devuelve los divisores de 2 y 3 de la interseccion
		HashSet<Integer> conjuntoA = new HashSet<>();
		HashSet<Integer> conjuntoB = new HashSet<>();  
	    numeros(conjuntoA,conjuntoB);
	    ordenar(conjuntoA,conjuntoB);	    
	    interseccion(conjuntoA,conjuntoB);
	    List<Integer> listahashA = new ArrayList<>(conjuntoA);
	    multiplos(listahashA);
	    }
	public static void numeros(HashSet<Integer> conjuntoA,HashSet<Integer> conjuntoB) {
		int numeroalea = (int)(Math.random()*100+30);
		for(int i=0;i<numeroalea;i++) {
			conjuntoA.add((int)(Math.random()*200));
			conjuntoB.add((int)(Math.random()*200));
		}
		System.out.println("conjunto A: "+conjuntoA);
		System.out.println("conjunto B: "+conjuntoB);
		}
	public static void ordenar(HashSet<Integer> conjuntoA,HashSet<Integer> conjuntoB) {
		List<Integer> listahashA = new ArrayList<>(conjuntoA);
	    List<Integer> listahashB = new ArrayList<>(conjuntoB);
	    Collections.sort(listahashA);
	    Collections.sort(listahashB);
	    System.out.println("\nConjunto A ordenado: "+listahashA);
	    System.out.println("Conjunto B ordenado: "+listahashB);
		}
	public static void interseccion(HashSet<Integer> conjuntoA,HashSet<Integer> conjuntoB) {
		conjuntoA.retainAll(conjuntoB);
	    System.out.println("\nLa interseccion: "+conjuntoA);
		}
	public static void multiplos(List<Integer> listahashA) {
	    HashSet<Integer> multiplos = new HashSet<>();
		for(int i=0;i<listahashA.size();i++) {
	    	if(listahashA.get(i)%2==0&&listahashA.get(i)%3==0) {
	    		multiplos.add(listahashA.get(i));
	    	}
	    }
		System.out.println("\nLos multiplos de 2 y 3 de la interseccion son: "+multiplos);
		}
	
	
	
	
	
	
	
	
}

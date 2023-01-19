package colas;

import java.util.*;

public class Colas {

	public static void main(String[] args) {
		LinkedList<Integer> linked = new LinkedList<>();
		ArrayDeque<Integer> cola = new ArrayDeque<>();
		PriorityQueue<Integer> priori = new PriorityQueue<>();
		for(int i=7;i>=1;i--) {
			linked.offer(i);
			cola.offer(i);
			priori.offer(i);
		}
		
		// en lista offer añade al final, en cola al principio
		imprimirColas(linked,cola,priori);
		//peek muestra el primer valor
		System.out.println(linked.peek());
		System.out.println(cola.peek());
		System.out.println(priori.peek());
		//poll saca el valor de la lista
		System.out.println(linked.poll());
		System.out.println(cola.poll());
		System.out.println(priori.poll());
		imprimirColas(linked,cola,priori);
		//devolvemos ultimo elemento de las 
		System.out.println("El ultimo elem de linked es: "+linked.peekLast());
		System.out.println("El ultimo elem de linked es: "+cola.peekLast());
		System.out.println(linked.pollLast());
		System.out.println(cola.pollLast());
		imprimirColas(linked,cola,priori);
	
		
		imprimirColas(linked,cola,priori);
		for(int i=5;i>0;i--) {
			System.out.println("LinkedList: "+linked.poll());
			System.out.println("ArraydeQue: "+cola.poll());
			System.out.println("PriorityQueue: "+priori.poll());
		}
		
		for(int i=7;i>=1;i--) {
			linked.offer(i);
			cola.offer(i);
			priori.offer(i);
		}
		while(!cola.isEmpty()) {
			System.out.println(cola.poll());
		}
	}
		
		public static void imprimirColas(Queue <Integer> a,Queue <Integer> b, Queue <Integer> c ) {
			
			System.out.println("LinkedList: "+a);
			System.out.println("Array Deque: "+b);
			System.out.println("Prioriry Queue: "+c);

		
		

		}
		
			

}




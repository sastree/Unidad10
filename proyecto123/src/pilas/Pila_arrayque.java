package pilas;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Pila_arrayque {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArrayDeque<Integer> pila = new ArrayDeque<>();
		for(int i=0;i<5;i++) {
			pila.push(entrada.nextInt());
		}
		System.out.println(pila.peek());
		System.out.println(pila.getFirst());
		System.out.println(pila.removeFirst());
		System.out.println(pila.remove());
		System.out.println(pila.poll());
		System.out.println(pila.pop());
		System.out.println(pila);
		

	}

}

package pilas;

import java.util.Stack;

public class Pilas {

	public static void main(String[] args) {
		Stack<String> pila = new Stack<>();
		
		pila.push("hola");
		pila.push("adios");
		pila.push("buenas");
		pila.push("dias");
		pila.push("que");
		for(int i=0;i>pila.size();i++) {
			System.out.println(pila.get(i));
		}
		//while(!pila.isEmpty()) {
		//	System.out.println(pila.pop());
		//}
		
		

	}

}

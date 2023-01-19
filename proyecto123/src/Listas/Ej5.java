package Listas;

import java.util.ArrayList;

public class Ej5 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numeros.add(i, (int) (Math.random() * 101));
		}
		System.out.println(numeros);
		System.out.println(numeros.subList(3, 7));
		numeros.removeAll(numeros.subList(3, 7));
		System.out.println(numeros);
	}

}

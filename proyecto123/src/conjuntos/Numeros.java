package conjuntos;

import java.util.*;

public class Numeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numero entre 1-10: ");
		int numero = entrada.nextInt();
		ArrayList<Integer> repetidos = new ArrayList<>();
		ArrayList<Integer> lista = new ArrayList<>();

		for (int i = 0; i < numero; i++) {
			lista.add(((int) (Math.random() * 11)));
		}

		for (int i : lista) {
			System.out.print(i + " ");
		}

		for (int i = 0; i < lista.size(); i++) {
			for (int a = i + 1; a < lista.size(); a++) {
				if (lista.get(i) == lista.get(a)) {
					repetidos.add(lista.get(i));
				}
			}
		}
		lista.removeAll(repetidos);
	    System.out.println("\nNumeros no repetidos: ");
		for(int i: lista) {
			System.out.print(i+" ");
		}
	}
}

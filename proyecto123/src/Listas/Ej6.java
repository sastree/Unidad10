package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Palabras: ");
		String palabras = entrada.nextLine();
		String palabrassep[] = palabras.split(" ");
		List<String> lista1 = Arrays.asList(palabrassep);
		LinkedList<String> lista = new LinkedList<>(lista1);
		System.out.println("Letra: ");
		String letras = entrada.next();
		char letra = letras.charAt(0);
		Iterator<String> iterador = lista.iterator();
		while (iterador.hasNext()) {
			if (iterador.next().charAt(0) == letra) {
				iterador.remove();
			}
		}
		System.out.println(lista);
        entrada.close();
	}

}

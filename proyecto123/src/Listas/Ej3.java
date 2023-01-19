package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nombres: ");
		String nombres = entrada.nextLine();
		String nombresSplit[] = nombres.split(" ");
		List<String> nombreslista = Arrays.asList(nombresSplit);
		Collections.reverse(nombreslista);
		System.out.println(nombreslista);
	}
}

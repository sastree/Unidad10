package tareaunidad6;

import java.util.*;

public class Ej1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numero: ");
		int numero = entrada.nextInt();
		while (!(numero >= 2 && numero <= 100000)) {
			System.out.println("El numero debe ser igual o mayor que 2 y menor de 100.000");
			System.out.println("Numero: ");
			numero = entrada.nextInt();
		}

		int numeros1[] = new int[numero];
		for (int i = 0; i < numero; i++) {
			numeros1[i] = i + 1;
		}
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < numeros1.length; i++) {
			nums.add(numeros1[i]);
		}
		for (int i = 1; i < nums.size(); i++) {
			for (int a = 0; a < nums.size(); a = a + i) {
				nums.remove(a);
			}
		}

		Collections.reverse(nums);

		System.out.print(numero + ": ");
		for (int num : nums) {
			System.out.print(num + " ");

		}
	}

}

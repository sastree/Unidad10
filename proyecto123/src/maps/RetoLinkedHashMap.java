package maps;

import java.util.*;


public class RetoLinkedHashMap {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		LinkedHashMap<Integer, Integer> numeros = new LinkedHashMap<>();
		System.out.println("Numeros: ");
		String clave = entrada.nextLine();
		int num = 0;

		for (int i = 0; i < clave.length(); i++) {
			char num1 = clave.charAt(i);
			num = Character.getNumericValue(num1);
			if (!numeros.containsKey(num)) {
				numeros.put(num, 1);
			} else
				numeros.put(num, numeros.get(num) + 1);

		}
		for(int i=0;i<10;i++) {
			if (numeros.containsKey(i))
				System.out.println(i+" -> "+numeros.get(i));
		}
		entrada.close();
	}

}

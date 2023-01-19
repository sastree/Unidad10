package conjuntos;

import java.util.*;

public class PrimerHashSet {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		HashSet<String> conjuntoA = new HashSet<>();
		HashSet<String> conjuntoB = new HashSet<>();
		String nombresA = "";
		String nombresB = "";
		// 4 nombres en la misma linea separados por espacios, guardar en hashset,

		System.out.println("Introduce nombres separados por un espacio: ");
		nombresA = entrada.nextLine();
		System.out.println("Introduce nombres separados por un espacio: ");
		nombresB = entrada.nextLine();
		String nombresarrayA[] = nombresA.split(" ");
		String nombresarrayB[] = nombresB.split(" ");
		conjuntoA.addAll(Arrays.asList(nombresarrayA));
		conjuntoB.addAll(Arrays.asList(nombresarrayB));
        System.out.println(conjuntoA);
        System.out.println(conjuntoB);
       
	}

}

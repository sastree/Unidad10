package conjuntos;
import java.util.*;
public class PrimerTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> conjunto = new TreeSet<>();
		conjunto.add(1);
		conjunto.add(3);
		conjunto.add(2);
		conjunto.add(4);
		System.out.println(conjunto);
		//primer elemento
		Integer primero = conjunto.first();
		System.out.println("El primer elemento es: "+primero);
		Integer ultimo = conjunto.last();
		System.out.println("El ultimo elemento es: "+ultimo);

	}

}

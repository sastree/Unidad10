package conjuntos;
import java.util.*;
public class EjercicioLinkedHashSet {

	public static void main(String[] args) {
		// array 4 nombres, imprimimos, linkedhashset con 2 nulos, imprimimos linked, borramos nulos, añadimos el array, comprobamos si hay dos de los nombres introducidos
		//creamos treeset e imprimimos por orden alfabetico 
		String lista [] = {"Luis","Alex","Sastre","Pablo"};
		System.out.println(Arrays.toString(lista));
		LinkedHashSet<String> conjunto = new LinkedHashSet<>();
		conjunto.add(null);
		conjunto.add(null);
		System.out.println(conjunto);
		conjunto.remove(null);
		
		conjunto.addAll(Arrays.asList(lista));
		
		System.err.println("Contiene a Luis y Pablo?: "+conjunto.containsAll(Set.of("Luis","Pablo"))); //subconjunto
		TreeSet<String> ordenado = new TreeSet<>(conjunto);
		System.out.println(ordenado);

	}

}

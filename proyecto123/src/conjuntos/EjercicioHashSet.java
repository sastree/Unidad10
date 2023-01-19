package conjuntos;
import java.util.*;
public class EjercicioHashSet {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        
		Set<String> conjuntoB = Set.of("Luis","Ana","Ines","Beto");
		Set<String> conjuntoB2 = Set.of("Beto","Luis","Ines","Ana");
		Set<String> conjuntoN = Set.of("Pedro","Ana","Beto");
		
		System.out.println("Conjunto B"+conjuntoB);
		System.out.println("Conjunto B2"+conjuntoB2);
		System.out.println("Conjunto N"+conjuntoN);
		
		System.out.println("Luis esta en el conjunto B?: "+conjuntoB.contains("Luis")+"\nLuis esta en el conjunto B2?:"+conjuntoN.contains("Luis"));
        System.out.println("Es el conjunto B = B2?: "+conjuntoB.equals(conjuntoB2));
        System.out.println("Es el conjunto B = B2?: "+conjuntoB.equals(conjuntoN));
        
	}

}

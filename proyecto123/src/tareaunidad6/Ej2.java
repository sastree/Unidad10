package tareaunidad6;
import java.util.*;
public class Ej2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Animales: ");
		String animales = entrada.nextLine();
		int cuenta = 0;
		String animal[] = animales.split(" ");
		List<String> Lista = Arrays.asList(animal);
		
		System.out.println(Lista);
       
        
	}

}

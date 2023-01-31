package maps;
import java.util.*;
public class Reto {

	public static void main(String[] args) {
		String equipos [] = {"A","B","C","D","E","F","G","H"};
		ArrayList<String> equipos1 = new ArrayList<>(Arrays.asList(equipos));
		ArrayList<String> equipos2 = new ArrayList<>(Arrays.asList(equipos));
		HashSet<String> reparto = new HashSet<>();
		Collections.shuffle(equipos1);
		Collections.shuffle(equipos2);
		for(String i: equipos1) {
			for(String a: equipos2) {
				reparto.add(i);
				reparto.add(a);
				
			}
		}
		System.out.println(reparto);

	}

}

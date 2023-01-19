package conjuntos;

import java.util.*;

public class Conjunto1 {

	public static void main(String[] args) {
	
		List<String> nombres3 =  Arrays.asList("Luis", "Ines", "Ana", "Beto");
		List<String> nombres4 =  Arrays.asList("Ana", "Beto", "Pedro");
		ArrayList<String> inter = new ArrayList<>();
		
		for(int i=0;i<nombres4.size();i++) {
				if(nombres3.contains(nombres4.get(i))) {
					inter.add(nombres4.get(i));
			}
		}
		System.out.println(inter);

	}
}

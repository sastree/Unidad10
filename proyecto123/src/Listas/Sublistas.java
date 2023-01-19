package Listas;

import java.util.Arrays;
import java.util.List;

public class Sublistas {

	public static void main(String[] args) {
		List<String> Lista = Arrays.asList("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo");
		List<String> sublista = Lista.subList(2, 5);
		for (String dia : Lista) {
			System.out.print(dia+" ");
		}
		
		System.out.println("\n"+sublista);
	}

}

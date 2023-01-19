package sentenciaif;

import java.util.Scanner;

public class Siosi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime si: ");
		String si = entrada.nextLine();
		if(si.equalsIgnoreCase("Si"))
		{
		System.out.println("Gracias.");
		}
		else 
			System.out.println("Eso no es un si.");
		
		
			
			
		
		entrada.close();
		
		
		
		        
		
	}

}

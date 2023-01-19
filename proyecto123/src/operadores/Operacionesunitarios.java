/**
 * 
 */
package operadores;

import java.util.Scanner;

/**
 * @author cuent
 *
 */
public class Operacionesunitarios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Hola "+nombre+", en que año naciste?");
        
        
        int edad = entrada.nextInt();
        int edadcalculada = 2022 - edad;
        
        System.out.println("Tienes "+edadcalculada+" años.");
        entrada.close();
        
        
        
        
        
		
		
		
		
		
	}

}

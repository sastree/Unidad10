/**
 * 
 */
package operadores;

import java.util.Scanner;

/**
 * @author cuent
 *
 */
public class Areatriangulo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner teclado = new Scanner(System.in);
           System.out.println("Altura del triangulo: ");
           double altura = teclado.nextDouble();
           System.out.println("Base del triangulo: ");
           double base = teclado.nextDouble();
           double resultado = (base * altura)/2;       
           System.out.printf("El area del triangulo es: %.3f",resultado);
           teclado.close();
           
           
		
		
		
		
		
		
	}

}

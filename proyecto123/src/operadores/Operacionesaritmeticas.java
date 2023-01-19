/**
 * 
 */
package operadores;

/**
 * @author cuent
 *
 */
public class Operacionesaritmeticas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero1 = 8;
		double numero2 = 5;
		
		int intnumero1 = (int)(numero1);
		int intnumero2 = (int)(numero2);
		
		int suma = intnumero1 + intnumero2;
		
		
		System.out.println(numero1 + numero2);
		
		System.out.println(numero1 + numero2);
		System.out.println(numero1 - numero2);
		System.out.printf("%.2f \n", numero1 / numero2);
		System.out.println(numero1 * numero2);
		System.out.println(numero1 % numero2); //resto de la division
		System.out.printf("%.0f \n", numero1 + numero2);
		System.out.printf("La suma de %.0f y %.0f es: %.0f \n",numero1, numero2, numero1 + numero2);
		
		System.out.println("La suma de "+intnumero1+" y "+intnumero2+" es: "+(intnumero1+intnumero2));
		System.out.println("La suma de "+intnumero1+" y "+intnumero2+" es: "+suma);
		
		
		
		
		
		
	}

}

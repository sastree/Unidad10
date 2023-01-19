/**
 * 
 */
package operadores;

/**
 * @author cuent
 *
 */
public class Ejercicioformateo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
         double numero1 = 144;
         double numero2 = 199;
       
         
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        System.out.printf("|--------------------------------------------------------|\n");
        System.out.printf("|%-12s %-8s %-8s %-17s %-20s \n","VARIABLES","SUMA","RESTA","MULTIPLICACION","DIVISON|");
        System.out.printf("|--------------------------------------------------------|\n");
        System.out.printf("|%.0f y %.0f    ",numero1,numero2);
        System.out.printf("%-8.0f %-9.0f %7.0f %16.3f|\n",suma,resta,multiplicacion,division);
        System.out.println("|--------------------------------------------------------|");
        
		
		
		
		
		
	}

}

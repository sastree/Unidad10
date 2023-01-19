/**
 * 
 */
package proyecto1;

/**
 * @author cuent
 *
 */
public class Proyecto1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int edad = 19;
		String nombre = "Alejandro";
		char letra = 'A';
		double altura = 1.80;
		
		final float iva = 0.21F;
		int precio = 50;
		byte chicle = 1;
		
		boolean contraseña;
	    contraseña = true;
	    
	    int manzanas = 10;
	    manzanas = manzanas - 5;
	    
	    double centimetros = 6.87654;
	    final float pulgadas = 2.54F; //constante
	    double conversion = centimetros / pulgadas;
		
		
		
		System.out.println("EL precio del producto es: "+precio);
		System.out.println("El precio del producto con iva es: "+(precio+precio*iva));
		System.out.print("Me llamo "+nombre+" y tengo "+edad+" años.");
		System.out.println(" Mi nombre empieza por la letra "+letra+".");
		System.out.print("Mido "+altura+" metros.");
		
		System.out.println(chicle);
		System.out.println(contraseña);
		
		System.out.println(manzanas);
		
		System.out.printf("%.2f centimetros son %.2f pulgadas.", centimetros, conversion);
		
		

		
		
		
		
		
		
		
	}

}

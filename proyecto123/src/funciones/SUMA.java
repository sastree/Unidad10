package funciones;
import java.util.Scanner;

public class SUMA {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		double num1 = entrada.nextDouble();
		System.out.println("Introduce el segundo numero: ");
		double num2 = entrada.nextDouble();
		
		double suma = resta(num1, num2);
		
		System.out.printf("La resta es: %.2f",suma);
		entrada.close();
	}
    public static double resta(double a,double b) {
    	double resultado = a - b;
    	return resultado;
    }
}

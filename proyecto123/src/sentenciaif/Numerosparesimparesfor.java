package sentenciaif;
import java.util.Scanner;
public class Numerosparesimparesfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numpares = 0;
		int numimpares = 0;
		System.out.println("Introduce 10 numeros: ");
		for(int i=1;i<=10;i++) {	
			int numero = entrada.nextInt();
			if(numero%2==0) {
				numpares++;						
			}
			else {
				numimpares++;
			}
				}
		
			System.out.println("Hay "+numpares+" numeros pares.");
			System.out.println("Hay "+numimpares+" numeros impares.");
            entrada.close();
	}

}

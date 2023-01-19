package sentenciaif;

import java.util.Scanner;

public class Cuentabanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuanto dinero tienes en la cuenta: ");
		double dinero = entrada.nextDouble();
		System.out.println("Cuanto quieres retirar: ");
		double retirada = entrada.nextDouble();
		double dinerorestante = dinero - retirada;
		if(dinerorestante < 0) {
			System.out.println("Tu nuevo saldo es de "+(dinero-retirada)+"\nSaldo negativo");
		}
		else
			System.out.println("Tu nuevo saldo es de "+dinerorestante+" euros." );
		
		
		
		
		entrada.close();
		
		
		
	}

}

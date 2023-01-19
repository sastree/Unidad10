package sentenciaif;
import java.util.Scanner;
public class Adivinanumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numerorandom = (int)(Math.random()*100+0);
		int numero = -1;
		int cuenta = 0;
		System.out.println("Numero generado.");
		System.out.println("Que numero es: ");
		numero = entrada.nextInt();
		while(numero!=numerorandom&&cuenta<=3) {
			if(numero>numerorandom) {
				System.out.println("El numero es mas pequeño. Intentos restantes: "+(4-cuenta));
				cuenta++;
				numero = entrada.nextInt();}		
			else {
				System.out.println("El numero es mas grande. Intentos restantes: "+(4-cuenta));
				cuenta++;
				numero = entrada.nextInt();	}
		}
		if(cuenta<5&&numero==numerorandom) {
		System.out.println("CORRECTO!");}
		else {
			System.out.println("Perdiste :(\nEra el "+numerorandom);
			
		}
     entrada.close();
	}

}

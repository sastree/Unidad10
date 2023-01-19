package sentenciaif;

import java.util.Scanner;

public class Ejerciciosdeifyelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantos años tienes: ");
		int edad = entrada.nextInt(); // es un nextInt porque es un numero entero
		if(edad<18) { //siempre se empieza por if
	    System.out.println("Eres una persona joven.");
		}
		else if(edad>=18&&edad<=60) {
			System.out.println("Eres una persona adulta.");
		}
		else if(edad>60&&edad<=75) { //en el medio habran else if
		System.out.println("Eres una persona madura.");						
		}
		else  //siempre termina en else
		    System.out.println("Eres una persona mayor. Cuidese.");
		
		entrada.close();
	}

}

package ejercicios2;
import java.util.Scanner;
public class Piezas {
static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
	
		int piezas[]=entrada_piezas(); // doy valor a la variable piezas desde la funcion de entrada_piezas
		
		if(piezas[0]+piezas[1]+piezas[2]+piezas[3]==10) {
			System.out.println("Falta la pieza numero 5");
		}
		else if(piezas[0]+piezas[1]+piezas[2]+piezas[3]==11) {
			System.out.println("Falta la pieza numero 4");
		}
		else if(piezas[0]+piezas[1]+piezas[2]+piezas[3]==12) {   // en el if analizo la pieza que falta con las respectivas sumas
			System.out.println("Falta la pieza numero 3");
		}
		else if(piezas[0]+piezas[1]+piezas[2]+piezas[3]==13) {
			System.out.println("Falta la pieza numero 2");}
		
		else 
			System.out.println("Falta la pieza numero 1");
		}
	public static int[] entrada_piezas() {   //en esta funcion pregunto al usuario por el numero de piezas y devuelvo un array
		int piezas[]=new int [5];
	
		for(int i=0;i<4;i++) {
			System.out.println("Pieza (1-5): ");
			piezas[i]= entrada.nextInt();	
			while(piezas[i]<1||piezas[i]>5) {
				System.out.println("Numero de pieza no valida.");//si el usuario pone un num<1 o >5 no sera valido y se volvera a preguntar
				System.out.println("Pieza (1-5): ");
				piezas[i]= entrada.nextInt();	
			}
	    }
		return piezas;		
    }
}


package ejercicios;
import java.util.Scanner;
public class Mayorde5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		int numeros[]= new int[6];    //creacion del array
		int mayor = Integer.MIN_VALUE;   // numero utilizado para hayar el numero mayor
		for(int i=1;i<numeros.length;i++) {   //bucle con la duracion de la cantidad de elementos del array
			System.out.println("Introduce el "+i+" numero: ");
			numeros[i]= entrada.nextInt();   //se da valor a cada elemento del array		
			if(numeros[i]>mayor){  //comprobacion del numero mas grande
				mayor=numeros[i];
		    }  			
		}  
		System.out.println("El mayor es: "+mayor);
   entrada.close();
	}

}

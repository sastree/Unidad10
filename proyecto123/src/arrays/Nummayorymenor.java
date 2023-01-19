package arrays;
import java.util.Scanner;
public class Nummayorymenor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Tamaño del array: "); 
		int numeros = entrada.nextInt();
		int array[]=new int [numeros];
		
		for(int i=0;i<=array.length-1;i++) {
			array[i]=(int)(Math.random()*10000);
		}
		for(int i=0;i<=array.length-1;i++) {
			System.out.print(array[i]+" ");
		}
			
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]<menor){
				menor=array[i];
		}
			if(array[i]>mayor){
				mayor=array[i];
		}
			
			
			 
			{
			System.out.println("\nEl numero menor es: "+menor+"\nEl numero mayor es: "+mayor);
			

	
    entrada.close();
}
}
		}
	}

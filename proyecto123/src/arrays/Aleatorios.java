package arrays;

import java.util.Scanner;

public class Aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int array[]= new int [150];
		int numerospares = 0;
		int numerosimpares= 0;
		for(int i=0;i<=array.length-1;i++) {
			array[i]=(int)(Math.random()*100);		
		}
		for(int i=0;i<=array.length-1;i++) {
			System.out.print(array[i]+" ");
		}
		int suma =0;
		for(int i=0;i<=array.length-1;i++) {
			suma+=array[i];
		}
		System.out.println("\nLa suma total es: "+suma);
		
		for(int i=0;i<=array.length-1;i++) {
			if(array[i]%2==0) {
				numerospares++;}
			else {
				numerosimpares++;
			     }
		}
		int arraypares[]= new int [numerospares];
		int arrayimpares[]= new int [numerosimpares];
			int j=0;
			int k=0;
		for(int i=0;i<=array.length-1;i++) {
				if(array[i]%2==0) {
					arraypares[j]=array[i];
					j++;}
				else {
					arrayimpares[k]=array[i];
					k++;}
				}
	
		System.out.println("Hay "+numerospares+" numeros pares.\nHay "+numerosimpares+" numeros impares.");
		System.out.print("Numeros pares: ");
		for(int i=0;i<=arraypares.length-1;i++) {
			System.out.print(arraypares[i]+" ");
		}
		System.out.print("\nNumeros impares: ");
		for(int i=0;i<=arrayimpares.length-1;i++) {
			System.out.print(arrayimpares[i]+" ");
		}
		entrada.close();
	}

}

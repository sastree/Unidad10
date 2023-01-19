package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Notamedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int examen[]= {1,2,3,4,5};
		double notas[]=new double [5];
		for(int i=0;i<5;i++) {
		System.out.println("Nota de tu "+examen[i]+" examen: ");
		notas[i]= entrada.nextDouble();
		    while(notas[i]<0) {
			System.out.println("Nota no valida.");
			System.out.println("Nota de tu "+examen[i]+" examen: ");
			notas[i]= entrada.nextDouble();
		    }
	    }
		Arrays.sort(notas);
		for(double elementos:notas) {
			System.out.print(elementos+" ");
		}
		double media = (notas[0]+notas[1]+notas[2]+notas[3]+notas[4])/5;
		System.out.printf("\nTu nota media es %.2f",media);
		entrada.close();
    } 
}
package arraymultidi;

import java.util.Arrays;
import java.util.Scanner;

public class Arraymultix {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int filas =0;
		int columnas=0;
		System.out.println("Cuantas filas quieres: ");
		filas = entrada.nextInt();
		System.out.println("Cuantas columnas quieres: ");
		columnas = entrada.nextInt();
		int array[][]=new int[filas][columnas];
		for(int i=0;i<array.length;i++) {
        	for(int j=0;j<array[i].length;j++) {
        		System.out.println("Valor para("+i+","+j+")");
    			array[i][j]=entrada.nextInt();
        	}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]*=5;			
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		entrada.close();
	}
}

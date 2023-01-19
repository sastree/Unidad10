package arraymultidi;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numeros[][]=new int[3][4];
		for(int i=0;i<1;i++) {
			for(int j=0;j<numeros[i].length;j++) {
				numeros[0][j]=(int)(Math.random()*10);
				numeros[1][j]=(int)Math.pow(numeros[0][j],2);		
                numeros[2][j]=(int)Math.pow(numeros[0][j],3);
 				}

		}	
			
			
		
	
		for(int i=0;i<numeros.length;i++) {
			System.out.println(Arrays.toString(numeros[i]));
		}
}
}
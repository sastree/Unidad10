package ejercicioscomplementarios;

import java.util.Arrays;

public class Matriztraspuesta {

	public static void main(String[] args) {
		int matriz[][]=new int[4][5];
		int matriz2[][]=new int[5][4];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=(int)(Math.random()*50);
				
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i])); // imprimo el array
		}
		for(int j=0;j<matriz[0].length;j++) {
			for(int i=0;i<matriz.length;i++) {
				matriz2[i][matriz2[j].length]=matriz[i][j];
			}
		}
		System.out.println();
		for(int i=0;i<matriz2.length;i++) {
		System.out.println(Arrays.toString(matriz2[i]));

		}	

	}
}
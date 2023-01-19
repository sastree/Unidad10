package arraymultidi;

import java.util.Arrays;

public class Arraymultidim {

	public static void main(String[] args) {
		int ventas[][]= new int [4][4];
		int ventas9[][]= {
				{2,2,2,2},
				{2,2,2,2},
				{2,2,2,2},
				{2,2,2,2},
		};
		int matriz[][]= new int[4][];
		matriz[0]= new int[4];
		matriz[1]= new int[2];
		matriz[2]= new int[3];
		matriz[3]= new int[1];
	    int matriz3[][]= {
	    		{1,1,1,1},
	    		{1,1},
	    		{1,1,1},
	    		{1}
	    };
	    int [][] matrizDeEnteros = {
	    		{1,5,7},
	    		{3,4,9},
	    		{5,1,61},
	    		{7,16,13}
	    };
	    System.out.println(Arrays.toString(matrizDeEnteros[0]));
	    System.out.println(Arrays.toString(matrizDeEnteros[1]));
	    System.out.println(Arrays.toString(matrizDeEnteros[2]));
	    System.out.println(Arrays.toString(matrizDeEnteros[3]));
	    System.out.println("\n");
	    for(int i=0;i<matrizDeEnteros.length;i++) {
	    	System.out.println(Arrays.toString(matrizDeEnteros[i]));
	    }
	    System.out.println("\n");
	    for(int i=0;i<matriz3.length;i++) {
	    	System.out.println(Arrays.toString(matriz3[i]));
	    }
				
	}

}

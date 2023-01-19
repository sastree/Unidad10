package arraymultidi;

import java.util.Arrays;

public class filacolumnas {

	public static void main(String[] args) {
		int matriz3[][]= {
	    		{1,1,1,1},
	    		{1,1},
	    		{1,1,1},
	    		{1}
	    };
		for(int i=0;i<matriz3.length;i++) {
	    	System.out.println(Arrays.toString(matriz3[i]));
	    }
		for(int i=0;i<matriz3.length;i++) {
			System.out.println("La fila "+(i+1)+" tiene "+matriz3[i].length+" columnas.");
		}

	}

}

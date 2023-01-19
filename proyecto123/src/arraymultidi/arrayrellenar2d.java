package arraymultidi;

import java.util.Scanner;
public class arrayrellenar2d {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numero de ");
        int array[][][]=new int[2][3][4];
        
	
        for(int i=0;i<array.length;i++) { //recorre filas
        	for(int j=0;j<array[i].length;j++) {//recorre columnas 2d
        		for(int k=0;k<array[i].length;k++) { //recorre columnas 3d
        			System.out.println("Valor para("+i+","+j+","+k+")");
        			array[i][j][k]=entrada.nextInt();
        		}
        	}
        }
        entrada.close();
      
	}
}

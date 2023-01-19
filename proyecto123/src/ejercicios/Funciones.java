package ejercicios;

import java.util.Arrays;

public class Funciones {

	public static void main(String[] args) {
		    Arrays.sort(array);
			System.out.println(Arrays.toString(array));
		}
	}
	public static boolean esPrimo(int n) {
		for(int i=0;i<n;i++) {
			if(n%i==0) 
				return false;
		}
		return true;
	}
	public static int[] arrayPrimos() {
		int array[]=new int [10];
		for(int i=0;i<array.length;i++) {
			int aleatorio =(int)Math.random()*1000;
			while(esPrimo(aleatorio)==false) {
				aleatorio = (int)Math.random()*1000;
			}
			array[i]=aleatorio;
		}
		return array;
	}

}

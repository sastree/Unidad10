package arraymultidi;

import java.util.Arrays;

public class Clonesarray {

	public static void main(String[] args) {
		int primos[]={ 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };
        int copia[]=new int[primos.length];
        int clonado[];
        System.arraycopy(primos,0,copia,0,primos.length);
        clonado = primos.clone();
        
        
        System.out.println("0-Primos: "+Arrays.toString(primos));
        System.out.println("0-Copia: "+Arrays.toString(copia));
        System.out.println("0-Clonado: "+Arrays.toString(clonado));
        clonado[3]=100;
        System.out.println("1-Primos: "+Arrays.toString(primos));
        System.out.println("1-Clonado: "+Arrays.toString(clonado));
        copia[3]=300;
        System.out.println("2-Primos: "+Arrays.toString(primos));
        System.out.println("2-Copia: "+Arrays.toString(copia));
	}

}

package arraymultidi;

import java.util.Arrays;

public class Arraycopias {

	public static void main(String[] args) {
		int primos[]={ 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };
		int copia[]=new int[primos.length];
		System.arraycopy(primos,1,copia,2,6);
	
		
		System.out.println(Arrays.toString(copia));
		
		
		
	}

}


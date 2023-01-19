package arrays;
import java.util.Arrays;
public class Formejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
		int numeros[]= new int[10];
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=(int)(Math.random()*100);		
		}
		
		for(int elemento:numeros) {
			System.out.print(elemento+" ");
		}
		Arrays.sort(numeros);
		System.out.println("\n"+Arrays.toString(numeros));

	}

}

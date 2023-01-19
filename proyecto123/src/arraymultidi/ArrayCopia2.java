package arraymultidi;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayCopia2 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int arraynumeros[]=new int[]{1,2,3,4,5,6,7,8};
        int numeros=arraynumeros.length;
        int arraytemp[]=new int[numeros];
        System.out.println("Introduce cuantos elementos quieres mover a la derecha");
        int k=entrada.nextInt();
        if(k>numeros) {
        	k=k % arraynumeros.length;
        }
        System.arraycopy(arraynumeros, 0, arraytemp, k, numeros-k);
        System.out.println("Array numeros: "+Arrays.toString(arraynumeros));
        System.out.println("Array temporal: "+Arrays.toString(arraytemp));
        System.arraycopy(arraynumeros,numeros-k,arraynumeros,0,k);
        System.out.println("Array numeros: "+Arrays.toString(arraynumeros));
        System.arraycopy(arraytemp,k,arraynumeros,k,numeros-k);
        System.out.println("Array final: "+Arrays.toString(arraynumeros));
        entrada.close();

}
}

package arraymultidi;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int filas =0;
		int columnas=0;
		System.out.println("Cuantas filas quieres: ");
		filas = entrada.nextInt();
		System.out.println("Cuantas columnas quieres: ");
		columnas = entrada.nextInt();
		int numeros1[][]=new int[filas][columnas];
		for(int i=0;i<numeros1.length;i++) {
        	for(int j=0;j<numeros1[i].length;j++) {
        		System.out.println("Primera matriz. Valor para("+i+","+j+")");
    			numeros1[i][j]=entrada.nextInt();
        	}
		}
		int numeros2[][]=new int[filas][columnas];
		for(int i=0;i<numeros2.length;i++) {
        	for(int j=0;j<numeros2[i].length;j++) {
        		System.out.println("Segunda matriz. Valor para("+i+","+j+")");
    			numeros2[i][j]=entrada.nextInt();
        	}
		}
		int suma[][]=new int[filas][columnas];
		for(int i=0;i<numeros2.length;i++) {
        	for(int j=0;j<numeros2[i].length;j++) {
        		suma[i][j]=numeros1[i][j]+numeros2[i][j];
        	}
		

	}
		for(int i=0;i<numeros1.length;i++) {
			System.out.println(Arrays.toString(numeros1[i]));
		}
		System.out.println("   +");
		for(int i=0;i<numeros2.length;i++) {
			System.out.println(Arrays.toString(numeros2[i]));}
		System.out.println("-------");
		for(int i=0;i<suma.length;i++) {
			System.out.println(Arrays.toString(suma[i]));}
		entrada.close();

}
}
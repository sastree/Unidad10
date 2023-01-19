package arrays;
import java.util.Scanner;
public class Ej1arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Cuantos elementos quieres en el array: ");
		int numero = entrada.nextInt();
		int array [] = new int [numero];
		System.out.println("El array tiene: "+array.length+" elementos.");
		array[0]=2;
		array[1]=array[0];
		array[2]=array[0]+array[1];
		array[3]=array.length+10;
		array[array.length-1]= array[0];
		System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]+" "+array[array.length-1]);
		for(int i= 0;i<array.length;i++) {
			System.out.println(array[i]);
		}
			
        entrada.close();
	}

}

package pruebas;
import java.util.Arrays;
import java.util.Scanner;
public class Aa {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String tabla[][]=new String[10][10];
		int pixeles=0;
		int coords[]=new int[20];
		int coords2[]=new int[20];
		
	
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				tabla[i][j]="("+i+","+j+")";
			}
		}
		for(int i=0;i<tabla.length;i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}
		System.out.println("Cuantos pixeles vas a usar: ");
		pixeles=entrada.nextInt();
		for(int i=0;i<pixeles;i++) {
			System.out.println("Coord y:");
			coords[i]=entrada.nextInt();
			System.out.println("Coord x:");
			coords2[i]=entrada.nextInt();
		}
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				tabla[i][j]=" ";
			}
			
		}
		for(int i=0;i<pixeles;i++) {
			if(tabla[coords[i]][coords2[i]]==" ") {
				tabla[coords[i]][coords2[i]]="▄";
			}
		}
		
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
			System.out.print(tabla[i][j]+" ");
			}
			System.out.println();

		}
}
}






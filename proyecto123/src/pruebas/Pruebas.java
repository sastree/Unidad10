package pruebas;
import java.util.Scanner;
public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Coordenada X: ");
		int coordenadax = entrada.nextInt();
		System.out.println("Coordenada Y: ");
		int coordenaday = entrada.nextInt();
		String x[]= new String[coordenadax];
		String y[]=new String[coordenaday];
		for(int i=0;i<=10;i++) {
		System.out.print(i+"   ");
	

	}
		for(int i=0;i<=10;i++) {
			System.out.println(i+"\n ");	
		}
		
		entrada.close();
}
}

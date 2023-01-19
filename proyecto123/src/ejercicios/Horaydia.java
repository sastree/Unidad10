package ejercicios;
import java.util.Scanner;
public class Horaydia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que hora es(0 - 23): "); //solicitud de la hora
		int hora = entrada.nextInt();
		if(hora>=6&&hora<=12) {          
			System.out.println("Buenos días.");  //si la hora esta entre las 6 y las 12: Buenos dias
		}
		else if(hora>=13&&hora<=20) {
			System.out.println("Buenas tardes."); //si la hora esta entre las 13 y las 20: Buenas tardes
		}
		else {
			System.out.println("Buenas noches.");  //si la hora esta entre las 20 y las 24: Buenos noches
		}
		
		entrada.close();

	}

}

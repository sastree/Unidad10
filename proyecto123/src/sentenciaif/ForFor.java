package sentenciaif;
import java.util.Scanner;
public class ForFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = entrada.nextInt();
		System.out.println("-----------\nTABLA DEL "+numero+"\n-----------");
		for(int i=0;i<=10;i++){
			System.out.println(numero+"x"+i+"= "+(numero*i));
		}
        entrada.close();
	}

}

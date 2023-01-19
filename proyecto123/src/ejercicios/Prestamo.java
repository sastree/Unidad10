package ejercicios;
import java.util.Scanner;
public class Prestamo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Importe del prestamo: "); //peticion del prestamo solicitado
		double prestamo = entrada.nextDouble();
		double aportacion = 0;   //inicializacion de la variable de la aportacion
		while(prestamo-aportacion<=prestamo) {
			System.out.println("Aportacion: ");
			aportacion = entrada.nextDouble(); //se da valor a la aportacion aportada
			prestamo=prestamo-aportacion;  //calculo de la deuda pendiente restando la aportacion
			if(prestamo<=0) {   // si la aportacion es mayor a la deuda, esta sera 0 y el dinero sobrante se lo queda el banco
			System.out.println("Deuda saldada.");	
			System.exit(0);}
			else
				System.out.println("Deuda pendiente: "+prestamo); //si la aportacion es menor, se seguiran pidiendo mas aportaciones hasta lograr pagar la deuda
		}	
			entrada.close();
	}		
}
		

	



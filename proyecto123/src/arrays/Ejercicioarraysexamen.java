package arrays;
import java.util.Scanner;
public class Ejercicioarraysexamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double notas []= new double[5];
		for(int i=0;i<5;i++){
		System.out.println("Nota de tus ultimos examenes: ");
        notas[i] = entrada.nextDouble();
	}
		double notafinal=(notas[0]+notas[1]+notas[2]+notas[3]+notas[4])/5;
		System.out.printf("Tu nota media es de: %.2f",notafinal);
    entrada.close();
}
}
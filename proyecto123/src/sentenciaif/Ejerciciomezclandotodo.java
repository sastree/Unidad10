package sentenciaif;
import java.util.Scanner;
public class Ejerciciomezclandotodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//notas 3 examenes, sacamos media,<5 sus, 
         Scanner entrada = new Scanner(System.in);
         System.out.println("Cual es la nota de tus tres untimos examenes: ");
         double nota1 = entrada.nextDouble();
         double nota2 = entrada.nextDouble();
         double nota3 = entrada.nextDouble();
         double media = (nota1+nota2+nota3)/3;
         if(media<5)
         {
         System.out.println("Estas suspenso.");
         }
         else if(media>=5&&media<6)
         {
         System.out.println("Suficiente.");
         }
         else if(media>=6&&media<7)
         {
         System.out.println("Bien.");
         }
         else if(media>=7&&media<9)
         {
         System.out.println("Notable.");
         }
         else if(media>=9&&media<10)
         {
         System.out.println("Sobresaliente.");
         }
         else if(media==10)
         {
         System.out.println("Matricula.");
         }
         else
         System.out.println("Error.");
         entrada.close();
	}

}

package funciones;
import java.util.Scanner;
public class Menu {
static Scanner entrada = new Scanner(System.in);

   public static void main(String[] args) {
	   System.out.println("Tamaño del array: ");
	   int length = entrada.nextInt();
	   int array[]= arrayrandom(length);
	   String opcion=menu();
	}

   public static String menu() {
	   System.out.println("Sumar");
	   System.out.println("Restar");
	   System.out.println("Contar");
	   System.out.println("Multiplicar");
	   String opcion = entrada.nextLine();
	   return opcion;
   }
   public static int [] arrayrandom(int length) {
	   int array[]= new int[length];
	   for(int i=0;i<array.length;i++) {
		   array[i]=(int)Math.random()*100;
		   
	   }
	   return array;
   }
   public static int calculadora(int[] array,String operacion) {
	   int resultado=0;
	   switch(operacion.toLowerCase(null)) {
	   case"sumar":
		   for(int i=0;i<array.length;i++) {
			   resultado= resultado+array[i];
			   
		   }
	   case"restar":
		   for(int i=0;i<array.length;i++) {
			   
		   }
	   case"Contar":
		   for(int i=0;i<array.length;i++) {
			   
		   }
	   case"multiplicar":
		   for(int i=0;i<array.length;i++) {
		   
	       }
		  
		   }
	   return resultado;
   }
}

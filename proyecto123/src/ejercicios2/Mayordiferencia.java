package ejercicios2;
import java.util.Scanner;
public class Mayordiferencia {
static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		
		int notas[]= entradadatos();  // doy valores al array de notas desde la funcion de entradadatos
		int diferencia=diferencia(notas); //doy el valor el cual sera el resultado desde la funcion diferencia
		System.out.println("La diferencia es: "+diferencia);
		entrada.close();
	}
	public static int diferencia (int[]array) { //en esta funcion calculo la diferencia y la devuelvo en forma de int
		int mayor= Integer.MIN_VALUE;
		int menor= Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]<menor){
				menor=array[i];}
			if(array[i]>mayor){
				mayor=array[i];}
			}
			int diferencia=mayor-menor;
		return diferencia;}
	
	public static int [] entradadatos () { // en esta funcion pregunto al usuario las notas de los ultimos examenes
		int notas[] = new int[5];
		for(int i=0;i<notas.length;i++) {
			System.out.println("Introduzca la nota del alumno "+(i+1)+":");
			notas[i]=entrada.nextInt();
		while(notas[i]<0||notas[i]>10) {	
			System.out.println("Nota no valida.\nIntroduzca la nota del alumno "+(i+1)+":"); //si la nota es menor de 0 o mayor de 10 no sera valida
	        notas[i]=entrada.nextInt();}
		}
			return notas;
			
	}
	
}






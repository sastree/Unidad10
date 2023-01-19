package ejercicios3;
import java.util.Arrays;
import java.util.Scanner;
public class Buscaminas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String tabla[][] = new String[5][5]; //inicio el array 2d
		int numero=0;
		int fila=0;   //inicializo las variables necesarias
		int columna=0;
		int cuenta=0;
		for(int i=0;i<tabla.length;i++) {  //establezco que hay una probabilidad de 1/3 de que en una casilla se encuentre una mina
        	for(int j=0;j<tabla[i].length;j++) {
        		numero= (int)(Math.random()*3+1);
        		if(numero==1) {
        		tabla[i][j]="*";
        		}
        		else if(numero==2||numero==3)
        			tabla[i][j]="-";
        	}
		}
		for(int i=0;i<tabla.length;i++) { //imprimo el contenido de cada casilla
        	for(int j=0;j<tabla[i].length;j++) {
        		System.out.println("Coordenada ("+i+","+j+"):"+tabla[i][j]);
        	}
		}
		for(int i=0;i<tabla.length;i++) { //imprimo la tabla para que sea mas visual
			System.out.println(Arrays.toString(tabla[i]));
		}
		System.out.println("Introduzca la fila a comprobar: ");//pregunto por la casilla a comprobar
		fila=entrada.nextInt();
		System.out.println("Introduzca la columna a comprobar: ");
		columna=entrada.nextInt();
			
		if(tabla[fila][columna]=="*") { //compruebo el valor de cada casilla para ver si hay mina o no
			cuenta++;
		}
		if(fila<4&&columna<4&&tabla[fila+1][columna+1]=="*") {
			cuenta++;
		}
		if(columna<4&&tabla[fila][columna+1]=="*") {
			cuenta++;
		}
		if(fila>0&&columna<4&&tabla[fila-1][columna+1]=="*") {
			cuenta++;
		}
		if(fila>0&&tabla[fila-1][columna]=="*") {
			cuenta++;
		}
		if(fila>0&&columna>0&&tabla[fila-1][columna-1]=="*") {
			cuenta++;
		}
		if(columna>0&&tabla[fila][columna-1]=="*") {
			cuenta++;
		}
		if(fila<4&&columna>0&&tabla[fila+1][columna-1]=="*") {
			cuenta++;
		}
		if(fila<4&&tabla[fila+1][columna]=="*") {
			cuenta++;
		}
        entrada.close();
		System.out.println("Hay "+cuenta+" minas alrededor de esa posicion, teniendo en cuenta la misma.");//imprimo resultado
    }
}

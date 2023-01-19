package arrays;
import java.util.Scanner;
public class Temperaturamedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		int temp[]= new int [12];
		String meses[]= new String[12] ;
		meses[0]="Enero";
		meses[1]="Febrero";
		meses[2]="Marzo";
		meses[3]="Abril";
		meses[4]="Mayo";
		meses[5]="Junio";
		meses[6]="Julio";
		meses[7]="Agosto";
		meses[8]="Septiembre";
		meses[9]="Octubre";
		meses[10]="Noviembre";
		meses[11]="Diciembre";
	
		for(int i=0;i<12;i++) {
			System.out.println("Introduce la temperatura de "+meses[i]+": ");
			temp[i]= entrada.nextInt();		
			}
	    System.out.print("Enero     : ");
		for(int i=0;i<temp[0];i++) {
			System.out.print("*");}
		System.out.println();
		 System.out.print("Febrero   : ");
		for(int i=0;i<temp[1];i++) {
			System.out.print("*");}
		System.out.println();
		 System.out.print("Marzo     : ");
		for(int i=0;i<temp[2];i++) {
			System.out.print("*");}
		System.out.println();
		 System.out.print("Abril     : ");
		for(int i=0;i<temp[3];i++) {
			System.out.print("*");}
		System.out.println();
		 System.out.print("Mayo      : ");
		for(int i=0;i<temp[4];i++) {
			System.out.print("*");}
		System.out.println();
		 System.out.print("Junio     : ");
		for(int i=0;i<temp[5];i++) {
			System.out.print("*");}
		System.out.println();
		 System.out.print("Julio     : ");
		for(int i=0;i<temp[6];i++) {
			System.out.print("*");}
		System.out.println();
		 System.out.print("Agosto    : ");
		for(int i=0;i<temp[7];i++) {
			System.out.print("*");}
		System.out.println();
		 System.out.print("Septiembre: ");
		for(int i=0;i<temp[8];i++) {
			System.out.print("*");}
		System.out.println();
		 System.out.print("Octubre   : ");
		for(int i=0;i<temp[9];i++) {
			System.out.print("*");}
		System.out.println();
		 System.out.print("Noviembre : ");
		for(int i=0;i<temp[10];i++) {
			System.out.print("*");}
		System.out.println();
		 System.out.print("Diciembre : ");
		for(int i=0;i<temp[11];i++) {
			System.out.print("*");}


		entrada.close();
	}

}


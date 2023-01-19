package ejercicios;

import java.util.Scanner;

public class Ejemploprocedimiento {
	final static double libras = 0.86;
    final static double dolares = 1.28611;
    final static double yenes = 129.852;
    static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		double resultado=convertir();
	    int eleccion=eleccion();
        double euros=euros_introducidos();
        resultadofinal(euros,resultado);
        
	}
	
	public static double euros_introducidos() {
		double euros =0;
		System.out.println("Introduce la cantidad a convertir: ");
	    euros= entrada.nextDouble();
	    return euros;
	}
	public static int eleccion() {
		int eleccion=0;
		System.out.println("1-Dolares\n2-Yenes\n3-Libras");
		eleccion = entrada.nextInt();
		return eleccion;
	}
	
	public static void resultadofinal (int eleccion,double euros,double resultado) {
		double resultado=0;
		if(eleccion==1) {
			resultado=euros*dolares;
		}
		else if(eleccion==2) {
			resultado=euros*yenes;
		}
		else
			resultado=euros*libras;
		return resultado;}

}

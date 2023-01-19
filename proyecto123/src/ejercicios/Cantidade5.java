package ejercicios;

import java.util.Scanner;

public class Cantidade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 1.000.000: "); //solicitud del numero
        int numero = entrada.nextInt();
        int cantidad = 0;    //inicializacion de la variable cantidad    	
        while(numero>0&&numero<1000000) {   //requisitos para entrar en el bucle        	
        	if(numero%10==5) {     //si este if es true se suma 1 a la cantidad de 5
        		cantidad++;
        		numero=numero/10;
        	}
        	else {    //si el if es false se divide entre 10 para comprobar el siquiente numero
        		numero=numero/10;
        	}
        }     	  	
        System.out.println("Hay "+cantidad+" cincos en el numero introducido.");
        entrada.close();
	}
}

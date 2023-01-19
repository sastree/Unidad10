package sentenciaif;
import java.util.Scanner;
public class Comida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//precios constantes, comida refresco postre,tortilla lentejas ,agua cerveza, helado o flan. +15 descuento 3%, despues del total cuanto dinero tiene.
        Scanner entrada = new Scanner(System.in);
        final double preciotortilla = 6.50;
		final double preciolentejas = 10;
		final double precioagua = 1;
		final double preciocerveza = 3;
		final double preciohelado = 4;
		final double precioflan = 3;
		double cuenta = 0;
		String bebidas = "Bebidas";
		String postres = "Postres";
		String menu = "MENU";
		String tortilla = "tortilla";
		String lentejas = "lentejas";
		String agua = "agua";
		String cerveza = "cerveza";
		String helado = "helado";
		String flan = "flan";
        System.out.printf("%25s\n-------------------------------------------------\nEntrantes %16s %15s\n1.Tortilla: %1s    1.Agua: %1s     1.Helado: %1s   \n2.Lentejas: %1s   2.Cerveza: %1s  2.Flan: %1s\n-------------------------------------------------\n",menu,bebidas,postres,preciotortilla,precioagua,preciohelado,preciolentejas,preciocerveza,precioflan);
        
        //PETICION DE ENTRANTE
        
		System.out.println("Entrante: ");
		String respuesta1 = entrada.nextLine();
		if(respuesta1.toLowerCase().equals(tortilla)) {
			cuenta=preciotortilla+cuenta;}
		else if(respuesta1.toLowerCase().equals(lentejas))
			    cuenta=preciolentejas+cuenta;
		else {System.out.println("Introduzca una opcion valida.");
	          System.exit(0);}
			
		//PETICION DE BEBIDA
		System.out.println("Bebida: ");
		String respuesta2 = entrada.nextLine();
		if(respuesta2.toLowerCase().equals(agua)) {
			cuenta=precioagua+cuenta;}		
		else if(respuesta2.toLowerCase().equals(cerveza))
			    cuenta=preciocerveza+cuenta;
		else {System.out.println("Introduzca una opcion valida.");
	          System.exit(0);}
			
		//PETICION DE POSTRE
		System.out.println("Postre: ");
		String respuesta3 = entrada.nextLine();
		if(respuesta3.toLowerCase().equals(helado)) {
			cuenta=cuenta+preciohelado;}		
		else if(respuesta3.toLowerCase().equals(flan))
			    cuenta=cuenta+precioflan;
		else {System.out.println("Introduzca una opcion valida.");
		      System.exit(0);}
	    //APLICACION DE DESCUENTO SI ES OPORTUNO
		if(cuenta>=15) {
			cuenta=cuenta-(cuenta*0.03);}
		//COMPROBACION DE SALDO SUFICIENTE
		System.out.println("De cuanto dinero dispones: ");
		double dinero = entrada.nextDouble();
		if(dinero>cuenta) {
			System.out.println("Disfrute de su comida.\n");}	
		else {System.out.println("Pedido cancelado.");
		       System.exit(0);}
		double vueltas = dinero-cuenta;
			
		//FRASE FINAL     
		System.out.println("Ha elegido: "+respuesta1+" de entrante, "+respuesta2+" de bebida y "+respuesta3+" de postre.\nEl total sera: "+cuenta+" euros.");
		System.out.println("El cambio sera de: "+vueltas+" euros.");
		entrada.close();
		
		
	}

}

package proyecto1;

import java.util.Scanner;

public class TareaUD1 {

	public static void main(String[] args) {
		
        // Ejercicio 1, SALUDO
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Hola "+nombre+".");
		
		
	    // Ejercicio 2, SUMA
		int suma = 2 + 2;
		System.out.println("2 + 2 = "+suma);
		
		//Ejercicio 3, INTERCAMBIO
		int num1 = 5;
		int num2 = 8;
		System.out.println("num1="+num1+" y num2="+num2);
		
		num1 = num2;
		num2 = 5;
		
		System.out.println("num1="+num1+" y num2="+num2);
		
		//Ejercicio 3, Multiplica Constante
		double numero = 6.5;
		final double numero2 = 7.8;
		System.out.printf("%.2f \n",numero*numero2);
		
		//Ejercicio 4,División con decimales
		double n1 = 5;
		double n2 = 2;
		System.out.println("n1=5");
		System.out.println("n2=2");
		double division = n1/n2;
		System.out.println("n1/n2= "+division);
		
		//Ejercicio 5, Envoltorio Integer
		String numeroTexto = "100";
		int stringaint = Integer.parseInt(numeroTexto);
		int masUno = stringaint + 1;
		System.out.println(masUno);
		
		//Ejercicio 6, Operadores Aritmeticos 
		byte valor1 = 4;
		byte valor2 = 2;
		
		System.out.println(valor1+" + "+valor2+" = "+(valor1+valor2));
		System.out.println(valor1+" - "+valor2+" = "+(valor1-valor2));
		System.out.println(valor1+" * "+valor2+" = "+(valor1*valor2));
		System.out.println(valor1+" / "+valor2+" = "+(valor1/valor2));

		//Ejercicio 7, Division y Modulo
		System.out.println("45 / 10 = "+(45/10)); // divide 45 entre 10 y muestra el resultado
		System.out.println("45 % 10 = "+(45%10)); // muestra el resto de la division 45/10
		// utilidad: crear un programa para pasar de segundos a horas minutos y segundos.
		
		//Ejercicio 8, Edad y Peso
		System.out.println("Indica tu edad: ");
		int edad = entrada.nextInt();
		System.out.println("Indica tu peso: ");
		double peso = entrada.nextDouble();
		int edadfinal = edad + 1;
		double doblepeso = peso*2;
		System.out.println("Con un año mas tendras "+edadfinal+" y el doble de tu peso seria "+doblepeso+" kg.");
		
		
	
		
		
		entrada.close();
	}

}

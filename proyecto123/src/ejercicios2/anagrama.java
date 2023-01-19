package ejercicios2;
import java.util.Arrays;
import java.util.Scanner;
public class anagrama {
static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		String palabra[]=new String[2];
		for(int i=0;i<palabra.length;i++) {
			System.out.println("Palabra "+(i+1)+": "); //pido las palabras al usuario
			palabra[i]=entrada.nextLine();
			palabra[i]=palabra[i].toUpperCase();//paso la palabra a mayusculas para ver si es una palabra o un numero
			while(!palabra[i].matches("[A-Z]*")){ //si es un numero y no una palabra pido la palabra otra vez (esto lo he aprendido de google)
				System.out.println("Introduce una opcion valida.");
				System.out.println("Palabra "+(i+1)+": ");
				palabra[i]=entrada.nextLine();
			}
		}
		String palabra_minusculas []=new String[2]; // creo el array de las palabras en minusculas
		palabra_minusculas[0]=palabra[0].toLowerCase();
		palabra_minusculas[1]=palabra[1].toLowerCase();  //las paso a minusculas
		
		char letras1[]= palabra_minusculas[0].toCharArray();//las paso a char para poder usar letra por letra
	    char letras2[]= palabra_minusculas[1].toCharArray();
	    
		Arrays.sort(letras1); //ordeno las letras
		Arrays.sort(letras2);
		
		
		int cuenta=0;       //inicializo la variable cuenta
		for(int i=0;i<letras1.length;i++) {
			if(letras1.length!=letras2.length) {  //si las palabras no tienen el mismo numero de letras no sera posible el anagrama 
				System.out.println("NO");
				System.exit(i);
			}
			if(letras1[i]==letras2[i]) {     //comparo letra por letra
				cuenta++;
			}
	    }
		if(cuenta==letras1.length) {
			System.out.println("SI");   //si la cuenta es igual a la longitud de la palabra es que todas las letras son iguales
			                                           
		}
		else
			System.out.println("NO"); 
    }
}



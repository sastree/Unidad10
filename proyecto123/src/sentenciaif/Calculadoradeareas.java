package sentenciaif;


import java.util.Scanner;

public class Calculadoradeareas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		   Scanner entrada = new Scanner(System.in);
		   double area = 0;
           System.out.println("--------------\n|1.Cuadrado  |\n|2.Rectangulo|\n|3.Triangulo |\n|4.Circulo   |\n--------------\nIntrocuce un numero para elegir figura: ");
           int eleccion = entrada.nextInt();
           if(eleccion!=1&&eleccion!=2&&eleccion!=3&&eleccion!=4) { //if por si no elige ninguna opcion
        	   System.out.println("Eres tonto.");
           }             
           else if(eleccion==1) {      //calculo del cuadrado
        	   System.out.println("Introduce el lado del cuadrado: ");
                double ladocuadrado = entrada.nextDouble();
                 area = ladocuadrado*ladocuadrado;
		      
           }
		   else if(eleccion==2) {       //calculo del rectangulo
			   System.out.println("Introduce la altura del rectangulo: ");
			   double alturarectangulo = entrada.nextDouble();
			   System.out.println("Introduce la base del rectangulo: ");
			   double baserectangulo = entrada.nextDouble();
			    area = baserectangulo*alturarectangulo;
			  
		   }
		   else if(eleccion==3) {          //calculo del triangulo
			   System.out.println("Introduce la altura del triangulo: ");
			   double alturatriangulo = entrada.nextDouble();
			   System.out.println("Introduce la base del triangulo: ");
			   double basetriangulo = entrada.nextDouble();
			    area = (basetriangulo*alturatriangulo)/2;
				   
		   }
		   else {     //calculo del circulo
			   System.out.println("Introduce el radio del circulo: ");
               double radiocirculo = entrada.nextDouble();
                area = Math.PI*(radiocirculo*radiocirculo);
             
		   }
			   
	System.out.printf("El area es de : %.2f cm^2.",area);	       
		entrada.close();
	}

}

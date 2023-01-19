package sentenciaif;


import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		   Scanner entrada = new Scanner(System.in);
		   double area = 0;
           System.out.println("--------------\n|1.Cuadrado  |\n|2.Rectangulo|\n|3.Triangulo |\n|4.Circulo   |\n--------------\nIntrocuce un numero para elegir figura: ");
           int eleccion = entrada.nextInt();
           switch(eleccion)                	   
               {  
               case 1:      //calculo del cuadrado
        	   System.out.println("Introduce el lado del cuadrado: ");
               double ladocuadrado = entrada.nextDouble();
               area = ladocuadrado*ladocuadrado;	      
               break;
               
               case 2:         //calculo del rectangulo
			   System.out.println("Introduce la altura del rectangulo: ");
			   double alturarectangulo = entrada.nextDouble();
			   System.out.println("Introduce la base del rectangulo: ");
			   double baserectangulo = entrada.nextDouble();
			   area = baserectangulo*alturarectangulo;		  
		       break;
		       
               case 3:          //calculo del triangulo
			   System.out.println("Introduce la altura del triangulo: ");
			   double alturatriangulo = entrada.nextDouble();
			   System.out.println("Introduce la base del triangulo: ");
			   double basetriangulo = entrada.nextDouble();
			   area = (basetriangulo*alturatriangulo)/2;				   
		       break;
		       
		       case 4: 
			   System.out.println("Introduce el radio del circulo: ");
               double radiocirculo = entrada.nextDouble();
               area = Math.PI*(radiocirculo*radiocirculo);		  
               break;
               
               default:        
    	       System.out.println("Eres tonto.");
           
               }
               if(eleccion>=1&&eleccion<=4)  
               {  
	           System.out.printf("El area es de : %.2f cm^2.",area);	
               }
		       entrada.close();
	           }
               }

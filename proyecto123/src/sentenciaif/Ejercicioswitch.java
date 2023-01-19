package sentenciaif;

import java.util.Scanner;

public class Ejercicioswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime tu signo del zodiaco: ");
        String signo = entrada.nextLine();
        switch (signo.toLowerCase())
        {
        case "aries":
        System.out.println("Naciste entre el 21 de Marzo y el 20 de Abril");
        break;
        
        case "tauro":
        System.out.println("Naciste entre el 21 de Abril y el 20 de Mayo");
        break;
        
        case "geminis":
        System.out.println("Naciste entre el 21 de Mayo y el 20 de Junio");
        break;
        
        case "cancer":
        System.out.println("Naciste entre el 21 de Junio y el 20 de Julio");
        break;
        
        case "leo":
        System.out.println("Naciste entre el 21 de Julio y el 20 de Agosto");
        break;
            
        case "virgo":
        System.out.println("Naciste entre el 21 de Agosto y el 20 de Septiembre");
        break;
        
        case "libra":
        System.out.println("Naciste entre el 21 de Septiempre y el 20 de Octubre");
        break;
        
        case "escorpio":
        System.out.println("Naciste entre el 21 de Octubre y el 20 de Noviembre");
        break;
        
        case "sagitario":
        System.out.println("Naciste entre el 21 de Noviembre y el 20 de Diciembre");
        break;
        
        case "capricornio":
        System.out.println("Naciste entre el 21 de Diciembre y el 20 de Enero");
        break;
        
        case "acuario":
        System.out.println("Naciste entre el 21 de Enero y el 20 de Febrero");
        break;
        
        case "piscis":
        System.out.println("Naciste entre el 21 de Febrero y el 20 de Marzo");
        break;
        
        default:
        System.out.println("Mejor");
        }
        entrada.close();
	    }
        }

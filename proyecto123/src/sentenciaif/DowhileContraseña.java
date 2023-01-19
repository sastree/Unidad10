package sentenciaif;
import java.util.Scanner;
public class DowhileContraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		final String contra = "Admin";	  
        String clave = "";
        int cuenta = 0;
        do {
        	System.out.println("Contraseña: ");
        	clave = entrada.nextLine();
        	cuenta++;
        }while(!clave.equals(contra)&&cuenta<=2);{
        	System.out.println("Contraseña incorrecta. Te quedan "+(3-cuenta)+" intentos.");
        
    	
    	
        if(cuenta<3)
        	System.out.println("Contraseña correcta.");
        else    	
            System.out.println("Te quedan 0 intentos.");
        	
        	
        entrada.close();
	}

}
}

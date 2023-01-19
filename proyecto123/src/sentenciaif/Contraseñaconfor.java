package sentenciaif;
import java.util.Scanner;
public class Contraseñaconfor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);	
		final String contra = "sastre";
		for(int i = 0;i<=2;i++) {
			System.out.println("Contraseña: ");
			String respuesta = entrada.nextLine();
			if(!respuesta.equals(contra)) {
				System.out.println("Contraseña incorrecta. Intentos restantes "+(2-i));}	
			else {
				System.out.println("Correcto.");
			    System.exit(i);}		
		         }	    
             entrada.close();
	}
}

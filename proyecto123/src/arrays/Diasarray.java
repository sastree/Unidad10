package arrays;

import java.util.Scanner;

public class Diasarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String dias [] = new String [7];
		
		for(int i=0;i<=6;i++) {
		
		System.out.println("Dime el nombre del dia "+(i+1)+": ");
		dias[i]= entrada.nextLine();	
		}
		for(int i=6;i>=0;i--) {
			System.out.print(dias[i]+" ");
		}
	    for(int i=0;i<=6;i+=2) {
	    	System.out.print("\n"+dias[i]+" ");
	    }
	    	
       entrada.close();
	}

}

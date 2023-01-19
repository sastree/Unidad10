package arrays;

public class Primerarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         int sueldos [] = new int [5];
         //forma 1
         sueldos[0]=1200;
         sueldos[1]=750;
         sueldos[2]=820;
         sueldos[3]=550;
         sueldos[4]=450;
         //forma 2
         int sueldos1 [] = {1200,750,820,550,450}; 
         System.out.println(sueldos.length); //numero de sueldos
         System.out.println(sueldos[2]); //
         System.out.println("La ultima posicion del array es: "+(sueldos1.length-1));
	}

}

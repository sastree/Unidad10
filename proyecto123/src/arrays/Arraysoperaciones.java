package arrays;

public class Arraysoperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero[]= new int[20];
		int cuadrado[]= new int[20];
		int cubo[]= new int[20];
		
		for(int i=0;i<numero.length;i++) {
			numero[i]=(int)Math.random()*100;
			cuadrado[i]=(int)Math.random()*100;
			cubo[i]=(int)Math.random()*100;
		}
		for(int elemento:numero) {
			System.out.println(elemento+" ");
	    }  
		for(int elemento:cuadrado) {
			System.out.println(elemento+" ");
	    }
		for(int elemento:cubo) {
			System.out.println(elemento+" ");

	    }

}
}
package paquetestringbuilder;

public class Clasestringbuilder {

	public static void main(String[] args) {
		StringBuilder string = new StringBuilder("Primer StringBuilder");
		string.append(" en java");
	    System.out.println(string.length());
		string.insert(6, " unico");
		System.out.println(string);
		System.out.println(string.length());
		System.err.println("hola");
		System.out.println(string.capacity());
		System.out.println(string.reverse());
		string.reverse();
		System.out.println(string.toString().toUpperCase());
		
	}

}


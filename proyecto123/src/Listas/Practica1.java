package Listas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


import javax.annotation.processing.SupportedSourceVersion;

public class Practica1 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los nombres: ");
        String nombres = entrada.nextLine();
        String nombresarray[]=nombres.split(" ");
        List<String> lista = Arrays.asList(nombresarray);
        System.out.println(lista);
        System.out.println("Introduce un nombre a buscar: ");
        String busqueda = entrada.nextLine();
        
        if(lista.indexOf(busqueda)==-1) {
        	System.err.println("Ese nombre no esta en la lista.");
        }else
        	System.out.println(busqueda+" esta en la posicion: "+lista.indexOf(busqueda));
       
        
        
        
        entrada.close();
	}
}

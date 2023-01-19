package Listas;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistvsLinkenlist {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<>();
        LinkedList<String> linked = new LinkedList<>();
        long tiempo;
        for(int i=0;i<10000;i++) {
        	arraylist.add("palabra"+i);
        	linked.add("palabra"+i);
        	
        }
        System.out.println("Tiempos: ");
        tiempo= System.nanoTime();
        arraylist.add("PALABRA");        
        System.out.println("ArrayList: "+(System.nanoTime()-tiempo));
        
        tiempo= System.nanoTime();
        linked.add("PALABRA");
        System.out.println("LinkedList: "+(System.nanoTime()-tiempo));
	}

}

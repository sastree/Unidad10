package colas;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Colasej1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    List<Integer> lista = Arrays.asList(3,4,5,6,7,8);
		LinkedList<Integer> listagen = new LinkedList<>(lista);
        System.out.println(listagen);
        listagen.addFirst(2);
        System.out.println(listagen);
        listagen.addLast(9);
        System.out.println(listagen);
        listagen.addFirst(1);
        System.out.println(listagen);
        listagen.addLast(10);
        System.out.println(listagen);
        listagen.removeFirst();
        listagen.removeLast();
        listagen.removeFirst();
        System.out.println(listagen);
	}

}

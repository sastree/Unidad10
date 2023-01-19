package colas;

import java.util.ArrayDeque;

public class Coladoble {

	public static void main(String[] args) {
		int [] listadoInicial = {1,2,3,4,5,6,7,8,9,10};
		ArrayDeque<Integer> ListadoFinal = new ArrayDeque<>();
		for(int i=0;i<listadoInicial.length;i++) {
			if(listadoInicial[i]%2==0) {
				ListadoFinal.addFirst(listadoInicial[i]);
				
			}
			else {
				ListadoFinal.addLast(listadoInicial[i]);
			}
		}
		System.out.println(ListadoFinal);
		}
	

	}



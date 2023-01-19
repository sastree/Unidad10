package ejercicioscomplementarios;

import java.util.Arrays;

public class arraybidimnumaltobajo {
	static int array[][] = new int[6][10];
	static int coordmayor1 = 0;
	static int coordmayor2 = 0; // inicializo los valores para la localizacion de los numeros
	static int coordmenor1 = 0;
	static int coordmenor2 = 0;

	public static void main(String[] args) {
		int menor = 0;
		int mayor = 0; // inicializo los numeros

		array = generar_array();
		menor = num_menor();
		mayor = num_mayor();

		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i])); // imprimo el array
		}
		System.out.println("El mayor es " + mayor + ", que se encuentra en la posicion (" + coordmayor1 + ","
				+ coordmayor2 + ") y el menor es " + menor + ", que se encuentra en la posicion (" + coordmenor1 + ","
				+ coordmenor2 + ")."); // imprimo el resultado
	}

	public static int[][] generar_array() { // relleno el array con numeros aleatorios (0-1000)
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 1000);
			}
		}
		return array; // devuelvo los el array con valores al main
	}

	public static int num_menor() { // encuentro el numero menor untilizando el max_value
		int menor = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < menor) {
					menor = array[i][j];
					coordmenor1 = i; // guardo la posicion del numero menor
					coordmenor2 = j;
				}
			}
		}
		return menor;// devuelvo el resultado
	}

	public static int num_mayor() { // encuentro el numero menor untilizando el min_value
		int mayor = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > mayor) {
					mayor = array[i][j];
					coordmayor1 = i; // guardo la posicion del numero mayor
					coordmayor2 = j;

				}
			}
		}
		return mayor; // devuelvo el resultado
	}
}
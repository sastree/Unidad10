package ejercicioscomplementarios;

import java.util.Arrays;
import java.util.Scanner;

public class Arraymultidimsuma {
	static Scanner entrada = new Scanner(System.in);
	static int array[][] = new int[5][6]; // inicializo el array

	public static void main(String[] args) {

		array = valores_array(); // doy los valores de las funciones
		int suma = 0;
		int suma2 = suma_array(suma);
		array[4][5] = suma2;
		array = suma_filas();
		array = suma_columnas();
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i])); // imprimo el array
		}
	}

	public static int[][] valores_array() { // pido al usuario los valores del array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j < 5 && i < 4) {
					System.out.println("Valor para(" + i + "," + j + "):");
					array[i][j] = entrada.nextInt();
				}
			}
		}
		return array; // devuelvo el array con valores al main
	}

	public static int suma_array(int suma) {// sumo los valores y lo guardo en la esquina inferior derecha
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j < 5 && i < 4) {

					suma += array[i][j];
				}
			}
		}
		return suma;
	}

	public static int[][] suma_filas() { // sumo las filas y lo guardo y la ultima columna
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][array.length] += array[i][j];
			}
		}
		return array;
	}

	public static int[][] suma_columnas() { // sumo las columnas y lo guardo en la ultima fila
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length; j++) {
				array[array.length - 1][j] += array[i][j];

			}
		}
		return array;
	}
}

package reto;

import java.util.Scanner;

public class Reto2 {

	static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		while (CasoDePrueba())
			;
	}

	public static boolean CasoDePrueba() {

		String hora = entrada.nextLine();

		while (!hora.equals("00:00")) {

			String hora1[] = hora.split(":");
			int horas = Integer.parseInt(hora1[0]);
			int min = Integer.parseInt(hora1[1]);
			int resul1 = ((24 - horas) * 60) - 60;
			int resul2 = 60 - min;
			int resultado = resul1 + resul2;
			System.out.println(resultado);
			hora = entrada.nextLine();
		}
		return false;
	}
}

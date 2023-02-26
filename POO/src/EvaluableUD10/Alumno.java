package EvaluableUD10;

import java.util.*;

public class Alumno {
	Scanner entrada = new Scanner(System.in);
	private String nombre; // establecemos atributos de la clase
	private String curso;
	private int asignaturas;
	private int[] notas;

	public Alumno(String nombre, String curso, int asignaturas) { // Primer constructor (nombre, curso, asignaturas)
		this.nombre = nombre;
		this.curso = curso;
		this.asignaturas = asignaturas;
		this.notas = new int[asignaturas]; // la longitud del array de notas es el numero de asignaturas
	}

	public Alumno(String nombre, String curso) { // segundo constructor (nombre y curso)
		this.nombre = nombre;
		this.curso = curso;
		asignaturas = 5; // las asignaturas por defecto son 5
		this.notas = new int[asignaturas];
	}

	public Alumno(String nombre) {
		this.nombre = nombre;
		this.curso = "DAM"; // el curso por defecto es DAM
		this.asignaturas = 5;
		this.notas = new int[asignaturas];

	}

	public String getNombre() { // getter del nombre del alumno
		return nombre;
	}

	public void cambiarNombre() { // setter para cambiar el nombre del alumno
		System.out.println("Corregir nombre de " + nombre + ":");
		nombre = entrada.nextLine();
	}

	public String getCurso() { // getter para el curso
		return curso;
	}

	public void cambiarCurso() { // setter para cambiar de curso
		System.out.println("Cambiar curso de " + nombre + ": ");
		curso = entrada.nextLine();
	}

	public void getNotas() { // getter de las notas
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota numero " + (i + 1) + ": " + notas[i]);
		}
	}

	public double media() { // metodo para calcular la media de las notas del alumno
		double media = 0.0;
		for (int i = 0; i < notas.length; i++) {
			media = media + notas[i];
		}
		media = media / notas.length;

		return media;
	}

	public void setNotas() { // setter para establecer las notas del alumno o cambiarlas
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota numero " + (i + 1) + " de " + nombre + ": ");
			this.notas[i] = entrada.nextInt();
		}

	}

	public void cambiarNumeroAsignaturas() { // setter para cambiar el numero de asignaturas
		System.out.println("Nuevo numero de asignaturas de " + nombre + ": ");
		this.asignaturas = entrada.nextInt();
	}

	public int getAsignaturas() { // getter para el numero de asignaturas
		return asignaturas;
	}

}

package EvaluableUD10;

import java.util.*;

public class PruebaAlumno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Alumno Alejandro = new Alumno("Alejandro", "DAW", 5);
		Alumno Pablo = new Alumno("Pablo", "DAW");
		Alumno Alex = new Alumno("Alex");

		// 2 metodos en el objeto Alejandro
		Alejandro.setNotas();
		Alejandro.getNotas();

		System.out.println("La media de " + Alejandro.getNombre() + " es: " + Alejandro.media());

		// 2 metodos en el objeto Pablo
		System.out.println("Nombre: " + Pablo.getNombre());
		Pablo.cambiarNombre();
		System.out.println("Nombre: " + Pablo.getNombre());

		System.out.println("Curso de " + Pablo.getNombre() + ": " + Pablo.getCurso());
		Pablo.cambiarCurso();
		System.out.println("Curso de " + Pablo.getNombre() + ": " + Pablo.getCurso());

		// 1 metodo en el objeto Alex
		System.out.println("Numero de asignaturas de " + Alex.getNombre() + ": " + Alex.getAsignaturas());
		Alex.cambiarNumeroAsignaturas();
		System.out.println("Numero de asignaturas de " + Alex.getNombre() + ": " + Alex.getAsignaturas());

		entrada.close();

	}

}

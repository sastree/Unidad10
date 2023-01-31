package maps;

import java.util.*;

public class PrimerTreeMap {
	static int opcion;
	static Scanner entrada;
	static TreeMap<String, Integer>agenda;
    
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		agenda = new TreeMap<>();
		agenda.put("Arenita", 633488851);
		agenda.put("Señor Crangejo", 12345678);
		agenda.put("Punchis", 9182354);
		agenda.put("Patricio Estrella", 12837593);
		agenda.put("Bob Esponja", 91726482);
		menu();
		
			opciones();
			menu();
		
		System.err.println("Agenda cerrada.");
	}
public static void menu() {
	System.out.println(
			"**** APLICACIÓN MÓVIL ****\n1. Ver contactos\n2. Añadir contacto\n3. Modificar contacto\n4. Eliminar contacto\n5. Buscar contacto\n6. Mostrar todos los contactos desde una letra dada\n7. Salir");
	System.out.println("Opcion: ");
	opcion = entrada.nextInt();
	
}
public static void opcion1() {
	
	Iterator<String> nombres = agenda.keySet().iterator();
	while (nombres.hasNext()) {
		String nombre = nombres.next();
		System.out.println(nombre + " -> " + agenda.get(nombre));

	}
	
}
public static void opcion2() {
	System.out.println("Nombre del nuevo contacto (si quieres cancelar, escribe 'x'): ");
	String nuevo = entrada.nextLine();
	if(nuevo.isEmpty()) {
		nuevo = entrada.nextLine();
	}
	if(!nuevo.equals("x")) {
	if(!agenda.containsKey(nuevo)) {
	
	System.out.println("Numero del nuevo contacto: ");
	int nuevonum = entrada.nextInt();
	agenda.put(nuevo, nuevonum);
	}else
		System.out.println("Ese contacto ya existe.");
	}

}
public static void opcion3() {
	Iterator<String> nombres2 = agenda.keySet().iterator();
	while (nombres2.hasNext()) {
		String nombre2 = nombres2.next();
		System.out.println(nombre2);
	}
	System.out.println("Que contacto quieres modificar (si quieres cancelar, escribe 'x'): ");
	String mod = entrada.nextLine();
	if(mod.isEmpty()) {
		mod = entrada.nextLine();
	}
	if(!mod.equals("x")) {
	if(agenda.containsKey(mod)) {
		System.out.println("Nuevo numero: ");
		int nuevonummod = entrada.nextInt();
		agenda.put(mod, nuevonummod);
		System.out.println("Contacto modificado correctamente.");
	}
	
	else {
		System.out.println("El contacto llamado '"+mod+"' no existe.");
	}
	}
}
public static void opcion4() {
	System.out.println("Que contacto quieres eliminar (si quieres cancelar, escribe 'x'): ");
	String elim = entrada.nextLine();
	
	if(elim.isEmpty()) {
		elim = entrada.nextLine();
	}
	if(!elim.equals("x")) {
	agenda.remove(elim);
	System.out.println("Contacto eliminado con exito.");
	}
}
public static void opcion5() {
	System.out.println("Que contacto quieres buscar: "); 
	String busqueda = entrada.nextLine();
	if(busqueda.isEmpty()) {
		busqueda = entrada.nextLine();
	}
	if(agenda.containsKey(busqueda)) {
		System.out.println("El contacto "+busqueda+" si se encuentra en su agenda.");
	}
	else
		System.out.println("El contacto "+busqueda+" no se encuentra en su agenda.");
	
}
public static void opcion6() {
	System.out.println("Con que letras quieres filtrar la busqueda: ");//submaps
	String letra1 = entrada.nextLine();
	if(letra1.isEmpty()) {
		letra1 = entrada.nextLine();
	}
	String letra2 = entrada.nextLine();
	if(letra2.isEmpty()) {
		letra2 = entrada.nextLine();
	}
	
	System.out.println(agenda.subMap(letra1, letra2));
	
}
public static void opciones() {
	while (!(opcion == 7)) {
		while (!(opcion == 1) && !(opcion == 2) && !(opcion == 3) && !(opcion == 4) && !(opcion == 5)
				&& !(opcion == 6)&& !(opcion == 7)) {
			System.out.println("Opcion no valida.");
			System.out.println("Opcion: ");
			opcion = entrada.nextInt();
		}

	switch (opcion) {
	case 1:
		opcion1();
		break;
	case 2:
		opcion2();
		break;
	case 3:
		opcion3();
		break;
	case 4:
		opcion4();
		break;
	case 5:
		opcion5();
		break;
	case 6:
		opcion6();
		break;
	}
	}
}
}
	


	



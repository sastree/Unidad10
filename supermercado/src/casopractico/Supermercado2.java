package casopractico;

import java.util.*;

public class Supermercado2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String contra = "123";
		int intentos = 0;
		final String ANSI_GREEN = "\u001B[32m";
		final String ANSI_RESET = "\u001B[0m";
		TreeSet<String> productos = new TreeSet<>(); // inicializo los conjuntos
		TreeSet<String> cesta = new TreeSet<>();
		LinkedList<String> añadidos = new LinkedList<>();
		LinkedList<String> borrados = new LinkedList<>();
		LinkedList<String> modificados = new LinkedList<>();
		productos.add("Leche");// añado los productos con .add
		productos.add("Tomate");
		productos.add("Aceite");
		productos.add("Pan");
		productos.add("Lechuga");
		productos.add("Yogur");
		productos.add("Queso");
		productos.add("Jamon");
		productos.add("Harina");
		productos.add("Champu");
		productos.add("Gel");
		productos.add("Lejia");
		productos.add("Cereales");
		productos.add("Manzana");
		productos.add("Platano");
		productos.add("Zumo");
		productos.add("Pipas");
		productos.add("Patatas");
		productos.add("Mandarina");
		productos.add("Piña");
		System.out.println("********** MENU **********\n\n1. Personal del supermercado\n2. Cliente");
		System.out.println("\nOpcion: ");
		int opcion = entrada.nextInt();// pido la opcion deseada de la lista
		while (!(opcion == 1) && !(opcion == 2)) { // establezco las opciones validas
			System.out.println("Opcion no valida.");
			opcion = entrada.nextInt();
		}
		switch (opcion) { // creo un switch con las posibles opciones
		case 1:
			System.out.println("Contraseña: ");
			String contra2 = entrada.nextLine();
			if (contra2.isEmpty()) {
				contra2 = entrada.nextLine();
			}
			if (contra2.equals(contra)) { // compruebo la contraseña
				System.out.println("Contraseña correcta.");
			}
			while (!contra2.equals(contra)) {
				if (contra2.equals(contra)) {
					System.out.println("contraseña correcta");
				} else {
					intentos++; // sumo 1 intento por cada fallo
					System.out.println("Contraseña incorrecta. Numero de intentos: " + intentos);
					if (intentos == 3) { // si se llega a los 3 fallos se detiene el programa
						System.err.println("Numero de intentos excedido. Acceso denegado.");
						System.exit(opcion);
					}
					System.out.println("Contraseña: ");
					contra2 = entrada.nextLine();

				}
			}
			menu();

			System.out.println("\nOpcion: ");
			int opcion2 = entrada.nextInt();
			while (!(opcion2 == 6)) { // creo un bucle hasta que el usuario decida salir
				while (!(opcion2 == 1) && !(opcion2 == 2) && !(opcion2 == 3) && !(opcion2 == 4) && !(opcion2 == 5)// opciones
																													// validas
						&& !(opcion2 == 6)) {
					System.out.println("Opcion no valida.");
					opcion2 = entrada.nextInt();
				}
				switch (opcion2) { // segundo switch dentro del caso 1 del primer switch
				case 1: // muestro los productos
					for (String i : productos) {
						System.out.println(i);
					}
					menu();
					System.out.println("\nOpcion: ");
					opcion2 = entrada.nextInt();
					break;
				case 2: // pregunto por producto a añadir
					System.out.println("Que producto quieres añadir: ");
					String prodnuevo = entrada.nextLine();
					if (prodnuevo.isEmpty()) {
						prodnuevo = entrada.nextLine();
					}
					if (!productos.contains(prodnuevo)) { // compruebo que el producto no este ya en la lista
						productos.add(prodnuevo); // añado el producto a la lista
						añadidos.add(prodnuevo); // añado el producto al historial de productos añadidos
						System.out.println("Producto añadido.");
					} else {
						System.out.println("Ese producto ya se encuentra en la lista.");
					}
					menu();
					System.out.println("\nOpcion: ");
					opcion2 = entrada.nextInt();
					break;
				case 3: // caso para eliminar productos
					System.out.println("Que producto quieres eliminar: ");
					String prodelim = entrada.nextLine();
					if (prodelim.isEmpty()) {
						prodelim = entrada.nextLine();
					}
					if (!productos.contains(prodelim)) { // compruebo que este en la lista
						System.out.println("Ese producto no esta en la lista.");
					} else {
						productos.remove(prodelim);// borro el producto de la lista
						borrados.add(prodelim); // añado el producto al historial de productos eliminados
						System.out.println("Producto eliminado.");
					}
					menu();
					System.out.println("\nOpcion: ");
					opcion2 = entrada.nextInt();
					break;
				case 4: // pregunto que producto quiere modificar
					System.out.println("Que producto quieres modificar: ");
					String prodmod = entrada.nextLine();
					if (prodmod.isEmpty()) {
						prodmod = entrada.nextLine();
					}
					if (productos.contains(prodmod)) { // compruebo que el producto este en la lista
						modificados.add(prodmod); // añado el producto a modificar en el historial de modificaciones
						productos.remove(prodmod); // borro el antiguo producto
						System.out.println("Nuevo nombre para " + prodmod + ":");
						String nuevoprod = entrada.nextLine();
						productos.add(nuevoprod); // añado el nuevo
						modificados.add(nuevoprod); // añado el nuevo al historial de modificados
					} else {
						System.out.println("Ese producto no esta en la lista.");
					}

					menu();
					System.out.println("\nOpcion: ");
					opcion2 = entrada.nextInt();
					break;
				case 5: // imprimo el historial de cambios generales
					if (!añadidos.isEmpty()) { // compruebo que hay productos añadidos
						System.out.println("Historial de cambios: \nProductos añadidos: ");
						for (String i : añadidos) {
							System.out.println(ANSI_GREEN + "+" + i + ANSI_RESET); // imprimo añadidos
						}
					} else
						System.out.println("Ningun producto añadido.");
					if (!borrados.isEmpty()) { // compruebo que hay productos borrados
						System.out.println("Productos eliminados: ");
						for (String i : borrados) {
							System.err.println("-" + i); // imprimo eliminados
						}
					} else {
						System.out.println("Ningun producto borrado.");
					}
					if (!modificados.isEmpty()) {// compruebo que hay productos modificados
						System.out.println("Productos modificados: ");
						Iterator<String> itmod = modificados.iterator();
						for (int i = 0; i < modificados.size(); i++) {
							if (i % 2 == 0) {
								System.err.println(itmod.next()); // imprimo antiguo nombre en rojo
							} else {
								System.out.println(ANSI_GREEN + itmod.next() + ANSI_RESET); // imprimo nuevo nombre en
																							// verde
							}
						}
					} else
						System.out.println("Ningun producto modificado.");

					menu();
					System.out.println("\nOpcion: ");
					opcion2 = entrada.nextInt();

					break;
				}
			}
			if (opcion2 == 6) { // cierra sesion de empleado

				System.err.println("Sesion cerrada.");
				System.exit(0);

			}

		case 2:
			menu2();
			System.out.println("\nOpcion: ");
			int opcion3 = entrada.nextInt();
			while (!(opcion3 == 6)) {
				while (!(opcion3 == 1) && !(opcion3 == 2) && !(opcion3 == 3) && !(opcion3 == 4) && !(opcion3 == 5)
						&& !(opcion3 == 6)) { // opciones validas
					System.out.println("Opcion no valida.");
					opcion3 = entrada.nextInt();
				}
				switch (opcion3) { // tercer switch dentro de la opcion dos del primer switch
				case 1:
					for (String i : productos) {
						System.out.println(i); // todo los siguiente es muy parecido al codigo ya comentado de
												// SupermercadoMain
					}
					menu2();
					System.out.println("\nOpcion: ");
					opcion3 = entrada.nextInt();
					break;

				case 2:
					System.out.println("Que quieres añadir a la cesta: ");
					String comprar = entrada.nextLine();
					while (!comprar.contains("fin")) {
						comprar = entrada.nextLine();
						if (!comprar.equals("fin")) {
							if (productos.contains(comprar)) {
								if (!cesta.contains(comprar)) {
									cesta.add(comprar);
								} else {
									System.out.println("Ya esta en la cesta.");
								}
							} else {
								System.out.println("Ese producto no esta en la lista.");
							}
						} else {
							menu2();
							System.out.println("Que quieres hacer: ");
							opcion3 = entrada.nextInt();
						}
					}

					break;
				case 3:
					if (!cesta.isEmpty()) {
						System.out.print("Su carrito de la compra contiene:");
						for (String i : cesta) {
							System.out.print(i + " ");
						}
					} else {
						System.out.println("Su carrito de la compra esta vacio.");
					}
					menu2();
					System.out.println("Que quiere hacer: ");
					opcion3 = entrada.nextInt();
					break;

				case 4:
					if (!cesta.isEmpty()) {
						System.out.println("Que producto quiere comprobar: ");
						String pregunta = entrada.nextLine();
						if (pregunta.isEmpty()) {
							pregunta = entrada.nextLine();
						}
						if (cesta.contains(pregunta)) {
							System.out.println("El producto '" + pregunta + "' si se encuentra en su cesta.");
						} else
							System.out.println("El producto '" + pregunta + "' no se encuentra en su cesta.");
						menu2();
						System.out.println("Que quiere hacer: ");
						opcion3 = entrada.nextInt();
					} else {
						System.out.println("Su carrito de la compra esta vacio.");
						menu2();
						System.out.println("Que quiere hacer: ");
						opcion3 = entrada.nextInt();
					}
					break;

				case 5:
					if (cesta.isEmpty()) {
						System.out.println("Su carrito de la compra esta vacio.");
					} else {
						System.out.println("Que producto quiere eliminar del carrito: ");
						String prodelim2 = entrada.nextLine();
						if (prodelim2.isEmpty()) {
							prodelim2 = entrada.nextLine();
						}
						if (cesta.contains(prodelim2)) {
							cesta.remove(prodelim2);
							System.out.println("Producto eliminado del carrito de la compra.");
						} else {
							System.out.println(
									"El producto '" + prodelim2 + "' no se encuentra en su carrito de la compra.");
						}
					}
					menu2();
					System.out.println("Que quiere hacer: ");
					opcion3 = entrada.nextInt();
				}
			}
			break;

		}
		if (!cesta.isEmpty()) {
			System.out.println("¡Gracias por su compra!");
		} else {
			System.out.println("¡Vuelva pronto!");
		}
		entrada.close();

	}

	public static void menu() { // funciones para mostrar los menus
		System.out.println("\n********** MENU **********\n1. Mostrar productos del supermercado"
				+ "\n2. Añadir productos\n3. Eliminar producto\n4. Modificar producto\n5. Historial de cambios\n6. Salir");
	}

	public static void menu2() {
		System.out.println(
				"\n********** MENU **********\n1. Ver productos del supermercado\n2. Añadir productos al carrito\n3. Mostrar carrito de la compra ordenado"
						+ "\n4. Consulta productos del carrito\n5. Eliminar producto\n6. Salir");
	}

}

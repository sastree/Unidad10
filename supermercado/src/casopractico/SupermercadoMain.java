package casopractico;

import java.util.*;

public class SupermercadoMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		TreeSet<String> productos = new TreeSet<>(); // inicializo los conjuntos
		TreeSet<String> cesta = new TreeSet<>();

		System.out.println(
				"     ********** MENU **********\n1. Mostrar productos del supermercado\n2. Añadir productos al carrito\n3. Mostrar carrito de la compra ordenado"
						+ "\n4. Consultar producto de carrito\n5. Cambiar un producto por otro\n6. Salir");
		System.out.println("Que quieres hacer: ");
		int opcion = entrada.nextInt(); // pido la opcion deseada de la lista
		entrada.reset();
		productos.add("Leche"); // añado los productos con .add
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

		while (!(opcion == 6)) { // creo un bucle hasta que el usuario decida salir
			while (!(opcion == 1) && !(opcion == 2) && !(opcion == 3) && !(opcion == 4) && !(opcion == 5)
					&& !(opcion == 6)) { // establezco las unicas opciones validas a contestar
				System.out.println("Opcion no valida.");
				opcion = entrada.nextInt();
			}
			switch (opcion) { // creo un switch con las posibles opciones
			case 1: // imprimo la lista de productos
				for (String i : productos) {
					System.out.println(i);
				}
				menu();
				System.out.println("Que quieres hacer: ");
				opcion = entrada.nextInt();
				break;
			case 2: // pregunto el producto que desea añadir
				System.out.println("Que quieres añadir a la cesta (escriba 'fin' cuando haya terminado): ");
				String comprar = entrada.nextLine();
				while (!comprar.contains("fin")) { // creo un bucle para seguir preguntando hasta que contenga 'fin'
					comprar = entrada.nextLine();
					if (!comprar.equals("fin")) {

						if (productos.contains(comprar)) { // compruebo que el producto este en la lista
							if (!cesta.contains(comprar)) { // compruebo que el producto no este en la cesta
								cesta.add(comprar);
							} else {
								System.out.println("Ya esta en la cesta.");
							}
						} else {
							System.out.println("Ese producto no esta en la lista.");
						}
					} else {
						menu();
						System.out.println("Que quieres hacer: ");
						opcion = entrada.nextInt();
					}
				}

				break;
			case 3: // muestro el contenido del carrito
				if (!cesta.isEmpty()) { // compruebo que no este vacio
					System.out.print("Su carrito de la compra contiene:");
					for (String i : cesta) {
						System.out.print(i + " ");
					}
					menu();
					System.out.println("\nQue quiere hacer: ");
					opcion = entrada.nextInt();
				} else {
					System.out.println("Su carrito de la compra esta vacio.");
				}
				menu();
				System.out.println("Que quieres hacer: ");
				opcion = entrada.nextInt();
				break;
			case 4:
				if (!cesta.isEmpty()) { // compruebo que no este vacio
					System.out.println("Que producto quiere comprobar: ");
					String pregunta = entrada.nextLine();
					if (pregunta.isEmpty()) {
						pregunta = entrada.nextLine();
					}
					if (cesta.contains(pregunta)) { // compruebo si esta en la cesta
						System.out.println("El producto '" + pregunta + "' si se encuentra en su cesta.");
					} else
						System.out.println("El producto '" + pregunta + "' no se encuentra en su cesta.");
					menu();
					System.out.println("Que quiere hacer: ");
					opcion = entrada.nextInt();
				} else {
					System.out.println("Su carrito de la compra esta vacio.");
					menu();
					System.out.println("Que quiere hacer: ");
					opcion = entrada.nextInt();
				}
				break;
			case 5:
				if (cesta.isEmpty()) { // compruebo que no este vacio
					System.out.println("Su carrito de la compra esta vacio.");
				} else {
					System.out.println("Que producto quiere reemplazar: ");
					String reemplazo = entrada.nextLine();
					if (reemplazo.isEmpty()) {
						reemplazo = entrada.nextLine();
					}
					if (cesta.contains(reemplazo)) { // compruebo que el producto en este ya en la cesta

						System.out
								.println("Que otro producto quiere añadir a la cesta en lugar de " + reemplazo + ": ");
						String reemplazo2 = entrada.nextLine();

						cesta.remove(reemplazo); // borro el anterior
						cesta.add(reemplazo2); // añado el nuevo
						System.out.println("Producto reemplazado.");
					} else {
						System.out.println("Ese producto no se encuentra es su carrito de la compra.");
					}
				}
				menu();
				System.out.println("Que quieres hacer: ");
				opcion = entrada.nextInt();
				break;

			}
		}
		if (!cesta.isEmpty()) { // compruebo si el cliente sale con la cesta vacia o no
			System.out.println("¡Gracias por su compra!");
		} else {
			System.out.println("¡Vuelva pronto!");
		}
		entrada.close();

	}

	public static void menu() { // funcion para mostrar los menus
		System.out.println(
				"     \n********** MENU **********\n1. Mostrar productos del supermercado\n2. Añadir productos al carrito\n3. Mostrar carrito de la compra ordenado"
						+ "\n4. Consultar producto de carrito\n5. Cambiar un producto por otro\n6. Salir");
	}

}

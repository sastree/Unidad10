package examen2;

import java.util.*;

public class AlejandroSastre {

	public static void main(String[] args) {
		TreeSet<String> listaMarta = new TreeSet<>();     //treeset para la lista de marta
		HashMap<String, Integer> caja = new HashMap<>();    //hashmap para el ticket
		Scanner entrada = new Scanner(System.in);    
		System.out.println("Hola Juan, introduce tu lista de la compra: ");
		String lista = entrada.nextLine();
		String productos[] = lista.split(",");   //separo por comas
		System.out.print("Listado Juan: ");
		for (int i = 0; i < productos.length; i++) { //recorre los productos
			productos[i] = productos[i].toLowerCase();      //lo paso todo a minusculas
			String mayus = productos[i];
			String letra = mayus.substring(0, 1).toUpperCase();  //separo la primera letra del resto de la palabra y la paso a mayusculas
			String resto = mayus.substring(1);
			String resultado = letra + resto;   //recompongo la palabra
			if (!listaMarta.contains(resultado)) {   //quito los repetidos en la lista de marta
				listaMarta.add(resultado);
			}
			System.out.print(resultado);
			if (!(i == productos.length - 1)) {  //si es el ultimo elemento no hay coma
				System.out.print(", ");
			}
		}
		Iterator<String> martaIt = listaMarta.iterator();  
		System.out.print("\nListado de Marta: ");   //imprimo la lista de marta con un iterator
		while (martaIt.hasNext()) {
			String prod = martaIt.next();
			System.out.print(prod);
			if (martaIt.hasNext()) {   //si es el ultimo no pongo coma
				System.out.print(", ");
			}
		}
		System.out.println("\nRosa pasa los articulos por caja: "); //pregunto los precios con el iterator de antes
		martaIt = listaMarta.iterator();
		while(martaIt.hasNext()) {
			String nombreProd = martaIt.next();
			System.out.print(nombreProd+": ");
			int precio = entrada.nextInt();
			caja.put(nombreProd, precio);  //guardo producto y precio en el hashmap
		}
		Iterator<String> ticket = caja.keySet().iterator();
		System.out.println("TICKET DE COMPRA");  
		int suma=0;
		while(ticket.hasNext()) {   //imprimo el ticket con un iterator
			String ticket2 = ticket.next();
			System.out.println(ticket2+": "+caja.get(ticket2)+"$");
			suma += caja.get(ticket2);  //sumo los precios
		}
		System.out.println("TOTAL: "+suma+"$");
	}
}

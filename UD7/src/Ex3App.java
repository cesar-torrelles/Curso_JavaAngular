import java.util.Hashtable;
import java.util.Scanner;
/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex3App {
	
	public static void a�adirArticulo (Hashtable<String, Double> articulos, Scanner teclado, Hashtable<String, Integer> cantidades) {
		String nombre;
		double precio;
		int cantidad;
		
		System.out.println("Nombre del art�culo? ");
		nombre = teclado.next();
		
		System.out.println("Precio del art�culo? ");
		precio = teclado.nextDouble();
		
		System.out.println("Cantidad en stock? ");
		cantidad = teclado.nextInt();
		
		articulos.put(nombre, precio);
		cantidades.put(nombre, cantidad);
		
		infoArticulos (articulos, cantidades);
		
		System.out.println("Art�culo a�adido!");
	}
	
	public static void infoArticulos (Hashtable<String, Double> articulos, Hashtable<String, Integer> cantidades) {
		for (String i : articulos.keySet()) {
			System.out.println("Articulo: " + i);
			System.out.println("Precio: " + articulos.get(i) + "�");
			System.out.println("En stock: " + cantidades.get(i));
			System.out.println();
		}
	}
	
	public static void infoArticulo (Hashtable<String, Double> articulos, Scanner teclado, Hashtable<String, Integer> cantidades) {
		String articulo;
		
		System.out.println("Sobre que art�culo quieres consultar la informaci�n? ");
		articulo = teclado.next();
		
		System.out.println("Precio: " + articulos.get(articulo));
		System.out.println("En stock: " + cantidades.get(articulo));
		
	}
	
	public static void a�adir_cantidades (Hashtable<String, Integer> cantidades) {
		cantidades.put("Monitor", 5);
		cantidades.put("Teclado mec�nico", 10);
		cantidades.put("Rat�n gaming", 4);
		cantidades.put("Altavoces", 6);
		cantidades.put("Carcasa torre", 8);
		cantidades.put("PC completo", 2);
		cantidades.put("Auriculares", 4);
		cantidades.put("Port�til", 3);
		cantidades.put("Disco duro", 5);
		cantidades.put("Echo dot", 1);
	}
	
	public static void a�adir_articulos (Hashtable<String, Double> articulos) {
		articulos.put("Monitor", 150.0);
		articulos.put("Teclado mec�nico", 50.0);
		articulos.put("Rat�n gaming", 25.99);
		articulos.put("Altavoces", 30.0);
		articulos.put("Carcasa torre", 39.99);
		articulos.put("PC completo", 569.0);
		articulos.put("Auriculares", 29.95);
		articulos.put("Port�til", 599.99);
		articulos.put("Disco duro", 60.0);
		articulos.put("Echo dot", 44.99);
	}
	

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		Hashtable<String, Double> articulos = new Hashtable <>();
		Hashtable<String, Integer> cantidades = new Hashtable <>();
		Scanner teclado = new Scanner (System.in);
		int respuesta;
		
		a�adir_articulos (articulos);
		a�adir_cantidades (cantidades);
		
		//MEN�
		System.out.println("Selecciona una opci�n: ");
		System.out.println("1. Consultar informaci�n sobre un art�culo.");
		System.out.println("2. Ver la informaci�n de todos los art�culos.");
		System.out.println("3. A�adir un nuevo art�culo.");
		respuesta = teclado.nextInt();
		
		switch (respuesta) {
		case 1: infoArticulo (articulos, teclado, cantidades);
		break;
		case 2: infoArticulos (articulos, cantidades);
		break;
		case 3: a�adirArticulo (articulos, teclado, cantidades);
		break;
		default: System.out.println("Introduce una respuesta v�lida.");
		}

	}

}

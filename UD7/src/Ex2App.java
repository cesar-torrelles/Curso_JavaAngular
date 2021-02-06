import java.util.ArrayList;

public class Ex2App {
	
	public static double precioIVA (double precioT, double IVA) {
		double total;
		
		total = precioT + IVA;
		
		return (total);
	}
	
	public static double IVA (double precioT) {
		double IVA;
		
		IVA = precioT * 0.21;
		
		return (IVA);
	}
	
	public static double precio_total (ArrayList<Double> precio) {
		double total = 0;
		for(Double t : precio) {
		    total += t;
		}
		return (total);
	}
	
	public static void a�adir_precios (ArrayList<Double> precio) {
		precio.add(1.5);
		precio.add(2.30);
		precio.add(4.95);
		precio.add(1.25);
		precio.add(5.59);
	}
	
	public static void a�adir_productos (ArrayList<String> compra) {
		compra.add("Agua");
		compra.add("Caf�");
		compra.add("Pollo");
		compra.add("Macarrones");
		compra.add("At�n");
	}

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		ArrayList<String> compra = new ArrayList<>();
		ArrayList<Double> precio = new ArrayList<>();
		double precioT;
		double IVA;
		double precioIVA;
		double efectivo = 20;
		
		a�adir_productos (compra);
		a�adir_precios (precio);
		precioT = precio_total (precio);
		IVA = IVA (precioT);
		precioIVA = precioIVA (precioT, IVA);
		
		//MOSTRAR RESULTADOS
		System.out.println("IVA Aplicado: " + IVA);
		System.out.println("Precio total bruto: " + precioT);
		System.out.println("Precio m�s IVA: " + precioIVA);
		System.out.println("N� de articulos comprados: " + compra.size());
		System.out.println("Efectivo: " + efectivo);
		System.out.println("Cambio a devolver: " + (efectivo - precioIVA));
		

	}

}

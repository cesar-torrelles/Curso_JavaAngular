import java.util.Scanner;

/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex10App {

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		int [] ventas;
		int suma = 0;
		int numVentas;
		Scanner teclado = new Scanner (System.in);
		
		//ENTRADA DE DATOS
		System.out.print("Introduce un n�mero de ventas:");
		numVentas = teclado.nextInt();
		ventas = new int [numVentas];
		
		for (int i = 0; i < ventas.length; i++) {
			System.out.println("Introduce el importe de la venta " + i + ": ");
			ventas [i] = teclado.nextInt();
			suma = suma + ventas [i];
		}
		
		System.out.println("La suma de todas las ventas �s = " + suma);
		teclado.close();
	}

}

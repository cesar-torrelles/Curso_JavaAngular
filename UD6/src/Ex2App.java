import java.util.Scanner;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex2App {
	
	public static void numeros (int cantidad, Scanner teclado) {
		int max, min;
		
		//Preguntamos el intervalo de n�meros.
		System.out.print("Num m�nimo?");
		min = teclado.nextInt();
		
		System.out.print("Num m�ximo?");
		max = teclado.nextInt();
		
		//Imprimimos la cantidad de n�meros aleatorios que hemos dicho anteriormente.
		for (int i = 0; i < cantidad; i++) {
			System.out.println((int)(Math.random()*max+min));
		}
}

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		int cantidad;
		Scanner teclado = new Scanner (System.in);
		
		//Preguntamos cuantos n�meros quiere generar.
		System.out.print("�Cu�ntos n�meros aleatorios quieres generar?");
		cantidad = teclado.nextInt();
		
		numeros (cantidad, teclado);

		teclado.close();
	}

}

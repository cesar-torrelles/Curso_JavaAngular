import java.util.Scanner;

/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex8App {
	
	public static void mostrar_vector (int [] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posici�n: " + i + ", Valor: " + numeros[i]);
		}
	}
	
	public static void llenar_vector (int [] numeros) {
		Scanner teclado = new Scanner (System.in);
		
		for (int i = 0; i < numeros.length; i++) {
		System.out.println("Introduce el valor " + i + ":");
		numeros [i] = teclado.nextInt();
		}
		
		teclado.close();
	}

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		int [] numeros = new int [10];
		
		llenar_vector(numeros);
		mostrar_vector (numeros);
		

	}

}

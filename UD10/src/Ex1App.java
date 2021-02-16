import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1App {

	public static void main(String[] args) {
		//Generamos un n�mero aleatorio
		int numeroAleatorio = (int)(Math. random()*500+1);
		
		//Variable para guardar el n�mero que ingresemos por teclado y contador de intentos
		int numero = 0;
		int intentos = 0;
		Scanner teclado = new Scanner (System.in);

		//Mientras el n�mero que le ingresamos no sea igual al aleatorio
		//nos indicar� si el num es m�s peque�o o m�s grande y contar� los intentos
		try {
			while (numero != numeroAleatorio) {
				System.out.println("Introduce un n�mero:");
				numero = teclado.nextInt();
				intentos++;
				
				if (numero < numeroAleatorio) {
					System.out.println("El n�mero es m�s grande.");
				}
				else {
					System.out.println("El n�mero es m�s peque�o.");
				}
				}
			System.out.println("Lo has adivinado!!");
		}
		
		//Si no introduce un n�mero saltar� el mensaje de error.
		catch (InputMismatchException ex) {
			System.out.println("No has introducido un car�cter v�lido.");
			intentos++;
		}
		
		//Cuando acertemos, nos mostrar� el n�mero de intentos que hemos hecho hasta adivinarlo.
		System.out.println("Has hecho " + intentos + " intentos.");
		
		teclado.close();
	}
}


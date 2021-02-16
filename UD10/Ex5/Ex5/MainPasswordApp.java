package Ex5;
/**
 * @author Ingrid Dominguez
 */
import java.util.Scanner;

public class MainPasswordApp {
	public static void main(String[] args) {
		Password contrase�as []; //Array para guardar las contrase�as
		boolean contrase�aFuerte []; //Array para guardar si son fuertes o no
		int tama�o; //Tama�o de los arrays introducido por teclado
		int longitud; //Longitud de la contrase�a
		Scanner teclado = new Scanner (System.in);
		
		//Preguntamos cuantas contrase�as vamos a generar
		System.out.println("Cuantas contrase�as quieres generar?");
		tama�o = teclado.nextInt();
		
		//Dimensionamos los arrays
		contrase�as = new Password [tama�o];
		contrase�aFuerte = new boolean [tama�o];
		
		//Preguntamos la longitud de las contrase�as
		System.out.println("Introduce la longitud de las contrase�as");
		longitud = teclado.nextInt();
		
		//M�todo para crear las contrase�as
		Metodos.crearContrase�as(longitud, tama�o, contrase�as);
		
		//M�todo para saber si una contrase�a �s fuerte y guardar el resultado en el array
		Metodos.contrase�asFuertes(contrase�as, contrase�aFuerte);
		
		//M�todo para mostrar el array
		Metodos.mostrarArray(contrase�as, contrase�aFuerte);
		
		//Cerramos el teclado
		teclado.close();
	}
}

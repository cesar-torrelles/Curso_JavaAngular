package Ex2;

import java.util.Scanner;

public class MainPasswordApp {

	public static void main(String[] args) {
		int longitud;
		Scanner teclado = new Scanner (System.in);
		
		//Introducimos la longitud de la contrase�a
		System.out.println("Introduce la longitud");
		longitud = teclado.nextInt();
		
		//Creamos el objeto con la longitud
		Password contrase�a1 = new Password (longitud);
		
		//Imprimimos el resultado
		System.out.println(contrase�a1.toString());

		teclado.close();
	}

}

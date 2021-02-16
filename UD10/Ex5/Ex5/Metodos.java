package Ex5;

import java.util.Random;

public class Metodos {
	public static String generarPassword(int longitud){
		// Array de posibles caracteres que contendr� la contrase�a generada
		final char[] caracteres =
		{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
		'Q','R','S','T','U','V','W','X', 'Y','Z',
		'a','b','c','d','e','f','g','e','h','i','j','l','k','m',
		'n','o','p','r','s','t','u','v','w','x','y','z',
		'1','2','3','4','5','6','7','8','9','0',
		'@','#','!','$','�','&','[',']'};

		    // Esta cadena guardar� al final del m�todo la contrase�a generada aleatoriamente
		    String temporal = "";
		
		    Random aleatorio = new Random();
		
		    // Iteramos tantas veces como longitud de caracteres debe tener la contrase�a
		    for(int i = 0; i < longitud ; i++){
		        // En cada iteracci�n a la cadena temporal le asignamos el car�cter
		        // asociado a la posici�n (generada aleatoriamente) del array caracteres
		        temporal += caracteres[aleatorio.nextInt(caracteres.length)];
		    }
		
		    return temporal;
	}
	
	public static void crearContrase�as (int longitud, int tama�o, Password[] contrase�as) {
		for (int i = 0; i < contrase�as.length; i++) {
			contrase�as[i] = new Password (longitud);
		}
	}
	
	public static void contrase�asFuertes (Password [] contrase�as, boolean [] contrase�aFuerte) {
		for (int i = 0; i < contrase�aFuerte.length; i++) {
			contrase�aFuerte[i] = esFuerte(contrase�as[i].contrase�a);
		}
	}
	
	public static boolean esFuerte(String contrase�a) {
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		
		for (char c: contrase�a.toCharArray ()){
			if (Character.isUpperCase(c)) {
				mayusculas++;
			}
			if (Character.isLowerCase(c)) {
				minusculas++;
			}
			if (c == '0' || c == '1' || c == '2' ||	c == '3' || c == '4' || c == '5' ||
				c == '6' || c == '7' || c == '8' || c == '9') {
				numeros++;
			}
		}
	
		if (mayusculas > 2 && minusculas > 1 && numeros >= 5) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void mostrarArray (Password [] contrase�as, boolean [] contrase�aFuerte) {
		for (int i = 0; i < contrase�as.length; i++) {
			System.out.println(contrase�as[i].toString() + " " + contrase�aFuerte[i]);
			}
	}
}
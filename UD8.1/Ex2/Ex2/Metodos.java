package Ex2;

import java.util.Random;

public class Metodos {
	public static String generarContrase�a (int longitud) {
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

}

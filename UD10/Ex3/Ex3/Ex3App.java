package Ex3;

import Excepcion.MiExcepcion;

public class Ex3App {

	public static void main(String[] args) {
		//Generamos un n�mero aleatorio.
		int num = (int)(Math.random()*999+1);
		//Si el n�mero es par nos mostrar� un mensaje, si es impar nos mostar� otro.
		try {
			System.out.println("Generando n�mero aleatorio...");
			System.out.println("El n�mero aleatorio �s: " + num );
			
			if (num % 2 == 0) {throw new MiExcepcion(024);}
			else {throw new MiExcepcion(135);}
		}
		catch (MiExcepcion ex){
			System.out.println(ex.getMessage());
		}
	}

}

package Ex2;

import Excepcion.MiExcepcion;

public class Ex2App {

	public static void main(String[] args) {
		//Nos mostrar� los mensajes de error seg�n el c�digo que tengan
		try {
			System.out.println("Mensaje mostrado por pantalla");
			{throw new MiExcepcion(111);}
		}
		catch (MiExcepcion ex){
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Fin del programa.");
		}

	}

}

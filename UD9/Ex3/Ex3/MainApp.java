package Ex3;

public class MainApp {
	
	//Ejecutamos el m�todo y nos mostrar� la respuesta
	public static void masPaginas (Libro libro1, Libro libro2) {
		
		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println("El libro con m�s p�ginas �s: " + libro1.getNumPaginas());
		}
		else {
			System.out.println("El libro con m�s p�ginas �s: " + libro2.getTitulo());
		}
	}

	public static void main(String[] args) {
		//Objetos
		Libro libro1 = new Libro ("1-1234-5678-0", "He jugado con lobos", "Gabriel Janer Manilla", 128);
		Libro libro2 = new Libro ("0-4321-9876-1", "El ni�o con el pijama de rayas", "John Boyne", 217);
		
		//Imprimir datos de los objetos
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());

		//Llamamos al m�todo para saber cu�l de los dos tiene m�s p�ginas
		masPaginas (libro1, libro2);
		
	}

}

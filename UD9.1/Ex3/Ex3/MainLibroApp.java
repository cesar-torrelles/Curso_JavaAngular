package Ex3;

public class MainLibroApp {
	
	public static void main(String[] args) {
		//Objetos
		Libro libro1 = new Libro ("1-1234-5678-0", "He jugado con lobos", "Gabriel Janer Manilla", 128);
		Libro libro2 = new Libro ("0-4321-9876-1", "El ni�o con el pijama de rayas", "John Boyne", 217);
		
		//Imprimir datos de los objetos
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());

		//Llamamos al m�todo para saber cu�l de los dos tiene m�s p�ginas
		Metodos.masPaginas (libro1, libro2);
		
	}

}
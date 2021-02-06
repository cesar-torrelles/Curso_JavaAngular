import java.util.Hashtable;
import java.util.Scanner;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex1App {
	
	public static void a�adir (Hashtable <String, Integer> mediaxAlumno, Scanner teclado) {
		String nombre;
		int nota;
		
		System.out.print("Nombre del alumno: ");
		nombre = teclado.next();
		
		System.out.println("Nota media: ");
		nota = teclado.nextInt();
		
		mediaxAlumno.put(nombre, nota);
		
		mostrar (mediaxAlumno);
		
	}
	
	public static void mostrar (Hashtable <String, Integer> mediaxAlumno) {
		for (String i : mediaxAlumno.keySet()) {
		      System.out.println("Nom de l'alumn@: " + i + ", Nota mitjana: " + mediaxAlumno.get(i));
	}
	}
	public static void a�adirAlumnos (Hashtable <String, Integer> mediaxAlumno) {
		mediaxAlumno.put("Ingrid", 8);
		mediaxAlumno.put("Anna", 6);
		mediaxAlumno.put("Oscar", 7);
		mediaxAlumno.put("Juan", 5);
	}

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		Hashtable <String, Integer> mediaxAlumno = new Hashtable <>();
		int respuesta;
		Scanner teclado = new Scanner (System.in);
		
		//Men� donde seleccionas que quieres hacer.
		a�adirAlumnos (mediaxAlumno);
		System.out.println("Que quieres hacer? ");
		System.out.println("1. Ver nota media de los alumnos.");
		System.out.println("2. A�adir un alumno.");
		respuesta = teclado.nextInt();
		
		switch (respuesta) {
		case 1: mostrar (mediaxAlumno);
		break;
		case 2: a�adir (mediaxAlumno, teclado);
		break;
		}
		
		teclado.close();
		
	}

}

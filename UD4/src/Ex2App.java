/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex2App {

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		int n = 2;
		double a = 5.99;
		char c = (int)'A';

		//MOSTRAR RESULTADOS
		System.out.println("Valor de la variable N: " + n);
		System.out.println("Valor de la variable A: " + a);
		System.out.println("Valor de la variable C: " + c);
		
		System.out.println(n + " + " + a + " = " + (n + a));
		System.out.println(a + " - " + n + " = " + (a - n));
		
		System.out.println("El valor n�merico correspondiente a la letra A �s " + ((int) c));
	}

}

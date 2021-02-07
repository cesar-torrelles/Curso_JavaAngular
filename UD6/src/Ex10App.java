import java.util.Scanner;

public class Ex10App {
	
	public static void mostrar_vector (int [] numeros) {
		int grande = 0;
		
		System.out.println("N�MEROS:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > grande) {
				grande = numeros[i];
			}
			System.out.println(numeros[i]);
		}
		
		System.out.println("El n�mero m�s grande �s: " + grande);
	}
	
	public static boolean es_primo (int numero) {
		boolean primo = true;
		int contador = 0;
        for (int i = 1; i < (numero + 1); i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador != 2) {
        	primo = false;
        }
        else {
        	primo = true;
        }
          return (primo);
	}
	
	public static void llenar_vector (int [] numeros, int min, int max) {
		int numero;
		int contador = 0;
		
        	while (contador != numeros.length){
    			numero = (int)Math.floor(Math.random()*(min-(max+1))+(max));
    			if (es_primo (numero)) {
    				numeros[contador] = numero;
    				contador++;
        	}
       	}
	}

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		int [] numeros;
		int num;
		int min, max;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("�Cu�ntos n�meros quieres generar?");
		num = teclado.nextInt();
		
		numeros = new int [num];
		
		System.out.println("N�mero m�nimo?");
		min = teclado.nextInt();
		
		System.out.println("N�mero m�ximo?");
		max = teclado.nextInt();
		
		llenar_vector (numeros, min, max);
		mostrar_vector (numeros);
		
		teclado.close();
	}

}

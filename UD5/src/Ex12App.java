import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex12App {

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		String contrase�a = "idominguez";
		int intentos = 1;
		boolean acierto = false;
		Scanner teclado = new Scanner (System.in);
		
		String password = JOptionPane.showInputDialog("Introduce la contrase�a: ");
		
		while (intentos < 3) { 		
		if (contrase�a.equals(password)) {
			JOptionPane.showMessageDialog(null, "ENHORABUENA!");
			acierto = true;
			break;
		}
		else {
			intentos++;
			JOptionPane.showMessageDialog(null, "Contrase�a incorrecta.");
			password = JOptionPane.showInputDialog("Introduce la contrase�a: ");
		}

		if (intentos >= 3 && acierto == false) {
			JOptionPane.showMessageDialog(null, "Has agotado los intentos.");
		}
	}

		teclado.close();
	}
}

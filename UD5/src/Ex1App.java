import javax.swing.JOptionPane;

/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex1App {

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		int a = 50;
		int b = 50;
		
		//MOSTRAR RESULTADOS
		if (a > b) {
			JOptionPane.showMessageDialog(null, "El n�mero m�s grande �s: " + a);
		}
		else if (a == b) {
			JOptionPane.showMessageDialog(null, "Los dos n�meros s�n iguales.");
		}
		else {
			JOptionPane.showMessageDialog(null, "El n�mero m�s grande �s: " + b);
		}

	}

}
